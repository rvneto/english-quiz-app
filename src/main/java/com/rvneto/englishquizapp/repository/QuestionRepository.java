package com.rvneto.englishquizapp.repository;

import com.rvneto.englishquizapp.domain.model.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends MongoRepository<Question, String> {

}
