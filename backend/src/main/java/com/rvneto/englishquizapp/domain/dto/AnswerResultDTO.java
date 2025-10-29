package com.rvneto.englishquizapp.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AnswerResultDTO {

    private String questionId;

    private Integer selectedOptionIndex;

    private Integer correctOptionIndex;

    private String explanation;

    private String explanationTranslation;

    // Força o Jackson a usar "isCorrect" como o nome do campo no JSON.
    // Isso alinha o backend com o que o frontend espera (result.isCorrect).
    @JsonProperty("isCorrect")
    private boolean isCorrect;

}