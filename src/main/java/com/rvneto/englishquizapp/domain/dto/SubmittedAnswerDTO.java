package com.rvneto.englishquizapp.domain.dto;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Data
public class SubmittedAnswerDTO {
    
    @NotBlank
    private String questionId;
    
    @NotNull
    private Integer selectedOptionIndex;
}
