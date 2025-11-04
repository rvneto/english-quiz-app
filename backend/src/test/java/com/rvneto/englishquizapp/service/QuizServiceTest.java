package com.rvneto.englishquizapp.service;

import com.rvneto.englishquizapp.domain.dto.AnswerResultDTO;
import com.rvneto.englishquizapp.domain.dto.QuestionDTO;
import com.rvneto.englishquizapp.domain.dto.SubmittedAnswerDTO;
import com.rvneto.englishquizapp.domain.enums.DifficultyLevel;
import com.rvneto.englishquizapp.domain.enums.QuestionStatus;
import com.rvneto.englishquizapp.domain.model.AnswerOption;
import com.rvneto.englishquizapp.domain.model.Category;
import com.rvneto.englishquizapp.domain.model.Question;
import com.rvneto.englishquizapp.repository.CategoryRepository;
import com.rvneto.englishquizapp.repository.QuestionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Pageable;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class QuizServiceTest {

    @Mock
    private QuestionRepository questionRepository;

    @Mock
    private CategoryRepository categoryRepository;

    @InjectMocks
    private QuizService quizService;

    private Question sampleQuestion;

    @BeforeEach
    void setUp() {
        AnswerOption option1 = new AnswerOption("Option 1", false);
        AnswerOption option2 = new AnswerOption("Option 2", true); // Resposta Correta
        AnswerOption option3 = new AnswerOption("Option 3", false);

        sampleQuestion = new Question();
        sampleQuestion.setId("1");
        sampleQuestion.setContent("What is the correct option?");
        sampleQuestion.setOptions(List.of(option1, option2, option3));
        sampleQuestion.setExplanation("Because it is.");
        sampleQuestion.setDifficultyLevel(DifficultyLevel.BEGINNER);
    }

    // Testes para o método validateAnswer

    @Test
    void testValidateAnswer_WhenCorrectAnswer_ShouldReturnTrue() {
        SubmittedAnswerDTO submittedAnswer = new SubmittedAnswerDTO();
        submittedAnswer.setQuestionId("1");
        submittedAnswer.setSelectedOptionIndex(1);

        when(questionRepository.findById("1")).thenReturn(Optional.of(sampleQuestion));

        AnswerResultDTO result = quizService.validateAnswer(submittedAnswer);

        assertNotNull(result);
        assertTrue(result.isCorrect());
        assertEquals(1, result.getCorrectOptionIndex());
    }

    @Test
    void testValidateAnswer_WhenIncorrectAnswer_ShouldReturnFalse() {
        SubmittedAnswerDTO submittedAnswer = new SubmittedAnswerDTO();
        submittedAnswer.setQuestionId("1");
        submittedAnswer.setSelectedOptionIndex(2);

        when(questionRepository.findById("1")).thenReturn(Optional.of(sampleQuestion));

        AnswerResultDTO result = quizService.validateAnswer(submittedAnswer);

        assertNotNull(result);
        assertFalse(result.isCorrect());
        assertEquals(1, result.getCorrectOptionIndex());
    }

    @Test
    void testValidateAnswer_WhenQuestionNotFound_ShouldThrowException() {
        SubmittedAnswerDTO submittedAnswer = new SubmittedAnswerDTO();
        submittedAnswer.setQuestionId("99");
        submittedAnswer.setSelectedOptionIndex(1);

        when(questionRepository.findById("99")).thenReturn(Optional.empty());

        assertThrows(IllegalArgumentException.class, () -> quizService.validateAnswer(submittedAnswer));
    }

    // Testes para o método findQuestionsForQuiz

    @Test
    void testFindQuestionsForQuiz_WhenQuestionsExist_ShouldReturnDTOList() {
        Category category = new Category();
        category.setName("Grammar");

        when(categoryRepository.findByName("Grammar")).thenReturn(category);
        when(questionRepository.findByCategoryAndDifficultyLevelAndStatus(any(Category.class), any(DifficultyLevel.class), any(QuestionStatus.class), any(Pageable.class)))
                .thenReturn(List.of(sampleQuestion));

        List<QuestionDTO> questions = quizService.findQuestionsForQuiz("Grammar", "BEGINNER", 1);

        assertNotNull(questions);
        assertEquals(1, questions.size());
        assertEquals("1", questions.getFirst().getId());
        assertEquals("What is the correct option?", questions.getFirst().getContent());
        assertEquals(3, questions.getFirst().getOptions().size());
    }

    @Test
    void testFindQuestionsForQuiz_WhenLevelIsInvalid_ShouldReturnEmptyList() {
        List<QuestionDTO> questions = quizService.findQuestionsForQuiz("Grammar", "SUPER_HARD", 1);

        assertNotNull(questions);
        assertTrue(questions.isEmpty());
    }

    @Test
    void testFindQuestionsForQuiz_WhenNoQuestionsMatch_ShouldReturnEmptyList() {
        Category category = new Category();
        category.setName("Vocabulary");

        when(categoryRepository.findByName("Vocabulary")).thenReturn(category);
        when(questionRepository.findByCategoryAndDifficultyLevelAndStatus(any(Category.class), any(DifficultyLevel.class), any(QuestionStatus.class), any(Pageable.class)))
                .thenReturn(Collections.emptyList());

        List<QuestionDTO> questions = quizService.findQuestionsForQuiz("Vocabulary", "INTERMEDIATE", 5);

        assertNotNull(questions);
        assertTrue(questions.isEmpty());
    }
}
