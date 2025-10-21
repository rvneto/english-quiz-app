package com.rvneto.englishquizapp.controller;

import com.rvneto.englishquizapp.domain.dto.QuestionDTO;
import com.rvneto.englishquizapp.service.QuizService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/quiz")
public class QuizController {
    
    private final QuizService quizService;
    
    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }
    
    /**
     * Endpoint para buscar perguntas do quiz com filtros.
     * Ex: GET /api/v1/quiz/questions?category=Grammar&level=BEGINNER&limit=10
     */
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
    
}