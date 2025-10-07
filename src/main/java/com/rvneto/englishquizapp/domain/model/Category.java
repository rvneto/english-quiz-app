package com.rvneto.englishquizapp.domain.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "categories")
public class Category {

    @Id
    private String id;

    private String name;

    private String description;
}
