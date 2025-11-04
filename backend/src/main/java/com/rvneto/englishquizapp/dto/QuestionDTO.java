package com.rvneto.englishquizapp.dto;

import lombok.Data;

import java.util.List;

@Data
public class QuestionDTO {
    private String content;
    private String contentTranslation;
    private String explanation;
    private String explanationTranslation;
    private List<AnswerOptionDTO> options;
}
