package com.rvneto.englishquizapp.service;

import com.rvneto.englishquizapp.domain.dto.QuestionDTO;
import com.rvneto.englishquizapp.domain.dto.QuizOptionDTO;
import com.rvneto.englishquizapp.domain.enums.DifficultyLevel;
import com.rvneto.englishquizapp.domain.enums.QuestionStatus;
import com.rvneto.englishquizapp.domain.model.Category;
import com.rvneto.englishquizapp.domain.model.Question;
import com.rvneto.englishquizapp.repository.CategoryRepository;
import com.rvneto.englishquizapp.repository.QuestionRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizService {
    
    private final QuestionRepository questionRepository;
    private final CategoryRepository categoryRepository;
    
    public QuizService(QuestionRepository questionRepository, CategoryRepository categoryRepository) {
        this.questionRepository = questionRepository;
        this.categoryRepository = categoryRepository;
    }
    
    /**
     * Busca perguntas aleatórias com base nos filtros.
     *
     * @param categoryName O nome da categoria (e.g., "Grammar").
     * @param level        O nível de dificuldade (e.g., "BEGINNER").
     * @param limit        O número máximo de perguntas.
     * @return Lista de QuestionDTOs (sem a resposta correta).
     */
    public List<QuestionDTO> findQuestionsForQuiz(String categoryName, String level, int limit) {
        
        Category category = categoryRepository.findByName(categoryName);
        
        DifficultyLevel difficultyLevel;
        try {
            difficultyLevel = DifficultyLevel.valueOf(level.toUpperCase());
        } catch (IllegalArgumentException e) {
            return Collections.emptyList();
        }
        
        Pageable pageable = PageRequest.of(0, limit);
        List<Question> limitedQuestions = questionRepository.findByDifficultyLevelAndStatus(
                difficultyLevel,
                QuestionStatus.ACTIVE,
                pageable
        );
        
        Collections.shuffle(limitedQuestions);
        
        return limitedQuestions.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }
    
    /**
     * Mapper: Converte a Entidade Question para o DTO (Esconde a Resposta Correta)
     */
    private QuestionDTO convertToDTO(Question question) {
        QuestionDTO dto = new QuestionDTO();
        dto.setId(question.getId());
        dto.setContent(question.getContent());
        dto.setContentTranslation(question.getContentTranslation());
        
        dto.setDifficultyLevel(question.getDifficultyLevel().getName());
        
        if (question.getCategory() != null) {
            dto.setCategoryId(question.getCategory().getId());
            dto.setCategoryName(question.getCategory().getName());
        }
        
        // Mapeia as opções e adiciona o índice
        List<QuizOptionDTO> options = new ArrayList<>();
        for (int i = 0; i < question.getOptions().size(); i++) {
            QuizOptionDTO optionDTO = new QuizOptionDTO();
            optionDTO.setText(question.getOptions().get(i).getText());
            optionDTO.setIndex(i); // O índice será usado para referenciar a opção
            options.add(optionDTO);
        }
        
        dto.setOptions(options);
        return dto;
    }
}