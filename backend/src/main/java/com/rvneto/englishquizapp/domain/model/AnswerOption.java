package com.rvneto.englishquizapp.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnswerOption {

    private String text;
    private boolean isCorrect;

}