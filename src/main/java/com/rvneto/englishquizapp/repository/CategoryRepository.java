package com.rvneto.englishquizapp.repository;

import com.rvneto.englishquizapp.domain.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {

    Category findByName(String name);
}