package com.rvneto.englishquizapp.service;

import com.rvneto.englishquizapp.domain.enums.DifficultyLevel;
import com.rvneto.englishquizapp.domain.enums.QuestionStatus;
import com.rvneto.englishquizapp.domain.model.AnswerOption;
import com.rvneto.englishquizapp.domain.model.Category;
import com.rvneto.englishquizapp.domain.model.Question;
import com.rvneto.englishquizapp.repository.CategoryRepository;
import com.rvneto.englishquizapp.repository.QuestionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// O @Order(2) garante que este seeder rode DEPOIS do CategorySeeder (@Order(1))
@Component
@Order(2)
public class QuestionSeeder implements CommandLineRunner {
    
    private final QuestionRepository questionRepository;
    private final CategoryRepository categoryRepository;
    
    // Lista das 20 perguntas (AGORA COM 4 OPÇÕES CADA)
    private final List<QuestionData> initialQuestionsData = Arrays.asList(
            // PERGUNTA 1: What is your name?
            new QuestionData(
                    "What is your name?",
                    "Qual é o seu nome?",
                    "Esta é uma pergunta básica de apresentação. A resposta deve ser uma apresentação.",
                    "Esta é uma pergunta básica de apresentação. A resposta deve ser uma apresentação.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("I am fine", false),
                            new AnswerOption("My name is John", true),
                            new AnswerOption("I go to school", false),
                            new AnswerOption("Yes, please", false) // 4ª Opção Adicionada
                    )
            ),
            // PERGUNTA 2: I ___ a student. (Verbo 'to be' - I)
            new QuestionData(
                    "I ___ a student.",
                    "Eu ___ um estudante.",
                    "Use 'am' com o pronome 'I' no presente do verbo 'to be'.",
                    "Use 'am' com o pronome 'I' no presente do verbo 'to be'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("am", true),
                            new AnswerOption("is", false),
                            new AnswerOption("are", false),
                            new AnswerOption("be", false) // 4ª Opção Adicionada
                    )
            ),
            // PERGUNTA 3: She ___ happy. (Verbo 'to be' - She)
            new QuestionData(
                    "She ___ happy.",
                    "Ela ___ feliz.",
                    "Use 'is' com os pronomes 'he', 'she', 'it' no presente do verbo 'to be'.",
                    "Use 'is' com os pronomes 'he', 'she', 'it' no presente do verbo 'to be'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("am", false),
                            new AnswerOption("is", true),
                            new AnswerOption("are", false),
                            new AnswerOption("do", false) // 4ª Opção Adicionada
                    )
            ),
            // PERGUNTA 4: They ___ at home. (Verbo 'to be' - They)
            new QuestionData(
                    "They ___ at home.",
                    "Eles ___ em casa.",
                    "Use 'are' com os pronomes 'you', 'we', 'they' no presente do verbo 'to be'.",
                    "Use 'are' com os pronomes 'you', 'we', 'they' no presente do verbo 'to be'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("is", false),
                            new AnswerOption("am", false),
                            new AnswerOption("are", true),
                            new AnswerOption("be", false) // 4ª Opção Adicionada
                    )
            ),
            // PERGUNTA 5: This is ___ apple. (Artigo Indefinido)
            new QuestionData(
                    "This is ___ apple.",
                    "Isto é ___ maçã.",
                    "Use o artigo indefinido 'an' antes de palavras que começam com som de vogal (apple).",
                    "Use o artigo indefinido 'an' antes de palavras que começam com som de vogal (apple).",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("a", false),
                            new AnswerOption("an", true),
                            new AnswerOption("the", false),
                            new AnswerOption("some", false) // 4ª Opção Adicionada
                    )
            ),
            // PERGUNTA 6: He ___ go to work every day. (Simple Present Negativo - He)
            new QuestionData(
                    "He ___ go to work every day.",
                    "Ele ___ ir trabalhar todos os dias.",
                    "Use 'doesn't' como auxiliar para a terceira pessoa do singular (he, she, it) em frases negativas do Simple Present.",
                    "Use 'doesn't' como auxiliar para a terceira pessoa do singular (he, she, it) em frases negativas do Simple Present.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("don't", false),
                            new AnswerOption("doesn't", true),
                            new AnswerOption("not", false),
                            new AnswerOption("isn't", false) // 4ª Opção Adicionada
                    )
            ),
            // PERGUNTA 7: Do you ___ coffee? (Simple Present Pergunta - Verbo Base)
            new QuestionData(
                    "Do you ___ coffee?",
                    "Você ___ café?",
                    "Após o auxiliar 'do', o verbo principal deve vir no infinitivo sem 'to' (base form).",
                    "Após o auxiliar 'do', o verbo principal deve vir no infinitivo sem 'to' (base form).",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("likes", false),
                            new AnswerOption("like", true),
                            new AnswerOption("liking", false),
                            new AnswerOption("liked", false) // 4ª Opção Adicionada
                    )
            ),
            // PERGUNTA 8: Where ___ you live? (Simple Present Pergunta - Auxiliar)
            new QuestionData(
                    "Where ___ you live?",
                    "Onde ___ você mora?",
                    "Use o auxiliar 'do' com os pronomes 'I', 'you', 'we', 'they' para formar perguntas no Simple Present.",
                    "Use o auxiliar 'do' com os pronomes 'I', 'you', 'we', 'they' para formar perguntas no Simple Present.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("is", false),
                            new AnswerOption("do", true),
                            new AnswerOption("are", false),
                            new AnswerOption("does", false) // 4ª Opção Adicionada
                    )
            ),
            // PERGUNTA 9: I ___ my homework yesterday. (Simple Past)
            new QuestionData(
                    "I ___ my homework yesterday.",
                    "Eu ___ meu dever de casa ontem.",
                    "Use 'did' (passado simples de 'do') para ações concluídas no passado.",
                    "Use 'did' (passado simples de 'do') para ações concluídas no passado.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("do", false),
                            new AnswerOption("did", true),
                            new AnswerOption("done", false),
                            new AnswerOption("doing", false) // 4ª Opção Adicionada
                    )
            ),
            // PERGUNTA 10: She ___ not come to the party. (Simple Past Negativo)
            new QuestionData(
                    "She ___ not come to the party.",
                    "Ela ___ não vir à festa.",
                    "Use 'did not' (didn't) para formar frases negativas no Simple Past.",
                    "Use 'did not' (didn't) para formar frases negativas no Simple Past.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("did", true),
                            new AnswerOption("does", false),
                            new AnswerOption("is", false),
                            new AnswerOption("has", false) // 4ª Opção Adicionada
                    )
            ),
            // PERGUNTA 11: They ___ to the beach last weekend. (Simple Past - Irregular)
            new QuestionData(
                    "They ___ to the beach last weekend.",
                    "Eles ___ para a praia no último fim de semana.",
                    "'Went' é o passado simples do verbo 'to go' e é usado para ações no passado.",
                    "'Went' é o passado simples do verbo 'to go' e é usado para ações no passado.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("go", false),
                            new AnswerOption("gone", false),
                            new AnswerOption("went", true),
                            new AnswerOption("going", false) // 4ª Opção Adicionada
                    )
            ),
            // PERGUNTA 12: What ___ you doing now? (Present Continuous - You)
            new QuestionData(
                    "What ___ you doing now?",
                    "O que ___ você fazendo agora?",
                    "Use 'are' como auxiliar para o pronome 'you' no Present Continuous (verbo 'to be' + verbo + ing).",
                    "Use 'are' como auxiliar para o pronome 'you' no Present Continuous (verbo 'to be' + verbo + ing).",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("is", false),
                            new AnswerOption("do", false),
                            new AnswerOption("are", true),
                            new AnswerOption("am", false) // 4ª Opção Adicionada
                    )
            ),
            // PERGUNTA 13: He ___ sleeping right now. (Present Continuous - He)
            new QuestionData(
                    "He ___ sleeping right now.",
                    "Ele ___ dormindo agora.",
                    "Use 'is' como auxiliar para o pronome 'he' no Present Continuous.",
                    "Use 'is' como auxiliar para o pronome 'he' no Present Continuous.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("are", false),
                            new AnswerOption("is", true),
                            new AnswerOption("am", false),
                            new AnswerOption("has", false) // 4ª Opção Adicionada
                    )
            ),
            // PERGUNTA 14: We ___ eating dinner. (Present Continuous - We)
            new QuestionData(
                    "We ___ eating dinner.",
                    "Nós ___ jantando.",
                    "Use 'are' como auxiliar para o pronome 'we' no Present Continuous.",
                    "Use 'are' como auxiliar para o pronome 'we' no Present Continuous.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("are", true),
                            new AnswerOption("is", false),
                            new AnswerOption("do", false),
                            new AnswerOption("does", false) // 4ª Opção Adicionada
                    )
            ),
            // PERGUNTA 15: I ___ a car. (Have/Has - I)
            new QuestionData(
                    "I ___ a car.",
                    "Eu ___ um carro.",
                    "Use 'have' para os pronomes 'I', 'you', 'we', 'they' para expressar posse.",
                    "Use 'have' para os pronomes 'I', 'you', 'we', 'they' para expressar posse.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("has", false),
                            new AnswerOption("have", true),
                            new AnswerOption("am have", false),
                            new AnswerOption("do have", false) // 4ª Opção Adicionada
                    )
            ),
            // PERGUNTA 16: She ___ three brothers. (Have/Has - She)
            new QuestionData(
                    "She ___ three brothers.",
                    "Ela ___ três irmãos.",
                    "Use 'has' para os pronomes 'he', 'she', 'it' para expressar posse.",
                    "Use 'has' para os pronomes 'he', 'she', 'it' para expressar posse.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("has", true),
                            new AnswerOption("have", false),
                            new AnswerOption("is have", false),
                            new AnswerOption("having", false) // 4ª Opção Adicionada
                    )
            ),
            // PERGUNTA 17: Can you help ___? (Pronome Objeto)
            new QuestionData(
                    "Can you help ___?",
                    "Você pode ajudar ___?",
                    "Use o pronome objeto 'me' após o verbo.",
                    "Use o pronome objeto 'me' após o verbo.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("I", false),
                            new AnswerOption("me", true),
                            new AnswerOption("mine", false),
                            new AnswerOption("my", false) // 4ª Opção Adicionada
                    )
            ),
            // PERGUNTA 18: This book is ___. (Pronome Possessivo)
            new QuestionData(
                    "This book is ___.",
                    "Este livro é ___.",
                    "Use o pronome possessivo 'mine' no final da frase.",
                    "Use o pronome possessivo 'mine' no final da frase.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("I", false),
                            new AnswerOption("my", false),
                            new AnswerOption("mine", true),
                            new AnswerOption("me", false) // 4ª Opção Adicionada
                    )
            ),
            // PERGUNTA 19: ___ is your name? (Wh-Question)
            new QuestionData(
                    "___ is your name?",
                    "___ é o seu nome?",
                    "Use 'What' para perguntar o nome de algo ou alguém.",
                    "Use 'What' para perguntar o nome de algo ou alguém.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("How", false),
                            new AnswerOption("What", true),
                            new AnswerOption("Who", false),
                            new AnswerOption("Where", false) // 4ª Opção Adicionada
                    )
            ),
            // PERGUNTA 20: ___ old are you? (Wh-Question - How)
            new QuestionData(
                    "___ old are you?",
                    "___ anos você tem?",
                    "Use 'How' para perguntar a idade.",
                    "Use 'How' para perguntar a idade.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("What", false),
                            new AnswerOption("How", true),
                            new AnswerOption("Where", false),
                            new AnswerOption("Why", false) // 4ª Opção Adicionada
                    )
            )
    );
    
    // Construtor com Injeção de Dependência
    public QuestionSeeder(QuestionRepository questionRepository, CategoryRepository categoryRepository) {
        this.questionRepository = questionRepository;
        this.categoryRepository = categoryRepository;
    }
    
    @Override
    public void run(String... args) throws Exception {
        
        // Se já tiver 20 ou mais, pula para evitar duplicatas, mas o ideal é 0 para rodar
        if (questionRepository.count() < 20) {
            
            // Limpa antes de popular para garantir que os dados estejam atualizados com 4 opções
            questionRepository.deleteAll();
            System.out.println("-> Populando perguntas iniciais...");
            
            // 1. Encontrar a categoria 'Grammar'
            Category grammarCategory = categoryRepository.findByName("Grammar");
            
            if (grammarCategory == null) {
                // Tenta inserir novamente as categorias se não existirem
                System.err.println("ERRO: Categoria 'Grammar' não encontrada. Verifique se o CategorySeeder rodou!");
                return;
            }
            
            // 2. Mapear os dados brutos para entidades Question
            List<Question> questionsToSave = new ArrayList<>();
            for (QuestionData data : initialQuestionsData) {
                questionsToSave.add(mapToQuestion(data, grammarCategory));
            }
            
            // 3. Salvar no banco
            questionRepository.saveAll(questionsToSave);
            
            System.out.println("-> População de perguntas concluída. Total: " + questionRepository.count());
            
        } else {
            System.out.println("-> Perguntas já existem no banco. Pulando o Data Seeding.");
        }
    }
    
    /**
     * Mapeia os dados brutos para o objeto Question
     */
    private Question mapToQuestion(QuestionData data, Category category) {
        Question q = new Question();
        q.setContent(data.content);
        q.setContentTranslation(data.contentTranslation);
        q.setExplanation(data.explanation);
        q.setExplanationTranslation(data.explanationTranslation);
        q.setDifficultyLevel(data.difficultyLevel);
        q.setCategory(category);
        q.setOptions(data.options);
        q.setStatus(QuestionStatus.ACTIVE);
        return q;
    }
    
    // Classe interna para estruturar os dados de forma limpa
    private static class QuestionData {
        String content;
        String contentTranslation;
        String explanation;
        String explanationTranslation;
        DifficultyLevel difficultyLevel;
        String categoryName;
        List<AnswerOption> options;
        
        public QuestionData(String content, String contentTranslation, String explanation, String explanationTranslation, DifficultyLevel difficultyLevel, String categoryName, List<AnswerOption> options) {
            this.content = content;
            this.contentTranslation = contentTranslation;
            this.explanation = explanation;
            this.explanationTranslation = explanationTranslation;
            this.difficultyLevel = difficultyLevel;
            this.categoryName = categoryName;
            this.options = options;
        }
    }
}