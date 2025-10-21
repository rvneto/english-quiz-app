package com.rvneto.englishquizapp.controller;

import com.rvneto.englishquizapp.domain.dto.AnswerResultDTO;
import com.rvneto.englishquizapp.domain.dto.QuestionDTO;
import com.rvneto.englishquizapp.domain.dto.SubmittedAnswerDTO;
import com.rvneto.englishquizapp.service.QuizService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/quiz")
public class QuizController {
    
    private final QuizService quizService;
    
    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }
    
    @GetMapping("/questions")
    public ResponseEntity<List<QuestionDTO>> getQuizQuestions(
            @RequestParam(required = true) String category,
            @RequestParam(required = true) String level,
            @RequestParam(defaultValue = "10") int limit) {
        
        List<QuestionDTO> questions = quizService.findQuestionsForQuiz(category, level, limit);
        
        if (questions.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        
        return ResponseEntity.ok(questions);
    }
    
    @PostMapping("/answer")
    public ResponseEntity<AnswerResultDTO> submitAnswer(@RequestBody @Valid SubmittedAnswerDTO submission) {
        
        try {
            AnswerResultDTO result = quizService.validateAnswer(submission);
            return ResponseEntity.ok(result);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().build();
        }
    }
    
}