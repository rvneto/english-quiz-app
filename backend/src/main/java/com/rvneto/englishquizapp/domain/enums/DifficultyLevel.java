package com.rvneto.englishquizapp.domain.enums;

import lombok.Getter;

@Getter
public enum DifficultyLevel {

    BEGINNER("Beginner", "Fácil, para quem está começando."),
    INTERMEDIATE("Intermediate", "Médio, para quem já tem alguma base."),
    ADVANCED("Advanced", "Difícil, para quem busca fluência.");

    private final String name;
    private final String description;

    DifficultyLevel(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}