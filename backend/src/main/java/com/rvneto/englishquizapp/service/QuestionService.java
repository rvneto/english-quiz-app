package com.rvneto.englishquizapp.service;

import com.rvneto.englishquizapp.domain.enums.DifficultyLevel;
import com.rvneto.englishquizapp.domain.model.AnswerOption;
import com.rvneto.englishquizapp.domain.model.Category;
import com.rvneto.englishquizapp.domain.model.Question;
import com.rvneto.englishquizapp.dto.AnswerOptionDTO;
import com.rvneto.englishquizapp.dto.QuestionDTO;
import com.rvneto.englishquizapp.repository.CategoryRepository;
import com.rvneto.englishquizapp.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Question> createQuestions(DifficultyLevel difficultyLevel, String categoryName, List<QuestionDTO> questionDTOs) {
        Category category = categoryRepository.findByName(categoryName);

        List<Question> questions = new ArrayList<>();
        for (QuestionDTO questionDTO : questionDTOs) {
            Question question = new Question();
            question.setContent(questionDTO.getContent());
            question.setContentTranslation(questionDTO.getContentTranslation());
            question.setExplanation(questionDTO.getExplanation());
            question.setExplanationTranslation(questionDTO.getExplanationTranslation());
            question.setDifficultyLevel(difficultyLevel);
            question.setCategory(category);

            List<AnswerOption> options = questionDTO.getOptions().stream()
                    .map(dto -> new AnswerOption(dto.getText(), dto.isCorrect()))
                    .collect(Collectors.toList());
            question.setOptions(options);

            questions.add(question);
        }

        return questionRepository.saveAll(questions);
    }
}
