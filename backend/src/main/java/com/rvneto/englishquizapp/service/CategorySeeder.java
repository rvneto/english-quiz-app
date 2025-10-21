package com.rvneto.englishquizapp.service;

import com.rvneto.englishquizapp.domain.model.Category;
import com.rvneto.englishquizapp.repository.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

// Indica que esta classe é um componente do Spring e será executada automaticamente
@Component
public class CategorySeeder implements CommandLineRunner {

    private final CategoryRepository categoryRepository;

    // Injeção de Dependência do Repositório (o Spring cuida disso)
    public CategorySeeder(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    // Método principal que será executado ao iniciar a aplicação
    @Override
    public void run(String... args) throws Exception {

        // 1. Verificar se já existem categorias no banco
        if (categoryRepository.count() == 0) {

            System.out.println("-> Populando categorias iniciais...");

            // 2. Definir a lista de categorias que você quer
            List<Category> initialCategories = Arrays.asList(
                    createCategory(null, "Grammar", "Tópicos de regras gramaticais (e.g., tempos verbais, preposições)."),
                    createCategory(null, "Vocabulary", "Questões focadas em vocabulário e sinônimos."),
                    createCategory(null, "Phrasal Verbs", "Testes específicos sobre verbos frasais."),
                    createCategory(null, "Idioms", "Questões sobre expressões idiomáticas.")
            );

            // 3. Salvar todas de uma vez
            categoryRepository.saveAll(initialCategories);

            System.out.println("-> População de categorias concluída. Total: " + categoryRepository.count());

        } else {
            System.out.println("-> Categorias já existem no banco. Pulando o Data Seeding.");
        }
    }

    /**
     * Método auxiliar para criar uma instância de Category
     */
    private Category createCategory(String id, String name, String description) {
        Category category = new Category();
        category.setId(id); // O MongoDB/Spring Data gerará o ID se for null
        category.setName(name);
        category.setDescription(description);
        return category;
    }
}