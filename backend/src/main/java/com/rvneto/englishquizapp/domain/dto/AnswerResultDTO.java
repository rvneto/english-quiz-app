package com.rvneto.englishquizapp.domain.dto;

import lombok.Data;

@Data
public class AnswerResultDTO {
    
    private String questionId;
    private boolean isCorrect;
    private Integer correctOptionIndex;
    private Integer selectedOptionIndex;
    private String explanation;
    private String explanationTranslation;
    
}