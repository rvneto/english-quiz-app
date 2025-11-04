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
                            new AnswerOption("Why", false))),
            new QuestionData(
                    "The new mobile app really ___ after the media coverage, and downloads skyrocketed.",
                    "O novo aplicativo móvel realmente ___ depois da cobertura da mídia, e os downloads dispararam.",
                    "The phrasal verb 'take off' means to suddenly become successful or popular.",
                    "O phrasal verb 'take off' significa subitamente se tornar bem-sucedido ou popular.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("turned up", false),
                            new AnswerOption("put out", false),
                            new AnswerOption("took off", true),
                            new AnswerOption("held in", false)
                    )
            ),
            new QuestionData(
                    "All the younger students ___ the school captain because of his integrity and hard work.",
                    "Todos os estudantes mais jovens ___ o capitão da escola por causa de sua integridade e trabalho duro.",
                    "To 'look up to' someone means to admire or respect them.",
                    "O phrasal verb 'look up to' significa admirar ou respeitar alguém.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("look into", false),
                            new AnswerOption("look down on", false),
                            new AnswerOption("look up to", true),
                            new AnswerOption("look out for", false)
                    )
            ),
            new QuestionData(
                    "It took her several weeks to ___ the flu, but she is finally feeling well enough to return to work.",
                    "Levou várias semanas para ela ___ a gripe, mas ela finalmente está se sentindo bem o suficiente para voltar ao trabalho.",
                    "To 'get over' something means to recover from an illness, shock, or difficult experience.",
                    "O phrasal verb 'get over' significa se recuperar de uma doença, choque ou experiência difícil.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("get by", false),
                            new AnswerOption("get over", true),
                            new AnswerOption("get along", false),
                            new AnswerOption("get into", false)
                    )
            ),
            new QuestionData(
                    "We had to ___ the meeting until next Tuesday because the main speaker was ill.",
                    "Tivemos que ___ a reunião até a próxima terça-feira porque o palestrante principal estava doente.",
                    "To 'put off' is a common phrasal verb meaning to postpone or delay an event or action.",
                    "O phrasal verb 'put off' é comum e significa adiar ou postergar um evento ou ação.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("put up", false),
                            new AnswerOption("put off", true),
                            new AnswerOption("put down", false),
                            new AnswerOption("put across", false)
                    )
            ),
            new QuestionData(
                    "I accidentally ___ an old photograph of my grandparents while I was cleaning the attic.",
                    "Eu acidentalmente ___ uma foto antiga dos meus avós enquanto estava limpando o sótão.",
                    "To 'come across' means to find something or someone by chance.",
                    "O phrasal verb 'come across' significa encontrar algo ou alguém por acaso.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("came out", false),
                            new AnswerOption("came up with", false),
                            new AnswerOption("came down", false),
                            new AnswerOption("came across", true)
                    )
            ),
            new QuestionData(
                    "The presentation had to be cut short because the projector suddenly ___ battery power.",
                    "A apresentação teve que ser interrompida porque o projetor de repente ___ a bateria.",
                    "To 'run out of' something means to use up or finish your supply of it.",
                    "O phrasal verb 'run out of' significa esgotar ou terminar seu estoque de algo.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("ran into", false),
                            new AnswerOption("ran out of", true),
                            new AnswerOption("ran down", false),
                            new AnswerOption("ran over", false)
                    )
            ),
            new QuestionData(
                    "Our car ___ on the highway, and we had to call for a tow truck.",
                    "Nosso carro ___ na rodovia, e tivemos que chamar um guincho.",
                    "When a machine or vehicle 'breaks down,' it stops working.",
                    "Quando uma máquina ou veículo 'breaks down,' isso significa que parou de funcionar.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("broke in", false),
                            new AnswerOption("broke up", false),
                            new AnswerOption("broke down", true),
                            new AnswerOption("broke out", false)
                    )
            ),
            new QuestionData(
                    "The team was instructed to ___ a thorough investigation of the incident.",
                    "A equipe foi instruída a ___ uma investigação completa do incidente.",
                    "To 'carry out' means to perform or execute a task, plan, or instruction.",
                    "O phrasal verb 'carry out' significa executar ou realizar uma tarefa, plano ou instrução.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("carry on", false),
                            new AnswerOption("carry away", false),
                            new AnswerOption("carry out", true),
                            new AnswerOption("carry off", false)
                    )
            ),
            new QuestionData(
                    "Could you please ___ for a moment? I need to check something on my computer.",
                    "Você poderia, por favor, ___ por um momento? Preciso verificar algo no meu computador.",
                    "The phrasal verb 'hold on' means to wait for a short time.",
                    "O phrasal verb 'hold on' significa esperar por um curto período de tempo.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("hold back", false),
                            new AnswerOption("hold up", false),
                            new AnswerOption("hold on", true),
                            new AnswerOption("hold out", false)
                    )
            ),
            new QuestionData(
                    "She decided not to ___ the issue of the pay raise during the first meeting.",
                    "Ela decidiu não ___ a questão do aumento salarial durante a primeira reunião.",
                    "To 'bring up' means to introduce a topic into a conversation or discussion.",
                    "O phrasal verb 'bring up' significa introduzir um tópico em uma conversa ou discussão.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("bring about", false),
                            new AnswerOption("bring around", false),
                            new AnswerOption("bring up", true),
                            new AnswerOption("bring off", false)
                    )
            ),
            new QuestionData(
                    "I always ___ at 7:00 AM, even on weekends.",
                    "Eu sempre ___ às 7:00 da manhã, mesmo nos fins de semana.",
                    "The phrasal verb 'wake up' means to stop sleeping, which fits the context of a morning routine.",
                    "O phrasal verb 'wake up' significa parar de dormir, o que se encaixa no contexto de uma rotina matinal.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("look for", false),
                            new AnswerOption("wake up", true),
                            new AnswerOption("go back", false),
                            new AnswerOption("turn down", false)
                    )
            ),
            new QuestionData(
                    "It is cold outside, so you should ___ your coat.",
                    "Está frio lá fora, então você deve ___ seu casaco.",
                    "To 'put on' means to place an item of clothing on your body.",
                    "O phrasal verb 'put on' significa vestir uma peça de roupa.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("get off", false),
                            new AnswerOption("take over", false),
                            new AnswerOption("put on", true),
                            new AnswerOption("give in", false)
                    )
            ),
            new QuestionData(
                    "Please ___ the light before you leave the room.",
                    "Por favor, ___ a luz antes de sair da sala.",
                    "To 'turn off' means to stop the flow of electricity to a device, like a light.",
                    "O phrasal verb 'turn off' significa desligar o fluxo de eletricidade para um aparelho, como uma luz.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("call back", false),
                            new AnswerOption("get up", false),
                            new AnswerOption("turn off", true),
                            new AnswerOption("pass out", false)
                    )
            ),
            new QuestionData(
                    "She is ___ her keys; she cannot find them anywhere.",
                    "Ela está ___ as chaves dela; ela não as consegue encontrar em lugar nenhum.",
                    "The phrasal verb 'look for' means to search for something you have lost.",
                    "O phrasal verb 'look for' significa procurar por algo que você perdeu.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("looking for", true),
                            new AnswerOption("looking up", false),
                            new AnswerOption("looking out", false),
                            new AnswerOption("looking at", false)
                    )
            ),
            new QuestionData(
                    "Let's ___ to the park this afternoon.",
                    "Vamos ___ ao parque esta tarde.",
                    "To 'go out' means to leave your home to go to a public place, like a park.",
                    "O phrasal verb 'go out' significa sair de casa para ir a um lugar público, como um parque.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("hold on", false),
                            new AnswerOption("run into", false),
                            new AnswerOption("go out", true),
                            new AnswerOption("break down", false)
                    )
            ),
            new QuestionData(
                    "He said he would ___ home after finishing his errands.",
                    "Ele disse que iria ___ para casa depois de terminar seus recados.",
                    "To 'come back' means to return to a place, such as home.",
                    "O phrasal verb 'come back' significa retornar a um lugar, como para casa.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("take off", false),
                            new AnswerOption("come back", true),
                            new AnswerOption("set up", false),
                            new AnswerOption("show up", false)
                    )
            ),
            new QuestionData(
                    "It's a difficult puzzle, but don't ___! Keep trying.",
                    "É um quebra-cabeça difícil, mas não ___! Continue tentando.",
                    "To 'give up' means to stop trying to do something.",
                    "O phrasal verb 'give up' significa parar de tentar fazer algo.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("give off", false),
                            new AnswerOption("give in", false),
                            new AnswerOption("give up", true),
                            new AnswerOption("give away", false)
                    )
            ),
            new QuestionData(
                    "Every morning, I ___ at 7:00 and start my day.",
                    "Todas as manhãs, eu ___ às 7:00 e começo o meu dia.",
                    "The phrasal verb 'get up' means to rise from bed after waking up.",
                    "O phrasal verb 'get up' significa levantar-se da cama depois de acordar.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("try on", false),
                            new AnswerOption("get up", true),
                            new AnswerOption("find out", false),
                            new AnswerOption("put away", false)
                    )
            ),
            new QuestionData(
                    "When you come inside, please ___ your hat.",
                    "Quando você entrar, por favor, ___ seu chapéu.",
                    "To 'take off' means to remove clothing or accessories from your body.",
                    "O phrasal verb 'take off' significa remover roupas ou acessórios do seu corpo.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("go on", false),
                            new AnswerOption("take off", true),
                            new AnswerOption("run out", false),
                            new AnswerOption("hang up", false)
                    )
            ),
            new QuestionData(
                    "I can't talk right now, but I will ___ you ___ later this afternoon.",
                    "Não posso falar agora, mas eu vou ___ para você ___ mais tarde esta tarde.",
                    "The separable phrasal verb 'call back' means to return a phone call to someone.",
                    "O phrasal verb separável 'call back' significa retornar uma ligação telefônica para alguém.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("drop / off", false),
                            new AnswerOption("pick / up", false),
                            new AnswerOption("call / back", true),
                            new AnswerOption("look / after", false)
                    )
            ));

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