package com.rvneto.englishquizapp.domain.model;

import com.rvneto.englishquizapp.domain.enums.DifficultyLevel;
import com.rvneto.englishquizapp.domain.enums.QuestionStatus;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document(collection = "questions")
public class Question {

    @Id
    private String id;
    private String content;
    private String contentTranslation;
    private String explanation;
    private String explanationTranslation;
    private DifficultyLevel difficultyLevel;
    @DBRef
    private Category category;
    private QuestionStatus status = QuestionStatus.DRAFT;
    private List<AnswerOption> options;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt;

}