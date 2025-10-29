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

@Component
@Order(2)
public class QuestionSeeder implements CommandLineRunner {

        private final QuestionRepository questionRepository;
        private final CategoryRepository categoryRepository;

        // Lista das 20 perguntas (Com Explicações EN/PT Corrigidas)
        private final List<QuestionData> initialQuestionsData = Arrays.asList(
                        // PERGUNTA 1: What is your name?
                        new QuestionData(
                                        "What is your name?",
                                        "Qual é o seu nome?",
                                        "This is a basic introductory question. The answer should be an introduction.", // EN
                                        "Esta é uma pergunta básica de apresentação. A resposta deve ser uma apresentação.", // PT
                                        DifficultyLevel.BEGINNER, "Grammar",
                                        Arrays.asList(
                                                        new AnswerOption("I am fine", false),
                                                        new AnswerOption("My name is John", true),
                                                        new AnswerOption("I go to school", false),
                                                        new AnswerOption("Yes, please", false))),
                        // PERGUNTA 2: I ___ a student. (Verbo 'to be' - I)
                        new QuestionData(
                                        "I ___ a student.",
                                        "Eu ___ um estudante.",
                                        "Use 'am' with the pronoun 'I' in the present tense of the verb 'to be'.", // EN
                                        "Use 'am' com o pronome 'I' no presente do verbo 'to be'.", // PT
                                        DifficultyLevel.BEGINNER, "Grammar",
                                        Arrays.asList(
                                                        new AnswerOption("am", true),
                                                        new AnswerOption("is", false),
                                                        new AnswerOption("are", false),
                                                        new AnswerOption("be", false))),
                        // PERGUNTA 3: She ___ happy. (Verbo 'to be' - She)
                        new QuestionData(
                                        "She ___ happy.",
                                        "Ela ___ feliz.",
                                        "Use 'is' with the pronouns 'he', 'she', 'it' in the present tense of the verb 'to be'.", // EN
                                        "Use 'is' com os pronomes 'he', 'she', 'it' no presente do verbo 'to be'.", // PT
                                        DifficultyLevel.BEGINNER, "Grammar",
                                        Arrays.asList(
                                                        new AnswerOption("am", false),
                                                        new AnswerOption("is", true),
                                                        new AnswerOption("are", false),
                                                        new AnswerOption("do", false))),
                        // PERGUNTA 4: They ___ at home. (Verbo 'to be' - They)
                        new QuestionData(
                                        "They ___ at home.",
                                        "Eles ___ em casa.",
                                        "Use 'are' with the pronouns 'you', 'we', 'they' in the present tense of the verb 'to be'.", // EN
                                        "Use 'are' com os pronomes 'you', 'we', 'they' no presente do verbo 'to be'.", // PT
                                        DifficultyLevel.BEGINNER, "Grammar",
                                        Arrays.asList(
                                                        new AnswerOption("is", false),
                                                        new AnswerOption("am", false),
                                                        new AnswerOption("are", true),
                                                        new AnswerOption("be", false))),
                        // PERGUNTA 5: This is ___ apple. (Artigo Indefinido)
                        new QuestionData(
                                        "This is ___ apple.",
                                        "Isto é ___ maçã.",
                                        "Use the indefinite article 'an' before words that start with a vowel sound (e.g., apple).", // EN
                                        "Use o artigo indefinido 'an' antes de palavras que começam com som de vogal (ex: apple).", // PT
                                        DifficultyLevel.BEGINNER, "Grammar",
                                        Arrays.asList(
                                                        new AnswerOption("a", false),
                                                        new AnswerOption("an", true),
                                                        new AnswerOption("the", false),
                                                        new AnswerOption("some", false))),
                        // PERGUNTA 6: He ___ go to work every day. (Simple Present Negativo - He)
                        new QuestionData(
                                        "He ___ go to work every day.",
                                        "Ele ___ ir trabalhar todos os dias.",
                                        "Use 'doesn't' as the auxiliary for the third person singular (he, she, it) in negative Simple Present sentences.", // EN
                                        "Use 'doesn't' como auxiliar para a terceira pessoa do singular (he, she, it) em frases negativas do Simple Present.", // PT
                                        DifficultyLevel.BEGINNER, "Grammar",
                                        Arrays.asList(
                                                        new AnswerOption("don't", false),
                                                        new AnswerOption("doesn't", true),
                                                        new AnswerOption("not", false),
                                                        new AnswerOption("isn't", false))),
                        // PERGUNTA 7: Do you ___ coffee? (Simple Present Pergunta - Verbo Base)
                        new QuestionData(
                                        "Do you ___ coffee?",
                                        "Você ___ café?",
                                        "After the auxiliary 'do', the main verb must be in its base form (infinitive without 'to').", // EN
                                        "Após o auxiliar 'do', o verbo principal deve vir no infinitivo sem 'to' (base form).", // PT
                                        DifficultyLevel.BEGINNER, "Grammar",
                                        Arrays.asList(
                                                        new AnswerOption("likes", false),
                                                        new AnswerOption("like", true),
                                                        new AnswerOption("liking", false),
                                                        new AnswerOption("liked", false))),
                        // PERGUNTA 8: Where ___ you live? (Simple Present Pergunta - Auxiliar)
                        new QuestionData(
                                        "Where ___ you live?",
                                        "Onde ___ você mora?",
                                        "Use the auxiliary 'do' with the pronouns 'I', 'you', 'we', 'they' to form questions in the Simple Present.", // EN
                                        "Use o auxiliar 'do' com os pronomes 'I', 'you', 'we', 'they' para formar perguntas no Simple Present.", // PT
                                        DifficultyLevel.BEGINNER, "Grammar",
                                        Arrays.asList(
                                                        new AnswerOption("is", false),
                                                        new AnswerOption("do", true),
                                                        new AnswerOption("are", false),
                                                        new AnswerOption("does", false))),
                        // PERGUNTA 9: I ___ my homework yesterday. (Simple Past)
                        new QuestionData(
                                        "I ___ my homework yesterday.",
                                        "Eu ___ meu dever de casa ontem.",
                                        "Use 'did' (Simple Past of 'do') for completed actions in the past.", // EN
                                        "Use 'did' (passado simples de 'do') para ações concluídas no passado.", // PT
                                        DifficultyLevel.BEGINNER, "Grammar",
                                        Arrays.asList(
                                                        new AnswerOption("do", false),
                                                        new AnswerOption("did", true),
                                                        new AnswerOption("done", false),
                                                        new AnswerOption("doing", false))),
                        // PERGUNTA 10: She ___ not come to the party. (Simple Past Negativo)
                        new QuestionData(
                                        "She ___ not come to the party.",
                                        "Ela ___ não vir à festa.",
                                        "Use 'did not' (didn't) to form negative sentences in the Simple Past. The main verb 'come' stays in the base form.", // EN
                                        "Use 'did not' (didn't) para formar frases negativas no Simple Past. O verbo principal 'come' fica na forma base.", // PT
                                        DifficultyLevel.BEGINNER, "Grammar",
                                        Arrays.asList(
                                                        new AnswerOption("did", true),
                                                        new AnswerOption("does", false),
                                                        new AnswerOption("is", false),
                                                        new AnswerOption("has", false))),
                        // PERGUNTA 11: They ___ to the beach last weekend. (Simple Past - Irregular)
                        new QuestionData(
                                        "They ___ to the beach last weekend.",
                                        "Eles ___ para a praia no último fim de semana.",
                                        "'Went' is the Simple Past of the verb 'to go' and is used for past actions.", // EN
                                        "'Went' é o passado simples do verbo 'to go' e é usado para ações no passado.", // PT
                                        DifficultyLevel.BEGINNER, "Grammar",
                                        Arrays.asList(
                                                        new AnswerOption("go", false),
                                                        new AnswerOption("gone", false),
                                                        new AnswerOption("went", true),
                                                        new AnswerOption("going", false))),
                        // PERGUNTA 12: What ___ you doing now? (Present Continuous - You)
                        new QuestionData(
                                        "What ___ you doing now?",
                                        "O que ___ você fazendo agora?",
                                        "Use 'are' as the auxiliary for the pronoun 'you' in the Present Continuous (verb 'to be' + verb + ing).", // EN
                                        "Use 'are' como auxiliar para o pronome 'you' no Present Continuous (verbo 'to be' + verbo + ing).", // PT
                                        DifficultyLevel.BEGINNER, "Grammar",
                                        Arrays.asList(
                                                        new AnswerOption("is", false),
                                                        new AnswerOption("do", false),
                                                        new AnswerOption("are", true),
                                                        new AnswerOption("am", false))),
                        // PERGUNTA 13: He ___ sleeping right now. (Present Continuous - He)
                        new QuestionData(
                                        "He ___ sleeping right now.",
                                        "Ele ___ dormindo agora.",
                                        "Use 'is' as the auxiliary for the pronoun 'he' in the Present Continuous.", // EN
                                        "Use 'is' como auxiliar para o pronome 'he' no Present Continuous.", // PT
                                        DifficultyLevel.BEGINNER, "Grammar",
                                        Arrays.asList(
                                                        new AnswerOption("are", false),
                                                        new AnswerOption("is", true),
                                                        new AnswerOption("am", false),
                                                        new AnswerOption("has", false))),
                        // PERGUNTA 14: We ___ eating dinner. (Present Continuous - We)
                        new QuestionData(
                                        "We ___ eating dinner.",
                                        "Nós ___ jantando.",
                                        "Use 'are' as the auxiliary for the pronoun 'we' in the Present Continuous.", // EN
                                        "Use 'are' como auxiliar para o pronome 'we' no Present Continuous.", // PT
                                        DifficultyLevel.BEGINNER, "Grammar",
                                        Arrays.asList(
                                                        new AnswerOption("are", true),
                                                        new AnswerOption("is", false),
                                                        new AnswerOption("do", false),
                                                        new AnswerOption("does", false))),
                        // PERGUNTA 15: I ___ a car. (Have/Has - I)
                        new QuestionData(
                                        "I ___ a car.",
                                        "Eu ___ um carro.",
                                        "Use 'have' for the pronouns 'I', 'you', 'we', 'they' to express possession.", // EN
                                        "Use 'have' para os pronomes 'I', 'you', 'we', 'they' para expressar posse.", // PT
                                        DifficultyLevel.BEGINNER, "Grammar",
                                        Arrays.asList(
                                                        new AnswerOption("has", false),
                                                        new AnswerOption("have", true),
                                                        new AnswerOption("am have", false),
                                                        new AnswerOption("do have", false))),
                        // PERGUNTA 16: She ___ three brothers. (Have/Has - She)
                        new QuestionData(
                                        "She ___ three brothers.",
                                        "Ela ___ três irmãos.",
                                        "Use 'has' for the pronouns 'he', 'she', 'it' to express possession.", // EN
                                        "Use 'has' para os pronomes 'he', 'she', 'it' para expressar posse.", // PT
                                        DifficultyLevel.BEGINNER, "Grammar",
                                        Arrays.asList(
                                                        new AnswerOption("has", true),
                                                        new AnswerOption("have", false),
                                                        new AnswerOption("is have", false),
                                                        new AnswerOption("having", false))),
                        // PERGUNTA 17: Can you help ___? (Pronome Objeto)
                        new QuestionData(
                                        "Can you help ___?",
                                        "Você pode ajudar ___?",
                                        "Use the object pronoun 'me' after the verb.", // EN
                                        "Use o pronome objeto 'me' após o verbo.", // PT
                                        DifficultyLevel.BEGINNER, "Grammar",
                                        Arrays.asList(
                                                        new AnswerOption("I", false),
                                                        new AnswerOption("me", true),
                                                        new AnswerOption("mine", false),
                                                        new AnswerOption("my", false))),
                        // PERGUNTA 18: This book is ___. (Pronome Possessivo)
                        new QuestionData(
                                        "This book is ___.",
                                        "Este livro é ___.",
                                        "Use the possessive pronoun 'mine' at the end of the sentence.", // EN
                                        "Use o pronome possessivo 'mine' no final da frase.", // PT
                                        DifficultyLevel.BEGINNER, "Grammar",
                                        Arrays.asList(
                                                        new AnswerOption("I", false),
                                                        new AnswerOption("my", false),
                                                        new AnswerOption("mine", true),
                                                        new AnswerOption("me", false))),
                        // PERGUNTA 19: ___ is your name? (Wh-Question)
                        new QuestionData(
                                        "___ is your name?",
                                        "___ é o seu nome?",
                                        "Use 'What' to ask for the name of something or someone.", // EN
                                        "Use 'What' para perguntar o nome de algo ou alguém.", // PT
                                        DifficultyLevel.BEGINNER, "Grammar",
                                        Arrays.asList(
                                                        new AnswerOption("How", false),
                                                        new AnswerOption("What", true),
                                                        new AnswerOption("Who", false),
                                                        new AnswerOption("Where", false))),
                        // PERGUNTA 20: ___ old are you? (Wh-Question - How)
                        new QuestionData(
                                        "___ old are you?",
                                        "___ anos você tem?",
                                        "Use 'How' to ask about age.", // EN
                                        "Use 'How' para perguntar a idade.", // PT
                                        DifficultyLevel.BEGINNER, "Grammar",
                                        Arrays.asList(
                                                        new AnswerOption("What", false),
                                                        new AnswerOption("How", true),
                                                        new AnswerOption("Where", false),
                                                        new AnswerOption("Why", false))));

