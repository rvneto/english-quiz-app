package com.rvneto.englishquizapp.controller;

import com.rvneto.englishquizapp.domain.enums.DifficultyLevel;
import com.rvneto.englishquizapp.domain.model.Question;
import com.rvneto.englishquizapp.dto.QuestionDTO;
import com.rvneto.englishquizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("questions")
public class QuestionController {

    @Autowired
    private QuestionService service;

    @PostMapping
    public ResponseEntity<List<Question>> createQuestions(@RequestParam("difficultyLevel") DifficultyLevel difficultyLevel,
                                                          @RequestParam("category") String categoryName,
                                                          @RequestBody List<QuestionDTO> questions) {
        List<Question> newQuestions = service.createQuestions(difficultyLevel, categoryName, questions);
        return ResponseEntity.ok(newQuestions);
    }
}
