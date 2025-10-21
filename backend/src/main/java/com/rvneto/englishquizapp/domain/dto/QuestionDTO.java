package com.rvneto.englishquizapp.domain.dto;

import lombok.Data;

import java.util.List;

@Data
public class QuestionDTO {
    
    private String id;
    private String content;
    private String contentTranslation;
    private String categoryId;
    private String categoryName;
    private String difficultyLevel;
    private List<QuizOptionDTO> options;
    
}