        // Construtor com Injeção de Dependência
        public QuestionSeeder(QuestionRepository questionRepository, CategoryRepository categoryRepository) {
                this.questionRepository = questionRepository;
                this.categoryRepository = categoryRepository;
        }

        @Override
        public void run(String... args) throws Exception {

                long questionCount = questionRepository.count();

                // Se a contagem for diferente de 20, limpa e popula
                if (questionCount != initialQuestionsData.size()) {

                        System.out.println("-> Contagem de perguntas (" + questionCount + ") difere do esperado ("
                                        + initialQuestionsData.size() + "). Limpando e populando...");
                        questionRepository.deleteAll();
                        System.out.println("-> Populando perguntas iniciais...");

                        // 1. Encontrar a categoria 'Grammar'
                        Category grammarCategory = categoryRepository.findByName("Grammar");

                        if (grammarCategory == null) {
                                System.err.println(
                                                "ERRO: Categoria 'Grammar' não encontrada. Verifique se o CategorySeeder rodou!");
                                return;
                        }

                        // 2. Mapear os dados brutos para entidades Question
                        List<Question> questionsToSave = new ArrayList<>();
                        for (QuestionData data : initialQuestionsData) {
                                Category category = data.categoryName.equals("Grammar") ? grammarCategory
                                                : categoryRepository.findByName(data.categoryName);
                                if (category == null) {
                                        System.err.println("ERRO: Categoria '" + data.categoryName
                                                        + "' não encontrada para a pergunta: " + data.content);
                                        continue;
                                }
                                questionsToSave.add(mapToQuestion(data, category));
                        }

                        // 3. Salvar no banco
                        questionRepository.saveAll(questionsToSave);

                        System.out.println("-> População de perguntas concluída. Total: " + questionRepository.count());

                } else {
                        System.out.println("-> Perguntas já existem no banco (" + questionCount
                                        + "). Pulando o Data Seeding.");
                }
        }

        /**
         * Mapeia os dados brutos para o objeto Question (VERSÃO LIMPA)
         * Esta função não causa mais o erro de compilação.
         */
        private Question mapToQuestion(QuestionData data, Category category) {
                Question q = new Question();
                q.setContent(data.content);
                q.setContentTranslation(data.contentTranslation);
                q.setExplanation(data.explanation); // Corrigido (EN)
                q.setExplanationTranslation(data.explanationTranslation); // Corrigido (PT)
                q.setDifficultyLevel(data.difficultyLevel);
                q.setCategory(category);
                q.setStatus(QuestionStatus.ACTIVE);

                // Define os índices (0, 1, 2, 3) em cada opção
                // O seu modelo AnswerOption não tem 'index', então não podemos fazer
                // 'option.setIndex(i)'
                // Mas o frontend PRECISA de um índice para enviar ao backend.
                // Vamos assumir que o frontend (quiz.html) está a definir o índice (data-index)
                // com base na ordem que a API retorna, o que já está a fazer.

                // Apenas definimos as opções
                q.setOptions(data.options);

                // NÃO definimos o correctOptionIndex (pois não existe no modelo Question)

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

                public QuestionData(String content, String contentTranslation, String explanation,
                                String explanationTranslation, DifficultyLevel difficultyLevel, String categoryName,
                                List<AnswerOption> options) {
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