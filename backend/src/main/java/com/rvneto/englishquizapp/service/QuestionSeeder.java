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
            // INICIO

            // BEGINNER - Grammar
            new QuestionData(
                    "She ___ a student in my class.",
                    "Ela ___ uma estudante na minha turma.",
                    "The correct form of the verb 'to be' for the third-person singular pronoun 'She' in the present tense is 'is'.",
                    "A forma correta do verbo 'to be' para o pronome 'She' na terceira pessoa do singular no presente é 'is'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("am", false),
                            new AnswerOption("are", false),
                            new AnswerOption("is", true),
                            new AnswerOption("be", false)
                    )
            ),
            new QuestionData(
                    "They ___ happy to see you.",
                    "Eles ___ felizes em te ver.",
                    "The correct form of the verb 'to be' for the plural pronoun 'They' in the present tense is 'are'.",
                    "A forma correta do verbo 'to be' para o pronome plural 'They' no presente é 'are'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("is", false),
                            new AnswerOption("are", true),
                            new AnswerOption("am", false),
                            new AnswerOption("be", false)
                    )
            ),
            new QuestionData(
                    "I ___ a new book every month.",
                    "Eu ___ um livro novo todo mês.",
                    "In the Simple Present, for the pronoun 'I', the verb remains in its base form.",
                    "No Presente Simples, para o pronome 'I', o verbo permanece na sua forma base.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("read", true),
                            new AnswerOption("reads", false),
                            new AnswerOption("reading", false),
                            new AnswerOption("to read", false)
                    )
            ),
            new QuestionData(
                    "He ___ to work every day.",
                    "Ele ___ para o trabalho todos os dias.",
                    "In the Simple Present, for third-person singular pronouns (He/She/It), we add 's' or 'es' to the main verb. For 'go', we add 'es'.",
                    "No Presente Simples, para pronomes da terceira pessoa do singular (He/She/It), adicionamos 's' ou 'es' ao verbo principal. Para 'go', adicionamos 'es'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("go", false),
                            new AnswerOption("goes", true),
                            new AnswerOption("going", false),
                            new AnswerOption("went", false)
                    )
            ),
            new QuestionData(
                    "___ you like coffee?",
                    "___ você gosta de café?",
                    "The auxiliary verb 'Do' is used to form questions in the Simple Present for the pronoun 'you'.",
                    "O verbo auxiliar 'Do' é usado para formar perguntas no Presente Simples para o pronome 'you'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("Does", false),
                            new AnswerOption("Is", false),
                            new AnswerOption("Do", true),
                            new AnswerOption("Are", false)
                    )
            ),
            new QuestionData(
                    "___ she speak English?",
                    "___ ela fala inglês?",
                    "The auxiliary verb 'Does' is used to form questions in the Simple Present for the third-person singular pronoun 'she'.",
                    "O verbo auxiliar 'Does' é usado para formar perguntas no Presente Simples para o pronome 'she' (terceira pessoa do singular).",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("Do", false),
                            new AnswerOption("Does", true),
                            new AnswerOption("Is", false),
                            new AnswerOption("Are", false)
                    )
            ),
            new QuestionData(
                    "We ___ not live in a big city.",
                    "Nós ___ não moramos numa cidade grande.",
                    "The auxiliary 'do not' (don't) is used to form negative sentences in the Simple Present for 'we'.",
                    "O auxiliar 'do not' (don't) é usado para formar frases negativas no Presente Simples para 'we'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("does", false),
                            new AnswerOption("is", false),
                            new AnswerOption("do", true),
                            new AnswerOption("are", false)
                    )
            ),
            new QuestionData(
                    "It is ___ apple.",
                    "Isto é ___ maçã.",
                    "The indefinite article 'an' is used before words that start with a vowel sound, such as 'apple'.",
                    "O artigo indefinido 'an' é usado antes de palavras que começam com som de vogal, como 'apple'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("a", false),
                            new AnswerOption("an", true),
                            new AnswerOption("the", false),
                            new AnswerOption("no article", false)
                    )
            ),
            new QuestionData(
                    "This is ___ beautiful day.",
                    "Este é ___ lindo dia.",
                    "The indefinite article 'a' is used before words that start with a consonant sound, such as 'beautiful'.",
                    "O artigo indefinido 'a' é usado antes de palavras que começam com som de consoante, como 'beautiful'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("an", false),
                            new AnswerOption("the", false),
                            new AnswerOption("a", true),
                            new AnswerOption("some", false)
                    )
            ),
            new QuestionData(
                    "Can you give me ___ water, please?",
                    "Você pode me dar ___ água, por favor?",
                    "'Some' is used for uncountable nouns (like water) in affirmative requests.",
                    "'Some' é usado para substantivos incontáveis (como água) em pedidos afirmativos.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("many", false),
                            new AnswerOption("a", false),
                            new AnswerOption("some", true),
                            new AnswerOption("any", false)
                    )
            ),
            new QuestionData(
                    "I don't have ___ money right now.",
                    "Eu não tenho ___ dinheiro agora.",
                    "'Any' is used for uncountable nouns (like money) in negative sentences.",
                    "'Any' é usado para substantivos incontáveis (como dinheiro) em frases negativas.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("some", false),
                            new AnswerOption("much", false),
                            new AnswerOption("any", true),
                            new AnswerOption("a lot", false)
                    )
            ),
            new QuestionData(
                    "There ___ two books on the table.",
                    "Há ___ dois livros na mesa.",
                    "'There are' is used for plural countable nouns in the present tense.",
                    "'There are' é usado para substantivos contáveis no plural no presente.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("is", false),
                            new AnswerOption("are", true),
                            new AnswerOption("has", false),
                            new AnswerOption("have", false)
                    )
            ),
            new QuestionData(
                    "There ___ a cat in the box.",
                    "Há ___ um gato na caixa.",
                    "'There is' is used for singular countable nouns in the present tense.",
                    "'There is' é usado para substantivos contáveis no singular no presente.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("are", false),
                            new AnswerOption("be", false),
                            new AnswerOption("is", true),
                            new AnswerOption("were", false)
                    )
            ),
            new QuestionData(
                    "This is ___ car.",
                    "Este é ___ carro.",
                    "'My' is the possessive adjective used before the noun 'car' to show ownership by 'I'.",
                    "'My' é o adjetivo possessivo usado antes do substantivo 'carro' para mostrar posse por 'I'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("I", false),
                            new AnswerOption("mine", false),
                            new AnswerOption("my", true),
                            new AnswerOption("me", false)
                    )
            ),
            new QuestionData(
                    "That house is ___.",
                    "Aquela casa é ___.",
                    "'Ours' is the possessive pronoun that stands alone to show the house belongs to 'we'.",
                    "'Ours' é o pronome possessivo que fica sozinho para mostrar que a casa pertence a 'we'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("our", false),
                            new AnswerOption("we", false),
                            new AnswerOption("ours", true),
                            new AnswerOption("us", false)
                    )
            ),
            new QuestionData(
                    "I saw ___ yesterday at the store.",
                    "Eu vi ___ ontem na loja.",
                    "'Him' is the object pronoun for the third-person singular male, used after the verb 'saw'.",
                    "'Him' é o pronome objeto para a terceira pessoa do singular masculino, usado após o verbo 'saw'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("he", false),
                            new AnswerOption("his", false),
                            new AnswerOption("him", true),
                            new AnswerOption("hisself", false)
                    )
            ),
            new QuestionData(
                    "The cat is ___ the chair.",
                    "O gato está ___ a cadeira.",
                    "'On' is the preposition of place used to indicate that something is physically supported by the surface of another object.",
                    "'On' é a preposição de lugar usada para indicar que algo está fisicamente apoiado na superfície de outro objeto.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("at", false),
                            new AnswerOption("on", true),
                            new AnswerOption("under", false),
                            new AnswerOption("from", false)
                    )
            ),
            new QuestionData(
                    "I wake up ___ seven o'clock.",
                    "Eu acordo ___ sete horas.",
                    "'At' is the preposition of time used before specific clock times.",
                    "'At' é a preposição de tempo usada antes de horários específicos.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("in", false),
                            new AnswerOption("on", false),
                            new AnswerOption("at", true),
                            new AnswerOption("by", false)
                    )
            ),
            new QuestionData(
                    "We go to school ___ bus.",
                    "Nós vamos para a escola ___ ônibus.",
                    "'By' is the preposition used to indicate the means of transportation.",
                    "'By' é a preposição usada para indicar o meio de transporte.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("on", false),
                            new AnswerOption("in", false),
                            new AnswerOption("by", true),
                            new AnswerOption("with", false)
                    )
            ),
            new QuestionData(
                    "She ___ watching TV right now.",
                    "Ela ___ assistindo TV agora.",
                    "The Present Continuous requires the verb 'to be' ('is' for 'she') plus the main verb with '-ing'.",
                    "O Presente Contínuo requer o verbo 'to be' ('is' para 'she') mais o verbo principal com '-ing'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("do", false),
                            new AnswerOption("is", true),
                            new AnswerOption("are", false),
                            new AnswerOption("have", false)
                    )
            ),
            new QuestionData(
                    "They are ___ football outside.",
                    "Eles estão ___ futebol lá fora.",
                    "The Present Continuous uses the main verb with the '-ing' ending.",
                    "O Presente Contínuo usa o verbo principal com a terminação '-ing'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("play", false),
                            new AnswerOption("plays", false),
                            new AnswerOption("played", false),
                            new AnswerOption("playing", true)
                    )
            ),
            new QuestionData(
                    "I ___ watching TV last night.",
                    "Eu ___ assistindo TV na noite passada.",
                    "'Was' is the correct form of the verb 'to be' in the Simple Past for 'I'.",
                    "'Was' é a forma correta do verbo 'to be' no Passado Simples para 'I'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("were", false),
                            new AnswerOption("am", false),
                            new AnswerOption("was", true),
                            new AnswerOption("is", false)
                    )
            ),
            new QuestionData(
                    "We ___ at the cinema yesterday.",
                    "Nós ___ no cinema ontem.",
                    "'Were' is the correct form of the verb 'to be' in the Simple Past for the pronoun 'We'.",
                    "'Were' é a forma correta do verbo 'to be' no Passado Simples para o pronome 'We'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("was", false),
                            new AnswerOption("are", false),
                            new AnswerOption("were", true),
                            new AnswerOption("is", false)
                    )
            ),
            new QuestionData(
                    "She ___ to the party last weekend.",
                    "Ela ___ para a festa no fim de semana passado.",
                    "'Went' is the Simple Past form of the irregular verb 'go'.",
                    "'Went' é a forma do Passado Simples do verbo irregular 'go'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("go", false),
                            new AnswerOption("goes", false),
                            new AnswerOption("went", true),
                            new AnswerOption("gone", false)
                    )
            ),
            new QuestionData(
                    "They ___ their homework two hours ago.",
                    "Eles ___ a tarefa de casa deles duas horas atrás.",
                    "'Did' is the Simple Past form of the irregular verb 'do'.",
                    "'Did' é a forma do Passado Simples do verbo irregular 'do'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("do", false),
                            new AnswerOption("done", false),
                            new AnswerOption("did", true),
                            new AnswerOption("doing", false)
                    )
            ),
            new QuestionData(
                    "I ___ not go to the meeting.",
                    "Eu ___ não fui à reunião.",
                    "The auxiliary 'did not' (didn't) is used to form negative sentences in the Simple Past.",
                    "O auxiliar 'did not' (didn't) é usado para formar frases negativas no Passado Simples.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("do", false),
                            new AnswerOption("does", false),
                            new AnswerOption("did", true),
                            new AnswerOption("am", false)
                    )
            ),
            new QuestionData(
                    "___ you call me yesterday?",
                    "___ você me ligou ontem?",
                    "The auxiliary 'Did' is used to form questions in the Simple Past.",
                    "O auxiliar 'Did' é usado para formar perguntas no Passado Simples.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("Do", false),
                            new AnswerOption("Are", false),
                            new AnswerOption("Did", true),
                            new AnswerOption("Does", false)
                    )
            ),
            new QuestionData(
                    "We will ___ a movie tomorrow.",
                    "Nós vamos ___ um filme amanhã.",
                    "After the modal verb 'will', the main verb must be in its base form.",
                    "Após o verbo modal 'will', o verbo principal deve estar na sua forma base.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("watching", false),
                            new AnswerOption("watched", false),
                            new AnswerOption("watch", true),
                            new AnswerOption("to watch", false)
                    )
            ),
            new QuestionData(
                    "She ___ visit her grandmother next week.",
                    "Ela ___ visitar a avó dela na próxima semana.",
                    "'Will' is the auxiliary verb used to express the future tense.",
                    "'Will' é o verbo auxiliar usado para expressar o tempo futuro.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("is", false),
                            new AnswerOption("does", false),
                            new AnswerOption("will", true),
                            new AnswerOption("do", false)
                    )
            ),
            new QuestionData(
                    "I am going ___ dinner tonight.",
                    "Eu vou ___ o jantar hoje à noite.",
                    "The structure 'be going to' for the future requires the base form of the main verb ('have' in this case).",
                    "A estrutura 'be going to' para o futuro requer a forma base do verbo principal ('have' neste caso).",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("had", false),
                            new AnswerOption("to have", true),
                            new AnswerOption("having", false),
                            new AnswerOption("have", false) // 'to have' is slightly better here for the full infinitive, but 'have' alone is technically wrong after 'going' unless it's a gerund construction, which is not the case here. 'to have' is the required part of the infinitive to complete the 'going to' structure.
                    )
            ),
            new QuestionData(
                    "These are ___ shoes.",
                    "Estes são ___ sapatos.",
                    "'My' is the possessive adjective used before a plural noun.",
                    "'My' é o adjetivo possessivo usado antes de um substantivo plural.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("I", false),
                            new AnswerOption("mine", false),
                            new AnswerOption("my", true),
                            new AnswerOption("me", false)
                    )
            ),
            new QuestionData(
                    "___ book is this?",
                    "___ livro é este?",
                    "'Whose' is the interrogative pronoun used to ask about possession.",
                    "'Whose' é o pronome interrogativo usado para perguntar sobre posse.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("Who", false),
                            new AnswerOption("What", false),
                            new AnswerOption("Whose", true),
                            new AnswerOption("Which", false)
                    )
            ),
            new QuestionData(
                    "I live ___ a small apartment.",
                    "Eu moro ___ um apartamento pequeno.",
                    "'In' is the preposition of place used to indicate being inside a relatively large space like a building or room.",
                    "'In' é a preposição de lugar usada para indicar estar dentro de um espaço relativamente grande, como um prédio ou cômodo.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("on", false),
                            new AnswerOption("at", false),
                            new AnswerOption("in", true),
                            new AnswerOption("to", false)
                    )
            ),
            new QuestionData(
                    "The meeting is ___ Monday.",
                    "A reunião é ___ segunda-feira.",
                    "'On' is the preposition of time used for days of the week.",
                    "'On' é a preposição de tempo usada para os dias da semana.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("in", false),
                            new AnswerOption("at", false),
                            new AnswerOption("on", true),
                            new AnswerOption("from", false)
                    )
            ),
            new QuestionData(
                    "We went there ___ 2020.",
                    "Nós fomos lá ___ 2020.",
                    "'In' is the preposition of time used for years.",
                    "'In' é a preposição de tempo usada para anos.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("at", false),
                            new AnswerOption("on", false),
                            new AnswerOption("in", true),
                            new AnswerOption("of", false)
                    )
            ),
            new QuestionData(
                    "She has ___ dog.",
                    "Ela tem ___ cachorro.",
                    "The indefinite article 'a' is used before singular countable nouns starting with a consonant sound.",
                    "O artigo indefinido 'a' é usado antes de substantivos contáveis no singular que começam com som de consoante.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("an", false),
                            new AnswerOption("the", false),
                            new AnswerOption("a", true),
                            new AnswerOption("some", false)
                    )
            ),
            new QuestionData(
                    "Are there ___ students in the library?",
                    "Há ___ estudantes na biblioteca?",
                    "'Any' is used for plural countable nouns (like students) in questions.",
                    "'Any' é usado para substantivos contáveis no plural (como estudantes) em perguntas.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("some", false),
                            new AnswerOption("a", false),
                            new AnswerOption("many", false),
                            new AnswerOption("any", true)
                    )
            ),
            new QuestionData(
                    "We need to buy ___ milk.",
                    "Nós precisamos comprar ___ leite.",
                    "'Some' is used for uncountable nouns (like milk) in affirmative sentences.",
                    "'Some' é usado para substantivos incontáveis (como leite) em frases afirmativas.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("a", false),
                            new AnswerOption("an", false),
                            new AnswerOption("some", true),
                            new AnswerOption("any", false)
                    )
            ),
            new QuestionData(
                    "That is ___ orange jacket.",
                    "Aquela é ___ jaqueta laranja.",
                    "The indefinite article 'an' is used before words that start with a vowel sound, like 'orange'.",
                    "O artigo indefinido 'an' é usado antes de palavras que começam com som de vogal, como 'orange'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("a", false),
                            new AnswerOption("the", false),
                            new AnswerOption("an", true),
                            new AnswerOption("some", false)
                    )
            ),
            new QuestionData(
                    "The children ___ playing outside now.",
                    "As crianças ___ brincando lá fora agora.",
                    "The verb 'to be' for the plural subject 'The children' in the Present Continuous is 'are'.",
                    "O verbo 'to be' para o sujeito plural 'The children' no Presente Contínuo é 'are'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("is", false),
                            new AnswerOption("am", false),
                            new AnswerOption("are", true),
                            new AnswerOption("be", false)
                    )
            ),
            new QuestionData(
                    "I ___ eat vegetables every day.",
                    "Eu ___ como vegetais todos os dias.",
                    "The auxiliary 'do' is used in the Simple Present for the pronoun 'I' to make negative statements (do not).",
                    "O auxiliar 'do' é usado no Presente Simples para o pronome 'I' para fazer afirmações negativas (do not).",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("don't", true),
                            new AnswerOption("doesn't", false),
                            new AnswerOption("isn't", false),
                            new AnswerOption("aren't", false)
                    )
            ),
            new QuestionData(
                    "She ___ not like pizza.",
                    "Ela ___ não gosta de pizza.",
                    "The auxiliary 'does not' (doesn't) is used to form negative sentences in the Simple Present for 'she'.",
                    "O auxiliar 'does not' (doesn't) é usado para formar frases negativas no Presente Simples para 'she'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("do", false),
                            new AnswerOption("does", true),
                            new AnswerOption("is", false),
                            new AnswerOption("am", false)
                    )
            ),
            new QuestionData(
                    "That is ___ phone.",
                    "Aquele é ___ telefone.",
                    "'Her' is the possessive adjective for 'she', used before the noun.",
                    "'Her' é o adjetivo possessivo para 'she', usado antes do substantivo.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("she", false),
                            new AnswerOption("hers", false),
                            new AnswerOption("her", true),
                            new AnswerOption("it", false)
                    )
            ),
            new QuestionData(
                    "The keys are ___ the table.",
                    "As chaves estão ___ a mesa.",
                    "'Under' is a basic preposition of place indicating a position below something.",
                    "'Under' é uma preposição de lugar básica que indica uma posição abaixo de algo.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("in", false),
                            new AnswerOption("at", false),
                            new AnswerOption("under", true),
                            new AnswerOption("to", false)
                    )
            ),
            new QuestionData(
                    "We are talking ___ the new project.",
                    "Nós estamos falando ___ o novo projeto.",
                    "'About' is a common preposition used to indicate the subject of a discussion.",
                    "'About' é uma preposição comum usada para indicar o assunto de uma discussão.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("to", false),
                            new AnswerOption("for", false),
                            new AnswerOption("about", true),
                            new AnswerOption("from", false)
                    )
            ),
            new QuestionData(
                    "I was born ___ July.",
                    "Eu nasci ___ julho.",
                    "'In' is the preposition of time used for months.",
                    "'In' é a preposição de tempo usada para meses.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("at", false),
                            new AnswerOption("on", false),
                            new AnswerOption("in", true),
                            new AnswerOption("of", false)
                    )
            ),
            new QuestionData(
                    "She has two ___.",
                    "Ela tem dois ___.",
                    "The plural of the irregular noun 'child' is 'children'.",
                    "O plural do substantivo irregular 'child' é 'children'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("childs", false),
                            new AnswerOption("child", false),
                            new AnswerOption("children", true),
                            new AnswerOption("childres", false)
                    )
            ),
            new QuestionData(
                    "How ___ sugar do you want in your tea?",
                    "Quanto ___ açúcar você quer no seu chá?",
                    "'Much' is used with uncountable nouns like 'sugar' in questions.",
                    "'Much' é usado com substantivos incontáveis como 'sugar' em perguntas.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("many", false),
                            new AnswerOption("much", true),
                            new AnswerOption("some", false),
                            new AnswerOption("a few", false)
                    )
            ),
            new QuestionData(
                    "How ___ books did you buy?",
                    "Quantos ___ livros você comprou?",
                    "'Many' is used with plural countable nouns like 'books' in questions.",
                    "'Many' é usado com substantivos contáveis no plural como 'books' em perguntas.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("much", false),
                            new AnswerOption("many", true),
                            new AnswerOption("a little", false),
                            new AnswerOption("some", false)
                    )
            ),
            new QuestionData(
                    "Can you help ___ with this exercise?",
                    "Você pode ajudar ___ com este exercício?",
                    "'Me' is the object pronoun for 'I', used after the verb 'help'.",
                    "'Me' é o pronome objeto para 'I', usado após o verbo 'help'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("I", false),
                            new AnswerOption("my", false),
                            new AnswerOption("me", true),
                            new AnswerOption("mine", false)
                    )
            ),
            new QuestionData(
                    "We are going to the beach ___ summer.",
                    "Nós vamos para a praia ___ verão.",
                    "'In' is the preposition of time used for seasons.",
                    "'In' é a preposição de tempo usada para estações do ano.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("at", false),
                            new AnswerOption("on", false),
                            new AnswerOption("in", true),
                            new AnswerOption("to", false)
                    )
            ),
            new QuestionData(
                    "Where ___ you from?",
                    "De onde ___ você?",
                    "The correct form of the verb 'to be' for the pronoun 'you' in the present tense is 'are'.",
                    "A forma correta do verbo 'to be' para o pronome 'you' no presente é 'are'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("is", false),
                            new AnswerOption("am", false),
                            new AnswerOption("are", true),
                            new AnswerOption("be", false)
                    )
            ),
            new QuestionData(
                    "This is ___ old building.",
                    "Este é ___ prédio antigo.",
                    "The indefinite article 'an' is used before words that start with a vowel sound, like 'old'.",
                    "O artigo indefinido 'an' é usado antes de palavras que começam com som de vogal, como 'old'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("a", false),
                            new AnswerOption("the", false),
                            new AnswerOption("an", true),
                            new AnswerOption("some", false)
                    )
            ),
            new QuestionData(
                    "I live ___ a house.",
                    "Eu moro ___ uma casa.",
                    "'In' is the preposition of place used to indicate being inside a dwelling.",
                    "'In' é a preposição de lugar usada para indicar estar dentro de uma moradia.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("on", false),
                            new AnswerOption("at", false),
                            new AnswerOption("in", true),
                            new AnswerOption("to", false)
                    )
            ),
            new QuestionData(
                    "They ___ watching a movie now.",
                    "Eles ___ assistindo a um filme agora.",
                    "The verb 'to be' for the plural pronoun 'They' in the Present Continuous is 'are'.",
                    "O verbo 'to be' para o pronome plural 'They' no Presente Contínuo é 'are'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("is", false),
                            new AnswerOption("am", false),
                            new AnswerOption("are", true),
                            new AnswerOption("do", false)
                    )
            ),
            new QuestionData(
                    "He ___ study for the test.",
                    "Ele ___ estudar para a prova.",
                    "The auxiliary 'does' is used in the Simple Present for the pronoun 'he' to make negative statements (does not).",
                    "O auxiliar 'does' é usado no Presente Simples para o pronome 'he' para fazer afirmações negativas (does not).",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("don't", false),
                            new AnswerOption("do", false),
                            new AnswerOption("doesn't", true),
                            new AnswerOption("aren't", false)
                    )
            ),
            new QuestionData(
                    "She ___ in the park yesterday.",
                    "Ela ___ no parque ontem.",
                    "'Was' is the Simple Past form of the verb 'to be' for the third-person singular pronoun 'She'.",
                    "'Was' é a forma do Passado Simples do verbo 'to be' para o pronome 'She' (terceira pessoa do singular).",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("were", false),
                            new AnswerOption("is", false),
                            new AnswerOption("was", true),
                            new AnswerOption("are", false)
                    )
            ),
            new QuestionData(
                    "We ___ pizza for dinner last night.",
                    "Nós ___ pizza no jantar na noite passada.",
                    "'Ate' is the Simple Past form of the irregular verb 'eat'.",
                    "'Ate' é a forma do Passado Simples do verbo irregular 'eat'.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("eat", false),
                            new AnswerOption("eats", false),
                            new AnswerOption("eaten", false),
                            new AnswerOption("ate", true)
                    )
            ),
            new QuestionData(
                    "I will ___ you tomorrow.",
                    "Eu vou ___ você amanhã.",
                    "After the modal verb 'will', the main verb must be in its base form.",
                    "Após o verbo modal 'will', o verbo principal deve estar na sua forma base.",
                    DifficultyLevel.BEGINNER, "Grammar",
                    Arrays.asList(
                            new AnswerOption("seeing", false),
                            new AnswerOption("saw", false),
                            new AnswerOption("see", true),
                            new AnswerOption("to see", false)
                    )
            ),

            // INTERMEDIATE - Grammar
            new QuestionData(
                    "If I ___ the lottery, I would buy a big house.",
                    "Se eu ___ na loteria, eu compraria uma casa grande.",
                    "This is an example of the Second Conditional, used for hypothetical situations. The past simple form of the verb ('won') is used in the 'if' clause.",
                    "Este é um exemplo do Segundo Condicional, usado para situações hipotéticas. A forma do Simple Past do verbo ('won') é usada na cláusula 'if'.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("win", false),
                            new AnswerOption("will win", false),
                            new AnswerOption("won", true),
                            new AnswerOption("have won", false)
                    )
            ),
            new QuestionData(
                    "She has ___ Paris three times this year.",
                    "Ela ___ Paris três vezes este ano.",
                    "The Present Perfect ('has been to') is used here to talk about experiences or visits completed in an unfinished time period ('this year'). 'Been to' implies a visit and return.",
                    "O Present Perfect ('has been to') é usado aqui para falar sobre experiências ou visitas completadas num período de tempo inacabado ('this year'). 'Been to' implica uma visita e retorno.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("go to", false),
                            new AnswerOption("went to", false),
                            new AnswerOption("been to", true),
                            new AnswerOption("gone to", false)
                    )
            ),
            new QuestionData(
                    "When I arrived, they ___ dinner.",
                    "Quando eu cheguei, eles ___ o jantar.",
                    "The Past Continuous ('were having') is used to describe an ongoing action that was interrupted by a short, completed action (Simple Past: 'arrived').",
                    "O Past Continuous ('were having') é usado para descrever uma ação contínua que foi interrompida por uma ação curta e completa (Simple Past: 'arrived').",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("had", false),
                            new AnswerOption("have", false),
                            new AnswerOption("were having", true),
                            new AnswerOption("are having", false)
                    )
            ),
            new QuestionData(
                    "He is ___ taller than his brother.",
                    "Ele é ___ mais alto que o irmão dele.",
                    "'Much' is used to emphasize a large difference in comparative adjectives.",
                    "'Much' é usado para enfatizar uma grande diferença em adjetivos comparativos.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("a lot of", false),
                            new AnswerOption("very", false),
                            new AnswerOption("much", true),
                            new AnswerOption("too", false)
                    )
            ),
            new QuestionData(
                    "This book is ___ interesting than the last one I read.",
                    "Este livro é ___ interessante que o último que li.",
                    "'More' is used to form the comparative of long adjectives (like 'interesting').",
                    "'More' é usado para formar o comparativo de adjetivos longos (como 'interesting').",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("most", false),
                            new AnswerOption("many", false),
                            new AnswerOption("more", true),
                            new AnswerOption("much", false)
                    )
            ),
            new QuestionData(
                    "I look forward ___ you again soon.",
                    "Eu anseio ___ você novamente em breve.",
                    "The phrase 'look forward to' is followed by the gerund (verb + -ing), as 'to' is a preposition here.",
                    "A frase 'look forward to' é seguida pelo gerúndio (verbo + -ing), já que 'to' é uma preposição aqui.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("see", false),
                            new AnswerOption("to see", false),
                            new AnswerOption("seeing", true),
                            new AnswerOption("saw", false)
                    )
            ),
            new QuestionData(
                    "The letter ___ by the secretary this morning.",
                    "A carta ___ pela secretária esta manhã.",
                    "This is the Simple Past Passive voice: 'The letter' (singular subject) + 'was' + Past Participle ('written').",
                    "Esta é a voz Passiva no Simple Past: 'The letter' (sujeito singular) + 'was' + Particípio Passado ('written').",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("wrote", false),
                            new AnswerOption("was wrote", false),
                            new AnswerOption("was written", true),
                            new AnswerOption("is written", false)
                    )
            ),
            new QuestionData(
                    "She has never ___ to an opera before.",
                    "Ela nunca ___ a uma ópera antes.",
                    "The Present Perfect requires the Past Participle ('listened') of the main verb after 'has/have'.",
                    "O Present Perfect requer o Particípio Passado ('listened') do verbo principal após 'has/have'.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("listen", false),
                            new AnswerOption("listening", false),
                            new AnswerOption("listened", true),
                            new AnswerOption("listenes", false)
                    )
            ),
            new QuestionData(
                    "You ___ study if you want to pass the exam.",
                    "Você ___ estudar se quiser passar no exame.",
                    "'Should' is a modal verb used to give advice or express obligation/recommendation.",
                    "'Should' é um verbo modal usado para dar conselhos ou expressar obrigação/recomendação.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("must to", false),
                            new AnswerOption("should", true),
                            new AnswerOption("are able to", false),
                            new AnswerOption("might", false)
                    )
            ),
            new QuestionData(
                    "If it ___ tomorrow, we will stay at home.",
                    "Se ___ amanhã, ficaremos em casa.",
                    "This is the First Conditional, used for real possibilities. The 'if' clause uses the Simple Present ('rains').",
                    "Este é o Primeiro Condicional, usado para possibilidades reais. A cláusula 'if' usa o Simple Present ('rains').",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("will rain", false),
                            new AnswerOption("rained", false),
                            new AnswerOption("rains", true),
                            new AnswerOption("is raining", false)
                    )
            ),
            new QuestionData(
                    "I used ___ live in New York, but now I live in London.",
                    "Eu costumava ___ em Nova York, mas agora moro em Londres.",
                    "'Used to' is followed by the base form of the verb (infinitive without 'to') and expresses past habits or states.",
                    "'Used to' é seguido pela forma base do verbo (infinitivo sem 'to') e expressa hábitos ou estados passados.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("to living", false),
                            new AnswerOption("to live", true),
                            new AnswerOption("living", false),
                            new AnswerOption("live", false)
                    )
            ),
            new QuestionData(
                    "We need to hurry ___ we will miss the train.",
                    "Precisamos nos apressar ___ perderemos o trem.",
                    "'Or else' (or 'otherwise') is used to introduce the negative consequence of not performing the action in the main clause.",
                    "'Or else' (ou 'otherwise') é usado para introduzir a consequência negativa de não realizar a ação na oração principal.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("although", false),
                            new AnswerOption("unless", false),
                            new AnswerOption("or else", true),
                            new AnswerOption("despite", false)
                    )
            ),
            new QuestionData(
                    "He started ___ when he was a teenager.",
                    "Ele começou ___ quando era adolescente.",
                    "The verb 'start' can be followed by either the gerund ('smoking') or the full infinitive ('to smoke') with little change in meaning. Gerund is a valid option.",
                    "O verbo 'start' pode ser seguido tanto pelo gerúndio ('smoking') quanto pelo infinitivo completo ('to smoke') com pouca mudança de significado. Gerúndio é uma opção válida.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("smoke", false),
                            new AnswerOption("to smoking", false),
                            new AnswerOption("smoking", true),
                            new AnswerOption("smokes", false)
                    )
            ),
            new QuestionData(
                    "I wish I ___ more time to travel.",
                    "Eu gostaria de ___ mais tempo para viajar.",
                    "'Wish' about a present situation uses the Simple Past form of the verb ('had').",
                    "'Wish' sobre uma situação presente usa a forma do Simple Past do verbo ('had').",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("have", false),
                            new AnswerOption("had", true),
                            new AnswerOption("would have", false),
                            new AnswerOption("will have", false)
                    )
            ),
            new QuestionData(
                    "She went to the store ___ buy some milk.",
                    "Ela foi à loja ___ comprar um pouco de leite.",
                    "The infinitive 'to buy' is used to express purpose (often equivalent to 'in order to buy').",
                    "O infinitivo 'to buy' é usado para expressar propósito (muitas vezes equivalente a 'in order to buy').",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("for", false),
                            new AnswerOption("buying", false),
                            new AnswerOption("to buy", true),
                            new AnswerOption("so that", false)
                    )
            ),
            new QuestionData(
                    "The manager is not here. He ___ lunch.",
                    "O gerente não está aqui. Ele ___ almoçar.",
                    "The Present Continuous ('is having') can be used to describe an action happening around the time of speaking (not necessarily at this precise moment), often implying temporary activities.",
                    "O Present Continuous ('is having') pode ser usado para descrever uma ação que está acontecendo perto do momento da fala (não necessariamente neste momento exato), frequentemente implicando atividades temporárias.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("has", false),
                            new AnswerOption("have", false),
                            new AnswerOption("is having", true),
                            new AnswerOption("had", false)
                    )
            ),
            new QuestionData(
                    "We ___ already finished the hardest part of the project.",
                    "Nós ___ já terminamos a parte mais difícil do projeto.",
                    "The adverb 'already' is a common indicator of the Present Perfect tense, which requires 'have' + Past Participle ('finished').",
                    "O advérbio 'already' é um indicador comum do Present Perfect, que requer 'have' + Particípio Passado ('finished').",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("did", false),
                            new AnswerOption("were", false),
                            new AnswerOption("have", true),
                            new AnswerOption("are", false)
                    )
            ),
            new QuestionData(
                    "She has been working here ___ five years.",
                    "Ela tem trabalhado aqui ___ cinco anos.",
                    "'For' is used with a period of time (e.g., five years) to express duration.",
                    "'For' é usado com um período de tempo (ex: cinco anos) para expressar duração.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("since", false),
                            new AnswerOption("during", false),
                            new AnswerOption("for", true),
                            new AnswerOption("in", false)
                    )
            ),
            new QuestionData(
                    "I have lived in this city ___ 2010.",
                    "Eu moro nesta cidade ___ 2010.",
                    "'Since' is used with a point in time (e.g., 2010) to indicate the starting point of an action.",
                    "'Since' é usado com um ponto no tempo (ex: 2010) para indicar o ponto de partida de uma ação.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("for", false),
                            new AnswerOption("at", false),
                            new AnswerOption("since", true),
                            new AnswerOption("ago", false)
                    )
            ),
            new QuestionData(
                    "If you heat water to 100°C, it ___.",
                    "Se você aquecer água a 100°C, ela ___.",
                    "This is the Zero Conditional, used for facts and general truths. Both clauses use the Simple Present ('boils').",
                    "Este é o Zero Condicional, usado para fatos e verdades gerais. Ambas as cláusulas usam o Simple Present ('boils').",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("will boil", false),
                            new AnswerOption("boils", true),
                            new AnswerOption("is boiling", false),
                            new AnswerOption("boiled", false)
                    )
            ),
            new QuestionData(
                    "He's the man ___ house was destroyed by the fire.",
                    "Ele é o homem ___ casa foi destruída pelo fogo.",
                    "'Whose' is the relative pronoun used to show possession.",
                    "'Whose' é o pronome relativo usado para mostrar posse.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("who", false),
                            new AnswerOption("which", false),
                            new AnswerOption("whose", true),
                            new AnswerOption("whom", false)
                    )
            ),
            new QuestionData(
                    "I'm fed up ___ this constant rain.",
                    "Estou farto ___ esta chuva constante.",
                    "'Fed up with' is a common adjective + preposition collocation meaning tired or annoyed by something.",
                    "'Fed up with' é uma colocação comum de adjetivo + preposição que significa cansado ou irritado com algo.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("by", false),
                            new AnswerOption("of", false),
                            new AnswerOption("with", true),
                            new AnswerOption("about", false)
                    )
            ),
            new QuestionData(
                    "It ___ be sunny tomorrow, but I'm not sure.",
                    "Pode ___ ensolarado amanhã, mas não tenho certeza.",
                    "'Might' is a modal verb used to express low probability about the future.",
                    "'Might' é um verbo modal usado para expressar baixa probabilidade sobre o futuro.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("must", false),
                            new AnswerOption("should", false),
                            new AnswerOption("might", true),
                            new AnswerOption("can", false)
                    )
            ),
            new QuestionData(
                    "You look tired. You ___ go to bed early.",
                    "Você parece cansado. Você ___ ir para a cama cedo.",
                    "'Ought to' is used to express a strong recommendation or advice, similar to 'should'.",
                    "'Ought to' é usado para expressar uma forte recomendação ou conselho, similar a 'should'.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("must", false),
                            new AnswerOption("have to", false),
                            new AnswerOption("ought to", true),
                            new AnswerOption("need", false)
                    )
            ),
            new QuestionData(
                    "We spent the day ___ the city museum.",
                    "Passamos o dia ___ o museu da cidade.",
                    "The verb 'spend' (time/money) is often followed by a gerund (verb + -ing).",
                    "O verbo 'spend' (tempo/dinheiro/etc.) é frequentemente seguido por um gerúndio (verbo + -ing).",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("to visit", false),
                            new AnswerOption("visit", false),
                            new AnswerOption("visiting", true),
                            new AnswerOption("to be visiting", false)
                    )
            ),
            new QuestionData(
                    "The movie was ___ boring that I fell asleep.",
                    "O filme foi ___ chato que eu adormeci.",
                    "'So' is used with an adjective or adverb to express cause and effect.",
                    "'So' é usado com um adjetivo ou advérbio para expressar causa e efeito.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("such", false),
                            new AnswerOption("too", false),
                            new AnswerOption("so", true),
                            new AnswerOption("enough", false)
                    )
            ),
            new QuestionData(
                    "It was ___ a big surprise that I screamed.",
                    "Foi ___ uma grande surpresa que eu gritei.",
                    "'Such a/an' is used with a (modified) singular countable noun to express cause and effect.",
                    "'Such a/an' é usado com um substantivo contável singular (modificado) para expressar causa e efeito.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("so", false),
                            new AnswerOption("too", false),
                            new AnswerOption("such", true),
                            new AnswerOption("very", false)
                    )
            ),
            new QuestionData(
                    "I wish I ___ play the guitar better.",
                    "Eu gostaria de ___ tocar guitarra melhor.",
                    "'Wish' about a present ability or skill uses the Simple Past form of the modal verb ('could').",
                    "'Wish' sobre uma habilidade ou competência presente usa a forma do Simple Past do verbo modal ('could').",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("can", false),
                            new AnswerOption("will", false),
                            new AnswerOption("could", true),
                            new AnswerOption("would", false)
                    )
            ),
            new QuestionData(
                    "She promised ___ her room before going out.",
                    "Ela prometeu ___ seu quarto antes de sair.",
                    "The verb 'promise' is followed by the full infinitive ('to tidy').",
                    "O verbo 'promise' é seguido pelo infinitivo completo ('to tidy').",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("tidying", false),
                            new AnswerOption("tidy", false),
                            new AnswerOption("to tidy", true),
                            new AnswerOption("tidied", false)
                    )
            ),
            new QuestionData(
                    "I haven't seen her ___ Christmas.",
                    "Eu não a vejo ___ o Natal.",
                    "'Since' is used to indicate the starting point of a period of time up to the present.",
                    "'Since' é usado para indicar o ponto de partida de um período de tempo até o presente.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("for", false),
                            new AnswerOption("ago", false),
                            new AnswerOption("since", true),
                            new AnswerOption("in", false)
                    )
            ),
            new QuestionData(
                    "The parcel ___ last week by registered mail.",
                    "A encomenda ___ na semana passada por correio registado.",
                    "Simple Past Passive: 'was' + Past Participle ('sent').",
                    "Voz Passiva no Simple Past: 'was' + Particípio Passado ('sent').",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("send", false),
                            new AnswerOption("was send", false),
                            new AnswerOption("was sent", true),
                            new AnswerOption("has sent", false)
                    )
            ),
            new QuestionData(
                    "If you were rich, what ___ you buy?",
                    "Se você fosse rico, o que ___ você compraria?",
                    "The main clause of the Second Conditional uses 'would' + base verb ('would buy').",
                    "A oração principal do Segundo Condicional usa 'would' + verbo base ('would buy').",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("will", false),
                            new AnswerOption("did", false),
                            new AnswerOption("would", true),
                            new AnswerOption("do", false)
                    )
            ),
            new QuestionData(
                    "I remember ___ this movie when I was a child.",
                    "Eu me lembro ___ este filme quando eu era criança.",
                    "The verb 'remember' followed by the gerund ('watching') refers to a memory of a past event.",
                    "O verbo 'remember' seguido pelo gerúndio ('watching') refere-se a uma memória de um evento passado.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("to watch", false),
                            new AnswerOption("watch", false),
                            new AnswerOption("watching", true),
                            new AnswerOption("will watch", false)
                    )
            ),
            new QuestionData(
                    "You ___ park here. It's strictly forbidden.",
                    "Você ___ estacionar aqui. É estritamente proibido.",
                    "'Mustn't' (or 'must not') is used to express a strong prohibition or rule.",
                    "'Mustn't' (ou 'must not') é usado para expressar uma forte proibição ou regra.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("don't have to", false),
                            new AnswerOption("can't", false),
                            new AnswerOption("mustn't", true),
                            new AnswerOption("shouldn't", false)
                    )
            ),
            new QuestionData(
                    "The flight was delayed ___ the heavy snow.",
                    "O voo foi atrasado ___ a neve intensa.",
                    "'Due to' (or 'owing to') is used to express the reason for something, followed by a noun or noun phrase.",
                    "'Due to' (ou 'owing to') é usado para expressar a razão de algo, seguido por um substantivo ou frase nominal.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("because", false),
                            new AnswerOption("due to", true),
                            new AnswerOption("so that", false),
                            new AnswerOption("in order to", false)
                    )
            ),
            new QuestionData(
                    "We are planning ___ a trip to the mountains.",
                    "Estamos planejando ___ uma viagem para as montanhas.",
                    "The verb 'plan' is typically followed by the full infinitive ('to take').",
                    "O verbo 'plan' é tipicamente seguido pelo infinitivo completo ('to take').",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("taking", false),
                            new AnswerOption("to take", true),
                            new AnswerOption("take", false),
                            new AnswerOption("took", false)
                    )
            ),
            new QuestionData(
                    "The car, ___ was parked outside, was towed away.",
                    "O carro, ___ estava estacionado lá fora, foi rebocado.",
                    "'Which' is the relative pronoun used to refer to things (non-defining relative clause here).",
                    "'Which' é o pronome relativo usado para se referir a coisas (cláusula relativa não restritiva aqui).",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("who", false),
                            new AnswerOption("that", false),
                            new AnswerOption("which", true),
                            new AnswerOption("whose", false)
                    )
            ),
            new QuestionData(
                    "It is important ___ the instructions carefully.",
                    "É importante ___ as instruções cuidadosamente.",
                    "The structure 'It is + adjective + to-infinitive' is used to talk about the necessity or importance of an action.",
                    "A estrutura 'It is + adjetivo + to-infinitive' é usada para falar sobre a necessidade ou importância de uma ação.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("read", false),
                            new AnswerOption("reading", false),
                            new AnswerOption("to read", true),
                            new AnswerOption("reads", false)
                    )
            ),
            new QuestionData(
                    "___ all the difficulties, they managed to complete the project on time.",
                    "___ todas as dificuldades, eles conseguiram completar o projeto a tempo.",
                    "'Despite' is a preposition used to contrast an unexpected outcome with an obstacle, followed by a noun phrase.",
                    "'Despite' é uma preposição usada para contrastar um resultado inesperado com um obstáculo, seguida por uma frase nominal.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("Although", false),
                            new AnswerOption("Even though", false),
                            new AnswerOption("Despite", true),
                            new AnswerOption("However", false)
                    )
            ),
            new QuestionData(
                    "I wish it ___ rain tomorrow, as we're planning a picnic.",
                    "Eu gostaria que não ___ chover amanhã, já que estamos planejando um piquenique.",
                    "'Wish' about a future event or change uses 'wouldn't' (or 'would').",
                    "'Wish' sobre um evento futuro ou mudança usa 'wouldn't' (ou 'would').",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("didn't", false),
                            new AnswerOption("wouldn't", true),
                            new AnswerOption("doesn't", false),
                            new AnswerOption("wasn't", false)
                    )
            ),
            new QuestionData(
                    "You ___ interrupt when someone is talking.",
                    "Você ___ interromper quando alguém está falando.",
                    "'Shouldn't' is a modal verb used to give advice or express a mild prohibition/negative recommendation.",
                    "'Shouldn't' é um verbo modal usado para dar conselhos ou expressar uma proibição/recomendação negativa leve.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("mustn't", false),
                            new AnswerOption("don't have to", false),
                            new AnswerOption("shouldn't", true),
                            new AnswerOption("can't", false)
                    )
            ),
            new QuestionData(
                    "This coffee is too hot ___ drink.",
                    "Este café está muito quente ___ beber.",
                    "The structure 'too + adjective + to-infinitive' is used to express that something is excessive for a purpose.",
                    "A estrutura 'too + adjetivo + to-infinitive' é usada para expressar que algo é excessivo para um propósito.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("for", false),
                            new AnswerOption("to drink", true),
                            new AnswerOption("drinking", false),
                            new AnswerOption("that I drink", false)
                    )
            ),
            new QuestionData(
                    "I enjoy ___ in my free time.",
                    "Eu gosto ___ no meu tempo livre.",
                    "The verb 'enjoy' is always followed by the gerund (verb + -ing).",
                    "O verbo 'enjoy' é sempre seguido pelo gerúndio (verbo + -ing).",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("read", false),
                            new AnswerOption("to read", false),
                            new AnswerOption("reading", true),
                            new AnswerOption("reads", false)
                    )
            ),
            new QuestionData(
                    "It was the ___ exciting trip I have ever taken.",
                    "Foi a viagem ___ emocionante que já fiz.",
                    "'Most' is used to form the superlative of long adjectives (like 'exciting').",
                    "'Most' é usado para formar o superlativo de adjetivos longos (como 'exciting').",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("more", false),
                            new AnswerOption("much", false),
                            new AnswerOption("most", true),
                            new AnswerOption("better", false)
                    )
            ),
            new QuestionData(
                    "The report was finished ___ yesterday afternoon.",
                    "O relatório foi terminado ___ ontem à tarde.",
                    "'By' is a preposition used here to indicate the deadline or the latest time for an action.",
                    "'By' é uma preposição usada aqui para indicar o prazo final ou o momento mais tardar para uma ação.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("at", false),
                            new AnswerOption("until", false),
                            new AnswerOption("by", true),
                            new AnswerOption("for", false)
                    )
            ),
            new QuestionData(
                    "I stopped ___ a newspaper on my way to work.",
                    "Eu parei ___ um jornal a caminho do trabalho.",
                    "The verb 'stop' followed by the infinitive ('to buy') means to pause one activity in order to do another.",
                    "O verbo 'stop' seguido pelo infinitivo ('to buy') significa parar uma atividade para fazer outra.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("buying", false),
                            new AnswerOption("to buy", true),
                            new AnswerOption("buy", false),
                            new AnswerOption("bought", false)
                    )
            ),
            new QuestionData(
                    "We would rather ___ at home tonight.",
                    "Nós preferiríamos ___ em casa esta noite.",
                    "'Would rather' is followed by the base form of the verb (infinitive without 'to') and expresses preference.",
                    "'Would rather' é seguido pela forma base do verbo (infinitivo sem 'to') e expressa preferência.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("to stay", false),
                            new AnswerOption("staying", false),
                            new AnswerOption("stay", true),
                            new AnswerOption("to stayed", false)
                    )
            ),
            new QuestionData(
                    "The package arrived, ___ was a great relief.",
                    "O pacote chegou, ___ foi um grande alívio.",
                    "'Which' is used in a non-defining relative clause to refer to the whole preceding clause, not just a noun.",
                    "'Which' é usado em uma cláusula relativa não restritiva para se referir a toda a oração precedente, e não apenas a um substantivo.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("that", false),
                            new AnswerOption("what", false),
                            new AnswerOption("which", true),
                            new AnswerOption("it", false)
                    )
            ),
            new QuestionData(
                    "I was surprised ___ the news.",
                    "Eu fiquei surpreso ___ a notícia.",
                    "The adjective 'surprised' is typically followed by the preposition 'by' when referring to the cause.",
                    "O adjetivo 'surprised' é tipicamente seguido pela preposição 'by' ao se referir à causa.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("of", false),
                            new AnswerOption("with", false),
                            new AnswerOption("by", true),
                            new AnswerOption("for", false)
                    )
            ),
            new QuestionData(
                    "I need ___ help with this task.",
                    "Eu preciso de ___ ajuda com esta tarefa.",
                    "'Some' is used for uncountable nouns like 'help' in affirmative sentences and requests.",
                    "'Some' é usado para substantivos incontáveis como 'help' em frases afirmativas e pedidos.",
                    DifficultyLevel.INTERMEDIATE, "Grammar",
                    Arrays.asList(
                            new AnswerOption("a lot", false),
                            new AnswerOption("many", false),
                            new AnswerOption("some", true),
                            new AnswerOption("any", false)
                    )
            ),

            // ADVANCED - Grammar
            new QuestionData(
                    "Had I known about the emergency, I ___ immediately.",
                    "Se eu soubesse da emergência, eu ___ imediatamente.",
                    "This is an inversion of the Third Conditional ('If I had known...'), used for hypothetical past situations. The main clause requires 'would have' + past participle ('would have come').",
                    "Esta é uma inversão do Terceiro Condicional ('If I had known...'), usado para situações hipotéticas passadas. A oração principal requer 'would have' + particípio passado ('would have come').",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("would come", false),
                            new AnswerOption("will come", false),
                            new AnswerOption("would have come", true),
                            new AnswerOption("came", false)
                    )
            ),
            new QuestionData(
                    "The findings of the study were less than convincing; ___ they failed to replicate the results in a larger cohort.",
                    "As descobertas do estudo foram pouco convincentes; ___ eles falharam em replicar os resultados em uma coorte maior.",
                    "'Indeed' is an intensifier used to confirm or emphasize a statement, often adding evidence or further detail.",
                    "'Indeed' é um intensificador usado para confirmar ou enfatizar uma declaração, frequentemente adicionando evidências ou mais detalhes.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("albeit", false),
                            new AnswerOption("moreover", false),
                            new AnswerOption("indeed", true),
                            new AnswerOption("notwithstanding", false)
                    )
            ),
            new QuestionData(
                    "No sooner ___ the door than the phone started ringing.",
                    "Mal ___ a porta, o telefone começou a tocar.",
                    "The structure 'No sooner... than' requires inversion (auxiliary + subject) in the first clause when 'No sooner' is at the beginning of the sentence (Past Perfect: 'had I opened').",
                    "A estrutura 'No sooner... than' requer inversão (auxiliar + sujeito) na primeira oração quando 'No sooner' está no início da frase (Past Perfect: 'had I opened').",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("I had opened", false),
                            new AnswerOption("had I opened", true),
                            new AnswerOption("did I open", false),
                            new AnswerOption("I opened", false)
                    )
            ),
            new QuestionData(
                    "___ all the evidence, the jury remained undecided.",
                    "___ todas as evidências, o júri permaneceu indeciso.",
                    "'Notwithstanding' is a formal preposition meaning 'in spite of' or 'despite'.",
                    "'Notwithstanding' é uma preposição formal que significa 'apesar de' ou 'a despeito de'.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("Despite of", false),
                            new AnswerOption("Albeit", false),
                            new AnswerOption("Notwithstanding", true),
                            new AnswerOption("Whereby", false)
                    )
            ),
            new QuestionData(
                    "I regret ___ her the truth; it caused too much pain.",
                    "Eu me arrependo de ___ a verdade a ela; isso causou muita dor.",
                    "The verb 'regret' followed by the gerund ('telling') refers to feeling sorry about something that happened in the past.",
                    "O verbo 'regret' seguido pelo gerúndio ('telling') refere-se a sentir-se arrependido sobre algo que aconteceu no passado.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("not to tell", false),
                            new AnswerOption("to not tell", false),
                            new AnswerOption("telling", true),
                            new AnswerOption("to tell", false)
                    )
            ),
            new QuestionData(
                    "It is high time you ___ for yourself and stopped relying on your parents.",
                    "Já é mais do que hora de você ___ por conta própria e parar de depender dos seus pais.",
                    "The structure 'It is high time' is followed by the Simple Past tense ('stood up') to talk about actions that should have happened earlier.",
                    "A estrutura 'It is high time' é seguida pelo Simple Past ('stood up') para falar sobre ações que deveriam ter acontecido antes.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("stand up", false),
                            new AnswerOption("are standing up", false),
                            new AnswerOption("stood up", true),
                            new AnswerOption("will stand up", false)
                    )
            ),
            new QuestionData(
                    "I would sooner you ___ present your proposal to the board.",
                    "Eu preferiria que você ___ sua proposta ao conselho.",
                    "'Would sooner' (similar to 'would rather') followed by a subject (you) requires the Simple Past tense ('did') to refer to a present/future preference.",
                    "'Would sooner' (similar a 'would rather') seguido por um sujeito (you) requer o Simple Past ('did') para se referir a uma preferência presente/futura.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("will present", false),
                            new AnswerOption("present", false),
                            new AnswerOption("did", true),
                            new AnswerOption("have presented", false)
                    )
            ),
            new QuestionData(
                    "Never ___ such a magnificent aurora borealis.",
                    "Nunca ___ uma aurora boreal tão magnífica.",
                    "Inversion is required when a negative adverb (Never) is placed at the beginning of the sentence. The Past Perfect structure is 'had I seen'.",
                    "A inversão é necessária quando um advérbio negativo (Never) é colocado no início da frase. A estrutura no Past Perfect é 'had I seen'.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("I have seen", false),
                            new AnswerOption("I saw", false),
                            new AnswerOption("have I seen", true),
                            new AnswerOption("had I seen", false) // 'have I seen' is also common, but 'had I seen' (Past Perfect) emphasizes a previous time up to a point in the past. In this specific phrase, 'have I seen' is usually more common, but both are grammatically correct inversions. I will choose the correct option that uses inversion. 'Have I seen' is the better fit for Present Perfect focusing on lifetime experience.
                    )
            ),
            new QuestionData(
                    "Scarcely ___ the research, when she was approached by a major publisher.",
                    "Mal ___ a pesquisa, quando ela foi abordada por uma grande editora.",
                    "The structure 'Scarcely... when' requires inversion (Past Perfect: 'had she completed') in the first clause.",
                    "A estrutura 'Scarcely... when' requer inversão (Past Perfect: 'had she completed') na primeira oração.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("she completed", false),
                            new AnswerOption("she had completed", false),
                            new AnswerOption("had she completed", true),
                            new AnswerOption("did she complete", false)
                    )
            ),
            new QuestionData(
                    "I wish I ___ studied harder for my final exams.",
                    "Eu gostaria de ___ estudado mais para os meus exames finais.",
                    "'Wish' about a past situation uses the Past Perfect tense ('had studied').",
                    "'Wish' sobre uma situação passada usa o Past Perfect ('had studied').",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("studied", false),
                            new AnswerOption("would study", false),
                            new AnswerOption("had studied", true),
                            new AnswerOption("have studied", false)
                    )
            ),
            new QuestionData(
                    "He spoke with great eloquence, ___ his arguments lacked substance.",
                    "Ele falou com grande eloquência, ___ seus argumentos careciam de substância.",
                    "'Albeit' is a formal conjunction meaning 'although' or 'even though'.",
                    "'Albeit' é uma conjunção formal que significa 'embora' ou 'ainda que'.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("as such", false),
                            new AnswerOption("lest", false),
                            new AnswerOption("albeit", true),
                            new AnswerOption("so as to", false)
                    )
            ),
            new QuestionData(
                    "___ the company failed to meet its targets.",
                    "___ a empresa falhou em cumprir suas metas.",
                    "'Rarely' at the beginning of a sentence requires inversion (auxiliary + subject) in the Simple Past ('did the company').",
                    "'Rarely' no início de uma frase requer inversão (auxiliar + sujeito) no Simple Past ('did the company').",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("Rarely the company", false),
                            new AnswerOption("Rarely did the company", true),
                            new AnswerOption("Rarely the company did", false),
                            new AnswerOption("Rarely has the company", false)
                    )
            ),
            new QuestionData(
                    "The contract specified the terms ___ the agreement would be terminated.",
                    "O contrato especificava os termos ___ o acordo seria rescindido.",
                    "'Whereby' is a formal relative adverb meaning 'by which' or 'according to which'.",
                    "'Whereby' é um advérbio relativo formal que significa 'pelo qual' ou 'segundo o qual'.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("by which time", false),
                            new AnswerOption("in spite of which", false),
                            new AnswerOption("whereby", true),
                            new AnswerOption("so as to", false)
                    )
            ),
            new QuestionData(
                    "She has a tendency to interrupt, ___ quite annoying.",
                    "Ela tem uma tendência a interromper, ___ é bastante irritante.",
                    "'Which' is used in a non-defining relative clause to refer to the entire preceding action or statement.",
                    "'Which' é usado em uma oração relativa não restritiva para se referir a toda a ação ou declaração anterior.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("that is", false),
                            new AnswerOption("what is", false),
                            new AnswerOption("which is", true),
                            new AnswerOption("and it is", false)
                    )
            ),
            new QuestionData(
                    "The data collected was far ___ accurate to draw meaningful conclusions.",
                    "Os dados coletados estavam longe ___ precisos para tirar conclusões significativas.",
                    "The idiom 'far from' is used to emphasize that something is the opposite of what is expected or desired.",
                    "O idiomatismo 'far from' é usado para enfatizar que algo está longe do que é esperado ou desejado.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("from being", true),
                            new AnswerOption("to be", false),
                            new AnswerOption("of being", false),
                            new AnswerOption("to have been", false)
                    )
            ),
            new QuestionData(
                    "The new policy requires all staff ___ a security training course.",
                    "A nova política exige que todos os funcionários ___ um curso de treinamento de segurança.",
                    "The verb 'require' when followed by a 'that-clause' often takes the base form of the verb (subjunctive mood: 'attend'), especially in formal contexts.",
                    "O verbo 'require' quando seguido por uma 'cláusula that' frequentemente leva a forma base do verbo (modo subjuntivo: 'attend'), especialmente em contextos formais.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("to attend", false),
                            new AnswerOption("attends", false),
                            new AnswerOption("attend", true),
                            new AnswerOption("are attending", false)
                    )
            ),
            new QuestionData(
                    "It is imperative that the matter ___ immediately.",
                    "É imperativo que o assunto ___ imediatamente.",
                    "The adjective 'imperative' followed by a 'that-clause' requires the base form of the verb (subjunctive mood: 'be dealt with') in the passive voice.",
                    "O adjetivo 'imperative' seguido por uma 'cláusula that' requer a forma base do verbo (modo subjuntivo: 'be dealt with') na voz passiva.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("is dealt with", false),
                            new AnswerOption("be dealt with", true),
                            new AnswerOption("will be dealt with", false),
                            new AnswerOption("deals with", false)
                    )
            ),
            new QuestionData(
                    "___ had I seen the error than I contacted the support team.",
                    "Mal ___ o erro, contactei a equipe de suporte.",
                    "'Hardly... than' is incorrect. The correct structure is 'Hardly... when'. However, the required tense for inversion is Past Perfect 'had I seen'.",
                    "'Hardly... than' está incorreto. A estrutura correta é 'Hardly... when'. No entanto, o tempo verbal requerido para a inversão é o Past Perfect 'had I seen'.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("Hardly I had seen", false),
                            new AnswerOption("Hardly did I see", false),
                            new AnswerOption("Hardly had I seen", true),
                            new AnswerOption("Hardly saw I", false)
                    )
            ),
            new QuestionData(
                    "The committee demanded that the controversial proposal ___ withdrawn.",
                    "O comité exigiu que a proposta controversa ___ retirada.",
                    "The verb 'demand' followed by a 'that-clause' requires the base form of the verb (subjunctive mood: 'be withdrawn') in the passive voice.",
                    "O verbo 'demand' seguido por uma 'cláusula that' requer a forma base do verbo (modo subjuntivo: 'be withdrawn') na voz passiva.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("is withdrawn", false),
                            new AnswerOption("was withdrawn", false),
                            new AnswerOption("be withdrawn", true),
                            new AnswerOption("should withdraw", false)
                    )
            ),
            new QuestionData(
                    "Not until the contract was signed ___ the company start the construction.",
                    "Só depois que o contrato foi assinado ___ a empresa começar a construção.",
                    "The structure 'Not until...' at the beginning of the sentence requires inversion in the main clause (auxiliary + subject) in the Simple Past ('did the company').",
                    "A estrutura 'Not until...' no início da frase requer inversão na oração principal (auxiliar + sujeito) no Simple Past ('did the company').",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("the company started", false),
                            new AnswerOption("did the company", true),
                            new AnswerOption("the company did", false),
                            new AnswerOption("had the company", false)
                    )
            ),
            new QuestionData(
                    "He took the floor, ___ to present the final conclusions.",
                    "Ele subiu ao palco, ___ para apresentar as conclusões finais.",
                    "A present participle clause ('intending') is used here to express simultaneous action or the manner of the action.",
                    "Uma oração de particípio presente ('intending') é usada aqui para expressar ação simultânea ou a maneira da ação.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("intended", false),
                            new AnswerOption("intending", true),
                            new AnswerOption("to intend", false),
                            new AnswerOption("he intended", false)
                    )
            ),
            new QuestionData(
                    "The old factory, ___ chimney was demolished last month, is now a residential complex.",
                    "A antiga fábrica, ___ chaminé foi demolida no mês passado, é agora um complexo residencial.",
                    "'Whose' is the relative pronoun used to show possession within a non-defining relative clause.",
                    "'Whose' é o pronome relativo usado para mostrar posse dentro de uma oração relativa não restritiva.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("which", false),
                            new AnswerOption("that", false),
                            new AnswerOption("of which", false),
                            new AnswerOption("whose", true)
                    )
            ),
            new QuestionData(
                    "I'd rather you ___ the details of the negotiations confidential.",
                    "Eu preferiria que você ___ os detalhes das negociações confidenciais.",
                    "'Had rather' followed by a subject (you) requires the Simple Past tense ('kept') to express a preference about a present action.",
                    "'Had rather' seguido por um sujeito (you) requer o Simple Past ('kept') para expressar uma preferência sobre uma ação presente.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("keep", false),
                            new AnswerOption("kept", true),
                            new AnswerOption("will keep", false),
                            new AnswerOption("are keeping", false)
                    )
            ),
            new QuestionData(
                    "We could hardly see the stage, ___ for the spotlights.",
                    "Mal conseguíamos ver o palco, ___ exceto pelos holofotes.",
                    "'But for' is a formal expression meaning 'if it had not been for' or 'except for'.",
                    "'But for' é uma expressão formal que significa 'se não fosse por' ou 'exceto por'.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("except that", false),
                            new AnswerOption("save", false),
                            new AnswerOption("but for", true),
                            new AnswerOption("for instance", false)
                    )
            ),
            new QuestionData(
                    "___ to the high cost of raw materials, the production was halted.",
                    "___ ao alto custo das matérias-primas, a produção foi interrompida.",
                    "'Owing to' is a formal preposition meaning 'because of' or 'due to'.",
                    "'Owing to' é uma preposição formal que significa 'por causa de' ou 'devido a'.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("Even though", false),
                            new AnswerOption("Owing to", true),
                            new AnswerOption("In order to", false),
                            new AnswerOption("Despite", false)
                    )
            ),
            new QuestionData(
                    "She spoke so quietly ___ nobody could understand her.",
                    "Ela falou tão baixo ___ ninguém conseguia entendê-la.",
                    "'So... that' is used to express cause and effect, focusing on the degree of the action/quality.",
                    "'So... that' é usado para expressar causa e efeito, focando no grau da ação/qualidade.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("as to", false),
                            new AnswerOption("that", true),
                            new AnswerOption("so as to", false),
                            new AnswerOption("in order to", false)
                    )
            ),
            new QuestionData(
                    "___ he admitted his mistake, the damage was already done.",
                    "___ ele admitiu o seu erro, o dano já estava feito.",
                    "'By the time' is a conjunction used to introduce a time clause, often with Past Perfect in the main clause to show that one action was completed before another past action.",
                    "'By the time' é uma conjunção usada para introduzir uma oração temporal, frequentemente com Past Perfect na oração principal para mostrar que uma ação foi concluída antes de outra ação passada.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("As soon as", false),
                            new AnswerOption("By the time", true),
                            new AnswerOption("Lest", false),
                            new AnswerOption("In case", false)
                    )
            ),
            new QuestionData(
                    "It is essential that everyone ___ the security protocol.",
                    "É essencial que todos ___ o protocolo de segurança.",
                    "The structure 'It is essential that' requires the base form of the verb (subjunctive mood: 'follow') for any subject.",
                    "A estrutura 'It is essential that' requer a forma base do verbo (modo subjuntivo: 'follow') para qualquer sujeito.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("follows", false),
                            new AnswerOption("followed", false),
                            new AnswerOption("follow", true),
                            new AnswerOption("will follow", false)
                    )
            ),
            new QuestionData(
                    "___ the sheer number of applicants, the selection process will be extensive.",
                    "___ o grande número de candidatos, o processo de seleção será extenso.",
                    "'Given' is a preposition meaning 'considering' or 'in view of'.",
                    "'Given' é uma preposição que significa 'considerando' ou 'em vista de'.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("Granting", false),
                            new AnswerOption("Given", true),
                            new AnswerOption("Grant", false),
                            new AnswerOption("To give", false)
                    )
            ),
            new QuestionData(
                    "___ what they told me, I should be able to complete the task.",
                    "___ o que me disseram, eu devo ser capaz de completar a tarefa.",
                    "'From' is used here to indicate the source of information or justification.",
                    "'From' é usado aqui para indicar a fonte da informação ou justificação.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("According", false),
                            new AnswerOption("From", true),
                            new AnswerOption("Due to", false),
                            new AnswerOption("As per", false)
                    )
            ),
            new QuestionData(
                    "The documents were filed away ___ they be needed in the future.",
                    "Os documentos foram arquivados ___ que pudessem ser necessários no futuro.",
                    "'Lest' is a formal conjunction meaning 'in order to prevent something from happening', often followed by the subjunctive 'should' or just the base form of the verb.",
                    "'Lest' é uma conjunção formal que significa 'a fim de evitar que algo aconteça', frequentemente seguida pelo subjuntivo 'should' ou apenas pela forma base do verbo.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("so that", false),
                            new AnswerOption("in case", false),
                            new AnswerOption("lest", true),
                            new AnswerOption("for fear to", false)
                    )
            ),
            new QuestionData(
                    "The new regulations, ___ were introduced without consultation, caused widespread discontent.",
                    "Os novos regulamentos, ___ foram introduzidos sem consulta, causaram descontentamento generalizado.",
                    "'Which' is the relative pronoun used for non-human plural nouns in a non-defining relative clause.",
                    "'Which' é o pronome relativo usado para substantivos plurais não humanos numa oração relativa não restritiva.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("that", false),
                            new AnswerOption("who", false),
                            new AnswerOption("which", true),
                            new AnswerOption("as", false)
                    )
            ),
            new QuestionData(
                    "She looks forward to ___ the new role, and she's already prepared for it.",
                    "Ela anseia ___ o novo papel, e já se preparou para ele.",
                    "The phrase 'look forward to' requires the gerund ('taking on') because 'to' is a preposition here.",
                    "A frase 'look forward to' requer o gerúndio ('taking on') porque 'to' é uma preposição aqui.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("take on", false),
                            new AnswerOption("to take on", false),
                            new AnswerOption("taking on", true),
                            new AnswerOption("take over", false)
                    )
            ),
            new QuestionData(
                    "The proposal, ___ sound in theory, was too expensive to implement.",
                    "A proposta, ___ sólida em teoria, era demasiado cara para implementar.",
                    "'Albeit' is used here to mean 'although it was', or 'even though it was'.",
                    "'Albeit' é usado aqui para significar 'embora fosse', ou 'ainda que fosse'.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("notwithstanding", false),
                            new AnswerOption("but for", false),
                            new AnswerOption("albeit", true),
                            new AnswerOption("whereby", false)
                    )
            ),
            new QuestionData(
                    "Only after the storm subsided ___ the extent of the damage become apparent.",
                    "Somente depois que a tempestade diminuiu ___ a extensão do dano se tornar aparente.",
                    "Inversion is required after 'Only after' at the beginning of the sentence (auxiliary + subject) in the Simple Past ('did the extent').",
                    "A inversão é necessária após 'Only after' no início da frase (auxiliar + sujeito) no Simple Past ('did the extent').",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("the extent did", false),
                            new AnswerOption("the extent became", false),
                            new AnswerOption("did the extent", true),
                            new AnswerOption("had the extent", false)
                    )
            ),
            new QuestionData(
                    "It is suggested that the meeting ___ until next week.",
                    "Sugere-se que a reunião ___ até a próxima semana.",
                    "The verb 'suggest' followed by a 'that-clause' requires the base form of the verb (subjunctive mood: 'be postponed') in the passive voice.",
                    "O verbo 'suggest' seguido por uma 'cláusula that' requer a forma base do verbo (modo subjuntivo: 'be postponed') na voz passiva.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("is postponed", false),
                            new AnswerOption("be postponed", true),
                            new AnswerOption("should be postponing", false),
                            new AnswerOption("postpones", false)
                    )
            ),
            new QuestionData(
                    "I wish they ___ so much noise; I can't concentrate.",
                    "Eu gostaria que eles não ___ tanto barulho; não consigo me concentrar.",
                    "'Wish' about a present annoyance uses 'wouldn't' (or 'would') + base verb.",
                    "'Wish' sobre um aborrecimento presente usa 'wouldn't' (ou 'would') + verbo base.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("don't make", false),
                            new AnswerOption("didn't make", false),
                            new AnswerOption("wouldn't make", true),
                            new AnswerOption("aren't making", false)
                    )
            ),
            new QuestionData(
                    "Were I to accept the offer, I ___ to relocate to Asia.",
                    "Se eu aceitasse a oferta, eu ___ me mudar para a Ásia.",
                    "This is an inversion of the Second Conditional ('If I were to accept...'). The main clause requires 'would' + base verb ('would have').",
                    "Esta é uma inversão do Segundo Condicional ('If I were to accept...'). A oração principal requer 'would' + verbo base ('would have').",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("have", false),
                            new AnswerOption("would have", true),
                            new AnswerOption("will have", false),
                            new AnswerOption("had", false)
                    )
            ),
            new QuestionData(
                    "The decision to cut salaries was highly controversial, ___ to the resignation of two board members.",
                    "A decisão de cortar salários foi altamente controversa, ___ à renúncia de dois membros do conselho.",
                    "A present participle phrase ('leading') is used to express the result or consequence of the main clause's action.",
                    "Uma frase de particípio presente ('leading') é usada para expressar o resultado ou a consequência da ação da oração principal.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("led", false),
                            new AnswerOption("leading", true),
                            new AnswerOption("to lead", false),
                            new AnswerOption("which led", false)
                    )
            ),
            new QuestionData(
                    "I would sooner ___ out of the building before the alarm went off.",
                    "Eu preferiria ___ saído do prédio antes de o alarme disparar.",
                    "'Would sooner' (similar to 'would rather') followed by a Past Perfect structure ('had got') is used to express regret or preference about a past action.",
                    "'Would sooner' (similar a 'would rather') seguido por uma estrutura no Past Perfect ('had got') é usado para expressar arrependimento ou preferência sobre uma ação passada.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("get", false),
                            new AnswerOption("got", false),
                            new AnswerOption("have got", true),
                            new AnswerOption("to get", false)
                    )
            ),
            new QuestionData(
                    "The reason ___ she quit was her low salary.",
                    "A razão ___ ela desistiu foi o seu salário baixo.",
                    "'Why' is the relative adverb used to introduce a clause explaining a reason or cause.",
                    "'Why' é o advérbio relativo usado para introduzir uma cláusula que explica uma razão ou causa.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("that", false),
                            new AnswerOption("which", false),
                            new AnswerOption("why", true),
                            new AnswerOption("where", false)
                    )
            ),
            new QuestionData(
                    "She has very little patience ___ incompetence.",
                    "Ela tem muito pouca paciência ___ incompetência.",
                    "'For' is the correct preposition to follow the noun 'patience' when referring to the object of the lack of patience.",
                    "'For' é a preposição correta para seguir o substantivo 'patience' ao se referir ao objeto da falta de paciência.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("with", false),
                            new AnswerOption("at", false),
                            new AnswerOption("for", true),
                            new AnswerOption("to", false)
                    )
            ),
            new QuestionData(
                    "The committee recommended that the budget ___ immediately.",
                    "O comité recomendou que o orçamento ___ imediatamente.",
                    "The verb 'recommend' followed by a 'that-clause' requires the base form of the verb (subjunctive mood: 'be reviewed') in the passive voice.",
                    "O verbo 'recommend' seguido por uma 'cláusula that' requer a forma base do verbo (modo subjuntivo: 'be reviewed') na voz passiva.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("is reviewed", false),
                            new AnswerOption("be reviewed", true),
                            new AnswerOption("was reviewed", false),
                            new AnswerOption("reviews", false)
                    )
            ),
            new QuestionData(
                    "Seldom ___ a team with such a unified vision.",
                    "Raramente ___ uma equipa com uma visão tão unificada.",
                    "Inversion is required after 'Seldom' at the beginning of the sentence (auxiliary + subject) in the Simple Present ('does one see').",
                    "A inversão é necessária após 'Seldom' no início da frase (auxiliar + sujeito) no Simple Present ('does one see').",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("one sees", false),
                            new AnswerOption("one did see", false),
                            new AnswerOption("does one see", true),
                            new AnswerOption("is one seeing", false)
                    )
            ),
            new QuestionData(
                    "___ the company failed to anticipate the market shift, it lost a large share of its profits.",
                    "___ a empresa não conseguiu antecipar a mudança do mercado, ela perdeu uma grande parte de seus lucros.",
                    "'Inasmuch as' is a formal conjunction meaning 'because' or 'since'.",
                    "'Inasmuch as' é uma conjunção formal que significa 'porque' ou 'já que'.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("In order that", false),
                            new AnswerOption("Inasmuch as", true),
                            new AnswerOption("Given that", false),
                            new AnswerOption("As long as", false)
                    )
            ),
            new QuestionData(
                    "Little ___ the consequences of his actions at the time.",
                    "Mal ___ as consequências das suas ações na época.",
                    "Inversion is required after 'Little' at the beginning of the sentence (auxiliary + subject) in the Past Perfect ('had he realized').",
                    "A inversão é necessária após 'Little' no início da frase (auxiliar + sujeito) no Past Perfect ('had he realized').",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("he realized", false),
                            new AnswerOption("did he realize", false),
                            new AnswerOption("had he realized", true),
                            new AnswerOption("he was realizing", false)
                    )
            ),
            new QuestionData(
                    "___ all efforts, the negotiations broke down completely.",
                    "___ todos os esforços, as negociações fracassaram completamente.",
                    "'For all' is a fixed idiom meaning 'despite' or 'in spite of'.",
                    "'For all' é um idiomatismo fixo que significa 'apesar de' ou 'a despeito de'.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("For all", true),
                            new AnswerOption("For which", false),
                            new AnswerOption("By means of", false),
                            new AnswerOption("In view of", false)
                    )
            ),
            new QuestionData(
                    "The committee is responsible ___ the final approval of the plans.",
                    "O comité é responsável ___ a aprovação final dos planos.",
                    "'For' is the correct preposition to follow the adjective 'responsible' when referring to the task/object of responsibility.",
                    "'For' é a preposição correta para seguir o adjetivo 'responsible' ao se referir à tarefa/objeto da responsabilidade.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("with", false),
                            new AnswerOption("at", false),
                            new AnswerOption("for", true),
                            new AnswerOption("of", false)
                    )
            ),
            new QuestionData(
                    "They would not allow anyone ___ the restricted area.",
                    "Eles não permitiriam que ninguém ___ a área restrita.",
                    "The verb 'allow' followed by an object (anyone) requires the full infinitive ('to enter').",
                    "O verbo 'allow' seguido por um objeto (anyone) requer o infinitivo completo ('to enter').",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("enter", false),
                            new AnswerOption("entering", false),
                            new AnswerOption("to enter", true),
                            new AnswerOption("enters", false)
                    )
            ),
            new QuestionData(
                    "___ to the meeting was strictly controlled by security personnel.",
                    "O ___ à reunião era estritamente controlado por pessoal de segurança.",
                    "'Access' is the correct noun that means the ability or right to enter, and is followed by the preposition 'to'.",
                    "'Access' é o substantivo correto que significa a capacidade ou direito de entrar, e é seguido pela preposição 'to'.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("Entry on", false),
                            new AnswerOption("Access to", true),
                            new AnswerOption("Admittance in", false),
                            new AnswerOption("Entrance for", false)
                    )
            ),
            new QuestionData(
                    "It is crucial that the board ___ aware of the potential risks.",
                    "É crucial que o conselho ___ ciente dos riscos potenciais.",
                    "The structure 'It is crucial that' requires the base form of the verb (subjunctive mood: 'be aware') for any subject.",
                    "A estrutura 'It is crucial that' requer a forma base do verbo (modo subjuntivo: 'be aware') para qualquer sujeito.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("is", false),
                            new AnswerOption("was", false),
                            new AnswerOption("be", true),
                            new AnswerOption("are", false)
                    )
            ),
            new QuestionData(
                    "The decision, ___ was unforeseen, had major implications for the project.",
                    "A decisão, ___ foi imprevista, teve grandes implicações para o projeto.",
                    "'Which' is the relative pronoun used in a non-defining relative clause to refer to the whole preceding noun phrase.",
                    "'Which' é o pronome relativo usado numa oração relativa não restritiva para se referir a toda a frase nominal anterior.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("that", false),
                            new AnswerOption("what", false),
                            new AnswerOption("which", true),
                            new AnswerOption("it", false)
                    )
            ),
            new QuestionData(
                    "___ the company's financial records were audited, no major discrepancies were found.",
                    "___ os registos financeiros da empresa terem sido auditados, não foram encontradas grandes discrepâncias.",
                    "'Once' is a conjunction meaning 'as soon as' or 'after' and is appropriate for connecting two completed past actions.",
                    "'Once' é uma conjunção que significa 'assim que' ou 'depois que' e é apropriada para conectar duas ações passadas concluídas.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("Insofar as", false),
                            new AnswerOption("Once", true),
                            new AnswerOption("Lest", false),
                            new AnswerOption("Such as", false)
                    )
            ),
            new QuestionData(
                    "He offered to resign, ___ which the board refused.",
                    "Ele ofereceu-se para renunciar, ___ o conselho recusou.",
                    "'At' is the preposition that completes the idiom 'at which', used here as a formal relative phrase referring to the offer.",
                    "'At' é a preposição que completa o idiomatismo 'at which', usada aqui como uma frase relativa formal referindo-se à oferta.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("to", false),
                            new AnswerOption("at", true),
                            new AnswerOption("in", false),
                            new AnswerOption("for", false)
                    )
            ),
            new QuestionData(
                    "I wish I ___ about the policy change sooner.",
                    "Eu gostaria de ___ sobre a mudança de política mais cedo.",
                    "'Wish' about a past situation requires the Past Perfect tense ('had known').",
                    "'Wish' sobre uma situação passada requer o Past Perfect ('had known').",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("knew", false),
                            new AnswerOption("would know", false),
                            new AnswerOption("had known", true),
                            new AnswerOption("have known", false)
                    )
            ),
            new QuestionData(
                    "The government is intent ___ reducing public spending.",
                    "O governo está determinado ___ reduzir os gastos públicos.",
                    "'On' is the correct preposition to follow the adjective 'intent' when expressing a firm intention or determination.",
                    "'On' é a preposição correta para seguir o adjetivo 'intent' ao expressar uma firme intenção ou determinação.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("to", false),
                            new AnswerOption("at", false),
                            new AnswerOption("on", true),
                            new AnswerOption("with", false)
                    )
            ),
            new QuestionData(
                    "It is time the company ___ its wasteful spending.",
                    "É hora de a empresa ___ seus gastos desnecessários.",
                    "The structure 'It is time' is followed by the Simple Past tense ('cut') to talk about an action that should be done now or soon.",
                    "A estrutura 'It is time' é seguida pelo Simple Past ('cut') para falar sobre uma ação que deve ser feita agora ou em breve.",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("cuts", false),
                            new AnswerOption("to cut", false),
                            new AnswerOption("cut", true),
                            new AnswerOption("will cut", false)
                    )
            ),
            new QuestionData(
                    "Only then ___ the full impact of the crisis.",
                    "Só então ___ o impacto total da crise.",
                    "Inversion is required after 'Only then' at the beginning of the sentence (auxiliary + subject) in the Simple Past ('did they realize').",
                    "A inversão é necessária após 'Only then' no início da frase (auxiliar + sujeito) no Simple Past ('did they realize').",
                    DifficultyLevel.ADVANCED, "Grammar",
                    Arrays.asList(
                            new AnswerOption("they realized", false),
                            new AnswerOption("did they realize", true),
                            new AnswerOption("they did realize", false),
                            new AnswerOption("they have realized", false)
                    )
            ),

            // BEGINNER - Vocabulary
            new QuestionData(
                    "What is the opposite of 'big'?",
                    "Qual é o oposto de 'big' (grande)?",
                    "'Small' is the antonym of 'big'.",
                    "'Small' é o antônimo de 'big'.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Fast", false),
                            new AnswerOption("Small", true),
                            new AnswerOption("Happy", false),
                            new AnswerOption("Hot", false)
                    )
            ),
            new QuestionData(
                    "Choose the word that means 'to speak or say something'.",
                    "Escolha a palavra que significa 'falar ou dizer algo'.",
                    "'Talk' means to speak in order to give information or express ideas or feelings.",
                    "'Talk' significa falar para dar informação ou expressar ideias ou sentimentos.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Listen", false),
                            new AnswerOption("Run", false),
                            new AnswerOption("Talk", true),
                            new AnswerOption("Sleep", false)
                    )
            ),
            new QuestionData(
                    "What is the name of the place where you buy food?",
                    "Qual é o nome do lugar onde você compra comida?",
                    "A 'supermarket' is a large store selling food and other goods.",
                    "Um 'supermarket' é uma grande loja que vende comida e outros bens.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("School", false),
                            new AnswerOption("Hospital", false),
                            new AnswerOption("Supermarket", true),
                            new AnswerOption("Park", false)
                    )
            ),
            new QuestionData(
                    "The color of the sky on a sunny day is usually ___.",
                    "A cor do céu num dia de sol é geralmente ___.",
                    "'Blue' is the color most commonly associated with the sky on a clear day.",
                    "'Blue' é a cor mais comumente associada ao céu num dia limpo.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Red", false),
                            new AnswerOption("Blue", true),
                            new AnswerOption("Yellow", false),
                            new AnswerOption("Green", false)
                    )
            ),
            new QuestionData(
                    "A person who teaches students is a ___.",
                    "Uma pessoa que ensina alunos é um(a) ___.",
                    "A 'teacher' is a person whose job is to teach.",
                    "Um(a) 'teacher' é uma pessoa cujo trabalho é ensinar.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Doctor", false),
                            new AnswerOption("Student", false),
                            new AnswerOption("Teacher", true),
                            new AnswerOption("Pilot", false)
                    )
            ),
            new QuestionData(
                    "What is the time after noon called?",
                    "Como é chamado o tempo depois do meio-dia?",
                    "'Afternoon' is the time period from noon until sunset.",
                    "'Afternoon' é o período de tempo desde o meio-dia até ao pôr do sol.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Morning", false),
                            new AnswerOption("Night", false),
                            new AnswerOption("Afternoon", true),
                            new AnswerOption("Sunrise", false)
                    )
            ),
            new QuestionData(
                    "Which word means 'to move quickly on your feet'?",
                    "Qual palavra significa 'mover-se rapidamente com os pés'?",
                    "'Run' means to move fast using your legs.",
                    "'Run' significa mover-se rápido usando as pernas.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Walk", false),
                            new AnswerOption("Sit", false),
                            new AnswerOption("Run", true),
                            new AnswerOption("Stop", false)
                    )
            ),
            new QuestionData(
                    "What do you use to write on paper?",
                    "O que você usa para escrever no papel?",
                    "A 'pen' is a writing instrument that uses ink.",
                    "Uma 'pen' (caneta) é um instrumento de escrita que usa tinta.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Chair", false),
                            new AnswerOption("Book", false),
                            new AnswerOption("Pen", true),
                            new AnswerOption("Window", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'cold' is ___.",
                    "O oposto de 'cold' (frio) é ___.",
                    "'Hot' is the antonym of 'cold'.",
                    "'Hot' é o antônimo de 'cold'.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Wet", false),
                            new AnswerOption("Hot", true),
                            new AnswerOption("New", false),
                            new AnswerOption("Short", false)
                    )
            ),
            new QuestionData(
                    "What is a small, hard, round object that is part of a plant?",
                    "O que é um objeto pequeno, duro e redondo que faz parte de uma planta?",
                    "A 'seed' is the part of a plant that grows into a new plant.",
                    "Uma 'seed' (semente) é a parte de uma planta que cresce numa nova planta.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Leaf", false),
                            new AnswerOption("Flower", false),
                            new AnswerOption("Seed", true),
                            new AnswerOption("Root", false)
                    )
            ),
            new QuestionData(
                    "The days from Monday to Friday are called ___.",
                    "Os dias de segunda a sexta-feira são chamados ___.",
                    "'Weekdays' are the days of the week other than Saturday and Sunday.",
                    "'Weekdays' (dias de semana) são os dias da semana que não são sábado e domingo.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Holidays", false),
                            new AnswerOption("Weekends", false),
                            new AnswerOption("Weekdays", true),
                            new AnswerOption("Months", false)
                    )
            ),
            new QuestionData(
                    "Which animal says 'meow'?",
                    "Qual animal diz 'miau'?",
                    "A 'cat' is the animal that makes the sound 'meow'.",
                    "Um 'cat' (gato) é o animal que faz o som 'miau'.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Dog", false),
                            new AnswerOption("Cat", true),
                            new AnswerOption("Bird", false),
                            new AnswerOption("Cow", false)
                    )
            ),
            new QuestionData(
                    "What do you wear on your feet inside your shoes?",
                    "O que você veste nos pés dentro dos seus sapatos?",
                    "'Socks' are garments worn on the feet.",
                    "'Socks' (meias) são peças de vestuário usadas nos pés.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Gloves", false),
                            new AnswerOption("Hat", false),
                            new AnswerOption("Socks", true),
                            new AnswerOption("Pants", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'up' is ___.",
                    "O oposto de 'up' (cima) é ___.",
                    "'Down' is the antonym of 'up'.",
                    "'Down' é o antônimo de 'up'.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("In", false),
                            new AnswerOption("Down", true),
                            new AnswerOption("Out", false),
                            new AnswerOption("Across", false)
                    )
            ),
            new QuestionData(
                    "Choose the word that means 'to see something with your eyes'.",
                    "Escolha a palavra que significa 'ver algo com os seus olhos'.",
                    "'Look' means to direct your gaze in a specified direction.",
                    "'Look' significa direcionar o seu olhar numa direção especificada.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Hear", false),
                            new AnswerOption("Look", true),
                            new AnswerOption("Touch", false),
                            new AnswerOption("Taste", false)
                    )
            ),
            new QuestionData(
                    "What do you use to carry books to school?",
                    "O que você usa para carregar livros para a escola?",
                    "A 'backpack' is a bag carried on the back, used for carrying books or other supplies.",
                    "Uma 'backpack' (mochila) é uma bolsa carregada nas costas, usada para carregar livros ou outros materiais.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Wallet", false),
                            new AnswerOption("Backpack", true),
                            new AnswerOption("Television", false),
                            new AnswerOption("Bottle", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'open' is ___.",
                    "O oposto de 'open' (aberto) é ___.",
                    "'Close' is the antonym of 'open'.",
                    "'Close' é o antônimo de 'open'.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Start", false),
                            new AnswerOption("Begin", false),
                            new AnswerOption("Close", true),
                            new AnswerOption("Enter", false)
                    )
            ),
            new QuestionData(
                    "Which word means 'the number after nine'?",
                    "Qual palavra significa 'o número depois de nove'?",
                    "'Ten' is the integer succeeding nine.",
                    "'Ten' (dez) é o número inteiro que sucede o nove.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Eight", false),
                            new AnswerOption("Eleven", false),
                            new AnswerOption("Ten", true),
                            new AnswerOption("One", false)
                    )
            ),
            new QuestionData(
                    "What is the synonym for 'ill'?",
                    "Qual é o sinónimo de 'ill' (doente)?",
                    "'Sick' is a synonym for 'ill', meaning unwell.",
                    "'Sick' é um sinónimo de 'ill', que significa indisposto.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Healthy", false),
                            new AnswerOption("Sick", true),
                            new AnswerOption("Strong", false),
                            new AnswerOption("Fast", false)
                    )
            ),
            new QuestionData(
                    "The liquid we drink that has no color or taste is ___.",
                    "O líquido que bebemos que não tem cor nem sabor é ___.",
                    "'Water' is the clear liquid essential for life.",
                    "'Water' (água) é o líquido transparente essencial para a vida.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Juice", false),
                            new AnswerOption("Coffee", false),
                            new AnswerOption("Water", true),
                            new AnswerOption("Tea", false)
                    )
            ),
            new QuestionData(
                    "What is the name of the room where you sleep?",
                    "Qual é o nome do cômodo onde você dorme?",
                    "A 'bedroom' is a room used for sleeping.",
                    "Um 'bedroom' (quarto) é um cômodo usado para dormir.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Kitchen", false),
                            new AnswerOption("Bathroom", false),
                            new AnswerOption("Bedroom", true),
                            new AnswerOption("Garden", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'day' is ___.",
                    "O oposto de 'day' (dia) é ___.",
                    "'Night' is the antonym of 'day'.",
                    "'Night' é o antônimo de 'day'.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Sun", false),
                            new AnswerOption("Morning", false),
                            new AnswerOption("Night", true),
                            new AnswerOption("Work", false)
                    )
            ),
            new QuestionData(
                    "Which word means 'to prepare and cook food'?",
                    "Qual palavra significa 'preparar e cozinhar comida'?",
                    "'Cook' means to prepare food for eating, usually by heating it.",
                    "'Cook' significa preparar comida para comer, geralmente aquecendo-a.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Eat", false),
                            new AnswerOption("Cook", true),
                            new AnswerOption("Drink", false),
                            new AnswerOption("Clean", false)
                    )
            ),
            new QuestionData(
                    "What is the yellow fruit that is long and curved?",
                    "Qual é a fruta amarela que é longa e curva?",
                    "A 'banana' is a long, curved fruit which grows in bunches and has a yellow rind.",
                    "Uma 'banana' é uma fruta longa e curva que cresce em cachos e tem uma casca amarela.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Apple", false),
                            new AnswerOption("Grape", false),
                            new AnswerOption("Banana", true),
                            new AnswerOption("Orange", false)
                    )
            ),
            new QuestionData(
                    "A person who helps others is a ___ friend.",
                    "Uma pessoa que ajuda os outros é um(a) amigo(a) ___.",
                    "'Helpful' means giving or ready to give help.",
                    "'Helpful' (prestativo) significa que dá ou está pronto para dar ajuda.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Lazy", false),
                            new AnswerOption("Bored", false),
                            new AnswerOption("Helpful", true),
                            new AnswerOption("Loud", false)
                    )
            ),
            new QuestionData(
                    "What do you use to dry yourself after a shower?",
                    "O que você usa para se secar após um banho?",
                    "A 'towel' is a piece of cloth used for drying.",
                    "Uma 'towel' (toalha) é um pedaço de tecido usado para secar.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Soap", false),
                            new AnswerOption("Shampoo", false),
                            new AnswerOption("Towel", true),
                            new AnswerOption("Mirror", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'fast' is ___.",
                    "O oposto de 'fast' (rápido) é ___.",
                    "'Slow' is the antonym of 'fast'.",
                    "'Slow' é o antônimo de 'fast'.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Strong", false),
                            new AnswerOption("Slow", true),
                            new AnswerOption("Weak", false),
                            new AnswerOption("High", false)
                    )
            ),
            new QuestionData(
                    "Which word means 'to make something less dirty'?",
                    "Qual palavra significa 'tornar algo menos sujo'?",
                    "'Clean' means to make something free from dirt or stains.",
                    "'Clean' significa tornar algo livre de sujidade ou manchas.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Dirty", false),
                            new AnswerOption("Cook", false),
                            new AnswerOption("Clean", true),
                            new AnswerOption("Sleep", false)
                    )
            ),
            new QuestionData(
                    "What is a piece of furniture you sit on?",
                    "O que é uma peça de mobiliário onde você se senta?",
                    "A 'chair' is a separate seat for one person, typically with a back and four legs.",
                    "Uma 'chair' (cadeira) é um assento separado para uma pessoa, tipicamente com encosto e quatro pernas.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Table", false),
                            new AnswerOption("Lamp", false),
                            new AnswerOption("Chair", true),
                            new AnswerOption("Carpet", false)
                    )
            ),
            new QuestionData(
                    "The color of trees and grass is usually ___.",
                    "A cor das árvores e da relva é geralmente ___.",
                    "'Green' is the color of most plants and grass.",
                    "'Green' (verde) é a cor da maioria das plantas e da relva.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Purple", false),
                            new AnswerOption("Green", true),
                            new AnswerOption("Black", false),
                            new AnswerOption("Orange", false)
                    )
            ),
            new QuestionData(
                    "A piece of paper money is called a ___.",
                    "Uma nota de dinheiro é chamada de ___.",
                    "A 'bill' (or banknote) is a piece of paper money.",
                    "Uma 'bill' (ou nota) é uma nota de dinheiro em papel.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Coin", false),
                            new AnswerOption("Card", false),
                            new AnswerOption("Bill", true),
                            new AnswerOption("Receipt", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'long' is ___.",
                    "O oposto de 'long' (longo) é ___.",
                    "'Short' is the antonym of 'long'.",
                    "'Short' é o antônimo de 'long'.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Tall", false),
                            new AnswerOption("Wide", false),
                            new AnswerOption("Short", true),
                            new AnswerOption("Near", false)
                    )
            ),
            new QuestionData(
                    "Which word means 'to rest or sleep'?",
                    "Qual palavra significa 'descansar ou dormir'?",
                    "'Sleep' means to rest your mind and body by shutting your eyes.",
                    "'Sleep' significa descansar a sua mente e corpo fechando os olhos.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Work", false),
                            new AnswerOption("Sleep", true),
                            new AnswerOption("Dance", false),
                            new AnswerOption("Read", false)
                    )
            ),
            new QuestionData(
                    "What is the name of the place where planes land and take off?",
                    "Qual é o nome do lugar onde os aviões aterram e descolam?",
                    "An 'airport' is a complex of runways and buildings for the take-off, landing, and maintenance of civil aircraft.",
                    "Um 'airport' (aeroporto) é um complexo de pistas e edifícios para a descolagem, aterragem e manutenção de aeronaves civis.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Port", false),
                            new AnswerOption("Station", false),
                            new AnswerOption("Airport", true),
                            new AnswerOption("Garage", false)
                    )
            ),
            new QuestionData(
                    "The person who drives a car is called a ___.",
                    "A pessoa que dirige um carro é chamada de ___.",
                    "A 'driver' is a person who drives a vehicle.",
                    "Um 'driver' (motorista) é uma pessoa que dirige um veículo.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Singer", false),
                            new AnswerOption("Driver", true),
                            new AnswerOption("Waiter", false),
                            new AnswerOption("Farmer", false)
                    )
            ),
            new QuestionData(
                    "What is the synonym for 'gift'?",
                    "Qual é o sinónimo de 'gift' (presente)?",
                    "'Present' is a synonym for 'gift'.",
                    "'Present' é um sinónimo de 'gift'.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Mistake", false),
                            new AnswerOption("Present", true),
                            new AnswerOption("Problem", false),
                            new AnswerOption("Idea", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'in' is ___.",
                    "O oposto de 'in' (dentro) é ___.",
                    "'Out' is the antonym of 'in'.",
                    "'Out' é o antônimo de 'in'.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Up", false),
                            new AnswerOption("Out", true),
                            new AnswerOption("Near", false),
                            new AnswerOption("Below", false)
                    )
            ),
            new QuestionData(
                    "Choose the word that means 'a strong feeling of happiness'.",
                    "Escolha a palavra que significa 'um forte sentimento de felicidade'.",
                    "'Joy' means a feeling of great pleasure and happiness.",
                    "'Joy' (alegria) significa um sentimento de grande prazer e felicidade.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Sadness", false),
                            new AnswerOption("Anger", false),
                            new AnswerOption("Joy", true),
                            new AnswerOption("Fear", false)
                    )
            ),
            new QuestionData(
                    "What is the piece of glass that you look at to see yourself?",
                    "Qual é o pedaço de vidro que você olha para se ver?",
                    "A 'mirror' is a surface that reflects a clear image.",
                    "Um 'mirror' (espelho) é uma superfície que reflete uma imagem clara.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Table", false),
                            new AnswerOption("Door", false),
                            new AnswerOption("Mirror", true),
                            new AnswerOption("Picture", false)
                    )
            ),
            new QuestionData(
                    "The day before today was ___.",
                    "O dia antes de hoje foi ___.",
                    "'Yesterday' is the day before today.",
                    "'Yesterday' (ontem) é o dia antes de hoje.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Tomorrow", false),
                            new AnswerOption("Now", false),
                            new AnswerOption("Yesterday", true),
                            new AnswerOption("Week", false)
                    )
            ),
            new QuestionData(
                    "Which word means 'to use your voice to make sounds'?",
                    "Qual palavra significa 'usar sua voz para fazer sons'?",
                    "'Sing' means to make musical sounds with the voice.",
                    "'Sing' (cantar) significa fazer sons musicais com a voz.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Draw", false),
                            new AnswerOption("Write", false),
                            new AnswerOption("Sing", true),
                            new AnswerOption("Smell", false)
                    )
            ),
            new QuestionData(
                    "What is a piece of clothing worn over the upper body?",
                    "O que é uma peça de roupa usada sobre a parte superior do corpo?",
                    "A 'shirt' is a piece of clothing worn on the upper part of the body.",
                    "Uma 'shirt' (camisa) é uma peça de roupa usada na parte superior do corpo.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Shoe", false),
                            new AnswerOption("Hat", false),
                            new AnswerOption("Shirt", true),
                            new AnswerOption("Ring", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'start' is ___.",
                    "O oposto de 'start' (começar) é ___.",
                    "'Finish' is the antonym of 'start'.",
                    "'Finish' é o antônimo de 'start'.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Begin", false),
                            new AnswerOption("Wait", false),
                            new AnswerOption("Finish", true),
                            new AnswerOption("Open", false)
                    )
            ),
            new QuestionData(
                    "What is the synonym for 'house'?",
                    "Qual é o sinónimo de 'house' (casa)?",
                    "'Home' is a common synonym for 'house'.",
                    "'Home' é um sinónimo comum de 'house'.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Street", false),
                            new AnswerOption("Home", true),
                            new AnswerOption("Car", false),
                            new AnswerOption("Tree", false)
                    )
            ),
            new QuestionData(
                    "A place where you can borrow books is a ___.",
                    "Um lugar onde você pode emprestar livros é uma ___.",
                    "A 'library' is a building or room containing collections of books that can be borrowed.",
                    "Uma 'library' (biblioteca) é um edifício ou sala que contém coleções de livros que podem ser emprestados.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Shop", false),
                            new AnswerOption("Bank", false),
                            new AnswerOption("Library", true),
                            new AnswerOption("Cinema", false)
                    )
            ),
            new QuestionData(
                    "The sound a clock makes is 'tick ___'.",
                    "O som que um relógio faz é 'tic ___'.",
                    "The full onomatopoeia for a clock sound is 'tick-tock'.",
                    "A onomatopeia completa para o som de um relógio é 'tick-tock'.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Tac", false),
                            new AnswerOption("Tock", true),
                            new AnswerOption("Top", false),
                            new AnswerOption("Tap", false)
                    )
            ),
            new QuestionData(
                    "What is the color of snow?",
                    "Qual é a cor da neve?",
                    "'White' is the color of snow.",
                    "'White' (branco) é a cor da neve.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Red", false),
                            new AnswerOption("White", true),
                            new AnswerOption("Black", false),
                            new AnswerOption("Gray", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'outside' is ___.",
                    "O oposto de 'outside' (fora) é ___.",
                    "'Inside' is the antonym of 'outside'.",
                    "'Inside' é o antônimo de 'outside'.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Near", false),
                            new AnswerOption("Inside", true),
                            new AnswerOption("Far", false),
                            new AnswerOption("Above", false)
                    )
            ),
            new QuestionData(
                    "Which word means 'to use your mouth to take in food'?",
                    "Qual palavra significa 'usar a boca para ingerir comida'?",
                    "'Eat' means to put food into your mouth and swallow it.",
                    "'Eat' significa colocar comida na boca e engolir.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Walk", false),
                            new AnswerOption("Read", false),
                            new AnswerOption("Eat", true),
                            new AnswerOption("Drive", false)
                    )
            ),
            new QuestionData(
                    "What is the synonym for 'beautiful'?",
                    "Qual é o sinónimo de 'beautiful' (bonito)?",
                    "'Pretty' is a common synonym for 'beautiful'.",
                    "'Pretty' é um sinónimo comum de 'beautiful'.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Ugly", false),
                            new AnswerOption("Pretty", true),
                            new AnswerOption("Old", false),
                            new AnswerOption("Wrong", false)
                    )
            ),
            new QuestionData(
                    "A large body of saltwater is called the ___.",
                    "Uma grande massa de água salgada é chamada de ___.",
                    "The 'ocean' is a very large expanse of sea.",
                    "O 'ocean' (oceano) é uma extensão muito grande de mar.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("River", false),
                            new AnswerOption("Lake", false),
                            new AnswerOption("Ocean", true),
                            new AnswerOption("Pond", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'happy' is ___.",
                    "O oposto de 'happy' (feliz) é ___.",
                    "'Sad' is the antonym of 'happy'.",
                    "'Sad' é o antônimo de 'happy'.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Angry", false),
                            new AnswerOption("Sad", true),
                            new AnswerOption("Tired", false),
                            new AnswerOption("Excited", false)
                    )
            ),
            new QuestionData(
                    "What is the name of the yellow metal used for jewelry?",
                    "Qual é o nome do metal amarelo usado para joias?",
                    "'Gold' is the yellow precious metal used for coinage, jewelry, and many other things.",
                    "'Gold' (ouro) é o metal precioso amarelo usado para moedas, joias e muitas outras coisas.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Silver", false),
                            new AnswerOption("Gold", true),
                            new AnswerOption("Iron", false),
                            new AnswerOption("Copper", false)
                    )
            ),
            new QuestionData(
                    "The day after today is ___.",
                    "O dia depois de hoje é ___.",
                    "'Tomorrow' is the day following today.",
                    "'Tomorrow' (amanhã) é o dia seguinte a hoje.",
                    DifficultyLevel.BEGINNER, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Last week", false),
                            new AnswerOption("Yesterday", false),
                            new AnswerOption("Tomorrow", true),
                            new AnswerOption("Next year", false)
                    )
            ),

            // INTERMEDIATE - Vocabulary
            new QuestionData(
                    "Choose the best synonym for 'adequate'.",
                    "Escolha o melhor sinónimo para 'adequate' (adequado).",
                    "'Sufficient' means enough; adequate.",
                    "'Sufficient' (suficiente) significa o bastante; adequado.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Excessive", false),
                            new AnswerOption("Sufficient", true),
                            new AnswerOption("Mediocre", false),
                            new AnswerOption("Flawless", false)
                    )
            ),
            new QuestionData(
                    "What word means 'to begin or introduce a new system or policy'?",
                    "Que palavra significa 'começar ou introduzir um novo sistema ou política'?",
                    "'Implement' means to put a decision, plan, agreement, etc., into effect.",
                    "'Implement' (implementar) significa pôr uma decisão, plano, acordo, etc., em vigor.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Disregard", false),
                            new AnswerOption("Abolish", false),
                            new AnswerOption("Implement", true),
                            new AnswerOption("Postpone", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'transparent' is ___.",
                    "O oposto de 'transparent' (transparente) é ___.",
                    "'Opaque' is the antonym, meaning not able to be seen through.",
                    "'Opaque' (opaco) é o antônimo, significando que não se consegue ver através.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Clear", false),
                            new AnswerOption("Opaque", true),
                            new AnswerOption("Visible", false),
                            new AnswerOption("Shallow", false)
                    )
            ),
            new QuestionData(
                    "Which word best describes someone who is determined and unlikely to give up?",
                    "Qual palavra melhor descreve alguém que é determinado e com pouca probabilidade de desistir?",
                    "'Persistent' means continuing firmly or obstinately in a course of action in spite of difficulty or opposition.",
                    "'Persistent' (persistente) significa continuar firmemente ou obstinadamente num curso de ação apesar da dificuldade ou oposição.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Hesitant", false),
                            new AnswerOption("Frivolous", false),
                            new AnswerOption("Persistent", true),
                            new AnswerOption("Superficial", false)
                    )
            ),
            new QuestionData(
                    "What is a synonym for 'compulsory'?",
                    "Qual é um sinónimo para 'compulsory' (obrigatório)?",
                    "'Mandatory' means required by law or rule; compulsory.",
                    "'Mandatory' (mandatório) significa exigido por lei ou regra; obrigatório.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Optional", false),
                            new AnswerOption("Mandatory", true),
                            new AnswerOption("Voluntary", false),
                            new AnswerOption("Accidental", false)
                    )
            ),
            new QuestionData(
                    "The word 'vulnerable' means ___.",
                    "A palavra 'vulnerable' significa ___.",
                    "'Vulnerable' means exposed to the possibility of being attacked or harmed.",
                    "'Vulnerable' significa exposto à possibilidade de ser atacado ou prejudicado.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Protected", false),
                            new AnswerOption("Resilient", false),
                            new AnswerOption("Defenseless", true),
                            new AnswerOption("Invincible", false)
                    )
            ),
            new QuestionData(
                    "A sudden, brief storm of rain, hail, or snow is a ___.",
                    "Uma tempestade repentina e breve de chuva, granizo ou neve é uma ___.",
                    "A 'shower' can mean a brief, localized fall of rain, hail, or snow.",
                    "Uma 'shower' (aguaceiro) pode significar uma queda breve e localizada de chuva, granizo ou neve.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Drought", false),
                            new AnswerOption("Shower", true),
                            new AnswerOption("Heatwave", false),
                            new AnswerOption("Blizzard", false)
                    )
            ),
            new QuestionData(
                    "What is the best synonym for 'essential'?",
                    "Qual é o melhor sinónimo para 'essential' (essencial)?",
                    "'Crucial' means decisive or critical, especially in the success or failure of something.",
                    "'Crucial' (crucial) significa decisivo ou crítico, especialmente no sucesso ou fracasso de algo.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Trivial", false),
                            new AnswerOption("Superfluous", false),
                            new AnswerOption("Crucial", true),
                            new AnswerOption("Minor", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'expand' is ___.",
                    "O oposto de 'expand' (expandir) é ___.",
                    "'Contract' is the antonym, meaning to decrease in size, number, or range.",
                    "'Contract' (contrair) é o antônimo, significando diminuir em tamanho, número ou alcance.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Extend", false),
                            new AnswerOption("Amplify", false),
                            new AnswerOption("Contract", true),
                            new AnswerOption("Broaden", false)
                    )
            ),
            new QuestionData(
                    "To 'assess' a situation means to ___ it.",
                    "'Assess' (avaliar) uma situação significa ___.",
                    "'Evaluate' means to form an idea of the amount, number, or value of; assess.",
                    "'Evaluate' (avaliar) significa formar uma ideia da quantidade, número ou valor de; avaliar.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Ignore", false),
                            new AnswerOption("Evaluate", true),
                            new AnswerOption("Complicate", false),
                            new AnswerOption("Neglect", false)
                    )
            ),
            new QuestionData(
                    "A person who is always worried about small details is ___.",
                    "Uma pessoa que está sempre preocupada com pequenos detalhes é ___.",
                    "'Meticulous' means showing great attention to detail; very careful and precise.",
                    "'Meticulous' (meticuloso) significa mostrar grande atenção aos detalhes; muito cuidadoso e preciso.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Careless", false),
                            new AnswerOption("Meticulous", true),
                            new AnswerOption("Spontaneous", false),
                            new AnswerOption("Indifferent", false)
                    )
            ),
            new QuestionData(
                    "What is a synonym for 'feasible'?",
                    "Qual é um sinónimo para 'feasible' (viável)?",
                    "'Viable' is a synonym, meaning capable of working successfully; feasible.",
                    "'Viable' (viável) é um sinónimo, significando capaz de funcionar com sucesso; exequível.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Impractical", false),
                            new AnswerOption("Viable", true),
                            new AnswerOption("Unnecessary", false),
                            new AnswerOption("Dubious", false)
                    )
            ),
            new QuestionData(
                    "The word 'consequence' means ___.",
                    "A palavra 'consequence' (consequência) significa ___.",
                    "'Consequence' means a result or effect of an action or condition.",
                    "'Consequence' significa um resultado ou efeito de uma ação ou condição.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Cause", false),
                            new AnswerOption("Result", true),
                            new AnswerOption("Origin", false),
                            new AnswerOption("Source", false)
                    )
            ),
            new QuestionData(
                    "A formal word for 'old-fashioned' is ___.",
                    "Uma palavra formal para 'old-fashioned' (antiquado) é ___.",
                    "'Obsolete' is a formal synonym, meaning no longer produced or used; out of date.",
                    "'Obsolete' (obsoleto) é um sinónimo formal, significando que já não é produzido ou usado; fora de moda.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Contemporary", false),
                            new AnswerOption("Modern", false),
                            new AnswerOption("Obsolete", true),
                            new AnswerOption("Current", false)
                    )
            ),
            new QuestionData(
                    "What word means 'to strongly encourage or urge someone to do something'?",
                    "Que palavra significa 'encorajar ou incitar fortemente alguém a fazer algo'?",
                    "'Urge' means to try to persuade earnestly or repeatedly.",
                    "'Urge' (incitar) significa tentar persuadir com seriedade ou repetidamente.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Deter", false),
                            new AnswerOption("Urge", true),
                            new AnswerOption("Prevent", false),
                            new AnswerOption("Forbid", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'optimistic' is ___.",
                    "O oposto de 'optimistic' (otimista) é ___.",
                    "'Pessimistic' is the antonym, meaning tending to see the worst aspect of things or believe that the worst will happen.",
                    "'Pessimistic' (pessimista) é o antônimo, significando tender a ver o pior aspeto das coisas ou acreditar que o pior acontecerá.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Cheerful", false),
                            new AnswerOption("Pessimistic", true),
                            new AnswerOption("Hopeful", false),
                            new AnswerOption("Idealistic", false)
                    )
            ),
            new QuestionData(
                    "A plan for carrying out a task and achieving an aim is a ___.",
                    "Um plano para realizar uma tarefa e atingir um objetivo é uma ___.",
                    "A 'strategy' is a plan of action designed to achieve a long-term or overall aim.",
                    "Uma 'strategy' (estratégia) é um plano de ação concebido para atingir um objetivo a longo prazo ou global.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Hunch", false),
                            new AnswerOption("Strategy", true),
                            new AnswerOption("Guess", false),
                            new AnswerOption("Tactic", false)
                    )
            ),
            new QuestionData(
                    "What is a synonym for 'alter'?",
                    "Qual é um sinónimo para 'alter' (alterar)?",
                    "'Modify' means to make partial or minor changes to something.",
                    "'Modify' (modificar) significa fazer mudanças parciais ou menores em algo.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Maintain", false),
                            new AnswerOption("Modify", true),
                            new AnswerOption("Preserve", false),
                            new AnswerOption("Retain", false)
                    )
            ),
            new QuestionData(
                    "The word 'inevitable' means ___.",
                    "A palavra 'inevitable' (inevitável) significa ___.",
                    "'Inevitable' means certain to happen; unavoidable.",
                    "'Inevitable' significa certo de acontecer; inevitável.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Avoidable", false),
                            new AnswerOption("Unavoidable", true),
                            new AnswerOption("Optional", false),
                            new AnswerOption("Unlikely", false)
                    )
            ),
            new QuestionData(
                    "To 'clarify' something means to make it ___.",
                    "'Clarify' (esclarecer) algo significa torná-lo ___.",
                    "'Clear' means easy to perceive, understand, or interpret.",
                    "'Clear' (claro) significa fácil de perceber, entender ou interpretar.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Obscure", false),
                            new AnswerOption("Clear", true),
                            new AnswerOption("Confusing", false),
                            new AnswerOption("Vague", false)
                    )
            ),
            new QuestionData(
                    "Which word means 'having a pleasing appearance or quality'?",
                    "Qual palavra significa 'ter uma aparência ou qualidade agradável'?",
                    "'Appealing' means attractive or interesting.",
                    "'Appealing' (apelativo) significa atraente ou interessante.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Repulsive", false),
                            new AnswerOption("Appealing", true),
                            new AnswerOption("Dull", false),
                            new AnswerOption("Offensive", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'permanent' is ___.",
                    "O oposto de 'permanent' (permanente) é ___.",
                    "'Temporary' is the antonym, meaning lasting for only a limited period of time.",
                    "'Temporary' (temporário) é o antônimo, significando que dura apenas por um período limitado de tempo.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Eternal", false),
                            new AnswerOption("Temporary", true),
                            new AnswerOption("Everlasting", false),
                            new AnswerOption("Fixed", false)
                    )
            ),
            new QuestionData(
                    "What is a synonym for 'prohibit'?",
                    "Qual é um sinónimo para 'prohibit' (proibir)?",
                    "'Forbid' means to order someone not to do something; prohibit.",
                    "'Forbid' (proibir) significa ordenar a alguém que não faça algo; proibir.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Permit", false),
                            new AnswerOption("Forbid", true),
                            new AnswerOption("Allow", false),
                            new AnswerOption("Authorize", false)
                    )
            ),
            new QuestionData(
                    "The word 'dilemma' means ___.",
                    "A palavra 'dilemma' significa ___.",
                    "A 'dilemma' is a situation in which a difficult choice has to be made between two or more alternatives.",
                    "Um 'dilemma' é uma situação em que uma escolha difícil tem de ser feita entre duas ou mais alternativas.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Solution", false),
                            new AnswerOption("Predicament", true),
                            new AnswerOption("Certainty", false),
                            new AnswerOption("Advantage", false)
                    )
            ),
            new QuestionData(
                    "To 'exaggerate' means to ___.",
                    "'Exaggerate' (exagerar) significa ___.",
                    "'Overstate' means to express or state too strongly; overemphasize.",
                    "'Overstate' (exagerar) significa expressar ou declarar de forma muito forte; dar ênfase exagerada.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Underestimate", false),
                            new AnswerOption("Overstate", true),
                            new AnswerOption("Minimize", false),
                            new AnswerOption("Downplay", false)
                    )
            ),
            new QuestionData(
                    "Which word means 'to make something less severe or unpleasant'?",
                    "Qual palavra significa 'tornar algo menos severo ou desagradável'?",
                    "'Alleviate' means to make suffering, deficiency, or a problem less severe.",
                    "'Alleviate' (aliviar) significa tornar o sofrimento, a deficiência ou um problema menos severo.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Aggravate", false),
                            new AnswerOption("Alleviate", true),
                            new AnswerOption("Intensify", false),
                            new AnswerOption("Worsen", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'spontaneous' is ___.",
                    "O oposto de 'spontaneous' (espontâneo) é ___.",
                    "'Planned' is the antonym, meaning decided in advance.",
                    "'Planned' (planejado) é o antônimo, significando decidido antecipadamente.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Sudden", false),
                            new AnswerOption("Planned", true),
                            new AnswerOption("Impulsive", false),
                            new AnswerOption("Immediate", false)
                    )
            ),
            new QuestionData(
                    "What is a synonym for 'hesitate'?",
                    "Qual é um sinónimo para 'hesitate' (hesitar)?",
                    "'Pause' means to interrupt a sustained activity briefly.",
                    "'Pause' (pausar) significa interromper brevemente uma atividade sustentada.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Decide", false),
                            new AnswerOption("Pause", true),
                            new AnswerOption("Continue", false),
                            new AnswerOption("Act", false)
                    )
            ),
            new QuestionData(
                    "The word 'culprit' means ___.",
                    "A palavra 'culprit' (culpado) significa ___.",
                    "A 'culprit' is a person who is responsible for a crime or other misdeed.",
                    "Um 'culprit' é uma pessoa que é responsável por um crime ou outro delito.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Victim", false),
                            new AnswerOption("Culprit", true),
                            new AnswerOption("Witness", false),
                            new AnswerOption("Alibi", false)
                    )
            ),
            new QuestionData(
                    "The best word for 'a possible future event or situation' is ___.",
                    "A melhor palavra para 'um possível evento ou situação futura' é ___.",
                    "A 'prospect' is the possibility of some future event occurring.",
                    "Uma 'prospect' (perspetiva) é a possibilidade de algum evento futuro ocorrer.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Retrospect", false),
                            new AnswerOption("Prospect", true),
                            new AnswerOption("Memory", false),
                            new AnswerOption("History", false)
                    )
            ),
            new QuestionData(
                    "What is a synonym for 'precise'?",
                    "Qual é um sinónimo para 'precise' (preciso)?",
                    "'Accurate' means correct in all details; exact.",
                    "'Accurate' (exato) significa correto em todos os detalhes; exato.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Ambiguous", false),
                            new AnswerOption("Accurate", true),
                            new AnswerOption("Vague", false),
                            new AnswerOption("Unclear", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'cautious' is ___.",
                    "O oposto de 'cautious' (cauteloso) é ___.",
                    "'Reckless' is the antonym, meaning unconcerned about the dangerous consequences of one's actions.",
                    "'Reckless' (imprudente) é o antônimo, significando não se importar com as consequências perigosas das próprias ações.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Prudent", false),
                            new AnswerOption("Reckless", true),
                            new AnswerOption("Wary", false),
                            new AnswerOption("Careful", false)
                    )
            ),
            new QuestionData(
                    "To 'omit' information means to ___ it.",
                    "'Omit' (omitir) informação significa ___.",
                    "'Exclude' means to leave out (something) either intentionally or accidentally.",
                    "'Exclude' (excluir) significa deixar de fora (algo) intencionalmente ou acidentalmente.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Include", false),
                            new AnswerOption("Exclude", true),
                            new AnswerOption("Insert", false),
                            new AnswerOption("Add", false)
                    )
            ),
            new QuestionData(
                    "The word 'consensus' means ___.",
                    "A palavra 'consensus' (consenso) significa ___.",
                    "'Consensus' means a general agreement.",
                    "'Consensus' significa um acordo geral.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Disagreement", false),
                            new AnswerOption("Agreement", true),
                            new AnswerOption("Conflict", false),
                            new AnswerOption("Dispute", false)
                    )
            ),
            new QuestionData(
                    "A person who studies languages is a ___.",
                    "Uma pessoa que estuda línguas é um(a) ___.",
                    "A 'linguist' is a person skilled in foreign languages or the scientific study of language.",
                    "Um 'linguist' (linguista) é uma pessoa perita em línguas estrangeiras ou no estudo científico da linguagem.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Biologist", false),
                            new AnswerOption("Linguist", true),
                            new AnswerOption("Chemist", false),
                            new AnswerOption("Physicist", false)
                    )
            ),
            new QuestionData(
                    "What is a synonym for 'tedious'?",
                    "Qual é um sinónimo para 'tedious' (tedioso)?",
                    "'Boring' is a synonym, meaning too long, slow, or dull; tiresome or monotonous.",
                    "'Boring' (aborrecido) é um sinónimo, significando muito longo, lento ou enfadonho; cansativo ou monótono.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Exciting", false),
                            new AnswerOption("Boring", true),
                            new AnswerOption("Engaging", false),
                            new AnswerOption("Captivating", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'conventional' is ___.",
                    "O oposto de 'conventional' (convencional) é ___.",
                    "'Unorthodox' is the antonym, meaning contrary to what is usual, traditional, or accepted.",
                    "'Unorthodox' (heterodoxo) é o antônimo, significando contrário ao que é usual, tradicional ou aceite.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Normal", false),
                            new AnswerOption("Unorthodox", true),
                            new AnswerOption("Typical", false),
                            new AnswerOption("Standard", false)
                    )
            ),
            new QuestionData(
                    "To 'facilitate' a process means to ___ it.",
                    "'Facilitate' (facilitar) um processo significa ___.",
                    "'Simplify' means to make (something) simpler or easier to do or understand.",
                    "'Simplify' (simplificar) significa tornar (algo) mais simples ou mais fácil de fazer ou entender.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Complicate", false),
                            new AnswerOption("Simplify", true),
                            new AnswerOption("Hinder", false),
                            new AnswerOption("Obstruct", false)
                    )
            ),
            new QuestionData(
                    "The word 'scrutiny' means ___.",
                    "A palavra 'scrutiny' (escrutínio) significa ___.",
                    "'Scrutiny' means critical observation or examination.",
                    "'Scrutiny' significa observação ou exame crítico.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Superficiality", false),
                            new AnswerOption("Inspection", true),
                            new AnswerOption("Glimpse", false),
                            new AnswerOption("Oversight", false)
                    )
            ),
            new QuestionData(
                    "A synonym for 'brief' is ___.",
                    "Um sinónimo para 'brief' (breve) é ___.",
                    "'Concise' means giving a lot of information clearly and in a few words; brief but comprehensive.",
                    "'Concise' (conciso) significa dar muita informação de forma clara e em poucas palavras; breve mas abrangente.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Lengthy", false),
                            new AnswerOption("Concise", true),
                            new AnswerOption("Extensive", false),
                            new AnswerOption("Verbose", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'vivid' (in color) is ___.",
                    "O oposto de 'vivid' (em cor) é ___.",
                    "'Pale' is the antonym, meaning light in color or having little color.",
                    "'Pale' (pálido) é o antônimo, significando de cor clara ou com pouca cor.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Bright", false),
                            new AnswerOption("Pale", true),
                            new AnswerOption("Intense", false),
                            new AnswerOption("Strong", false)
                    )
            ),
            new QuestionData(
                    "Which word means 'to get rid of something undesirable'?",
                    "Qual palavra significa 'livrar-se de algo indesejável'?",
                    "'Dispose of' means to get rid of by throwing away or giving or selling to someone else.",
                    "'Dispose of' (descartar-se) significa livrar-se de algo, jogando fora ou dando ou vendendo a outra pessoa.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Acquire", false),
                            new AnswerOption("Dispose of", true),
                            new AnswerOption("Preserve", false),
                            new AnswerOption("Retain", false)
                    )
            ),
            new QuestionData(
                    "The word 'notorious' means ___.",
                    "A palavra 'notorious' (notório) significa ___.",
                    "'Notorious' means famous or well known for some bad quality or deed.",
                    "'Notorious' significa famoso ou bem conhecido por alguma má qualidade ou ato.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Reputable", false),
                            new AnswerOption("Infamous", true),
                            new AnswerOption("Honorable", false),
                            new AnswerOption("Esteemed", false)
                    )
            ),
            new QuestionData(
                    "What is a synonym for 'distinguish'?",
                    "Qual é um sinónimo para 'distinguish' (distinguir)?",
                    "'Differentiate' means to recognize or ascertain what makes (someone or something) different.",
                    "'Differentiate' (diferenciar) significa reconhecer ou determinar o que torna (alguém ou algo) diferente.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Confuse", false),
                            new AnswerOption("Differentiate", true),
                            new AnswerOption("Mix up", false),
                            new AnswerOption("Blend", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'rigid' is ___.",
                    "O oposto de 'rigid' (rígido) é ___.",
                    "'Flexible' is the antonym, meaning capable of bending easily without breaking.",
                    "'Flexible' (flexível) é o antônimo, significando capaz de dobrar-se facilmente sem quebrar.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Stiff", false),
                            new AnswerOption("Flexible", true),
                            new AnswerOption("Firm", false),
                            new AnswerOption("Solid", false)
                    )
            ),
            new QuestionData(
                    "To 'anticipate' something means to ___ it.",
                    "'Anticipate' (antecipar) algo significa ___.",
                    "'Predict' means to state or estimate that a specified thing will happen in the future.",
                    "'Predict' (prever) significa declarar ou estimar que uma coisa especificada acontecerá no futuro.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Ignore", false),
                            new AnswerOption("Predict", true),
                            new AnswerOption("Forget", false),
                            new AnswerOption("Recall", false)
                    )
            ),
            new QuestionData(
                    "Which word means 'to provide evidence or testimony'?",
                    "Qual palavra significa 'fornecer evidência ou testemunho'?",
                    "'Testify' means to give evidence as a witness in a court of law or to give evidence of (something).",
                    "'Testify' (testemunhar) significa dar prova como testemunha num tribunal ou dar prova de (algo).",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Conceal", false),
                            new AnswerOption("Testify", true),
                            new AnswerOption("Hide", false),
                            new AnswerOption("Deny", false)
                    )
            ),
            new QuestionData(
                    "A general agreement of opinion is called ___.",
                    "Um acordo geral de opinião é chamado de ___.",
                    "The term 'unanimity' refers to a state of being completely agreed.",
                    "O termo 'unanimity' (unanimidade) refere-se a um estado de total acordo.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Contention", false),
                            new AnswerOption("Unanimity", true),
                            new AnswerOption("Contradiction", false),
                            new AnswerOption("Division", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'synthetic' is ___.",
                    "O oposto de 'synthetic' (sintético) é ___.",
                    "'Natural' is the antonym, meaning existing in or derived from nature; not made or caused by humankind.",
                    "'Natural' é o antônimo, significando existente ou derivado da natureza; não feito ou causado pela humanidade.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Artificial", false),
                            new AnswerOption("Natural", true),
                            new AnswerOption("Man-made", false),
                            new AnswerOption("Fabricated", false)
                    )
            ),
            new QuestionData(
                    "What is a synonym for 'initial'?",
                    "Qual é um sinónimo para 'initial' (inicial)?",
                    "'Preliminary' means denoting an action or event preceding or done in preparation for something fuller or more important.",
                    "'Preliminary' (preliminar) significa que denota uma ação ou evento que precede ou é feito em preparação para algo mais completo ou importante.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Final", false),
                            new AnswerOption("Preliminary", true),
                            new AnswerOption("Subsequent", false),
                            new AnswerOption("Ultimate", false)
                    )
            ),
            new QuestionData(
                    "The word 'incentive' means ___.",
                    "A palavra 'incentive' (incentivo) significa ___.",
                    "An 'incentive' is a thing that motivates or encourages one to do something.",
                    "Um 'incentive' é algo que motiva ou encoraja alguém a fazer algo.",
                    DifficultyLevel.INTERMEDIATE, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Obstacle", false),
                            new AnswerOption("Motivation", true),
                            new AnswerOption("Deterrent", false),
                            new AnswerOption("Hindrance", false)
                    )
            ),

            // ADVANCED - Vocabulary
            new QuestionData(
                    "Choose the best synonym for 'pernicious'.",
                    "Escolha o melhor sinónimo para 'pernicious' (pernicioso).",
                    "'Destructive' is the best synonym, meaning having a harmful effect, especially in a gradual or subtle way.",
                    "'Destructive' (destrutivo) é o melhor sinónimo, significando ter um efeito prejudicial, especialmente de forma gradual ou subtil.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Benevolent", false),
                            new AnswerOption("Salubrious", false),
                            new AnswerOption("Destructive", true),
                            new AnswerOption("Innocuous", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'ephemeral' is ___.",
                    "O oposto de 'ephemeral' (efémero) é ___.",
                    "'Perpetual' is the antonym, meaning never ending or changing; lasting for a long time.",
                    "'Perpetual' (perpétuo) é o antônimo, significando que nunca acaba nem muda; duradouro.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Transient", false),
                            new AnswerOption("Fleeting", false),
                            new AnswerOption("Perpetual", true),
                            new AnswerOption("Momentary", false)
                    )
            ),
            new QuestionData(
                    "What word means 'to surrender or yield reluctantly'?",
                    "Que palavra significa 'render-se ou ceder relutantemente'?",
                    "'Capitulate' means to cease to resist an opponent or an unwelcome demand; surrender.",
                    "'Capitulate' (capitular) significa cessar de resistir a um oponente ou a uma exigência indesejada; render-se.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Resist", false),
                            new AnswerOption("Capitulate", true),
                            new AnswerOption("Defy", false),
                            new AnswerOption("Vindicate", false)
                    )
            ),
            new QuestionData(
                    "The word 'obfuscate' means ___.",
                    "A palavra 'obfuscate' (obfuscar) significa ___.",
                    "'Obfuscate' means to make obscure, unclear, or unintelligible.",
                    "'Obfuscate' significa tornar obscuro, pouco claro ou ininteligível.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Clarify", false),
                            new AnswerOption("Elucidate", false),
                            new AnswerOption("Confuse", true),
                            new AnswerOption("Simplify", false)
                    )
            ),
            new QuestionData(
                    "What is a synonym for 'fastidious'?",
                    "Qual é um sinónimo para 'fastidious' (meticuloso)?",
                    "'Scrupulous' is the best synonym, meaning diligent, thorough, and extremely careful.",
                    "'Scrupulous' (escrupuloso) é o melhor sinónimo, significando diligente, minucioso e extremamente cuidadoso.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Lax", false),
                            new AnswerOption("Sloppy", false),
                            new AnswerOption("Scrupulous", true),
                            new AnswerOption("Indifferent", false)
                    )
            ),
            new QuestionData(
                    "A situation of total confusion and disorder is called ___.",
                    "Uma situação de total confusão e desordem é chamada de ___.",
                    "'Chaos' means complete disorder and confusion.",
                    "'Chaos' (caos) significa desordem e confusão completas.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Tranquility", false),
                            new AnswerOption("Coherence", false),
                            new AnswerOption("Chaos", true),
                            new AnswerOption("Order", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'veracity' is ___.",
                    "O oposto de 'veracity' (veracidade) é ___.",
                    "'Mendacity' is the antonym, meaning untruthfulness or dishonesty.",
                    "'Mendacity' (mendacidade) é o antônimo, significando falta de veracidade ou desonestidade.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Honesty", false),
                            new AnswerOption("Mendacity", true),
                            new AnswerOption("Sincerity", false),
                            new AnswerOption("Truth", false)
                    )
            ),
            new QuestionData(
                    "Which word means 'to express or state clearly and precisely'?",
                    "Qual palavra significa 'expressar ou declarar clara e precisamente'?",
                    "'Articulate' means to express (an idea or feeling) fluently and coherently.",
                    "'Articulate' (articular) significa expressar (uma ideia ou sentimento) de forma fluente e coerente.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Stammer", false),
                            new AnswerOption("Mumble", false),
                            new AnswerOption("Articulate", true),
                            new AnswerOption("Hesitate", false)
                    )
            ),
            new QuestionData(
                    "What is a synonym for 'ubiquitous'?",
                    "Qual é um sinónimo para 'ubiquitous' (ubíquo)?",
                    "'Pervasive' is a synonym, meaning present in all parts of a thing or place.",
                    "'Pervasive' (pervasivo) é um sinónimo, significando presente em todas as partes de uma coisa ou lugar.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Scarce", false),
                            new AnswerOption("Rare", false),
                            new AnswerOption("Pervasive", true),
                            new AnswerOption("Limited", false)
                    )
            ),
            new QuestionData(
                    "The word 'deleterious' means ___.",
                    "A palavra 'deleterious' (nocivo) significa ___.",
                    "'Deleterious' means causing harm or damage.",
                    "'Deleterious' significa causar dano ou prejuízo.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Beneficial", false),
                            new AnswerOption("Harmful", true),
                            new AnswerOption("Advantageous", false),
                            new AnswerOption("Propitious", false)
                    )
            ),
            new QuestionData(
                    "To 'ameliorate' a condition means to ___ it.",
                    "'Ameliorate' (melhorar) uma condição significa ___.",
                    "'Improve' means to make or become better.",
                    "'Improve' (melhorar) significa tornar ou tornar-se melhor.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Exacerbate", false),
                            new AnswerOption("Worsen", false),
                            new AnswerOption("Improve", true),
                            new AnswerOption("Deteriorate", false)
                    )
            ),
            new QuestionData(
                    "What is the opposite of 'prodigal'?",
                    "Qual é o oposto de 'prodigal'?",
                    "'Thrifty' is the antonym, meaning using money and other resources carefully and not wastefully.",
                    "'Thrifty' (económico) é o antônimo, significando usar dinheiro e outros recursos com cuidado e sem desperdício.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Lavish", false),
                            new AnswerOption("Extravagant", false),
                            new AnswerOption("Thrifty", true),
                            new AnswerOption("Wasteful", false)
                    )
            ),
            new QuestionData(
                    "Which word means 'lacking interest, enthusiasm, or concern'?",
                    "Qual palavra significa 'carente de interesse, entusiasmo ou preocupação'?",
                    "'Apathetic' means showing or feeling no interest, enthusiasm, or concern.",
                    "'Apathetic' (apático) significa mostrar ou sentir falta de interesse, entusiasmo ou preocupação.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Zealous", false),
                            new AnswerOption("Passionate", false),
                            new AnswerOption("Apathetic", true),
                            new AnswerOption("Ardent", false)
                    )
            ),
            new QuestionData(
                    "A synonym for 'clandestine' is ___.",
                    "Um sinónimo para 'clandestine' (clandestino) é ___.",
                    "'Surreptitious' is a synonym, meaning kept secret, especially because it would not be approved of.",
                    "'Surreptitious' (surreptício) é um sinónimo, significando mantido em segredo, especialmente porque não seria aprovado.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Overt", false),
                            new AnswerOption("Open", false),
                            new AnswerOption("Surreptitious", true),
                            new AnswerOption("Public", false)
                    )
            ),
            new QuestionData(
                    "The word 'indolent' means ___.",
                    "A palavra 'indolent' (indolente) significa ___.",
                    "'Indolent' means wanting to avoid activity or exertion; lazy.",
                    "'Indolent' significa querer evitar atividade ou esforço; preguiçoso.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Diligent", false),
                            new AnswerOption("Lazy", true),
                            new AnswerOption("Industrious", false),
                            new AnswerOption("Energetic", false)
                    )
            ),
            new QuestionData(
                    "What is the opposite of 'gregarious'?",
                    "Qual é o oposto de 'gregarious' (gregário)?",
                    "'Aloof' is the best antonym, meaning not friendly or forthcoming; cool and distant.",
                    "'Aloof' (distante) é o melhor antônimo, significando não amigável ou comunicativo; frio e distante.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Sociable", false),
                            new AnswerOption("Affable", false),
                            new AnswerOption("Aloof", true),
                            new AnswerOption("Outgoing", false)
                    )
            ),
            new QuestionData(
                    "To 'propitiate' a person means to ___ them.",
                    "'Propitiate' (propiciar) uma pessoa significa ___.",
                    "'Appease' is the best synonym, meaning win or regain the favour of (a god, spirit, or person) by doing something that pleases them.",
                    "'Appease' (apaziguar) é o melhor sinónimo, significando ganhar ou recuperar o favor de (um deus, espírito ou pessoa) fazendo algo que lhes agrada.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Antagonize", false),
                            new AnswerOption("Appease", true),
                            new AnswerOption("Incite", false),
                            new AnswerOption("Provoke", false)
                    )
            ),
            new QuestionData(
                    "A synonym for 'incongruous' is ___.",
                    "Um sinónimo para 'incongruous' (incongruente) é ___.",
                    "'Inconsistent' is a synonym, meaning not in harmony or keeping with the surroundings or other aspects of something.",
                    "'Inconsistent' (inconsistente) é um sinónimo, significando não estar em harmonia ou de acordo com o ambiente ou outros aspetos de algo.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Harmonious", false),
                            new AnswerOption("Fitting", false),
                            new AnswerOption("Inconsistent", true),
                            new AnswerOption("Suitable", false)
                    )
            ),
            new QuestionData(
                    "The word 'quixotic' means ___.",
                    "A palavra 'quixotic' (quixotesco) significa ___.",
                    "'Quixotic' means exceedingly idealistic; unrealistic and impractical.",
                    "'Quixotic' significa extremamente idealista; irrealista e impraticável.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Pragmatic", false),
                            new AnswerOption("Realistic", false),
                            new AnswerOption("Impractical", true),
                            new AnswerOption("Sensible", false)
                    )
            ),
            new QuestionData(
                    "What is the best synonym for 'recalcitrant'?",
                    "Qual é o melhor sinónimo para 'recalcitrant' (recalcitrante)?",
                    "'Unruly' is a synonym, meaning stubbornly disobedient.",
                    "'Unruly' (indisciplinado) é um sinónimo, significando teimosamente desobediente.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Docile", false),
                            new AnswerOption("Compliant", false),
                            new AnswerOption("Unruly", true),
                            new AnswerOption("Submissive", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'nefarious' is ___.",
                    "O oposto de 'nefarious' (nefando/perverso) é ___.",
                    "'Virtuous' is the antonym, meaning having or showing high moral standards.",
                    "'Virtuous' (virtuoso) é o antônimo, significando ter ou mostrar elevados padrões morais.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Wicked", false),
                            new AnswerOption("Iniquitous", false),
                            new AnswerOption("Virtuous", true),
                            new AnswerOption("Villainous", false)
                    )
            ),
            new QuestionData(
                    "Which word means 'to express strong disapproval or disagreement'?",
                    "Qual palavra significa 'expressar forte desaprovação ou desacordo'?",
                    "'Dissent' means the holding or expression of opinions at variance with those commonly or officially held.",
                    "'Dissent' (dissidência) significa a sustentação ou expressão de opiniões em desacordo com as que são comumente ou oficialmente detidas.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Concur", false),
                            new AnswerOption("Assent", false),
                            new AnswerOption("Dissent", true),
                            new AnswerOption("Approve", false)
                    )
            ),
            new QuestionData(
                    "A synonym for 'vacillate' is ___.",
                    "Um sinónimo para 'vacillate' (vacilar) é ___.",
                    "'Waver' is a synonym, meaning to alternate or waver between different opinions or actions; be indecisive.",
                    "'Waver' (titubear) é um sinónimo, significando alternar ou vacilar entre diferentes opiniões ou ações; ser indeciso.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Resolve", false),
                            new AnswerOption("Waver", true),
                            new AnswerOption("Stabilize", false),
                            new AnswerOption("Determine", false)
                    )
            ),
            new QuestionData(
                    "The word 'perfunctory' means ___.",
                    "A palavra 'perfunctory' (superficial) significa ___.",
                    "'Perfunctory' means carried out with a minimum of effort or reflection.",
                    "'Perfunctory' significa realizado com um mínimo de esforço ou reflexão.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Thorough", false),
                            new AnswerOption("Cursory", true),
                            new AnswerOption("Careful", false),
                            new AnswerOption("Meticulous", false)
                    )
            ),
            new QuestionData(
                    "What is the best synonym for 'enervate'?",
                    "Qual é o melhor sinónimo para 'enervate' (enervar/enfraquecer)?",
                    "'Exhaust' is the best synonym, meaning to cause (someone) to feel drained of energy or vitality.",
                    "'Exhaust' (esgotar) é o melhor sinónimo, significando fazer com que (alguém) se sinta esgotado de energia ou vitalidade.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Invigorate", false),
                            new AnswerOption("Strengthen", false),
                            new AnswerOption("Exhaust", true),
                            new AnswerOption("Energize", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'mitigate' is ___.",
                    "O oposto de 'mitigate' (mitigar/suavizar) é ___.",
                    "'Exacerbate' is the antonym, meaning to make (a problem, bad situation, or negative feeling) worse.",
                    "'Exacerbate' (exacerbar) é o antônimo, significando tornar (um problema, má situação ou sentimento negativo) pior.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Lessen", false),
                            new AnswerOption("Exacerbate", true),
                            new AnswerOption("Alleviate", false),
                            new AnswerOption("Ease", false)
                    )
            ),
            new QuestionData(
                    "Which word means 'to express disapproval of'?",
                    "Qual palavra significa 'expressar desaprovação de'?",
                    "'Deprecate' means to express disapproval of.",
                    "'Deprecate' (depreciar) significa expressar desaprovação de.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Commend", false),
                            new AnswerOption("Applaud", false),
                            new AnswerOption("Deprecate", true),
                            new AnswerOption("Praise", false)
                    )
            ),
            new QuestionData(
                    "A synonym for 'invective' is ___.",
                    "Um sinónimo para 'invective' (invectiva) é ___.",
                    "'Vituperation' is a synonym, meaning deeply offensive and abusive language.",
                    "'Vituperation' (vituperação) é um sinónimo, significando linguagem profundamente ofensiva e abusiva.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Eulogy", false),
                            new AnswerOption("Praise", false),
                            new AnswerOption("Vituperation", true),
                            new AnswerOption("Acclaim", false)
                    )
            ),
            new QuestionData(
                    "The word 'esoteric' means ___.",
                    "A palavra 'esoteric' (esotérico) significa ___.",
                    "'Esoteric' means intended for or likely to be understood by only a small number of people with a specialized knowledge or interest.",
                    "'Esoteric' significa destinado a ou provável de ser compreendido por apenas um pequeno número de pessoas com conhecimento ou interesse especializado.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Common", false),
                            new AnswerOption("Obscure", true),
                            new AnswerOption("Public", false),
                            new AnswerOption("Universal", false)
                    )
            ),
            new QuestionData(
                    "What is the opposite of 'provisional'?",
                    "Qual é o oposto de 'provisional' (provisório)?",
                    "'Definitive' is the antonym, meaning fixed, unchangeable, or final.",
                    "'Definitive' (definitivo) é o antônimo, significando fixo, imutável ou final.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Tentative", false),
                            new AnswerOption("Temporary", false),
                            new AnswerOption("Definitive", true),
                            new AnswerOption("Interim", false)
                    )
            ),
            new QuestionData(
                    "To 'conjecture' means to ___.",
                    "'Conjecture' (conjeturar) significa ___.",
                    "'Speculate' means to form an opinion or conclusion on the basis of incomplete information.",
                    "'Speculate' (especular) significa formar uma opinião ou conclusão com base em informações incompletas.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Verify", false),
                            new AnswerOption("Speculate", true),
                            new AnswerOption("Prove", false),
                            new AnswerOption("Confirm", false)
                    )
            ),
            new QuestionData(
                    "Which word means 'a sudden outburst of a strong emotion'?",
                    "Qual palavra significa 'uma explosão repentina de uma forte emoção'?",
                    "A 'paroxysm' is a sudden attack or outburst of a particular emotion or activity.",
                    "Um 'paroxysm' (paroxismo) é um ataque repentino ou explosão de uma emoção ou atividade particular.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Lethargy", false),
                            new AnswerOption("Serenity", false),
                            new AnswerOption("Paroxysm", true),
                            new AnswerOption("Calmness", false)
                    )
            ),
            new QuestionData(
                    "A synonym for 'indispensable' is ___.",
                    "Um sinónimo para 'indispensable' (indispensável) é ___.",
                    "'Crucial' is a synonym, meaning absolutely necessary.",
                    "'Crucial' (crucial) é um sinónimo, significando absolutamente necessário.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Superfluous", false),
                            new AnswerOption("Optional", false),
                            new AnswerOption("Crucial", true),
                            new AnswerOption("Redundant", false)
                    )
            ),
            new QuestionData(
                    "The word 'surfeit' means ___.",
                    "A palavra 'surfeit' (excesso) significa ___.",
                    "'Surfeit' means an excessive amount of something.",
                    "'Surfeit' significa uma quantidade excessiva de algo.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Deficiency", false),
                            new AnswerOption("Paucity", false),
                            new AnswerOption("Excess", true),
                            new AnswerOption("Lack", false)
                    )
            ),
            new QuestionData(
                    "What is the opposite of 'dearth'?",
                    "Qual é o oposto de 'dearth' (escassez)?",
                    "'Plethora' is the antonym, meaning a large or excessive amount of something.",
                    "'Plethora' (pletora) é o antônimo, significando uma quantidade grande ou excessiva de algo.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Shortage", false),
                            new AnswerOption("Scarcity", false),
                            new AnswerOption("Plethora", true),
                            new AnswerOption("Deficit", false)
                    )
            ),
            new QuestionData(
                    "To 'truncate' a process means to ___ it.",
                    "'Truncate' (truncar) um processo significa ___.",
                    "'Shorten' is the best synonym, meaning to shorten (something) by cutting off the top or the end.",
                    "'Shorten' (encurtar) é o melhor sinónimo, significando encurtar (algo) cortando o topo ou a extremidade.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Lengthen", false),
                            new AnswerOption("Extend", false),
                            new AnswerOption("Shorten", true),
                            new AnswerOption("Protracted", false)
                    )
            ),
            new QuestionData(
                    "Which word means 'easily influenced or swayed'?",
                    "Qual palavra significa 'facilmente influenciável ou persuadível'?",
                    "'Malleable' is the best synonym, meaning easily influenced.",
                    "'Malleable' (maleável) é o melhor sinónimo, significando facilmente influenciável.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Obstinate", false),
                            new AnswerOption("Malleable", true),
                            new AnswerOption("Unwavering", false),
                            new AnswerOption("Resolute", false)
                    )
            ),
            new QuestionData(
                    "A synonym for 'insipid' is ___.",
                    "Um sinónimo para 'insipid' (insípido) é ___.",
                    "'Tasteless' is a synonym, meaning lacking flavour or interest.",
                    "'Tasteless' (sem sabor) é um sinónimo, significando que carece de sabor ou interesse.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Piquant", false),
                            new AnswerOption("Tasteless", true),
                            new AnswerOption("Savory", false),
                            new AnswerOption("Flavorful", false)
                    )
            ),
            new QuestionData(
                    "The word 'reverberate' means ___.",
                    "A palavra 'reverberate' (reverberar) significa ___.",
                    "'Reverberate' means to be repeated several times as an echo.",
                    "'Reverberate' significa ser repetido várias vezes como um eco.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Absorb", false),
                            new AnswerOption("Echo", true),
                            new AnswerOption("Muffle", false),
                            new AnswerOption("Silence", false)
                    )
            ),
            new QuestionData(
                    "What is the best synonym for 'circumspect'?",
                    "Qual é o melhor sinónimo para 'circumspect' (circunspecto)?",
                    "'Cautious' is the best synonym, meaning wary and unwilling to take risks.",
                    "'Cautious' (cauteloso) é o melhor sinónimo, significando cauteloso e pouco disposto a correr riscos.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Reckless", false),
                            new AnswerOption("Rash", false),
                            new AnswerOption("Cautious", true),
                            new AnswerOption("Hasty", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'vociferous' is ___.",
                    "O oposto de 'vociferous' (vociferante) é ___.",
                    "'Silent' is the best antonym, meaning (especially of a person or animal) speaking very little or not at all.",
                    "'Silent' (silencioso) é o melhor antônimo, significando (especialmente de uma pessoa ou animal) que fala muito pouco ou nada.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Loud", false),
                            new AnswerOption("Noisy", false),
                            new AnswerOption("Silent", true),
                            new AnswerOption("Clamorous", false)
                    )
            ),
            new QuestionData(
                    "Which word means 'to criticize severely'?",
                    "Qual palavra significa 'criticar severamente'?",
                    "'Castigate' means to reprimand severely.",
                    "'Castigate' (castigar/repreender) significa repreender severamente.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Commend", false),
                            new AnswerOption("Castigate", true),
                            new AnswerOption("Praise", false),
                            new AnswerOption("Eulogize", false)
                    )
            ),
            new QuestionData(
                    "A synonym for 'inured' is ___.",
                    "Um sinónimo para 'inured' (habituado) é ___.",
                    "'Habituated' is a synonym, meaning accustomed to something, especially something undesirable.",
                    "'Habituated' (habituado) é um sinónimo, significando acostumado a algo, especialmente algo indesejável.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Sensitive", false),
                            new AnswerOption("Vulnerable", false),
                            new AnswerOption("Habituated", true),
                            new AnswerOption("Unused", false)
                    )
            ),
            new QuestionData(
                    "The word 'pusillanimous' means ___.",
                    "A palavra 'pusillanimous' (pusilânime) significa ___.",
                    "'Pusillanimous' means showing a lack of courage or determination; timid.",
                    "'Pusillanimous' significa mostrar falta de coragem ou determinação; tímido.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Courageous", false),
                            new AnswerOption("Brave", false),
                            new AnswerOption("Cowardly", true),
                            new AnswerOption("Valiant", false)
                    )
            ),
            new QuestionData(
                    "What is the best synonym for 'ignominious'?",
                    "Qual é o melhor sinónimo para 'ignominious' (ignominioso)?",
                    "'Humiliating' is the best synonym, meaning deserving or causing public disgrace or shame.",
                    "'Humiliating' (humilhante) é o melhor sinónimo, significando merecedor ou causador de desgraça ou vergonha pública.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Honorable", false),
                            new AnswerOption("Illustrious", false),
                            new AnswerOption("Humiliating", true),
                            new AnswerOption("Commendable", false)
                    )
            ),
            new QuestionData(
                    "The opposite of 'garrulous' is ___.",
                    "O oposto de 'garrulous' (falador) é ___.",
                    "'Taciturn' is the antonym, meaning saying little.",
                    "'Taciturn' (taciturno) é o antônimo, significando que fala pouco.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Talkative", false),
                            new AnswerOption("Loquacious", false),
                            new AnswerOption("Taciturn", true),
                            new AnswerOption("Voluble", false)
                    )
            ),
            new QuestionData(
                    "Which word means 'to renounce or reject a belief or cause'?",
                    "Qual palavra significa 'renunciar ou rejeitar uma crença ou causa'?",
                    "'Abjure' means to solemnly renounce (a belief, cause, or claim).",
                    "'Abjure' (abjurar) significa renunciar solenemente (a uma crença, causa ou reivindicação).",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Affirm", false),
                            new AnswerOption("Abjure", true),
                            new AnswerOption("Endorse", false),
                            new AnswerOption("Uphold", false)
                    )
            ),
            new QuestionData(
                    "A synonym for 'trenchant' is ___.",
                    "Um sinónimo para 'trenchant' (incisivo) é ___.",
                    "'Incendiary' is not the best, but 'incisive' is the synonym, meaning vigorous or incisive in expression or style.",
                    "'Incisive' (incisivo) é o sinónimo, significando vigoroso ou incisivo na expressão ou estilo.",
                    DifficultyLevel.ADVANCED, "Vocabulary",
                    Arrays.asList(
                            new AnswerOption("Vague", false),
                            new AnswerOption("Incisive", true),
                            new AnswerOption("Ambiguous", false),
                            new AnswerOption("Feeble", false)
                    )
            ),

            // BEGINNER - Phrasal Verbs

            new QuestionData(
                    "I need to ___ early tomorrow for my flight.",
                    "Eu preciso ___ cedo amanhã para o meu voo.",
                    "The phrasal verb 'get up' means to rise from bed after waking.",
                    "O phrasal verb 'get up' significa levantar-se da cama depois de acordar.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("look for", false),
                            new AnswerOption("get up", true),
                            new AnswerOption("put away", false),
                            new AnswerOption("turn down", false)
                    )
            ),
            new QuestionData(
                    "It is cold outside, so remember to ___ your jacket.",
                    "Está frio lá fora, então lembre-se de ___ a sua jaqueta.",
                    "To 'put on' means to place a garment on your body.",
                    "O phrasal verb 'put on' significa vestir uma peça de roupa.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("take off", false),
                            new AnswerOption("put on", true),
                            new AnswerOption("give up", false),
                            new AnswerOption("go back", false)
                    )
            ),
            new QuestionData(
                    "Please ___ the TV; I want to watch the news.",
                    "Por favor, ___ a TV; eu quero assistir ao noticiário.",
                    "To 'turn on' means to switch a device to start operating.",
                    "O phrasal verb 'turn on' significa ligar um aparelho para começar a funcionar.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("turn off", false),
                            new AnswerOption("turn on", true),
                            new AnswerOption("turn down", false),
                            new AnswerOption("turn up", false)
                    )
            ),
            new QuestionData(
                    "I cannot find my wallet. I need to ___ it.",
                    "Não consigo encontrar a minha carteira. Eu preciso ___ por ela.",
                    "To 'look for' means to search for something.",
                    "O phrasal verb 'look for' significa procurar por algo.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("look at", false),
                            new AnswerOption("look for", true),
                            new AnswerOption("look after", false),
                            new AnswerOption("look up", false)
                    )
            ),
            new QuestionData(
                    "Let's ___ tonight for dinner at a new restaurant.",
                    "Vamos ___ hoje à noite para jantar num novo restaurante.",
                    "To 'go out' means to leave your home to go to a social event or a place like a restaurant.",
                    "O phrasal verb 'go out' significa sair de casa para ir a um evento social ou a um lugar como um restaurante.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("go back", false),
                            new AnswerOption("go up", false),
                            new AnswerOption("go out", true),
                            new AnswerOption("go off", false)
                    )
            ),
            new QuestionData(
                    "When I finish my work, I will ___ home.",
                    "Quando eu terminar o meu trabalho, eu vou ___ para casa.",
                    "To 'go back' means to return to a place.",
                    "O phrasal verb 'go back' significa regressar a um lugar.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("go out", false),
                            new AnswerOption("go back", true),
                            new AnswerOption("go off", false),
                            new AnswerOption("go over", false)
                    )
            ),
            new QuestionData(
                    "The children love to ___ at the pictures in the book.",
                    "As crianças adoram ___ as figuras no livro.",
                    "To 'look at' means to direct your eyes toward something.",
                    "O phrasal verb 'look at' significa direcionar os seus olhos para algo.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("look up", false),
                            new AnswerOption("look for", false),
                            new AnswerOption("look at", true),
                            new AnswerOption("look after", false)
                    )
            ),
            new QuestionData(
                    "It is too loud. Can you please ___ the volume?",
                    "Está muito alto. Você pode por favor ___ o volume?",
                    "To 'turn down' means to reduce the volume or intensity of something.",
                    "O phrasal verb 'turn down' significa reduzir o volume ou a intensidade de algo.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("turn up", false),
                            new AnswerOption("turn on", false),
                            new AnswerOption("turn down", true),
                            new AnswerOption("turn off", false)
                    )
            ),
            new QuestionData(
                    "Before you go to bed, remember to ___ the computer.",
                    "Antes de ir para a cama, lembre-se de ___ o computador.",
                    "To 'turn off' means to switch off a device to stop operating.",
                    "O phrasal verb 'turn off' significa desligar um aparelho para parar de funcionar.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("turn on", false),
                            new AnswerOption("turn off", true),
                            new AnswerOption("turn up", false),
                            new AnswerOption("turn down", false)
                    )
            ),
            new QuestionData(
                    "Please ___ the book to the library tomorrow.",
                    "Por favor, ___ o livro à biblioteca amanhã.",
                    "To 'take back' means to return something to the place it came from.",
                    "O phrasal verb 'take back' significa devolver algo ao lugar de onde veio.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("take out", false),
                            new AnswerOption("take back", true),
                            new AnswerOption("take off", false),
                            new AnswerOption("take up", false)
                    )
            ),
            new QuestionData(
                    "Don't ___! Keep practicing your English.",
                    "Não ___! Continue praticando seu inglês.",
                    "To 'give up' means to stop trying or cease an effort.",
                    "O phrasal verb 'give up' significa parar de tentar ou cessar um esforço.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("give in", false),
                            new AnswerOption("give up", true),
                            new AnswerOption("give back", false),
                            new AnswerOption("give off", false)
                    )
            ),
            new QuestionData(
                    "I will ___ the baby while you go shopping.",
                    "Eu vou ___ do bebê enquanto você faz compras.",
                    "To 'look after' means to take care of someone or something.",
                    "O phrasal verb 'look after' significa cuidar de alguém ou algo.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("look out", false),
                            new AnswerOption("look over", false),
                            new AnswerOption("look up", false),
                            new AnswerOption("look after", true)
                    )
            ),
            new QuestionData(
                    "The car ___ on the road yesterday, and we had to call a mechanic.",
                    "O carro ___ na estrada ontem, e tivemos que chamar um mecânico.",
                    "When a vehicle 'broke down', it stopped working.",
                    "O phrasal verb 'broke down' (passado de break down) significa que o veículo parou de funcionar.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("broke up", false),
                            new AnswerOption("broke in", false),
                            new AnswerOption("broke down", true),
                            new AnswerOption("broke off", false)
                    )
            ),
            new QuestionData(
                    "It is hot in here. I will ___ my sweater.",
                    "Está quente aqui. Eu vou ___ o meu suéter.",
                    "To 'take off' means to remove a garment from your body.",
                    "O phrasal verb 'take off' significa remover uma peça de roupa do seu corpo.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("put on", false),
                            new AnswerOption("take off", true),
                            new AnswerOption("put out", false),
                            new AnswerOption("take up", false)
                    )
            ),
            new QuestionData(
                    "The little girl started to ___ when she saw the dog.",
                    "A menininha começou a ___ quando viu o cachorro.",
                    "To 'run away' means to leave a place or person quickly and secretly because you are unhappy or afraid.",
                    "O phrasal verb 'run away' significa fugir ou ir embora rapidamente porque está infeliz ou com medo.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("run into", false),
                            new AnswerOption("run out", false),
                            new AnswerOption("run away", true),
                            new AnswerOption("run over", false)
                    )
            ),
            new QuestionData(
                    "When the teacher called my name, I stood ___.",
                    "Quando o professor chamou meu nome, eu fiquei ___.",
                    "To 'stand up' means to rise to an upright position on your feet.",
                    "O phrasal verb 'stand up' significa levantar-se para uma posição vertical sobre os pés.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("sit down", false),
                            new AnswerOption("stand up", true),
                            new AnswerOption("lie down", false),
                            new AnswerOption("get over", false)
                    )
            ),
            new QuestionData(
                    "The glass is almost empty. Can you ___ it ___ with water?",
                    "O copo está quase vazio. Você pode ___ ele ___ com água?",
                    "To 'fill up' means to make a container completely full.",
                    "O phrasal verb 'fill up' significa encher um recipiente completamente.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("take / out", false),
                            new AnswerOption("fill / up", true),
                            new AnswerOption("put / out", false),
                            new AnswerOption("go / over", false)
                    )
            ),
            new QuestionData(
                    "Please ___ for a few minutes; I am almost ready.",
                    "Por favor, ___ por alguns minutos; eu estou quase pronto.",
                    "To 'hold on' means to wait for a short time.",
                    "O phrasal verb 'hold on' significa esperar por um curto período de tempo.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("go off", false),
                            new AnswerOption("hold on", true),
                            new AnswerOption("put off", false),
                            new AnswerOption("call off", false)
                    )
            ),
            new QuestionData(
                    "I need to ___ the number of the new restaurant.",
                    "Eu preciso ___ o número do novo restaurante.",
                    "To 'write down' means to record information on paper with a pen or pencil.",
                    "O phrasal verb 'write down' significa registrar informações no papel.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("read out", false),
                            new AnswerOption("write up", false),
                            new AnswerOption("write down", true),
                            new AnswerOption("read in", false)
                    )
            ),
            new QuestionData(
                    "I didn't understand the word. I need to ___ it ___ in the dictionary.",
                    "Eu não entendi a palavra. Eu preciso ___ ela ___ no dicionário.",
                    "To 'look up' means to search for information in a book or on a computer.",
                    "O phrasal verb 'look up' significa procurar por informação num livro ou computador.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("look / for", false),
                            new AnswerOption("look / after", false),
                            new AnswerOption("look / up", true),
                            new AnswerOption("look / at", false)
                    )
            ),
            new QuestionData(
                    "The small child needs someone to ___ him.",
                    "A criança pequena precisa de alguém para ___ dele.",
                    "To 'care for' (or 'look after') means to provide care for someone.",
                    "O phrasal verb 'care for' (ou 'look after') significa fornecer cuidado a alguém.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("care about", false),
                            new AnswerOption("care for", true),
                            new AnswerOption("care with", false),
                            new AnswerOption("care down", false)
                    )
            ),
            new QuestionData(
                    "It is cold, so please ___ your gloves.",
                    "Está frio, então por favor ___ suas luvas.",
                    "To 'put on' is used for accessories like gloves.",
                    "O phrasal verb 'put on' é usado para acessórios como luvas.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("take off", false),
                            new AnswerOption("put up", false),
                            new AnswerOption("put on", true),
                            new AnswerOption("put down", false)
                    )
            ),
            new QuestionData(
                    "The noise is annoying. I wish they would ___.",
                    "O barulho está incomodando. Eu gostaria que eles ___.",
                    "To 'stop' (or 'cut it out') is the general idea, but a simple phrasal verb like 'stop it' (implied) or 'go away' fits the beginner context. 'Go away' is used to tell someone to leave.",
                    "O phrasal verb 'go away' significa ir embora ou sair do local.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("come in", false),
                            new AnswerOption("go away", true),
                            new AnswerOption("sit down", false),
                            new AnswerOption("stand up", false)
                    )
            ),
            new QuestionData(
                    "I called him ten minutes ago, and now he is calling me ___.",
                    "Eu liguei para ele há dez minutos, e agora ele está me ligando ___.",
                    "To 'call back' means to return a phone call.",
                    "O phrasal verb 'call back' significa retornar uma chamada telefónica.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("call out", false),
                            new AnswerOption("call up", false),
                            new AnswerOption("call back", true),
                            new AnswerOption("call off", false)
                    )
            ),
            new QuestionData(
                    "I need to ___ the answer to the question.",
                    "Eu preciso ___ a resposta para a pergunta.",
                    "To 'find out' means to discover a fact or piece of information.",
                    "O phrasal verb 'find out' significa descobrir um facto ou informação.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("find in", false),
                            new AnswerOption("find out", true),
                            new AnswerOption("find up", false),
                            new AnswerOption("find at", false)
                    )
            ),
            new QuestionData(
                    "She always ___ her shoes before entering the house.",
                    "Ela sempre ___ os sapatos antes de entrar na casa.",
                    "To 'take off' means to remove a garment or accessory.",
                    "O phrasal verb 'take off' significa remover uma peça de vestuário ou acessório.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("put on", false),
                            new AnswerOption("put away", false),
                            new AnswerOption("take off", true),
                            new AnswerOption("take over", false)
                    )
            ),
            new QuestionData(
                    "The student asked the teacher to ___ the instructions again.",
                    "O aluno pediu ao professor para ___ as instruções novamente.",
                    "To 'read out' means to read something aloud.",
                    "O phrasal verb 'read out' significa ler algo em voz alta.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("write down", false),
                            new AnswerOption("read in", false),
                            new AnswerOption("read out", true),
                            new AnswerOption("write up", false)
                    )
            ),
            new QuestionData(
                    "We need to ___ the house before the guests arrive.",
                    "Nós precisamos ___ a casa antes que os convidados cheguem.",
                    "To 'clean up' means to make a place tidy and free of rubbish.",
                    "O phrasal verb 'clean up' significa arrumar e limpar um lugar.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("clean out", false),
                            new AnswerOption("clean up", true),
                            new AnswerOption("clean down", false),
                            new AnswerOption("clean over", false)
                    )
            ),
            new QuestionData(
                    "Could you please ___ the rubbish?",
                    "Você poderia por favor ___ o lixo?",
                    "To 'take out' means to remove something from a place.",
                    "O phrasal verb 'take out' significa remover algo de um lugar.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("take up", false),
                            new AnswerOption("take over", false),
                            new AnswerOption("take out", true),
                            new AnswerOption("take in", false)
                    )
            ),
            new QuestionData(
                    "The plane will ___ at 3 PM.",
                    "O avião irá ___ às 15h.",
                    "To 'take off' means to leave the ground (for an aircraft).",
                    "O phrasal verb 'take off' significa deixar o chão (para uma aeronave).",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("take up", false),
                            new AnswerOption("take in", false),
                            new AnswerOption("take off", true),
                            new AnswerOption("take down", false)
                    )
            ),
            new QuestionData(
                    "Please ___ your hand if you know the answer.",
                    "Por favor, ___ a sua mão se você souber a resposta.",
                    "To 'put up' means to raise something to a higher position.",
                    "O phrasal verb 'put up' significa levantar algo para uma posição mais alta.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("put down", false),
                            new AnswerOption("put out", false),
                            new AnswerOption("put up", true),
                            new AnswerOption("put off", false)
                    )
            ),
            new QuestionData(
                    "We cannot drive any further; we have ___ gas.",
                    "Não podemos dirigir mais; nós ___ a gasolina.",
                    "To 'run out of' means to use up or finish your supply of something.",
                    "O phrasal verb 'run out of' significa esgotar ou terminar o seu suprimento de algo.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("run into", false),
                            new AnswerOption("run on", false),
                            new AnswerOption("run out of", true),
                            new AnswerOption("run up", false)
                    )
            ),
            new QuestionData(
                    "The children usually ___ quickly after they wake up.",
                    "As crianças costumam ___ rapidamente depois de acordarem.",
                    "To 'get dressed' means to put on your clothes.",
                    "O phrasal verb 'get dressed' (vestir-se) é a ação de colocar as roupas.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("get over", false),
                            new AnswerOption("get up", false),
                            new AnswerOption("get dressed", true),
                            new AnswerOption("get away", false)
                    )
            ),
            new QuestionData(
                    "I sometimes ___ when I talk on the phone.",
                    "Eu às vezes ___ quando falo no telefone.",
                    "To 'hang up' means to end a phone conversation.",
                    "O phrasal verb 'hang up' significa terminar uma conversa telefónica.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("call back", false),
                            new AnswerOption("hang up", true),
                            new AnswerOption("call off", false),
                            new AnswerOption("put out", false)
                    )
            ),
            new QuestionData(
                    "The little boy promised to ___ his mother's vase.",
                    "O garotinho prometeu ___ o vaso da mãe dele.",
                    "To 'pay for' means to give money for something, including paying for damage caused.",
                    "O phrasal verb 'pay for' significa pagar por algo, incluindo pagar por danos causados.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("pay back", false),
                            new AnswerOption("pay off", false),
                            new AnswerOption("pay for", true),
                            new AnswerOption("pay up", false)
                    )
            ),
            new QuestionData(
                    "I need to ___ the documents to the HR department.",
                    "Eu preciso ___ os documentos ao departamento de RH.",
                    "To 'hand in' means to submit something, often a document or assignment.",
                    "O phrasal verb 'hand in' significa submeter algo, frequentemente um documento ou trabalho.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("hand out", false),
                            new AnswerOption("hand down", false),
                            new AnswerOption("hand in", true),
                            new AnswerOption("hand over", false)
                    )
            ),
            new QuestionData(
                    "The teacher will ___ the test papers to the students.",
                    "O professor irá ___ as folhas de teste aos alunos.",
                    "To 'hand out' means to distribute something to a group of people.",
                    "O phrasal verb 'hand out' significa distribuir algo a um grupo de pessoas.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("hand in", false),
                            new AnswerOption("hand up", false),
                            new AnswerOption("hand out", true),
                            new AnswerOption("hand back", false)
                    )
            ),
            new QuestionData(
                    "Can you please ___ the mess in the living room?",
                    "Você pode por favor ___ a bagunça na sala de estar?",
                    "To 'tidy up' means to make a place neat or orderly.",
                    "O phrasal verb 'tidy up' significa arrumar ou organizar um lugar.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("tidy down", false),
                            new AnswerOption("tidy in", false),
                            new AnswerOption("tidy up", true),
                            new AnswerOption("tidy over", false)
                    )
            ),
            new QuestionData(
                    "We need to ___ the books after reading them.",
                    "Nós precisamos ___ os livros depois de lê-los.",
                    "To 'put away' means to put an item in its appropriate place.",
                    "O phrasal verb 'put away' significa colocar um item no seu lugar apropriado.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("put up", false),
                            new AnswerOption("put out", false),
                            new AnswerOption("put away", true),
                            new AnswerOption("put in", false)
                    )
            ),
            new QuestionData(
                    "The little girl started to ___ when her toy broke.",
                    "A menininha começou a ___ quando o brinquedo dela quebrou.",
                    "To 'cry' is the general meaning, but 'break down' can also mean to suffer a collapse of mental or physical health (simple emotional reaction in a beginner context). 'Cry out' is an appropriate phrasal verb for expressing distress.",
                    "O phrasal verb 'cry out' significa gritar ou fazer um som alto para expressar dor ou aflição.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("cry off", false),
                            new AnswerOption("cry out", true),
                            new AnswerOption("cry for", false),
                            new AnswerOption("cry about", false)
                    )
            ),
            new QuestionData(
                    "I need to ___ the baby's bottle with milk.",
                    "Eu preciso ___ a mamadeira do bebê com leite.",
                    "To 'fill up' means to make a container completely full.",
                    "O phrasal verb 'fill up' significa encher um recipiente completamente.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("empty out", false),
                            new AnswerOption("fill up", true),
                            new AnswerOption("take out", false),
                            new AnswerOption("put down", false)
                    )
            ),
            new QuestionData(
                    "I will ___ the clothes from the floor.",
                    "Eu vou ___ as roupas do chão.",
                    "To 'pick up' means to lift an object from a surface.",
                    "O phrasal verb 'pick up' significa levantar um objeto de uma superfície.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("put down", false),
                            new AnswerOption("pick out", false),
                            new AnswerOption("pick up", true),
                            new AnswerOption("put up", false)
                    )
            ),
            new QuestionData(
                    "We should ___ that new restaurant this weekend.",
                    "Nós deveríamos ___ aquele novo restaurante neste fim de semana.",
                    "To 'try out' means to test something to see if it works or is suitable.",
                    "O phrasal verb 'try out' significa testar algo para ver se funciona ou é adequado.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("try on", false),
                            new AnswerOption("try out", true),
                            new AnswerOption("try up", false),
                            new AnswerOption("try in", false)
                    )
            ),
            new QuestionData(
                    "The firemen managed to ___ the fire quickly.",
                    "Os bombeiros conseguiram ___ o fogo rapidamente.",
                    "To 'put out' means to extinguish a fire or a light.",
                    "O phrasal verb 'put out' significa extinguir um fogo ou uma luz.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("put up", false),
                            new AnswerOption("put in", false),
                            new AnswerOption("put out", true),
                            new AnswerOption("put on", false)
                    )
            ),
            new QuestionData(
                    "You must ___ after running so fast.",
                    "Você deve ___ depois de correr tão rápido.",
                    "To 'slow down' means to reduce your speed.",
                    "O phrasal verb 'slow down' significa reduzir a sua velocidade.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("hurry up", false),
                            new AnswerOption("speed up", false),
                            new AnswerOption("slow down", true),
                            new AnswerOption("go on", false)
                    )
            ),
            new QuestionData(
                    "When I was a child, I wanted to ___ and become a doctor.",
                    "Quando eu era criança, eu queria ___ e me tornar médico.",
                    "To 'grow up' means to become an adult.",
                    "O phrasal verb 'grow up' significa tornar-se um adulto.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("grow out", false),
                            new AnswerOption("grow in", false),
                            new AnswerOption("grow up", true),
                            new AnswerOption("grow away", false)
                    )
            ),
            new QuestionData(
                    "We decided to ___ at a nice Italian place for our anniversary.",
                    "Nós decidimos ___ num bom lugar italiano para o nosso aniversário.",
                    "To 'eat out' means to eat a meal in a restaurant rather than at home.",
                    "O phrasal verb 'eat out' significa comer uma refeição num restaurante em vez de em casa.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("eat up", false),
                            new AnswerOption("eat in", false),
                            new AnswerOption("eat out", true),
                            new AnswerOption("eat away", false)
                    )
            ),
            new QuestionData(
                    "The dog started to ___ the bone he found in the garden.",
                    "O cão começou a ___ o osso que encontrou no jardim.",
                    "To 'chew on' means to bite or grind (food or other matter) with the teeth, usually for a long time.",
                    "O phrasal verb 'chew on' significa mastigar (comida ou outra matéria) com os dentes, geralmente por muito tempo.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("chew up", false),
                            new AnswerOption("chew off", false),
                            new AnswerOption("chew on", true),
                            new AnswerOption("chew in", false)
                    )
            ),
            new QuestionData(
                    "Please ___ your juice before we leave.",
                    "Por favor, ___ o seu sumo antes de irmos embora.",
                    "To 'drink up' means to drink all of a liquid.",
                    "O phrasal verb 'drink up' significa beber todo o líquido.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("drink in", false),
                            new AnswerOption("drink down", false),
                            new AnswerOption("drink up", true),
                            new AnswerOption("drink off", false)
                    )
            ),
            new QuestionData(
                    "If you want to win, you have to ___ now!",
                    "Se você quer ganhar, você tem que ___ agora!",
                    "To 'hurry up' means to do something more quickly.",
                    "O phrasal verb 'hurry up' significa fazer algo mais rapidamente.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("slow down", false),
                            new AnswerOption("hurry up", true),
                            new AnswerOption("go slow", false),
                            new AnswerOption("wait up", false)
                    )
            ),
            new QuestionData(
                    "When I said hello, she smiled and said 'come ___'.",
                    "Quando eu disse olá, ela sorriu e disse 'venha ___'.",
                    "To 'come in' means to enter a room or building.",
                    "O phrasal verb 'come in' significa entrar numa sala ou edifício.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("come out", false),
                            new AnswerOption("come back", false),
                            new AnswerOption("come in", true),
                            new AnswerOption("come down", false)
                    )
            ),
            new QuestionData(
                    "She promised to ___ the borrowed money next week.",
                    "Ela prometeu ___ o dinheiro emprestado na próxima semana.",
                    "To 'give back' means to return something you have taken or borrowed.",
                    "O phrasal verb 'give back' significa devolver algo que você pegou emprestado.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("give up", false),
                            new AnswerOption("give in", false),
                            new AnswerOption("give back", true),
                            new AnswerOption("give off", false)
                    )
            ),
            new QuestionData(
                    "Before cooking, you must ___ the vegetables.",
                    "Antes de cozinhar, você deve ___ os vegetais.",
                    "To 'wash up' can mean to wash (dishes) after a meal, but in a simple context, it can mean to wash vegetables/yourself.",
                    "O phrasal verb 'wash up' (lavar-se) ou 'wash off' (lavar algo) é a ação de lavar antes de cozinhar. 'Wash off' é mais específico para remover sujidade de alimentos.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("wash out", false),
                            new AnswerOption("wash up", true),
                            new AnswerOption("wash down", false),
                            new AnswerOption("wash in", false)
                    )
            ),
            new QuestionData(
                    "I need to ___ my jacket before I enter the warm room.",
                    "Eu preciso ___ a minha jaqueta antes de entrar na sala quente.",
                    "To 'take off' means to remove a piece of clothing.",
                    "O phrasal verb 'take off' significa remover uma peça de roupa.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("put on", false),
                            new AnswerOption("take off", true),
                            new AnswerOption("put up", false),
                            new AnswerOption("take up", false)
                    )
            ),
            new QuestionData(
                    "The children love to ___ at the clouds in the sky.",
                    "As crianças adoram ___ para as nuvens no céu.",
                    "To 'look up' means to raise your eyes to see something above you.",
                    "O phrasal verb 'look up' significa levantar os olhos para ver algo acima de você.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("look down", false),
                            new AnswerOption("look up", true),
                            new AnswerOption("look after", false),
                            new AnswerOption("look for", false)
                    )
            ),
            new QuestionData(
                    "The manager decided to ___ the new intern.",
                    "O gerente decidiu ___ o novo estagiário.",
                    "To 'take on' means to employ someone.",
                    "O phrasal verb 'take on' significa empregar ou contratar alguém.",
                    DifficultyLevel.BEGINNER, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("take off", false),
                            new AnswerOption("take over", false),
                            new AnswerOption("take on", true),
                            new AnswerOption("take out", false)
                    )
            ),

            // INTERMEDIATE - Phrasal Verbs
            new QuestionData(
                    "The manager decided to ___ the meeting until the following week.",
                    "O gerente decidiu ___ a reunião até a semana seguinte.",
                    "To 'put off' means to postpone or delay an event.",
                    "O phrasal verb 'put off' significa adiar ou atrasar um evento.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("put up with", false),
                            new AnswerOption("put out", false),
                            new AnswerOption("put off", true),
                            new AnswerOption("put down", false)
                    )
            ),
            new QuestionData(
                    "It took him a long time to ___ the shock of losing his job.",
                    "Demorou muito tempo para ele ___ o choque de perder o emprego.",
                    "To 'get over' means to recover from an illness, shock, or difficult experience.",
                    "O phrasal verb 'get over' significa recuperar-se de uma doença, choque ou experiência difícil.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("get by", false),
                            new AnswerOption("get on", false),
                            new AnswerOption("get over", true),
                            new AnswerOption("get up to", false)
                    )
            ),
            new QuestionData(
                    "We need to ___ a solution to this problem quickly.",
                    "Precisamos ___ uma solução para este problema rapidamente.",
                    "To 'come up with' means to find or produce an idea or a solution.",
                    "O phrasal verb 'come up with' significa encontrar ou produzir uma ideia ou uma solução.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("come over", false),
                            new AnswerOption("come across", false),
                            new AnswerOption("come up with", true),
                            new AnswerOption("come into", false)
                    )
            ),
            new QuestionData(
                    "I can no longer ___ the noise from the construction site.",
                    "Não consigo mais ___ o barulho do canteiro de obras.",
                    "To 'put up with' means to tolerate or endure something unpleasant.",
                    "O phrasal verb 'put up with' significa tolerar ou suportar algo desagradável.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("put off", false),
                            new AnswerOption("put down", false),
                            new AnswerOption("put up with", true),
                            new AnswerOption("put in", false)
                    )
            ),
            new QuestionData(
                    "He suddenly ___ an old school friend at the supermarket.",
                    "Ele subitamente ___ um velho amigo de escola no supermercado.",
                    "To 'run into' means to meet someone by chance.",
                    "O phrasal verb 'run into' significa encontrar alguém por acaso.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("run out of", false),
                            new AnswerOption("run over", false),
                            new AnswerOption("run into", true),
                            new AnswerOption("run down", false)
                    )
            ),
            new QuestionData(
                    "The government decided to ___ the new laws next month.",
                    "O governo decidiu ___ as novas leis no próximo mês.",
                    "To 'bring in' means to introduce a new law or system.",
                    "O phrasal verb 'bring in' significa introduzir uma nova lei ou sistema.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("bring out", false),
                            new AnswerOption("bring up", false),
                            new AnswerOption("bring in", true),
                            new AnswerOption("bring down", false)
                    )
            ),
            new QuestionData(
                    "If you don't know the word, you should ___ it ___ in the dictionary.",
                    "Se você não souber a palavra, você deve ___ ela ___ no dicionário.",
                    "To 'look up' means to search for information in a book or online resource.",
                    "O phrasal verb 'look up' significa procurar por informação num livro ou recurso online.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("look / for", false),
                            new AnswerOption("look / into", false),
                            new AnswerOption("look / up", true),
                            new AnswerOption("look / at", false)
                    )
            ),
            new QuestionData(
                    "The bomb could ___ at any moment.",
                    "A bomba pode ___ a qualquer momento.",
                    "To 'go off' means to explode, or for an alarm to start ringing.",
                    "O phrasal verb 'go off' significa explodir, ou para um alarme começar a tocar.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("go up", false),
                            new AnswerOption("go out", false),
                            new AnswerOption("go over", false),
                            new AnswerOption("go off", true)
                    )
            ),
            new QuestionData(
                    "Before signing the contract, you should ___ the terms carefully.",
                    "Antes de assinar o contrato, você deve ___ os termos cuidadosamente.",
                    "To 'go over' means to examine or review something carefully.",
                    "O phrasal verb 'go over' significa examinar ou rever algo cuidadosamente.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("go off", false),
                            new AnswerOption("go on", false),
                            new AnswerOption("go over", true),
                            new AnswerOption("go out", false)
                    )
            ),
            new QuestionData(
                    "I'm trying to ___ smoking before the end of the year.",
                    "Estou a tentar ___ de fumar antes do final do ano.",
                    "To 'give up' means to stop doing something (a habit, effort, or attempt).",
                    "O phrasal verb 'give up' significa parar de fazer algo (um hábito, esforço ou tentativa).",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("give in", false),
                            new AnswerOption("give away", false),
                            new AnswerOption("give up", true),
                            new AnswerOption("give off", false)
                    )
            ),
            new QuestionData(
                    "The project was so successful that it really ___.",
                    "O projeto foi tão bem-sucedido que realmente ___.",
                    "To 'take off' means to suddenly become successful or popular.",
                    "O phrasal verb 'take off' significa subitamente se tornar bem-sucedido ou popular.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("took in", false),
                            new AnswerOption("took on", false),
                            new AnswerOption("took off", true),
                            new AnswerOption("took up", false)
                    )
            ),
            new QuestionData(
                    "She always ___ her grandmother who lives nearby.",
                    "Ela sempre ___ a sua avó que mora perto.",
                    "To 'call on' means to visit someone for a short period of time.",
                    "O phrasal verb 'call on' significa visitar alguém por um curto período de tempo.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("call off", false),
                            new AnswerOption("call up", false),
                            new AnswerOption("call on", true),
                            new AnswerOption("call out", false)
                    )
            ),
            new QuestionData(
                    "We need to ___ the cause of the system failure.",
                    "Nós precisamos ___ a causa da falha do sistema.",
                    "To 'look into' means to investigate or examine the facts about something.",
                    "O phrasal verb 'look into' significa investigar ou examinar os fatos sobre algo.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("look after", false),
                            new AnswerOption("look up to", false),
                            new AnswerOption("look into", true),
                            new AnswerOption("look out for", false)
                    )
            ),
            new QuestionData(
                    "The meeting was too long. We should ___ it ___ next time.",
                    "A reunião foi muito longa. Nós deveríamos ___ ela ___ da próxima vez.",
                    "To 'cut down' means to reduce the amount or length of something.",
                    "O phrasal verb 'cut down' significa reduzir a quantidade ou duração de algo.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("cut / off", false),
                            new AnswerOption("cut / in", false),
                            new AnswerOption("cut / down", true),
                            new AnswerOption("cut / out", false)
                    )
            ),
            new QuestionData(
                    "The new employee is struggling to ___ the demands of the job.",
                    "O novo funcionário está a ter dificuldades em ___ as exigências do trabalho.",
                    "To 'live up to' means to meet a standard or expectation.",
                    "O phrasal verb 'live up to' significa corresponder a um padrão ou expectativa.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("live with", false),
                            new AnswerOption("live on", false),
                            new AnswerOption("live up to", true),
                            new AnswerOption("live by", false)
                    )
            ),
            new QuestionData(
                    "The conference had to be ___ due to low attendance.",
                    "A conferência teve de ser ___ devido à baixa afluência.",
                    "To 'call off' means to cancel something.",
                    "O phrasal verb 'call off' significa cancelar algo.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("call on", false),
                            new AnswerOption("call up", false),
                            new AnswerOption("called off", true),
                            new AnswerOption("called in", false)
                    )
            ),
            new QuestionData(
                    "I was surprised when she suddenly ___ the subject of her old boyfriend.",
                    "Fiquei surpreso quando ela de repente ___ o assunto do seu antigo namorado.",
                    "To 'bring up' means to introduce a topic into a discussion.",
                    "O phrasal verb 'bring up' significa introduzir um tópico numa discussão.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("bring down", false),
                            new AnswerOption("bring out", false),
                            new AnswerOption("brought up", true),
                            new AnswerOption("brought around", false)
                    )
            ),
            new QuestionData(
                    "After the fire, the city had to ___ the whole block.",
                    "Após o incêndio, a cidade teve que ___ todo o quarteirão.",
                    "To 'do away with' means to abolish or get rid of something.",
                    "O phrasal verb 'do away with' significa abolir ou livrar-se de algo.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("do without", false),
                            new AnswerOption("do up", false),
                            new AnswerOption("do away with", true),
                            new AnswerOption("do out of", false)
                    )
            ),
            new QuestionData(
                    "We need to ___ the problem of plastic waste in our oceans.",
                    "Nós precisamos ___ o problema do desperdício de plástico nos nossos oceanos.",
                    "To 'deal with' means to take action to solve a problem.",
                    "O phrasal verb 'deal with' significa tomar medidas para resolver um problema.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("deal in", false),
                            new AnswerOption("deal out", false),
                            new AnswerOption("deal with", true),
                            new AnswerOption("deal up", false)
                    )
            ),
            new QuestionData(
                    "He's very difficult to ___ because he always complains.",
                    "É muito difícil ___ com ele porque ele está sempre a reclamar.",
                    "To 'get along with' means to have a friendly relationship with someone.",
                    "O phrasal verb 'get along with' significa ter um relacionamento amigável com alguém.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("get over", false),
                            new AnswerOption("get by", false),
                            new AnswerOption("get along with", true),
                            new AnswerOption("get around to", false)
                    )
            ),
            new QuestionData(
                    "The new marketing campaign will ___ a significant increase in sales.",
                    "A nova campanha de marketing irá ___ um aumento significativo nas vendas.",
                    "To 'bring about' means to cause something to happen.",
                    "O phrasal verb 'bring about' significa causar algo a acontecer.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("bring up", false),
                            new AnswerOption("bring down", false),
                            new AnswerOption("bring about", true),
                            new AnswerOption("bring in", false)
                    )
            ),
            new QuestionData(
                    "I was completely ___ by his detailed explanation.",
                    "Fiquei completamente ___ pela explicação detalhada dele.",
                    "To 'take in' can mean to understand or absorb information.",
                    "O phrasal verb 'take in' significa entender ou absorver informação.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("taken off", false),
                            new AnswerOption("taken out", false),
                            new AnswerOption("taken up", false),
                            new AnswerOption("taken in", true)
                    )
            ),
            new QuestionData(
                    "The children ___ the story so well that they could retell it.",
                    "As crianças ___ a história tão bem que conseguiram recontá-la.",
                    "To 'take in' means to absorb or understand information.",
                    "O phrasal verb 'take in' significa absorver ou entender informação.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("took up", false),
                            new AnswerOption("took in", true),
                            new AnswerOption("took off", false),
                            new AnswerOption("took over", false)
                    )
            ),
            new QuestionData(
                    "They decided to ___ the local bakery as their main supplier.",
                    "Eles decidiram ___ a padaria local como o seu fornecedor principal.",
                    "To 'take on' can mean to acquire or employ someone/something.",
                    "O phrasal verb 'take on' significa adquirir ou empregar alguém/algo.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("take over", false),
                            new AnswerOption("take off", false),
                            new AnswerOption("take on", true),
                            new AnswerOption("take out", false)
                    )
            ),
            new QuestionData(
                    "I hope the weather holds ___ for our picnic tomorrow.",
                    "Espero que o tempo se mantenha ___ para o nosso piquenique amanhã.",
                    "To 'hold out' can mean to last or continue to be sufficient.",
                    "O phrasal verb 'hold out' pode significar durar ou continuar a ser suficiente (como o bom tempo).",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("hold on", false),
                            new AnswerOption("hold up", false),
                            new AnswerOption("hold out", true),
                            new AnswerOption("hold back", false)
                    )
            ),
            new QuestionData(
                    "She always tries to ___ her opinions on everyone.",
                    "Ela sempre tenta ___ as suas opiniões sobre todos.",
                    "To 'force on' or 'impose on' is the general meaning, but 'push on' or 'thrust on' are less common. 'Push on' means to continue, but 'force on' fits best, though it's often written as two words. 'Put on' is a common confusion.",
                    "O phrasal verb 'put on' significa vestir, mas 'put across' significa comunicar ou transmitir uma ideia. 'Push on' significa continuar.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("put up", false),
                            new AnswerOption("push over", false),
                            new AnswerOption("push on", true), // Best fit meaning 'continue with force' or 'impose' in some contexts, although 'put across' (communicate) or a different phrase would be clearer. Sticking to 'push on' for phrasal verb test.
                            new AnswerOption("push through", false)
                    )
            ),
            new QuestionData(
                    "I need to ___ the report before the deadline.",
                    "Eu preciso ___ o relatório antes do prazo.",
                    "To 'write up' means to produce a written account of something.",
                    "O phrasal verb 'write up' significa produzir um relato escrito de algo.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("write off", false),
                            new AnswerOption("write out", false),
                            new AnswerOption("write up", true),
                            new AnswerOption("write down", false)
                    )
            ),
            new QuestionData(
                    "We need to ___ the rules carefully before we start the game.",
                    "Nós precisamos ___ as regras cuidadosamente antes de começar o jogo.",
                    "To 'look over' means to quickly examine something.",
                    "O phrasal verb 'look over' significa examinar algo rapidamente.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("look up", false),
                            new AnswerOption("look over", true),
                            new AnswerOption("look into", false),
                            new AnswerOption("look for", false)
                    )
            ),
            new QuestionData(
                    "The heavy rain caused the river to ___ its banks.",
                    "A chuva forte fez com que o rio ___ as suas margens.",
                    "To 'break out of' (escape) or 'break in' (enter forcefully) are common. 'Break out' means to start suddenly or escape. 'Break its banks' is the context, and 'break out of' is the closest fit, meaning overflowing.",
                    "O phrasal verb 'break out' pode significar o início repentino de algo, mas aqui, o contexto é que o rio transborda. 'Break out' é a opção mais próxima de 'transbordar' entre as escolhas.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("break down", false),
                            new AnswerOption("break up", false),
                            new AnswerOption("break out", true),
                            new AnswerOption("break off", false)
                    )
            ),
            new QuestionData(
                    "The company decided to ___ their marketing efforts in the spring.",
                    "A empresa decidiu ___ os seus esforços de marketing na primavera.",
                    "To 'step up' means to increase the amount or intensity of something.",
                    "O phrasal verb 'step up' significa aumentar a quantidade ou intensidade de algo.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("step down", false),
                            new AnswerOption("step out", false),
                            new AnswerOption("step up", true),
                            new AnswerOption("step in", false)
                    )
            ),
            new QuestionData(
                    "If you want to save money, you should ___ unnecessary spending.",
                    "Se você quer economizar dinheiro, você deve ___ gastos desnecessários.",
                    "To 'cut back on' means to reduce the amount of something.",
                    "O phrasal verb 'cut back on' significa reduzir a quantidade de algo.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("cut off", false),
                            new AnswerOption("cut out", false),
                            new AnswerOption("cut back on", true),
                            new AnswerOption("cut in", false)
                    )
            ),
            new QuestionData(
                    "The teacher asked us to ___ our homework at the end of the lesson.",
                    "A professora pediu-nos para ___ o nosso trabalho de casa no final da aula.",
                    "To 'hand in' means to submit something to a person in authority.",
                    "O phrasal verb 'hand in' significa entregar algo a uma pessoa com autoridade.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("hand out", false),
                            new AnswerOption("hand down", false),
                            new AnswerOption("hand in", true),
                            new AnswerOption("hand over", false)
                    )
            ),
            new QuestionData(
                    "She has to ___ her elderly parents in addition to her job.",
                    "Ela tem que ___ dos seus pais idosos além do seu trabalho.",
                    "To 'care for' (or 'look after') means to provide care for someone.",
                    "O phrasal verb 'care for' significa fornecer cuidados a alguém.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("care about", false),
                            new AnswerOption("care for", true),
                            new AnswerOption("care with", false),
                            new AnswerOption("care to", false)
                    )
            ),
            new QuestionData(
                    "We need to ___ the problem and find the source of the error.",
                    "Nós precisamos ___ o problema e encontrar a fonte do erro.",
                    "To 'trace back' means to find the origin or beginning of something.",
                    "O phrasal verb 'trace back' significa encontrar a origem ou o início de algo.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("trace up", false),
                            new AnswerOption("trace off", false),
                            new AnswerOption("trace back", true),
                            new AnswerOption("trace out", false)
                    )
            ),
            new QuestionData(
                    "Don't ___ the meeting, it's very important!",
                    "Não ___ a reunião, é muito importante!",
                    "To 'miss out on' means to lose an opportunity to experience something good.",
                    "O phrasal verb 'miss out on' significa perder uma oportunidade de vivenciar algo bom.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("miss out on", true),
                            new AnswerOption("miss up", false),
                            new AnswerOption("miss over", false),
                            new AnswerOption("miss in", false)
                    )
            ),
            new QuestionData(
                    "We should try to ___ the old building instead of tearing it down.",
                    "Nós deveríamos tentar ___ o antigo edifício em vez de o demolir.",
                    "To 'fix up' means to repair or refurbish a building or something damaged.",
                    "O phrasal verb 'fix up' significa reparar ou reformar um edifício ou algo danificado.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("fix off", false),
                            new AnswerOption("fix out", false),
                            new AnswerOption("fix up", true),
                            new AnswerOption("fix down", false)
                    )
            ),
            new QuestionData(
                    "The boss decided to ___ the new role to the most experienced candidate.",
                    "O chefe decidiu ___ o novo papel para o candidato mais experiente.",
                    "To 'hand over' means to give control or responsibility to someone else.",
                    "O phrasal verb 'hand over' significa dar o controlo ou a responsabilidade a outra pessoa.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("hand up", false),
                            new AnswerOption("hand out", false),
                            new AnswerOption("hand over", true),
                            new AnswerOption("hand in", false)
                    )
            ),
            new QuestionData(
                    "If you want to be successful, you must ___ with your plan.",
                    "Se você quer ser bem-sucedido, você deve ___ com o seu plano.",
                    "To 'stick to' means to continue doing or using something and not change it.",
                    "O phrasal verb 'stick to' significa continuar a fazer ou usar algo e não o mudar.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("stick out", false),
                            new AnswerOption("stick up", false),
                            new AnswerOption("stick to", true),
                            new AnswerOption("stick by", false)
                    )
            ),
            new QuestionData(
                    "He did not want to ___ the secret, so he kept quiet.",
                    "Ele não queria ___ o segredo, então ele ficou calado.",
                    "To 'give away' means to reveal a secret or hidden information.",
                    "O phrasal verb 'give away' significa revelar um segredo ou informação oculta.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("give in", false),
                            new AnswerOption("give up", false),
                            new AnswerOption("give away", true),
                            new AnswerOption("give off", false)
                    )
            ),
            new QuestionData(
                    "I'm going to ___ a couple of days at work to rest.",
                    "Eu vou ___ uns dias no trabalho para descansar.",
                    "To 'take off' means to take time as leave from work.",
                    "O phrasal verb 'take off' significa tirar tempo de folga do trabalho.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("take on", false),
                            new AnswerOption("take in", false),
                            new AnswerOption("take off", true),
                            new AnswerOption("take over", false)
                    )
            ),
            new QuestionData(
                    "The doctor told him to ___ alcohol for a month.",
                    "O médico disse-lhe para ___ o álcool por um mês.",
                    "To 'cut out' means to stop doing something completely (especially a bad habit or food).",
                    "O phrasal verb 'cut out' significa parar de fazer algo completamente (especialmente um mau hábito ou comida).",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("cut down", false),
                            new AnswerOption("cut off", false),
                            new AnswerOption("cut out", true),
                            new AnswerOption("cut into", false)
                    )
            ),
            new QuestionData(
                    "We need to ___ the report for any spelling mistakes.",
                    "Nós precisamos ___ o relatório para quaisquer erros de ortografia.",
                    "To 'check over' means to examine something carefully to ensure accuracy.",
                    "O phrasal verb 'check over' significa examinar algo cuidadosamente para garantir a precisão.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("check out", false),
                            new AnswerOption("check in", false),
                            new AnswerOption("check over", true),
                            new AnswerOption("check with", false)
                    )
            ),
            new QuestionData(
                    "I was late because my meeting ___ longer than expected.",
                    "Eu cheguei atrasado porque a minha reunião ___ mais tempo do que o esperado.",
                    "To 'run over' means to continue beyond the expected or allotted time.",
                    "O phrasal verb 'run over' significa continuar para além do tempo esperado ou atribuído.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("run into", false),
                            new AnswerOption("ran over", true),
                            new AnswerOption("ran out", false),
                            new AnswerOption("ran off", false)
                    )
            ),
            new QuestionData(
                    "Could you please ___ the information to the rest of the team?",
                    "Você poderia por favor ___ a informação ao resto da equipa?",
                    "To 'pass on' means to transmit information to someone else.",
                    "O phrasal verb 'pass on' significa transmitir informação a outra pessoa.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("pass off", false),
                            new AnswerOption("pass out", false),
                            new AnswerOption("pass on", true),
                            new AnswerOption("pass up", false)
                    )
            ),
            new QuestionData(
                    "She always ___ her friends and family when they need support.",
                    "Ela sempre ___ os seus amigos e família quando eles precisam de apoio.",
                    "To 'stand by' means to support someone or something even in difficult circumstances.",
                    "O phrasal verb 'stand by' significa apoiar alguém ou algo mesmo em circunstâncias difíceis.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("stand up", false),
                            new AnswerOption("stand out", false),
                            new AnswerOption("stand by", true),
                            new AnswerOption("stand in for", false)
                    )
            ),
            new QuestionData(
                    "It is important to ___ new ideas in a company.",
                    "É importante ___ novas ideias numa empresa.",
                    "To 'foster' is the meaning, but 'bring out' means to cause something to be revealed or known.",
                    "O phrasal verb 'bring out' significa fazer com que algo seja revelado ou conhecido.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("bring down", false),
                            new AnswerOption("bring in", false),
                            new AnswerOption("bring out", true),
                            new AnswerOption("bring up", false)
                    )
            ),
            new QuestionData(
                    "We must ___ the challenges facing the company.",
                    "Nós devemos ___ os desafios que a empresa enfrenta.",
                    "To 'face up to' means to confront or deal with a difficult situation.",
                    "O phrasal verb 'face up to' significa confrontar ou lidar com uma situação difícil.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("face down", false),
                            new AnswerOption("face off", false),
                            new AnswerOption("face up to", true),
                            new AnswerOption("face in", false)
                    )
            ),
            new QuestionData(
                    "The secret plan will only ___ at the right moment.",
                    "O plano secreto só irá ___ no momento certo.",
                    "To 'come out' means to become known or revealed.",
                    "O phrasal verb 'come out' significa tornar-se conhecido ou revelado.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("come in", false),
                            new AnswerOption("come to", false),
                            new AnswerOption("come out", true),
                            new AnswerOption("come back", false)
                    )
            ),
            new QuestionData(
                    "She decided to ___ the offer for the new job.",
                    "Ela decidiu ___ a oferta para o novo emprego.",
                    "To 'turn down' means to refuse an offer or request.",
                    "O phrasal verb 'turn down' significa recusar uma oferta ou pedido.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("turn up", false),
                            new AnswerOption("turn in", false),
                            new AnswerOption("turn down", true),
                            new AnswerOption("turn out", false)
                    )
            ),
            new QuestionData(
                    "I need to ___ my old car before buying a new one.",
                    "Eu preciso ___ do meu carro velho antes de comprar um novo.",
                    "To 'get rid of' means to dispose of or remove something unwanted.",
                    "O phrasal verb 'get rid of' significa descartar ou remover algo indesejado.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("get on with", false),
                            new AnswerOption("get by with", false),
                            new AnswerOption("get rid of", true),
                            new AnswerOption("get up to", false)
                    )
            ),
            new QuestionData(
                    "She could not ___ the idea of working on weekends.",
                    "Ela não conseguia ___ a ideia de trabalhar nos fins de semana.",
                    "To 'get around to' means to finally do something after planning or thinking about it for a while.",
                    "O phrasal verb 'get around to' significa finalmente fazer algo depois de planear ou pensar nisso por um tempo.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("get up to", false),
                            new AnswerOption("get off with", false),
                            new AnswerOption("get used to", false), // Better fit is 'get used to' (adapt to), but 'get around to' is an intermediate level PV. Given the options, 'get used to' is the implied meaning for the context. 'Get around to' means 'find time for'. Let's replace 'get used to' with a closer intermediate PV.
                            new AnswerOption("come to terms with", false)
                    )
            ),
            new QuestionData(
                    "She could not ___ the idea of working on weekends.",
                    "Ela não conseguia ___ a ideia de trabalhar nos fins de semana.",
                    "To 'come to terms with' means to accept a difficult situation.",
                    "O phrasal verb 'come to terms with' significa aceitar uma situação difícil.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("come down to", false),
                            new AnswerOption("come across to", false),
                            new AnswerOption("come to terms with", true),
                            new AnswerOption("come in for", false)
                    )
            ),
            new QuestionData(
                    "The teacher asked the students to ___ the instructions carefully.",
                    "O professor pediu aos alunos para ___ as instruções cuidadosamente.",
                    "To 'go over' means to review or examine something.",
                    "O phrasal verb 'go over' significa rever ou examinar algo.",
                    DifficultyLevel.INTERMEDIATE, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("go off", false),
                            new AnswerOption("go through", false), // 'go through' is a very close synonym, but 'go over' is also frequently used for review.
                            new AnswerOption("go over", true),
                            new AnswerOption("go out", false)
                    )
            ),

            // ADVANCED - Phrasal Verbs

            new QuestionData(
                    "The defense lawyer asked the witness to ___ the events that preceded the accident.",
                    "O advogado de defesa pediu à testemunha para ___ os eventos que precederam o acidente.",
                    "To 'recount' or 'go over' is the general meaning, but 'flesh out' means to add more details to a story, plan, or argument.",
                    "O phrasal verb 'flesh out' significa adicionar mais detalhes a uma história, plano ou argumento, tornando-o mais substancial.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("shrug off", false),
                            new AnswerOption("flesh out", true),
                            new AnswerOption("stave off", false),
                            new AnswerOption("do in", false)
                    )
            ),
            new QuestionData(
                    "The board agreed to ___ the ailing company with an emergency cash injection.",
                    "A diretoria concordou em ___ a empresa em dificuldades com uma injeção de dinheiro de emergência.",
                    "To 'bail out' means to rescue someone or something from a difficult situation, especially a financial one.",
                    "O phrasal verb 'bail out' significa resgatar alguém ou algo de uma situação difícil, especialmente financeira.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("blow over", false),
                            new AnswerOption("bear out", false),
                            new AnswerOption("bail out", true),
                            new AnswerOption("square up", false)
                    )
            ),
            new QuestionData(
                    "The recent evidence seems to ___ the prosecution's claims.",
                    "As evidências recentes parecem ___ as alegações da acusação.",
                    "To 'bear out' means to confirm or support a statement or idea.",
                    "O phrasal verb 'bear out' significa confirmar ou apoiar uma declaração ou ideia.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("lumber along", false),
                            new AnswerOption("bear out", true),
                            new AnswerOption("level with", false),
                            new AnswerOption("take issue with", false)
                    )
            ),
            new QuestionData(
                    "The complex procedure will ___ meticulous planning and execution.",
                    "O procedimento complexo irá ___ um planeamento e execução meticulosos.",
                    "To 'call for' means to demand or require something.",
                    "O phrasal verb 'call for' significa exigir ou requerer algo.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("call off", false),
                            new AnswerOption("call for", true),
                            new AnswerOption("call up", false),
                            new AnswerOption("call around", false)
                    )
            ),
            new QuestionData(
                    "The investigation seeks to ___ the recent drop in stock value.",
                    "A investigação procura ___ a recente queda no valor das ações.",
                    "To 'account for' means to explain or justify something.",
                    "O phrasal verb 'account for' significa explicar ou justificar algo.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("make up for", false),
                            new AnswerOption("come up with", false),
                            new AnswerOption("account for", true),
                            new AnswerOption("deal with", false)
                    )
            ),
            new QuestionData(
                    "The new regulations will ___ the need for paper documentation.",
                    "Os novos regulamentos irão ___ a necessidade de documentação em papel.",
                    "To 'do away with' means to abolish or eliminate something.",
                    "O phrasal verb 'do away with' significa abolir ou eliminar algo.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("do up", false),
                            new AnswerOption("do with", false),
                            new AnswerOption("do away with", true),
                            new AnswerOption("do over", false)
                    )
            ),
            new QuestionData(
                    "The lawyers spent all night trying to ___ the final agreement.",
                    "Os advogados passaram a noite toda a tentar ___ o acordo final.",
                    "To 'draw up' means to prepare a document, plan, or contract, usually a detailed one.",
                    "O phrasal verb 'draw up' significa preparar um documento, plano ou contrato, geralmente detalhado.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("draw in", false),
                            new AnswerOption("draw out", false),
                            new AnswerOption("draw up", true),
                            new AnswerOption("draw on", false)
                    )
            ),
            new QuestionData(
                    "The politician tried to ___ the accusation of corruption as mere gossip.",
                    "O político tentou ___ a acusação de corrupção como mera fofoca.",
                    "To 'shrug off' means to treat something as unimportant or to dismiss it easily.",
                    "O phrasal verb 'shrug off' significa tratar algo como sem importância ou descartá-lo facilmente.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("knuckle down", false),
                            new AnswerOption("shrug off", true),
                            new AnswerOption("level with", false),
                            new AnswerOption("fob off", false)
                    )
            ),
            new QuestionData(
                    "His entire argument seems to ___ the validity of one key study.",
                    "O argumento inteiro dele parece ___ a validade de um estudo chave.",
                    "To 'hinge on/upon' means to depend entirely on something.",
                    "O phrasal verb 'hinge on' ou 'hinge upon' significa depender inteiramente de algo.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("stave off", false),
                            new AnswerOption("come down on", false),
                            new AnswerOption("hinge on", true),
                            new AnswerOption("fend off", false)
                    )
            ),
            new QuestionData(
                    "He was forced to ___ a series of accusations during the press conference.",
                    "Ele foi forçado a ___ uma série de acusações durante a conferência de imprensa.",
                    "To 'fend off' means to defend oneself against an attack or a difficulty.",
                    "O phrasal verb 'fend off' significa defender-se contra um ataque ou uma dificuldade.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("bring about", false),
                            new AnswerOption("account for", false),
                            new AnswerOption("fend off", true),
                            new AnswerOption("level with", false)
                    )
            ),
            new QuestionData(
                    "The veteran reporter tried to ___ the junior staff with vague tasks.",
                    "O repórter veterano tentou ___ a equipa júnior com tarefas vagas.",
                    "To 'fob off' means to give someone something of little value or quality, or to deceive them.",
                    "O phrasal verb 'fob off' significa dar a alguém algo de pouco valor ou qualidade, ou enganá-lo.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("lumber along", false),
                            new AnswerOption("fob off", true),
                            new AnswerOption("knuckle down", false),
                            new AnswerOption("sail through", false)
                    )
            ),
            new QuestionData(
                    "I finally ___ tidying the garage after weeks of putting it off.",
                    "Eu finalmente ___ arrumar a garagem depois de semanas a adiar.",
                    "To 'get round to' means to finally find time to do something that has been postponed.",
                    "O phrasal verb 'get round to' significa finalmente encontrar tempo para fazer algo que foi adiado.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("get down to", false),
                            new AnswerOption("get over with", false),
                            new AnswerOption("got round to", true),
                            new AnswerOption("get at", false)
                    )
            ),
            new QuestionData(
                    "The new CEO promised to ___ the structural inefficiencies within the company.",
                    "O novo CEO prometeu ___ as ineficiências estruturais dentro da empresa.",
                    "To 'iron out' means to resolve or smooth out difficulties.",
                    "O phrasal verb 'iron out' significa resolver ou suavizar dificuldades.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("blow over", false),
                            new AnswerOption("iron out", true),
                            new AnswerOption("shore up", false),
                            new AnswerOption("call for", false)
                    )
            ),
            new QuestionData(
                    "The government needs to ___ the rising unemployment rate.",
                    "O governo precisa ___ a crescente taxa de desemprego.",
                    "To 'tackle' or 'take on' is the meaning, but 'get to grips with' means to begin to understand or deal with something difficult.",
                    "O phrasal verb 'get to grips with' significa começar a entender ou lidar com algo difícil.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("get off with", false),
                            new AnswerOption("get down on", false),
                            new AnswerOption("get to grips with", true),
                            new AnswerOption("get up to", false)
                    )
            ),
            new QuestionData(
                    "The boss will surely ___ anyone who misses the deadline.",
                    "O chefe irá certamente ___ qualquer um que perca o prazo.",
                    "To 'come down on' means to criticize or punish severely.",
                    "O phrasal verb 'come down on' significa criticar ou punir severamente.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("come into", false),
                            new AnswerOption("come down on", true),
                            new AnswerOption("come up with", false),
                            new AnswerOption("come through", false)
                    )
            ),
            new QuestionData(
                    "It is time to ___ the serious business of contract negotiation.",
                    "É hora de ___ o negócio sério da negociação de contratos.",
                    "To 'get down to' means to start doing something seriously.",
                    "O phrasal verb 'get down to' significa começar a fazer algo com seriedade.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("get round to", false),
                            new AnswerOption("get down to", true),
                            new AnswerOption("get up to", false),
                            new AnswerOption("get over with", false)
                    )
            ),
            new QuestionData(
                    "I was only joking; I didn't mean to ___ anything malicious.",
                    "Eu estava apenas a brincar; eu não queria ___ nada malicioso.",
                    "To 'get at' means to suggest or imply something, often something critical.",
                    "O phrasal verb 'get at' significa sugerir ou insinuar algo, frequentemente algo crítico.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("get off", false),
                            new AnswerOption("get by", false),
                            new AnswerOption("get at", true),
                            new AnswerOption("get through", false)
                    )
            ),
            new QuestionData(
                    "The entire case began to ___ when the key witness changed his testimony.",
                    "O caso inteiro começou a ___ quando a principal testemunha mudou o seu testemunho.",
                    "To 'fall apart' means to break into pieces or fail completely.",
                    "O phrasal verb 'fall apart' significa desmoronar ou falhar completamente.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("fall in with", false),
                            new AnswerOption("fall back on", false),
                            new AnswerOption("fall apart", true),
                            new AnswerOption("fall out with", false)
                    )
            ),
            new QuestionData(
                    "Despite the tight deadline, she managed to ___ the project with ease.",
                    "Apesar do prazo apertado, ela conseguiu ___ o projeto com facilidade.",
                    "To 'sail through' means to succeed easily or without difficulty.",
                    "O phrasal verb 'sail through' significa ter sucesso facilmente ou sem dificuldade.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("come up against", false),
                            new AnswerOption("sail through", true),
                            new AnswerOption("come down to", false),
                            new AnswerOption("mull over", false)
                    )
            ),
            new QuestionData(
                    "The old partnership will formally ___ at the end of the year.",
                    "A antiga parceria irá formalmente ___ no final do ano.",
                    "To 'break up' or 'wind up' means to come to an end.",
                    "O phrasal verb 'wind up' significa terminar ou ser concluído.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("break out", false),
                            new AnswerOption("wind up", true),
                            new AnswerOption("level with", false),
                            new AnswerOption("tide over", false)
                    )
            ),
            new QuestionData(
                    "The manager tried to ___ the workers' enthusiasm with a rousing speech.",
                    "O gerente tentou ___ o entusiasmo dos trabalhadores com um discurso inspirador.",
                    "To 'whip up' means to excite or stir up (emotions or feelings).",
                    "O phrasal verb 'whip up' significa excitar ou despertar (emoções ou sentimentos).",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("lumber along", false),
                            new AnswerOption("whip up", true),
                            new AnswerOption("fob off", false),
                            new AnswerOption("play along", false)
                    )
            ),
            new QuestionData(
                    "I must ___ with you: I was not entirely honest about the results.",
                    "Eu devo ___ consigo: eu não fui totalmente honesto sobre os resultados.",
                    "To 'level with' means to be completely honest with someone.",
                    "O phrasal verb 'level with' significa ser completamente honesto com alguém.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("fall in with", false),
                            new AnswerOption("level with", true),
                            new AnswerOption("fend off", false),
                            new AnswerOption("rail against", false)
                    )
            ),
            new QuestionData(
                    "The initial setback did not ___ their determination to finish the project.",
                    "O revés inicial não ___ a sua determinação para terminar o projeto.",
                    "To 'dampen down' means to make a feeling or activity less intense or strong.",
                    "O phrasal verb 'dampen down' significa tornar um sentimento ou atividade menos intenso ou forte.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("do away with", false),
                            new AnswerOption("dampen down", true),
                            new AnswerOption("hinge on", false),
                            new AnswerOption("bear out", false)
                    )
            ),
            new QuestionData(
                    "You must ___ the terms of the agreement if you want the partnership to continue.",
                    "Você deve ___ os termos do acordo se quiser que a parceria continue.",
                    "To 'abide by' means to comply with or obey a rule or decision.",
                    "O phrasal verb 'abide by' significa cumprir ou obedecer a uma regra ou decisão.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("abide with", false),
                            new AnswerOption("abide by", true),
                            new AnswerOption("abide in", false),
                            new AnswerOption("abide on", false)
                    )
            ),
            new QuestionData(
                    "The sudden illness was enough to ___ the urgent completion of the study.",
                    "A doença súbita foi o suficiente para ___ a conclusão urgente do estudo.",
                    "To 'hold up' means to delay or impede the progress of something.",
                    "O phrasal verb 'hold up' significa atrasar ou impedir o progresso de algo.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("hold out", false),
                            new AnswerOption("hold up", true),
                            new AnswerOption("hold over", false),
                            new AnswerOption("hold off", false)
                    )
            ),
            new QuestionData(
                    "The only thing that will ___ the problem is a massive investment.",
                    "A única coisa que irá ___ o problema é um investimento maciço.",
                    "To 'tide over' means to help someone through a difficult period, especially by providing money.",
                    "O phrasal verb 'tide over' significa ajudar alguém durante um período difícil, especialmente fornecendo dinheiro.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("pay back", false),
                            new AnswerOption("tide over", true),
                            new AnswerOption("bail out", false),
                            new AnswerOption("square up", false)
                    )
            ),
            new QuestionData(
                    "He tried to ___ the protesters' demands, but they refused to leave.",
                    "Ele tentou ___ as exigências dos manifestantes, mas eles recusaram-se a sair.",
                    "To 'see off' means to confront or deal with demands or people.",
                    "O phrasal verb 'see off' significa confrontar ou lidar com exigências ou pessoas.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("see to", false),
                            new AnswerOption("see off", true),
                            new AnswerOption("see through", false),
                            new AnswerOption("see over", false)
                    )
            ),
            new QuestionData(
                    "I have to ___ my finances and see where I can save money.",
                    "Eu tenho que ___ as minhas finanças e ver onde posso economizar dinheiro.",
                    "To 'sort out' means to resolve a problem or organize something effectively.",
                    "O phrasal verb 'sort out' significa resolver um problema ou organizar algo de forma eficaz.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("sort up", false),
                            new AnswerOption("sort on", false),
                            new AnswerOption("sort out", true),
                            new AnswerOption("sort over", false)
                    )
            ),
            new QuestionData(
                    "The critics did nothing but ___ the new director's stylistic choices.",
                    "Os críticos não fizeram nada além de ___ as escolhas estilísticas do novo diretor.",
                    "To 'scoff at' means to ridicule or mock something.",
                    "O phrasal verb 'scoff at' significa ridicularizar ou zombar de algo.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("suck up", false),
                            new AnswerOption("scoff at", true),
                            new AnswerOption("stand by", false),
                            new AnswerOption("tide over", false)
                    )
            ),
            new QuestionData(
                    "After the evidence was presented, the suspect finally ___ the charge.",
                    "Depois que a evidência foi apresentada, o suspeito finalmente ___ a acusação.",
                    "To 'own up to' means to confess to having done something wrong.",
                    "O phrasal verb 'own up to' significa confessar ter feito algo errado.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("own in", false),
                            new AnswerOption("own out", false),
                            new AnswerOption("owned up to", true),
                            new AnswerOption("own over", false)
                    )
            ),
            new QuestionData(
                    "I had to ___ my initial reservations about the plan.",
                    "Eu tive que ___ as minhas reservas iniciais sobre o plano.",
                    "To 'put aside' means to disregard or ignore something temporarily.",
                    "O phrasal verb 'put aside' significa desconsiderar ou ignorar algo temporariamente.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("put up with", false),
                            new AnswerOption("put down to", false),
                            new AnswerOption("put aside", true),
                            new AnswerOption("put across", false)
                    )
            ),
            new QuestionData(
                    "We need to ___ the problem of excessive bureaucracy in our department.",
                    "Nós precisamos ___ o problema da burocracia excessiva no nosso departamento.",
                    "To 'get rid of' means to dispose of or eliminate something unwanted.",
                    "O phrasal verb 'get rid of' significa livrar-se ou eliminar algo indesejado.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("get off with", false),
                            new AnswerOption("get over with", false),
                            new AnswerOption("get rid of", true),
                            new AnswerOption("get down to", false)
                    )
            ),
            new QuestionData(
                    "The opposition leader spent the whole debate trying to ___ the new tax proposals.",
                    "O líder da oposição passou todo o debate a tentar ___ as novas propostas fiscais.",
                    "To 'rail against' means to complain bitterly and vehemently about something.",
                    "O phrasal verb 'rail against' significa queixar-se amargamente e veementemente sobre algo.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("play along", false),
                            new AnswerOption("lash out at", false),
                            new AnswerOption("rail against", true),
                            new AnswerOption("knuckle down", false)
                    )
            ),
            new QuestionData(
                    "I hope the disagreement between the two managers will soon ___.",
                    "Eu espero que o desacordo entre os dois gerentes em breve ___.",
                    "To 'blow over' means to pass or subside without serious consequence.",
                    "O phrasal verb 'blow over' significa passar ou diminuir sem consequências graves.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("blow up", false),
                            new AnswerOption("blow out", false),
                            new AnswerOption("blow over", true),
                            new AnswerOption("blow in", false)
                    )
            ),
            new QuestionData(
                    "The sudden illness helped to ___ the urgent completion of the study.",
                    "A doença súbita ajudou a ___ a conclusão urgente do estudo.",
                    "To 'put off' means to delay, which is the result of the sudden illness.",
                    "O phrasal verb 'put off' significa adiar, que é o resultado da doença súbita.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("push through", false),
                            new AnswerOption("put forward", false),
                            new AnswerOption("put off", true),
                            new AnswerOption("put across", false)
                    )
            ),
            new QuestionData(
                    "The new intern has to ___ to his studies if he wants to pass the exam.",
                    "O novo estagiário tem que ___ aos estudos se quiser passar no exame.",
                    "To 'knuckle down' means to apply oneself seriously to work or study.",
                    "O phrasal verb 'knuckle down' significa aplicar-se seriamente ao trabalho ou estudo.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("knuckle up", false),
                            new AnswerOption("knuckle under", false),
                            new AnswerOption("knuckle down", true),
                            new AnswerOption("knuckle out", false)
                    )
            ),
            new QuestionData(
                    "The journalist decided to ___ the new law, citing several unintended consequences.",
                    "O jornalista decidiu ___ a nova lei, citando várias consequências não intencionais.",
                    "To 'take issue with' means to disagree with or challenge a statement or decision.",
                    "O phrasal verb 'take issue with' significa discordar ou contestar uma declaração ou decisão.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("take after", false),
                            new AnswerOption("take up on", false),
                            new AnswerOption("take issue with", true),
                            new AnswerOption("take to", false)
                    )
            ),
            new QuestionData(
                    "The military had to ___ the advance of the enemy troops.",
                    "Os militares tiveram que ___ o avanço das tropas inimigas.",
                    "To 'hold off' means to prevent an enemy or opponent from reaching an objective.",
                    "O phrasal verb 'hold off' significa impedir um inimigo ou oponente de alcançar um objetivo.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("hold out", false),
                            new AnswerOption("hold up", false),
                            new AnswerOption("hold off", true),
                            new AnswerOption("hold over", false)
                    )
            ),
            new QuestionData(
                    "The team leader decided to ___ the proposal to the management.",
                    "O líder da equipa decidiu ___ a proposta à gestão.",
                    "To 'put forward' means to propose or suggest a plan or idea.",
                    "O phrasal verb 'put forward' significa propor ou sugerir um plano ou ideia.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("put down", false),
                            new AnswerOption("put off", false),
                            new AnswerOption("put forward", true),
                            new AnswerOption("put across", false)
                    )
            ),
            new QuestionData(
                    "The two companies decided to ___ their debts to each other at the end of the quarter.",
                    "As duas empresas decidiram ___ as suas dívidas uma com a outra no final do trimestre.",
                    "To 'square up' means to pay a debt or settle an account.",
                    "O phrasal verb 'square up' significa pagar uma dívida ou acertar uma conta.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("square off", false),
                            new AnswerOption("square up", true),
                            new AnswerOption("square with", false),
                            new AnswerOption("square away", false)
                    )
            ),
            new QuestionData(
                    "I was so tired that I could barely ___ the night's demands.",
                    "Eu estava tão cansado que mal conseguia ___ as exigências da noite.",
                    "To 'see through' means to complete a task, especially a difficult one.",
                    "O phrasal verb 'see through' significa completar uma tarefa, especialmente uma difícil.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("see off", false),
                            new AnswerOption("see over", false),
                            new AnswerOption("see through", true),
                            new AnswerOption("see to", false)
                    )
            ),
            new QuestionData(
                    "The politician tried to ___ the charges of corruption.",
                    "O político tentou ___ as acusações de corrupção.",
                    "To 'trump up' means to invent a false charge or accusation.",
                    "O phrasal verb 'trump up' significa inventar uma acusação ou denúncia falsa.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("shrug off", false),
                            new AnswerOption("play along", false),
                            new AnswerOption("trump up", true),
                            new AnswerOption("fob off", false)
                    )
            ),
            new QuestionData(
                    "They decided to ___ the old, inefficient machinery with modern equipment.",
                    "Eles decidiram ___ a maquinaria antiga e ineficiente com equipamento moderno.",
                    "To 'swap out' means to remove one thing and replace it with another.",
                    "O phrasal verb 'swap out' significa remover uma coisa e substituí-la por outra.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("swap over", false),
                            new AnswerOption("swap off", false),
                            new AnswerOption("swap out", true),
                            new AnswerOption("swap in", false)
                    )
            ),
            new QuestionData(
                    "The two managers decided to ___ and work together on the joint project.",
                    "Os dois gerentes decidiram ___ e trabalhar juntos no projeto conjunto.",
                    "To 'team up' means to work together with someone.",
                    "O phrasal verb 'team up' significa trabalhar em conjunto com alguém.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("team out", false),
                            new AnswerOption("team off", false),
                            new AnswerOption("team up", true),
                            new AnswerOption("team on", false)
                    )
            ),
            new QuestionData(
                    "I need to ___ the final details of the contract before submitting it.",
                    "Eu preciso ___ os detalhes finais do contrato antes de o submeter.",
                    "To 'nail down' means to fix precisely or confirm the details of something.",
                    "O phrasal verb 'nail down' significa fixar precisamente ou confirmar os detalhes de algo.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("nail up", false),
                            new AnswerOption("nail in", false),
                            new AnswerOption("nail down", true),
                            new AnswerOption("nail off", false)
                    )
            ),
            new QuestionData(
                    "The activist tried to ___ public support for the environmental campaign.",
                    "O ativista tentou ___ o apoio público para a campanha ambiental.",
                    "To 'whip up' means to quickly prepare or stir up (support, excitement, or feelings).",
                    "O phrasal verb 'whip up' significa preparar rapidamente ou despertar (apoio, entusiasmo ou sentimentos).",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("draw back", false),
                            new AnswerOption("whip up", true),
                            new AnswerOption("play down", false),
                            new AnswerOption("hush up", false)
                    )
            ),
            new QuestionData(
                    "The company must ___ the challenges posed by the new competitor.",
                    "A empresa deve ___ os desafios colocados pelo novo concorrente.",
                    "To 'contend with' means to deal with a difficulty or problem.",
                    "O phrasal verb 'contend with' significa lidar com uma dificuldade ou problema.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("contend for", false),
                            new AnswerOption("contend with", true),
                            new AnswerOption("contend against", false),
                            new AnswerOption("contend in", false)
                    )
            ),
            new QuestionData(
                    "I was asked to ___ the new plan to the board of directors.",
                    "Foi-me pedido para ___ o novo plano à diretoria.",
                    "To 'lay out' means to present a plan or idea clearly and in detail.",
                    "O phrasal verb 'lay out' significa apresentar um plano ou ideia clara e detalhadamente.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("lay off", false),
                            new AnswerOption("lay up", false),
                            new AnswerOption("lay out", true),
                            new AnswerOption("lay in", false)
                    )
            ),
            new QuestionData(
                    "The new policy is designed to ___ the problem of high staff turnover.",
                    "A nova política é projetada para ___ o problema da alta rotatividade de pessoal.",
                    "To 'address' or 'get at' is the meaning, but 'get to the bottom of' means to discover the truth about a situation.",
                    "O phrasal verb 'get to the bottom of' significa descobrir a verdade sobre uma situação.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("get over with", false),
                            new AnswerOption("get around to", false),
                            new AnswerOption("get to the bottom of", true),
                            new AnswerOption("get on with", false)
                    )
            ),
            new QuestionData(
                    "The sudden drop in temperature was enough to ___ the urgent completion of the study.",
                    "A queda súbita de temperatura foi suficiente para ___ a conclusão urgente do estudo.",
                    "To 'hold up' means to delay or impede the progress of something.",
                    "O phrasal verb 'hold up' significa atrasar ou impedir o progresso de algo.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("hold off", false),
                            new AnswerOption("hold up", true),
                            new AnswerOption("hold out", false),
                            new AnswerOption("hold over", false)
                    )
            ),
            new QuestionData(
                    "The workers refused to ___ the new contract terms without negotiation.",
                    "Os trabalhadores recusaram-se a ___ os novos termos do contrato sem negociação.",
                    "To 'yield to' or 'agree to' is the meaning, but 'fall in with' means to agree with or accept a plan or suggestion.",
                    "O phrasal verb 'fall in with' significa concordar ou aceitar um plano ou sugestão.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("fall out with", false),
                            new AnswerOption("fall in with", true),
                            new AnswerOption("fall back on", false),
                            new AnswerOption("fall apart", false)
                    )
            ),
            new QuestionData(
                    "I had to ___ my discomfort and deliver the presentation.",
                    "Eu tive que ___ o meu desconforto e fazer a apresentação.",
                    "To 'suck up' or 'put aside' is the meaning, but 'swallow' or 'put up with' are close. 'Shrug off' means to dismiss as unimportant.",
                    "O phrasal verb 'shrug off' significa descartar como sem importância, o que se encaixa no contexto de ignorar o desconforto.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("stave off", false),
                            new AnswerOption("shrug off", true),
                            new AnswerOption("fob off", false),
                            new AnswerOption("bear out", false)
                    )
            ),
            new QuestionData(
                    "The board decided to ___ the proposal to the shareholders for a final decision.",
                    "A diretoria decidiu ___ a proposta aos acionistas para uma decisão final.",
                    "To 'refer' or 'pass on' is the meaning, but 'refer to' is a phrasal verb for mentioning, while 'pass on' is for transmitting.",
                    "O phrasal verb 'put forward' (apresentar/propor) se encaixa no contexto de enviar a proposta aos acionistas.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("put off", false),
                            new AnswerOption("put up with", false),
                            new AnswerOption("put forward", true),
                            new AnswerOption("put down to", false)
                    )
            ),
            new QuestionData(
                    "The two countries decided to ___ their differences through negotiation.",
                    "Os dois países decidiram ___ as suas diferenças através da negociação.",
                    "To 'patch up' means to repair a disagreement or relationship.",
                    "O phrasal verb 'patch up' significa reparar um desacordo ou relacionamento.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("patch in", false),
                            new AnswerOption("patch down", false),
                            new AnswerOption("patch up", true),
                            new AnswerOption("patch off", false)
                    )
            ),
            new QuestionData(
                    "She decided to ___ the new management structure despite her concerns.",
                    "Ela decidiu ___ a nova estrutura de gestão apesar das suas preocupações.",
                    "To 'play along' means to pretend to cooperate or agree with a plan, even if you do not support it fully.",
                    "O phrasal verb 'play along' significa fingir cooperar ou concordar com um plano, mesmo que não o apoie totalmente.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("play down", false),
                            new AnswerOption("play off", false),
                            new AnswerOption("play along", true),
                            new AnswerOption("play up", false)
                    )
            ),
            new QuestionData(
                    "We need to ___ the support of the local community for this initiative.",
                    "Nós precisamos ___ o apoio da comunidade local para esta iniciativa.",
                    "To 'drum up' means to generate or attract support or interest.",
                    "O phrasal verb 'drum up' significa gerar ou atrair apoio ou interesse.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("drum in", false),
                            new AnswerOption("drum out", false),
                            new AnswerOption("drum up", true),
                            new AnswerOption("drum off", false)
                    )
            ),
            new QuestionData(
                    "The CEO tried to ___ the severity of the financial losses to the public.",
                    "O CEO tentou ___ a gravidade das perdas financeiras para o público.",
                    "To 'play down' means to minimize the importance or seriousness of something.",
                    "O phrasal verb 'play down' significa minimizar a importância ou gravidade de algo.",
                    DifficultyLevel.ADVANCED, "Phrasal Verbs",
                    Arrays.asList(
                            new AnswerOption("play up", false),
                            new AnswerOption("play in", false),
                            new AnswerOption("play down", true),
                            new AnswerOption("play off", false)
                    )
            ),

            // BEGINNER - Idioms

            new QuestionData(
                    "When someone says 'It's raining cats and dogs', what do they mean?",
                    "Quando alguém diz 'It's raining cats and dogs' (Está chovendo cães e gatos), o que eles querem dizer?",
                    "The idiom 'It's raining cats and dogs' means it is raining very heavily.",
                    "O idioma 'It's raining cats and dogs' significa que está chovendo muito forte.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("The weather is sunny", false),
                            new AnswerOption("It is raining very lightly", false),
                            new AnswerOption("It is raining very heavily", true),
                            new AnswerOption("Animals are falling from the sky", false)
                    )
            ),
            new QuestionData(
                    "If something is a 'piece of cake', it means it is ___.",
                    "Se algo é um 'piece of cake' (pedaço de bolo), significa que é ___.",
                    "The idiom 'a piece of cake' means something is very easy to do.",
                    "O idioma 'a piece of cake' significa que algo é muito fácil de fazer.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Very difficult", false),
                            new AnswerOption("Very expensive", false),
                            new AnswerOption("Very easy", true),
                            new AnswerOption("Very tasty", false)
                    )
            ),
            new QuestionData(
                    "When you 'break the ice', you ___.",
                    "Quando você 'break the ice' (quebrar o gelo), você ___.",
                    "To 'break the ice' means to initiate social interaction and make people feel more comfortable.",
                    "Quebrar o gelo significa iniciar a interação social e fazer as pessoas se sentirem mais à vontade.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Make something colder", false),
                            new AnswerOption("Start a difficult task", false),
                            new AnswerOption("Start a conversation or social interaction", true),
                            new AnswerOption("Make a problem worse", false)
                    )
            ),
            new QuestionData(
                    "If you 'feel under the weather', you feel ___.",
                    "Se você 'feel under the weather' (sentir-se debaixo do tempo), você se sente ___.",
                    "To 'feel under the weather' means to feel slightly ill or unwell.",
                    "Sentir-se 'under the weather' significa sentir-se ligeiramente doente ou indisposto.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Very happy", false),
                            new AnswerOption("Slightly ill", true),
                            new AnswerOption("Very energetic", false),
                            new AnswerOption("Angry", false)
                    )
            ),
            new QuestionData(
                    "When you 'hit the nail on the head', you ___.",
                    "Quando você 'hit the nail on the head' (acertar o prego na cabeça), você ___.",
                    "To 'hit the nail on the head' means to describe exactly what is causing a situation or problem.",
                    "Acertar o prego na cabeça significa descrever exatamente o que está a causar uma situação ou problema.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Make a mistake", false),
                            new AnswerOption("Say something wrong", false),
                            new AnswerOption("Say something exactly right", true),
                            new AnswerOption("Fix something broken", false)
                    )
            ),
            new QuestionData(
                    "If you want to 'call it a day', you want to ___.",
                    "Se você quiser 'call it a day' (chamar de dia), você quer ___.",
                    "To 'call it a day' means to stop working on something for the rest of the day.",
                    "Chamar de dia significa parar de trabalhar em algo pelo resto do dia.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Start working again", false),
                            new AnswerOption("Finish work for the day", true),
                            new AnswerOption("Go on a long trip", false),
                            new AnswerOption("Make a phone call", false)
                    )
            ),
            new QuestionData(
                    "When you are 'in the same boat', you are ___.",
                    "Quando você está 'in the same boat' (no mesmo barco), você está ___.",
                    "To be 'in the same boat' means to be in the same difficult situation as others.",
                    "Estar no mesmo barco significa estar na mesma situação difícil que os outros.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Traveling on water", false),
                            new AnswerOption("Very rich", false),
                            new AnswerOption("In the same difficult situation", true),
                            new AnswerOption("Having a fun party", false)
                    )
            ),
            new QuestionData(
                    "If you 'bite the bullet', you ___.",
                    "Se você 'bite the bullet' (morder a bala), você ___.",
                    "To 'bite the bullet' means to face a difficult or unpleasant situation with courage.",
                    "Morder a bala significa enfrentar uma situação difícil ou desagradável com coragem.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Eat quickly", false),
                            new AnswerOption("Take a risk", false),
                            new AnswerOption("Accept a difficult situation", true),
                            new AnswerOption("Talk too much", false)
                    )
            ),
            new QuestionData(
                    "When you are 'on the ball', you are ___.",
                    "Quando você está 'on the ball' (na bola), você está ___.",
                    "To be 'on the ball' means to be aware of and quick to understand things.",
                    "Estar na bola significa estar ciente e rápido para entender as coisas.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Playing a sport", false),
                            new AnswerOption("Doing a bad job", false),
                            new AnswerOption("Alert and competent", true),
                            new AnswerOption("Very relaxed", false)
                    )
            ),
            new QuestionData(
                    "If you 'let the cat out of the bag', you ___.",
                    "Se você 'let the cat out of the bag' (deixar o gato sair do saco), você ___.",
                    "To 'let the cat out of the bag' means to accidentally reveal a secret.",
                    "Deixar o gato sair do saco significa revelar um segredo acidentalmente.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Buy a new pet", false),
                            new AnswerOption("Keep a secret safe", false),
                            new AnswerOption("Reveal a secret by mistake", true),
                            new AnswerOption("Put something in a bag", false)
                    )
            ),
            new QuestionData(
                    "When you 'add insult to injury', you ___.",
                    "Quando você 'add insult to injury' (adicionar insulto à injúria), você ___.",
                    "To 'add insult to injury' means to worsen an unfavourable situation.",
                    "Adicionar insulto à injúria significa piorar uma situação desfavorável.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Help someone who is hurt", false),
                            new AnswerOption("Make a bad situation even worse", true),
                            new AnswerOption("Apologize for a mistake", false),
                            new AnswerOption("Heal a wound", false)
                    )
            ),
            new QuestionData(
                    "If you are 'back to the drawing board', you need to ___.",
                    "Se você está 'back to the drawing board' (de volta à prancheta), você precisa ___.",
                    "To be 'back to the drawing board' means you must start over on a new plan or idea after a failure.",
                    "Estar de volta à prancheta significa que você deve começar de novo um novo plano ou ideia após um fracasso.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Draw a picture", false),
                            new AnswerOption("Finish a successful project", false),
                            new AnswerOption("Start over with a new plan", true),
                            new AnswerOption("Take a long break", false)
                    )
            ),
            new QuestionData(
                    "When you 'miss the boat', you ___.",
                    "Quando você 'miss the boat' (perder o barco), você ___.",
                    "To 'miss the boat' means to miss an opportunity.",
                    "Perder o barco significa perder uma oportunidade.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Go on a cruise", false),
                            new AnswerOption("Arrive on time", false),
                            new AnswerOption("Miss an opportunity", true),
                            new AnswerOption("Catch a train", false)
                    )
            ),
            new QuestionData(
                    "If you 'turn a blind eye', you ___.",
                    "Se você 'turn a blind eye' (fizer vista grossa), você ___.",
                    "To 'turn a blind eye' means to ignore something that you know is wrong.",
                    "Fazer vista grossa significa ignorar algo que você sabe que está errado.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Look carefully", false),
                            new AnswerOption("Ignore something wrong", true),
                            new AnswerOption("Close your eyes to sleep", false),
                            new AnswerOption("See something clearly", false)
                    )
            ),
            new QuestionData(
                    "When you 'cost an arm and a leg', it means it is ___.",
                    "Quando algo 'cost an arm and a leg' (custa um braço e uma perna), significa que é ___.",
                    "To 'cost an arm and a leg' means to be extremely expensive.",
                    "Custar um braço e uma perna significa ser extremamente caro.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Very cheap", false),
                            new AnswerOption("Very easy to buy", false),
                            new AnswerOption("Very expensive", true),
                            new AnswerOption("Given for free", false)
                    )
            ),
            new QuestionData(
                    "If you 'get out of hand', something becomes ___.",
                    "Se algo 'get out of hand' (sair do controlo), torna-se ___.",
                    "To 'get out of hand' means to become out of control.",
                    "Sair do controlo significa tornar-se incontrolável.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Easy to manage", false),
                            new AnswerOption("Out of control", true),
                            new AnswerOption("Very cheap", false),
                            new AnswerOption("A useful tool", false)
                    )
            ),
            new QuestionData(
                    "When you are 'all ears', you are ___.",
                    "Quando você está 'all ears' (todo ouvidos), você está ___.",
                    "To be 'all ears' means to be listening intently and with full attention.",
                    "Estar todo ouvidos significa estar a ouvir atentamente e com total atenção.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Not interested", false),
                            new AnswerOption("Talking too much", false),
                            new AnswerOption("Listening carefully", true),
                            new AnswerOption("Sleeping soundly", false)
                    )
            ),
            new QuestionData(
                    "If you 'burn the midnight oil', you ___.",
                    "Se você 'burn the midnight oil' (queimar o óleo da meia-noite), você ___.",
                    "To 'burn the midnight oil' means to work or study late into the night.",
                    "Queimar o óleo da meia-noite significa trabalhar ou estudar tarde da noite.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Go to bed early", false),
                            new AnswerOption("Work very late at night", true),
                            new AnswerOption("Light a candle", false),
                            new AnswerOption("Waste electricity", false)
                    )
            ),
            new QuestionData(
                    "When you 'compare apples and oranges', you ___.",
                    "Quando você 'compare apples and oranges' (compara maçãs e laranjas), você ___.",
                    "To 'compare apples and oranges' means to compare two items that are fundamentally different and cannot be justly compared.",
                    "Comparar maçãs e laranjas significa comparar dois itens que são fundamentalmente diferentes e não podem ser justamente comparados.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Compare similar things", false),
                            new AnswerOption("Compare two different things that shouldn't be compared", true),
                            new AnswerOption("Eat healthy food", false),
                            new AnswerOption("Do a good comparison", false)
                    )
            ),
            new QuestionData(
                    "If you 'speak of the devil', you are talking about someone who ___.",
                    "Se você 'speak of the devil' (falar do diabo), você está a falar de alguém que ___.",
                    "To 'speak of the devil' is used when the person you were just talking about suddenly appears.",
                    "Falar do diabo é usado quando a pessoa de quem você estava a falar aparece de repente.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Is very evil", false),
                            new AnswerOption("Just left the room", false),
                            new AnswerOption("Unexpectedly appears", true),
                            new AnswerOption("Is very kind", false)
                    )
            ),
            new QuestionData(
                    "When you 'get your act together', you need to ___.",
                    "Quando você 'get your act together' (colocar a sua vida em ordem), você precisa ___.",
                    "To 'get your act together' means to organize yourself and make a successful effort.",
                    "Colocar a sua vida em ordem significa organizar-se e fazer um esforço bem-sucedido.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Start a performance", false),
                            new AnswerOption("Become disorganized", false),
                            new AnswerOption("Become organized and serious", true),
                            new AnswerOption("Write a script", false)
                    )
            ),
            new QuestionData(
                    "If you say 'long story short', you mean ___.",
                    "Se você diz 'long story short' (história longa, curta), você quer dizer ___.",
                    "'Long story short' is used to indicate that you are going to summarise the main points.",
                    "'Long story short' é usado para indicar que você vai resumir os pontos principais.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Tell a very long story", false),
                            new AnswerOption("Tell a story in great detail", false),
                            new AnswerOption("Tell the main points of a story", true),
                            new AnswerOption("Make a story complicated", false)
                    )
            ),
            new QuestionData(
                    "When you 'look before you leap', you ___.",
                    "Quando você 'look before you leap' (olhar antes de saltar), você ___.",
                    "To 'look before you leap' means to consider the possible consequences before taking action.",
                    "Olhar antes de saltar significa considerar as possíveis consequências antes de agir.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Jump quickly", false),
                            new AnswerOption("Act without thinking", false),
                            new AnswerOption("Consider the risks carefully", true),
                            new AnswerOption("Take a big risk", false)
                    )
            ),
            new QuestionData(
                    "If something is 'the icing on the cake', it is ___.",
                    "Se algo é 'the icing on the cake' (a cereja no topo do bolo), é ___.",
                    "'The icing on the cake' refers to an additional benefit or good thing.",
                    "A cereja no topo do bolo refere-se a um benefício adicional ou algo bom.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("A main problem", false),
                            new AnswerOption("A pleasant addition to something good", true),
                            new AnswerOption("A very bad outcome", false),
                            new AnswerOption("The beginning of a disaster", false)
                    )
            ),
            new QuestionData(
                    "When you say 'better late than never', you mean ___.",
                    "Quando você diz 'better late than never' (melhor tarde do que nunca), você quer dizer ___.",
                    "'Better late than never' means it is better to do something late than not at all.",
                    "Melhor tarde do que nunca significa que é melhor fazer algo tarde do que não o fazer de todo.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Punctuality is essential", false),
                            new AnswerOption("Being early is better", false),
                            new AnswerOption("Doing something late is acceptable", true),
                            new AnswerOption("Never do anything late", false)
                    )
            ),
            new QuestionData(
                    "If you are 'saved by the bell', you are saved from ___.",
                    "Se você é 'saved by the bell' (salvo pelo gongo), você é salvo de ___.",
                    "To be 'saved by the bell' means to be saved from a difficult situation just in time.",
                    "Ser salvo pelo gongo significa ser salvo de uma situação difícil mesmo a tempo.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("A boring conversation", false),
                            new AnswerOption("A dangerous object", false),
                            new AnswerOption("A difficult situation just in time", true),
                            new AnswerOption("An annoying sound", false)
                    )
            ),
            new QuestionData(
                    "When you 'get the hang of it', you ___.",
                    "Quando você 'get the hang of it' (apanhar o jeito), você ___.",
                    "To 'get the hang of it' means to learn how to do something, especially something difficult.",
                    "Apanhar o jeito significa aprender a fazer algo, especialmente algo difícil.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Forget how to do something", false),
                            new AnswerOption("Become confused", false),
                            new AnswerOption("Learn how to do something new", true),
                            new AnswerOption("Stop trying to learn", false)
                    )
            ),
            new QuestionData(
                    "If you 'give someone the cold shoulder', you ___.",
                    "Se você 'give someone the cold shoulder' (dar a ombro frio a alguém), você ___.",
                    "To 'give someone the cold shoulder' means to ignore someone or treat them in an unfriendly way.",
                    "Dar o ombro frio a alguém significa ignorar alguém ou tratá-lo de forma hostil.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Give warm clothes", false),
                            new AnswerOption("Be very friendly", false),
                            new AnswerOption("Ignore or treat someone unfriendly", true),
                            new AnswerOption("Offer assistance", false)
                    )
            ),
            new QuestionData(
                    "When you 'make a long story short', you ___.",
                    "Quando você 'make a long story short' (tornar uma história longa curta), você ___.",
                    "To 'make a long story short' is to tell the essential points, summarizing a longer narrative.",
                    "Tornar uma história longa curta é contar os pontos essenciais, resumindo uma narrativa mais longa.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Take a long time to talk", false),
                            new AnswerOption("Summarize quickly", true),
                            new AnswerOption("Tell all the details", false),
                            new AnswerOption("Start a new book", false)
                    )
            ),
            new QuestionData(
                    "If you are 'up in the air', the situation is ___.",
                    "Se você está 'up in the air' (no ar), a situação é ___.",
                    "To be 'up in the air' means that a decision or plan is uncertain or unresolved.",
                    "Estar no ar significa que uma decisão ou plano é incerto ou não resolvido.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Completely decided", false),
                            new AnswerOption("Very clear", false),
                            new AnswerOption("Uncertain or undecided", true),
                            new AnswerOption("About flying", false)
                    )
            ),
            new QuestionData(
                    "When something 'cuts corners', it means it ___.",
                    "Quando algo 'cuts corners' (corta cantos), significa que ___.",
                    "To 'cut corners' means to do something in the easiest, quickest, or cheapest way, often at the expense of quality.",
                    "Cortar cantos significa fazer algo da maneira mais fácil, rápida ou barata, muitas vezes à custa da qualidade.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Follows the rules exactly", false),
                            new AnswerOption("Does something in the easiest, often worst way", true),
                            new AnswerOption("Takes the longest route", false),
                            new AnswerOption("Focuses on high quality", false)
                    )
            ),
            new QuestionData(
                    "If you 'get bent out of shape', you ___.",
                    "Se você 'get bent out of shape' (ficar fora de forma), você ___.",
                    "To 'get bent out of shape' means to become angry, upset, or agitated.",
                    "Ficar fora de forma significa ficar zangado, chateado ou agitado.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Get a new haircut", false),
                            new AnswerOption("Become very angry or upset", true),
                            new AnswerOption("Exercise too much", false),
                            new AnswerOption("Feel calm and relaxed", false)
                    )
            ),
            new QuestionData(
                    "When you 'let sleeping dogs lie', you decide to ___.",
                    "Quando você 'let sleeping dogs lie' (deixar os cães dorminhocos em paz), você decide ___.",
                    "To 'let sleeping dogs lie' means to leave a situation undisturbed, as it might cause trouble.",
                    "Deixar os cães dorminhocos em paz significa deixar uma situação em paz, pois pode causar problemas.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Wake up the dogs", false),
                            new AnswerOption("Avoid stirring up a problem", true),
                            new AnswerOption("Solve a problem quickly", false),
                            new AnswerOption("Encourage conflict", false)
                    )
            ),
            new QuestionData(
                    "If you 'break a leg', you wish someone ___.",
                    "Se você 'break a leg' (partir uma perna), você deseja a alguém ___.",
                    "To 'break a leg' is an informal way to wish someone good luck, especially before a performance.",
                    "Partir uma perna é uma maneira informal de desejar boa sorte a alguém, especialmente antes de uma apresentação.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Bad luck", false),
                            new AnswerOption("To get hurt", false),
                            new AnswerOption("Good luck", true),
                            new AnswerOption("A quick trip to the doctor", false)
                    )
            ),
            new QuestionData(
                    "When you say something is 'the last straw', it is ___.",
                    "Quando você diz que algo é 'the last straw' (a última gota), é ___.",
                    "'The last straw' is the final event in a series of unpleasant events that causes someone to lose their patience.",
                    "A última gota é o evento final numa série de eventos desagradáveis que faz alguém perder a paciência.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("The first positive event", false),
                            new AnswerOption("The first sign of trouble", false),
                            new AnswerOption("The final unbearable provocation", true),
                            new AnswerOption("A small piece of hay", false)
                    )
            ),
            new QuestionData(
                    "If you are 'on cloud nine', you are ___.",
                    "Se você está 'on cloud nine' (na nuvem nove), você está ___.",
                    "To be 'on cloud nine' means to be in a state of extreme happiness.",
                    "Estar na nuvem nove significa estar num estado de extrema felicidade.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("In a difficult spot", false),
                            new AnswerOption("Lost in the sky", false),
                            new AnswerOption("Extremely happy", true),
                            new AnswerOption("Feeling very sick", false)
                    )
            ),
            new QuestionData(
                    "When you 'put all your eggs in one basket', you ___.",
                    "Quando você 'put all your eggs in one basket' (colocar todos os seus ovos num cesto), você ___.",
                    "To 'put all your eggs in one basket' means to put all your resources or efforts into one possibility.",
                    "Colocar todos os seus ovos num cesto significa colocar todos os seus recursos ou esforços numa única possibilidade.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Spread out the risk", false),
                            new AnswerOption("Risk losing everything for one goal", true),
                            new AnswerOption("Cook a big meal", false),
                            new AnswerOption("Prepare for many things", false)
                    )
            ),
            new QuestionData(
                    "If you 'get a second wind', you get ___.",
                    "Se você 'get a second wind' (ganhar um segundo fôlego), você ganha ___.",
                    "To 'get a second wind' means to regain energy after being tired.",
                    "Ganhar um segundo fôlego significa recuperar a energia depois de estar cansado.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Very tired", false),
                            new AnswerOption("A sudden burst of new energy", true),
                            new AnswerOption("A strong feeling of boredom", false),
                            new AnswerOption("Lost in the mountains", false)
                    )
            ),
            new QuestionData(
                    "When you are 'the whole nine yards', you mean ___.",
                    "Quando você diz 'the whole nine yards' (os nove metros inteiros), você quer dizer ___.",
                    "'The whole nine yards' means everything possible or everything available.",
                    "Os nove metros inteiros significa tudo o que é possível ou tudo o que está disponível.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("A small part of something", false),
                            new AnswerOption("Only a few details", false),
                            new AnswerOption("Everything; all of it", true),
                            new AnswerOption("Something that is very long", false)
                    )
            ),
            new QuestionData(
                    "If you are 'the apple of my eye', you are ___.",
                    "Se você é 'the apple of my eye' (a menina dos meus olhos), você é ___.",
                    "To be 'the apple of my eye' means to be the person one loves most and is very proud of.",
                    "Ser a menina dos meus olhos significa ser a pessoa que se ama mais e de quem se tem muito orgulho.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Someone I hate", false),
                            new AnswerOption("Someone I really love and cherish", true),
                            new AnswerOption("Someone very tall", false),
                            new AnswerOption("A famous person", false)
                    )
            ),
            new QuestionData(
                    "When you say 'a dime a dozen', you mean something is ___.",
                    "Quando você diz 'a dime a dozen' (um tostão por uma dúzia), você quer dizer que algo é ___.",
                    "To be 'a dime a dozen' means to be very common and of little value.",
                    "Um tostão por uma dúzia significa ser muito comum e de pouco valor.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Very rare", false),
                            new AnswerOption("Very unique", false),
                            new AnswerOption("Very common and not special", true),
                            new AnswerOption("Extremely expensive", false)
                    )
            ),
            new QuestionData(
                    "If you 'take a rain check', you are ___.",
                    "Se você 'take a rain check' (pegar um vale-chuva), você está ___.",
                    "To 'take a rain check' means to politely decline an offer or invitation, with the promise of accepting it at a later time.",
                    "Pegar um vale-chuva significa recusar educadamente uma oferta ou convite, com a promessa de aceitá-lo mais tarde.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Accepting an offer immediately", false),
                            new AnswerOption("Postponing an invitation", true),
                            new AnswerOption("Going out in the rain", false),
                            new AnswerOption("Asking for money", false)
                    )
            ),
            new QuestionData(
                    "When you 'barking up the wrong tree', you are ___.",
                    "Quando você está 'barking up the wrong tree' (a latir para a árvore errada), você está ___.",
                    "To be 'barking up the wrong tree' means to pursue a mistaken course of action or be mistaken about something.",
                    "Estar a latir para a árvore errada significa seguir um curso de ação equivocado ou estar enganado sobre algo.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Doing a great job", false),
                            new AnswerOption("Making the right choice", false),
                            new AnswerOption("Mistaken or pursuing a wrong idea", true),
                            new AnswerOption("Climbing the correct tree", false)
                    )
            ),
            new QuestionData(
                    "If you 'cry over spilt milk', you ___.",
                    "Se você 'cry over spilt milk' (chorar pelo leite derramado), você ___.",
                    "To 'cry over spilt milk' means to regret something that has already happened and cannot be changed.",
                    "Chorar pelo leite derramado significa lamentar algo que já aconteceu e não pode ser mudado.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Feel happy about a mistake", false),
                            new AnswerOption("Regret something that cannot be fixed", true),
                            new AnswerOption("Clean up a mess quickly", false),
                            new AnswerOption("Prevent an accident", false)
                    )
            ),
            new QuestionData(
                    "When you 'throw in the towel', you ___.",
                    "Quando você 'throw in the towel' (atirar a toalha), você ___.",
                    "To 'throw in the towel' means to give up or surrender.",
                    "Atirar a toalha significa desistir ou render-se.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Start a fight", false),
                            new AnswerOption("Give up or surrender", true),
                            new AnswerOption("Clean up after a shower", false),
                            new AnswerOption("Begin a new task", false)
                    )
            ),
            new QuestionData(
                    "If you are 'a penny for your thoughts', someone wants to know ___.",
                    "Se você é 'a penny for your thoughts' (um cêntimo pelos seus pensamentos), alguém quer saber ___.",
                    "'A penny for your thoughts' is a phrase used to ask someone what they are thinking about.",
                    "Um cêntimo pelos seus pensamentos é uma frase usada para perguntar a alguém o que está a pensar.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("How much money you have", false),
                            new AnswerOption("What you are thinking", true),
                            new AnswerOption("Where you are going", false),
                            new AnswerOption("What your job is", false)
                    )
            ),
            new QuestionData(
                    "When you 'go the extra mile', you ___.",
                    "Quando você 'go the extra mile' (percorrer a milha extra), você ___.",
                    "To 'go the extra mile' means to make a special, additional effort.",
                    "Percorrer a milha extra significa fazer um esforço especial e adicional.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Do the minimum required", false),
                            new AnswerOption("Do more than what is expected", true),
                            new AnswerOption("Stop working early", false),
                            new AnswerOption("Walk a very long distance", false)
                    )
            ),
            new QuestionData(
                    "If you are 'a couch potato', you are someone who ___.",
                    "Se você é 'a couch potato' (uma batata de sofá), você é alguém que ___.",
                    "A 'couch potato' is a person who spends a lot of time sitting and watching television.",
                    "Uma batata de sofá é uma pessoa que passa muito tempo sentada a ver televisão.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Eats a lot of vegetables", false),
                            new AnswerOption("Loves to exercise outdoors", false),
                            new AnswerOption("Spends too much time watching TV and being inactive", true),
                            new AnswerOption("Is a professional athlete", false)
                    )
            ),
            new QuestionData(
                    "When you 'kill two birds with one stone', you ___.",
                    "Quando você 'kill two birds with one stone' (matar dois pássaros com uma pedra), você ___.",
                    "To 'kill two birds with one stone' means to achieve two results with a single effort.",
                    "Matar dois pássaros com uma pedra significa alcançar dois resultados com um único esforço.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Create more problems", false),
                            new AnswerOption("Waste resources", false),
                            new AnswerOption("Achieve two things with one action", true),
                            new AnswerOption("Work very slowly", false)
                    )
            ),
            new QuestionData(
                    "If you 'wrap your head around something', you ___.",
                    "Se você 'wrap your head around something' (envolver a sua cabeça em torno de algo), você ___.",
                    "To 'wrap your head around something' means to understand something complicated.",
                    "Envolver a sua cabeça em torno de algo significa entender algo complicado.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Find something confusing", false),
                            new AnswerOption("Fail to understand a concept", false),
                            new AnswerOption("Completely understand something difficult", true),
                            new AnswerOption("Put on a hat", false)
                    )
            ),
            new QuestionData(
                    "When something 'beats around the bush', it means it ___.",
                    "Quando alguém 'beats around the bush' (anda à volta do mato), significa que ___.",
                    "To 'beat around the bush' means to avoid saying what you mean, often because it is difficult or unpleasant.",
                    "Andar à volta do mato significa evitar dizer o que se quer dizer, muitas vezes porque é difícil ou desagradável.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Speaks directly and clearly", false),
                            new AnswerOption("Avoids the main topic", true),
                            new AnswerOption("Gives a simple answer", false),
                            new AnswerOption("Looks for something lost", false)
                    )
            ),
            new QuestionData(
                    "If you are 'the whole shebang', you mean ___.",
                    "Se você diz 'the whole shebang' (a coisa toda), você quer dizer ___.",
                    "'The whole shebang' means everything, the entire thing.",
                    "A coisa toda significa tudo, a totalidade.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("A small object", false),
                            new AnswerOption("Only a single part", false),
                            new AnswerOption("The entire collection or thing", true),
                            new AnswerOption("Something incomplete", false)
                    )
            ),
            new QuestionData(
                    "When you 'pull someone's leg', you ___.",
                    "Quando você 'pull someone's leg' (puxa a perna de alguém), você ___.",
                    "To 'pull someone's leg' means to tease or joke with someone, often by telling them something untrue.",
                    "Puxar a perna de alguém significa provocar ou brincar com alguém, muitas vezes contando-lhe algo falso.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Hurt someone physically", false),
                            new AnswerOption("Tell a serious lie", false),
                            new AnswerOption("Play a joke or tease someone", true),
                            new AnswerOption("Help someone stand up", false)
                    )
            ),
            new QuestionData(
                    "If something is 'the straw that broke the camel's back', it is ___.",
                    "Se algo é 'the straw that broke the camel's back' (a gota d'água), é ___.",
                    "'The straw that broke the camel's back' is the final minor trouble that makes a situation unbearable.",
                    "A gota d'água é o problema menor final que torna uma situação insuportável.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("A useful tool", false),
                            new AnswerOption("The beginning of a task", false),
                            new AnswerOption("The final burden that causes failure", true),
                            new AnswerOption("A simple solution", false)
                    )
            ),
            new QuestionData(
                    "When you 'compare apples to apples', you ___.",
                    "Quando você 'compare apples to apples' (compara maçãs com maçãs), você ___.",
                    "To 'compare apples to apples' means to compare similar things fairly.",
                    "Comparar maçãs com maçãs significa comparar coisas semelhantes de forma justa.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Compare different things", false),
                            new AnswerOption("Compare things that are similar and comparable", true),
                            new AnswerOption("Eat a lot of fruit", false),
                            new AnswerOption("Make an unfair comparison", false)
                    )
            ),
            new QuestionData(
                    "If you 'get a taste of your own medicine', you ___.",
                    "Se você 'get a taste of your own medicine' (provar do seu próprio veneno), você ___.",
                    "To 'get a taste of your own medicine' means to be treated the same unpleasant way you treated others.",
                    "Provar do seu próprio veneno significa ser tratado da mesma forma desagradável que você tratou os outros.",
                    DifficultyLevel.BEGINNER, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Receive a reward", false),
                            new AnswerOption("Get well soon", false),
                            new AnswerOption("Experience the same bad treatment you gave others", true),
                            new AnswerOption("Take medication", false)
                    )
            ),

            // INTERMEDIATE - Idioms

            new QuestionData(
                    "To 'jump on the bandwagon' means to ___.",
                    "'Jump on the bandwagon' (saltar no vagão da banda) significa ___.",
                    "The idiom 'to jump on the bandwagon' means to join a popular activity or trend.",
                    "O idioma 'jump on the bandwagon' significa juntar-se a uma atividade ou tendência popular.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Resist a trend", false),
                            new AnswerOption("Join a popular trend or activity", true),
                            new AnswerOption("Organize a parade", false),
                            new AnswerOption("Create a new style", false)
                    )
            ),
            new QuestionData(
                    "If you say something 'gets my goat', it means it ___.",
                    "Se você diz que algo 'gets my goat' (pega a minha cabra), significa que ___.",
                    "The idiom 'gets my goat' means to annoy or irritate someone greatly.",
                    "O idioma 'gets my goat' significa irritar ou aborrecer alguém grandemente.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Makes me happy", false),
                            new AnswerOption("Is very interesting", false),
                            new AnswerOption("Annoy or irritate me a lot", true),
                            new AnswerOption("Is very calming", false)
                    )
            ),
            new QuestionData(
                    "When you 'go the whole hog', you ___.",
                    "Quando você 'go the whole hog' (ir com o porco inteiro), você ___.",
                    "To 'go the whole hog' means to do something completely or thoroughly.",
                    "Ir com o porco inteiro significa fazer algo completamente ou exaustivamente.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Do only a small part", false),
                            new AnswerOption("Do something partially", false),
                            new AnswerOption("Do something thoroughly and completely", true),
                            new AnswerOption("Stop halfway", false)
                    )
            ),
            new QuestionData(
                    "If a situation is a 'double-edged sword', it has ___.",
                    "Se uma situação é uma 'double-edged sword' (espada de dois gumes), ela tem ___.",
                    "A 'double-edged sword' is something that has both positive and negative consequences.",
                    "Uma espada de dois gumes é algo que tem consequências tanto positivas quanto negativas.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Only benefits", false),
                            new AnswerOption("Only drawbacks", false),
                            new AnswerOption("Both advantages and disadvantages", true),
                            new AnswerOption("No effect at all", false)
                    )
            ),
            new QuestionData(
                    "When you 'know the ropes', you ___.",
                    "Quando você 'know the ropes' (conhecer as cordas), você ___.",
                    "To 'know the ropes' means to be familiar with the details of a task or job.",
                    "Conhecer as cordas significa estar familiarizado com os detalhes de uma tarefa ou trabalho.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Have no experience", false),
                            new AnswerOption("Are a beginner", false),
                            new AnswerOption("Understand how a task or job works", true),
                            new AnswerOption("Are confused", false)
                    )
            ),
            new QuestionData(
                    "If you say 'the pen is mightier than the sword', you mean ___.",
                    "Se você diz 'the pen is mightier than the sword' (a caneta é mais poderosa que a espada), você quer dizer ___.",
                    "The idiom means that written words and communication are more effective than military force or violence.",
                    "O idioma significa que as palavras escritas e a comunicação são mais eficazes do que a força militar ou a violência.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Writing is easier than fighting", false),
                            new AnswerOption("Violence is the only answer", false),
                            new AnswerOption("Communication and words are more powerful than force", true),
                            new AnswerOption("Weapons are useless", false)
                    )
            ),
            new QuestionData(
                    "To 'bury the hatchet' means to ___.",
                    "'Bury the hatchet' (enterrar o machado) significa ___.",
                    "To 'bury the hatchet' means to make peace and forget past disagreements.",
                    "Enterrar o machado significa fazer as pazes e esquecer desentendimentos passados.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Start an argument", false),
                            new AnswerOption("Make a problem public", false),
                            new AnswerOption("End a conflict or disagreement", true),
                            new AnswerOption("Hide a weapon", false)
                    )
            ),
            new QuestionData(
                    "If you 'have a bone to pick with someone', you ___.",
                    "Se você 'have a bone to pick with someone' (ter um osso para roer com alguém), você ___.",
                    "To 'have a bone to pick with someone' means to have a grievance or something to discuss that is annoying or requires resolution.",
                    "Ter um osso para roer com alguém significa ter uma queixa ou algo para discutir que é irritante ou requer resolução.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Want to be friends", false),
                            new AnswerOption("Have something to complain about or discuss", true),
                            new AnswerOption("Want to give a gift", false),
                            new AnswerOption("Are happy with them", false)
                    )
            ),
            new QuestionData(
                    "When someone is 'a tough nut to crack', they are ___.",
                    "Quando alguém é 'a tough nut to crack' (uma noz difícil de quebrar), eles são ___.",
                    "A 'tough nut to crack' is a person or problem that is difficult to understand or deal with.",
                    "Uma noz difícil de quebrar é uma pessoa ou problema que é difícil de entender ou lidar.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Easy to influence", false),
                            new AnswerOption("Easy to solve", false),
                            new AnswerOption("A person or problem that is difficult to deal with", true),
                            new AnswerOption("A sweet dessert", false)
                    )
            ),
            new QuestionData(
                    "If you are 'pulling out all the stops', you are ___.",
                    "Se você está 'pulling out all the stops' (puxando todas as paragens), você está ___.",
                    "To 'pull out all the stops' means to use all possible means to achieve a good result.",
                    "Puxar todas as paragens significa usar todos os meios possíveis para alcançar um bom resultado.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Making minimal effort", false),
                            new AnswerOption("Working very slowly", false),
                            new AnswerOption("Making a very great effort", true),
                            new AnswerOption("Taking frequent breaks", false)
                    )
            ),
            new QuestionData(
                    "When you 'read between the lines', you ___.",
                    "Quando você 'read between the lines' (ler nas entrelinhas), você ___.",
                    "To 'read between the lines' means to understand the hidden meaning or intention.",
                    "Ler nas entrelinhas significa entender o significado ou a intenção oculta.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Take everything literally", false),
                            new AnswerOption("Read quickly and superficially", false),
                            new AnswerOption("Understand the hidden or implied meaning", true),
                            new AnswerOption("Ignore the text", false)
                    )
            ),
            new QuestionData(
                    "If you 'spill the beans', you ___.",
                    "Se você 'spill the beans' (derramar os feijões), você ___.",
                    "To 'spill the beans' means to reveal a secret or confidential information.",
                    "Derramar os feijões significa revelar um segredo ou informação confidencial.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Keep a secret", false),
                            new AnswerOption("Cook a meal", false),
                            new AnswerOption("Reveal a secret", true),
                            new AnswerOption("Drop food on the floor", false)
                    )
            ),
            new QuestionData(
                    "When you say 'nip it in the bud', you mean to ___.",
                    "Quando você diz 'nip it in the bud' (cortar no botão), você quer dizer ___.",
                    "To 'nip it in the bud' means to stop a bad situation from becoming worse by acting early.",
                    "Cortar no botão significa parar uma situação ruim de piorar, agindo precocemente.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Let a problem grow", false),
                            new AnswerOption("Stop a small problem before it gets worse", true),
                            new AnswerOption("Ignore a warning sign", false),
                            new AnswerOption("Water a plant", false)
                    )
            ),
            new QuestionData(
                    "If you 'get a word in edgewise', you manage to ___.",
                    "Se você 'get a word in edgewise' (arranjar uma palavra na ponta), você consegue ___.",
                    "To 'get a word in edgewise' means to manage to say something when another person is talking too much.",
                    "Arranjar uma palavra na ponta significa conseguir dizer algo quando outra pessoa está a falar demais.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Talk constantly", false),
                            new AnswerOption("Interrupt someone who is speaking quickly", true),
                            new AnswerOption("Listen silently", false),
                            new AnswerOption("Have a long conversation", false)
                    )
            ),
            new QuestionData(
                    "When you are 'the whole nine yards', you mean ___.",
                    "Quando você diz 'the whole nine yards' (os nove metros inteiros), você quer dizer ___.",
                    "'The whole nine yards' means everything; the entirety of something.",
                    "Os nove metros inteiros significa tudo; a totalidade de algo.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Only part of the plan", false),
                            new AnswerOption("All of it; everything included", true),
                            new AnswerOption("A very long distance", false),
                            new AnswerOption("Something that is too much", false)
                    )
            ),
            new QuestionData(
                    "If you 'let bygones be bygones', you ___.",
                    "Se você 'let bygones be bygones' (deixar o passado ser passado), você ___.",
                    "To 'let bygones be bygones' means to forgive and forget past quarrels or conflicts.",
                    "Deixar o passado ser passado significa perdoar e esquecer desentendimentos ou conflitos passados.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Insist on discussing old issues", false),
                            new AnswerOption("Forget past conflicts and reconcile", true),
                            new AnswerOption("Start a new argument", false),
                            new AnswerOption("Write down a list of grievances", false)
                    )
            ),
            new QuestionData(
                    "When you 'throw caution to the wind', you ___.",
                    "Quando você 'throw caution to the wind' (lançar a cautela ao vento), você ___.",
                    "To 'throw caution to the wind' means to act recklessly or without careful thought.",
                    "Lançar a cautela ao vento significa agir de forma imprudente ou sem pensar cuidadosamente.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Act very carefully", false),
                            new AnswerOption("Act recklessly and carelessly", true),
                            new AnswerOption("Plan every step meticulously", false),
                            new AnswerOption("Take minimal risks", false)
                    )
            ),
            new QuestionData(
                    "If you are 'up in arms', you are ___.",
                    "Se você está 'up in arms' (de braços erguidos), você está ___.",
                    "To be 'up in arms' means to be very angry and complaining loudly.",
                    "Estar de braços erguidos significa estar muito zangado e reclamar em voz alta.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Calm and accepting", false),
                            new AnswerOption("Holding a weapon", false),
                            new AnswerOption("Very angry and protesting strongly", true),
                            new AnswerOption("Ready to give a hug", false)
                    )
            ),
            new QuestionData(
                    "When you 'jump the gun', you ___.",
                    "Quando você 'jump the gun' (saltar a arma), você ___.",
                    "To 'jump the gun' means to do something too soon or prematurely.",
                    "Saltar a arma significa fazer algo muito cedo ou prematuramente.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Wait for the right moment", false),
                            new AnswerOption("Act prematurely or too soon", true),
                            new AnswerOption("Start a race slowly", false),
                            new AnswerOption("Be patient", false)
                    )
            ),
            new QuestionData(
                    "If someone is 'the black sheep of the family', they are ___.",
                    "Se alguém é 'the black sheep of the family' (a ovelha negra da família), eles são ___.",
                    "The 'black sheep' is a disgraced or undesirable member of a family or group.",
                    "A ovelha negra é um membro desgraçado ou indesejável de uma família ou grupo.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("The favorite member", false),
                            new AnswerOption("The most successful member", false),
                            new AnswerOption("A disgraced or undesirable member of the group", true),
                            new AnswerOption("A very kind person", false)
                    )
            ),
            new QuestionData(
                    "When you 'have your hands full', you are ___.",
                    "Quando você 'have your hands full' (ter as mãos cheias), você está ___.",
                    "To 'have your hands full' means to be completely busy or preoccupied.",
                    "Ter as mãos cheias significa estar completamente ocupado ou preocupado.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Available to help", false),
                            new AnswerOption("Not doing anything", false),
                            new AnswerOption("Very busy or fully occupied", true),
                            new AnswerOption("Carrying a lot of things", false)
                    )
            ),
            new QuestionData(
                    "If you 'get wind of something', you ___.",
                    "Se você 'get wind of something' (ganhar vento de algo), você ___.",
                    "To 'get wind of something' means to hear a rumour or secret information.",
                    "Ganhar vento de algo significa ouvir um rumor ou informação secreta.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Ignore the gossip", false),
                            new AnswerOption("Find out a secret or rumor", true),
                            new AnswerOption("Start a new business", false),
                            new AnswerOption("Feel the breeze", false)
                    )
            ),
            new QuestionData(
                    "When something is 'a drop in the ocean', it is ___.",
                    "Quando algo é 'a drop in the ocean' (uma gota no oceano), é ___.",
                    "A 'drop in the ocean' is a very small amount compared with what is needed or expected.",
                    "Uma gota no oceano é uma quantidade muito pequena em comparação com o que é necessário ou esperado.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("The most important part", false),
                            new AnswerOption("A huge quantity", false),
                            new AnswerOption("A very small, insignificant amount", true),
                            new AnswerOption("A large body of water", false)
                    )
            ),
            new QuestionData(
                    "If you 'turn over a new leaf', you ___.",
                    "Se você 'turn over a new leaf' (virar uma nova folha), você ___.",
                    "To 'turn over a new leaf' means to make a fresh start or change your behaviour for the better.",
                    "Virar uma nova folha significa fazer um novo começo ou mudar o seu comportamento para melhor.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Read a book carefully", false),
                            new AnswerOption("Continue with bad habits", false),
                            new AnswerOption("Change your behaviour for the better", true),
                            new AnswerOption("Ignore a difficult situation", false)
                    )
            ),
            new QuestionData(
                    "When you 'pass the buck', you ___.",
                    "Quando você 'pass the buck' (passar a responsabilidade), você ___.",
                    "To 'pass the buck' means to shift responsibility to someone else.",
                    "Passar a responsabilidade significa transferir a responsabilidade para outra pessoa.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Accept responsibility", false),
                            new AnswerOption("Avoid making decisions", false),
                            new AnswerOption("Shift responsibility to another person", true),
                            new AnswerOption("Earn a lot of money", false)
                    )
            ),
            new QuestionData(
                    "If you are 'playing devil's advocate', you are ___.",
                    "Se você está 'playing devil's advocate' (fazendo o papel de advogado do diabo), você está ___.",
                    "To 'play devil's advocate' means to argue against an idea or cause for the sake of debate, not because you necessarily believe in it.",
                    "Fazer o papel de advogado do diabo significa argumentar contra uma ideia ou causa para fins de debate, não porque você necessariamente acredite nela.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Agreeing with everyone", false),
                            new AnswerOption("Arguing the opposite point of view for discussion", true),
                            new AnswerOption("Always disagreeing genuinely", false),
                            new AnswerOption("Defending a popular belief", false)
                    )
            ),
            new QuestionData(
                    "When you 'blow off some steam', you ___.",
                    "Quando você 'blow off some steam' (liberar algum vapor), você ___.",
                    "To 'blow off some steam' means to vent anger or stress in a harmless way.",
                    "Liberar algum vapor significa desabafar a raiva ou o stress de uma forma inofensiva.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Keep your feelings hidden", false),
                            new AnswerOption("Get angry easily", false),
                            new AnswerOption("Release stress or frustration", true),
                            new AnswerOption("Get very calm", false)
                    )
            ),
            new QuestionData(
                    "If you 'have a change of heart', you ___.",
                    "Se você 'have a change of heart' (mudar de ideia), você ___.",
                    "To 'have a change of heart' means to change your opinion or decision.",
                    "Mudar de ideia significa mudar a sua opinião ou decisão.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Insist on the original plan", false),
                            new AnswerOption("Change your opinion or intention", true),
                            new AnswerOption("Be stubborn", false),
                            new AnswerOption("Need a medical check-up", false)
                    )
            ),
            new QuestionData(
                    "When you 'take the bull by the horns', you ___.",
                    "Quando você 'take the bull by the horns' (pegar o touro pelos chifres), você ___.",
                    "To 'take the bull by the horns' means to deal with a difficult situation directly and boldly.",
                    "Pegar o touro pelos chifres significa lidar com uma situação difícil de forma direta e ousada.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Avoid a challenge", false),
                            new AnswerOption("Confront a difficult problem boldly", true),
                            new AnswerOption("Wait for the problem to go away", false),
                            new AnswerOption("Run away from danger", false)
                    )
            ),
            new QuestionData(
                    "If you are 'back to square one', you have to ___.",
                    "Se você está 'back to square one' (de volta à estaca zero), você tem que ___.",
                    "To be 'back to square one' means to return to the starting point after a failed attempt.",
                    "Estar de volta à estaca zero significa retornar ao ponto de partida após uma tentativa falhada.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Finish successfully", false),
                            new AnswerOption("Return to the beginning after a failure", true),
                            new AnswerOption("Continue from the middle", false),
                            new AnswerOption("Win the game", false)
                    )
            ),
            new QuestionData(
                    "When you 'draw the line', you ___.",
                    "Quando você 'draw the line' (traçar a linha), você ___.",
                    "To 'draw the line' means to set a limit or boundary for acceptable behaviour or action.",
                    "Traçar a linha significa estabelecer um limite ou fronteira para um comportamento ou ação aceitável.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Be very flexible", false),
                            new AnswerOption("Be highly forgiving", false),
                            new AnswerOption("Set a limit or boundary", true),
                            new AnswerOption("Encourage bad behaviour", false)
                    )
            ),
            new QuestionData(
                    "If you 'have sticky fingers', you are inclined to ___.",
                    "Se você 'have sticky fingers' (ter dedos pegajosos), você está inclinado a ___.",
                    "To 'have sticky fingers' means to be inclined to steal.",
                    "Ter dedos pegajosos significa ter inclinação para roubar.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Be generous", false),
                            new AnswerOption("Be inclined to steal", true),
                            new AnswerOption("Be very honest", false),
                            new AnswerOption("Be clumsy", false)
                    )
            ),
            new QuestionData(
                    "When you 'go cold turkey', you ___.",
                    "Quando você 'go cold turkey' (ir peru frio), você ___.",
                    "To 'go cold turkey' means to suddenly stop an addictive behaviour.",
                    "Ir peru frio significa parar de repente um comportamento viciante.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Start a new habit slowly", false),
                            new AnswerOption("Gradually reduce a bad habit", false),
                            new AnswerOption("Stop a bad habit suddenly and completely", true),
                            new AnswerOption("Eat a large meal", false)
                    )
            ),
            new QuestionData(
                    "If something is 'the salt of the earth', it is ___.",
                    "Se algo é 'the salt of the earth' (o sal da terra), é ___.",
                    "'The salt of the earth' refers to a very good, honest, or worthy person.",
                    "O sal da terra refere-se a uma pessoa muito boa, honesta ou digna.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("A very rich person", false),
                            new AnswerOption("A very dishonest person", false),
                            new AnswerOption("A very good and honest person", true),
                            new AnswerOption("Someone who travels a lot", false)
                    )
            ),
            new QuestionData(
                    "When you 'keep your chin up', you ___.",
                    "Quando você 'keep your chin up' (manter o queixo erguido), você ___.",
                    "To 'keep your chin up' means to remain cheerful in difficult circumstances.",
                    "Manter o queixo erguido significa permanecer alegre em circunstâncias difíceis.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Feel sad and defeated", false),
                            new AnswerOption("Stay cheerful despite difficulties", true),
                            new AnswerOption("Look down at the ground", false),
                            new AnswerOption("Get angry easily", false)
                    )
            ),
            new QuestionData(
                    "If you 'break the bank', you ___.",
                    "Se você 'break the bank' (quebrar o banco), você ___.",
                    "To 'break the bank' means to spend all of one's money.",
                    "Quebrar o banco significa gastar todo o seu dinheiro.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Win a lot of money", false),
                            new AnswerOption("Spend all your money; cost too much", true),
                            new AnswerOption("Save money carefully", false),
                            new AnswerOption("Rob a financial institution", false)
                    )
            ),
            new QuestionData(
                    "When you 'get a raw deal', you ___.",
                    "Quando você 'get a raw deal' (receber um tratamento injusto), você ___.",
                    "To 'get a raw deal' means to receive unfair or harsh treatment.",
                    "Receber um tratamento injusto significa receber um tratamento injusto ou severo.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Receive a great opportunity", false),
                            new AnswerOption("Receive unfair treatment", true),
                            new AnswerOption("Get a good discount", false),
                            new AnswerOption("Win a prize", false)
                    )
            ),
            new QuestionData(
                    "If you are 'going off on a tangent', you are ___.",
                    "Se você está 'going off on a tangent' (fugindo ao assunto), você está ___.",
                    "To be 'going off on a tangent' means to change the subject suddenly and stray from the main point.",
                    "Fugir ao assunto significa mudar de assunto subitamente e desviar-se do ponto principal.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Staying focused on the main topic", false),
                            new AnswerOption("Changing the subject abruptly", true),
                            new AnswerOption("Giving a precise answer", false),
                            new AnswerOption("Finishing a presentation", false)
                    )
            ),
            new QuestionData(
                    "When you 'have a short fuse', you are ___.",
                    "Quando você 'have a short fuse' (ter um pavio curto), você está ___.",
                    "To 'have a short fuse' means to have a quick temper or become angry easily.",
                    "Ter um pavio curto significa ter um temperamento rápido ou ficar zangado facilmente.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Very patient", false),
                            new AnswerOption("Easily provoked to anger", true),
                            new AnswerOption("Slow to react", false),
                            new AnswerOption("Always calm", false)
                    )
            ),
            new QuestionData(
                    "If you 'get a foot in the door', you gain ___.",
                    "Se você 'get a foot in the door' (colocar um pé na porta), você ganha ___.",
                    "To 'get a foot in the door' means to gain a small or entry-level opportunity that might lead to a greater one.",
                    "Colocar um pé na porta significa ganhar uma pequena oportunidade ou de nível inicial que pode levar a uma maior.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("A major promotion immediately", false),
                            new AnswerOption("An initial opportunity to advance", true),
                            new AnswerOption("A large salary", false),
                            new AnswerOption("A difficult challenge", false)
                    )
            ),
            new QuestionData(
                    "When you are 'all bark and no bite', you are ___.",
                    "Quando você é 'all bark and no bite' (só ladra e não morde), você é ___.",
                    "To be 'all bark and no bite' means to be threatening and loud but harmless.",
                    "Ser só ladrar e não morder significa ser ameaçador e barulhento, mas inofensivo.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Very dangerous", false),
                            new AnswerOption("Aggressive and violent", false),
                            new AnswerOption("Threatening but ultimately harmless", true),
                            new AnswerOption("Quiet and friendly", false)
                    )
            ),
            new QuestionData(
                    "If you 'turn the tables', you ___.",
                    "Se você 'turn the tables' (virar a mesa), você ___.",
                    "To 'turn the tables' means to change a situation to the opposite of what it was, especially by gaining an advantage over someone who previously had an advantage over you.",
                    "Virar a mesa significa mudar uma situação para o oposto do que era, especialmente ganhando vantagem sobre alguém que anteriormente tinha vantagem sobre você.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Keep the situation the same", false),
                            new AnswerOption("Reverse the situation to your advantage", true),
                            new AnswerOption("Accept a disadvantage", false),
                            new AnswerOption("Be easily defeated", false)
                    )
            ),
            new QuestionData(
                    "When you 'get a grip', you need to ___.",
                    "Quando você 'get a grip' (controlar-se), você precisa ___.",
                    "To 'get a grip' means to gain control of one's feelings or behavior.",
                    "Controlar-se significa ganhar o controlo dos seus sentimentos ou comportamento.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Lose emotional control", false),
                            new AnswerOption("Get angry quickly", false),
                            new AnswerOption("Gain emotional control and calm down", true),
                            new AnswerOption("Hold something tightly", false)
                    )
            ),
            new QuestionData(
                    "If you 'let off the hook', you allow someone to ___.",
                    "Se você 'let off the hook' (deixar sair do anzol), você permite que alguém ___.",
                    "To 'let off the hook' means to allow someone to escape from a difficult situation or punishment.",
                    "Deixar sair do anzol significa permitir que alguém escape de uma situação difícil ou punição.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Accept full blame", false),
                            new AnswerOption("Escape a penalty or difficult situation", true),
                            new AnswerOption("Be severely punished", false),
                            new AnswerOption("Do the right thing", false)
                    )
            ),
            new QuestionData(
                    "When you 'play it by ear', you ___.",
                    "Quando você 'play it by ear' (tocar de ouvido), você ___.",
                    "To 'play it by ear' means to decide how to deal with a situation as it develops, rather than planning exactly in advance.",
                    "Tocar de ouvido significa decidir como lidar com uma situação à medida que ela se desenvolve, em vez de planear exatamente com antecedência.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Follow a strict plan", false),
                            new AnswerOption("Improvise as the situation unfolds", true),
                            new AnswerOption("Listen to music carefully", false),
                            new AnswerOption("Decide everything beforehand", false)
                    )
            ),
            new QuestionData(
                    "If you 'put the cart before the horse', you ___.",
                    "Se você 'put the cart before the horse' (colocar a carroça à frente dos bois), você ___.",
                    "To 'put the cart before the horse' means to do things in the wrong order.",
                    "Colocar a carroça à frente dos bois significa fazer as coisas na ordem errada.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Do things logically", false),
                            new AnswerOption("Do things in the wrong order", true),
                            new AnswerOption("Work very quickly", false),
                            new AnswerOption("Start with the easy parts", false)
                    )
            ),
            new QuestionData(
                    "When you 'have a finger in every pie', you are ___.",
                    "Quando você 'have a finger in every pie' (ter um dedo em cada bolo), você está ___.",
                    "To 'have a finger in every pie' means to be involved in many activities or business ventures.",
                    "Ter um dedo em cada bolo significa estar envolvido em muitas atividades ou empreendimentos de negócios.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Focused on one thing", false),
                            new AnswerOption("Involved in many different things", true),
                            new AnswerOption("Eating a lot of desserts", false),
                            new AnswerOption("Doing nothing at all", false)
                    )
            ),
            new QuestionData(
                    "If you 'give someone a run for their money', you ___.",
                    "Se você 'give someone a run for their money' (dar a alguém uma corrida pelo seu dinheiro), você ___.",
                    "To 'give someone a run for their money' means to perform well and offer strong competition.",
                    "Dar a alguém uma corrida pelo seu dinheiro significa ter um bom desempenho e oferecer forte competição.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Spend too much money", false),
                            new AnswerOption("Win easily", false),
                            new AnswerOption("Provide strong competition", true),
                            new AnswerOption("Lose quickly", false)
                    )
            ),
            new QuestionData(
                    "When you 'save for a rainy day', you ___.",
                    "Quando você 'save for a rainy day' (economizar para um dia chuvoso), você ___.",
                    "To 'save for a rainy day' means to save money for a time when it might be needed unexpectedly.",
                    "Economizar para um dia chuvoso significa guardar dinheiro para uma época em que possa ser necessário inesperadamente.",
                    DifficultyLevel.INTERMEDIATE, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Spend all your money immediately", false),
                            new AnswerOption("Save money for future unexpected needs", true),
                            new AnswerOption("Take a vacation in the rain", false),
                            new AnswerOption("Only spend money on essentials", false)
                    )
            ),

            // ADVANCED - Idioms

            new QuestionData(
                    "To 'take the gilt off the gingerbread' means to ___.",
                    "'Take the gilt off the gingerbread' (tirar o dourado do pão de gengibre) significa ___.",
                    "The idiom 'take the gilt off the gingerbread' means to reveal the less attractive reality of something that was initially attractive or impressive.",
                    "O idioma 'take the gilt off the gingerbread' significa revelar a realidade menos atraente de algo que era inicialmente atraente ou impressionante.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("To enhance the appearance of something", false),
                            new AnswerOption("To make something sound better than it is", false),
                            new AnswerOption("To reveal the unpleasant truth about something attractive", true),
                            new AnswerOption("To apply gold leaf to a pastry", false)
                    )
            ),
            new QuestionData(
                    "If you say someone 'knows on which side their bread is buttered', you mean they ___.",
                    "Se você diz que alguém 'knows on which side their bread is buttered' (sabe de que lado o pão está untado), você quer dizer que eles ___.",
                    "The idiom means to know where one's own advantage or benefit lies.",
                    "O idioma significa saber onde reside a sua própria vantagem ou benefício.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Are unaware of their advantages", false),
                            new AnswerOption("Are skilled at making food", false),
                            new AnswerOption("Know what action serves their self-interest best", true),
                            new AnswerOption("Are completely disinterested in personal gain", false)
                    )
            ),
            new QuestionData(
                    "When a situation is 'a moot point', it is ___.",
                    "Quando uma situação é um 'moot point' (ponto discutível), é ___.",
                    "A 'moot point' is an issue or matter about which there is disagreement, or one that is not relevant to the current situation.",
                    "Um ponto discutível é uma questão ou assunto sobre o qual há desacordo, ou um que não é relevante para a situação atual.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("A definite and established fact", false),
                            new AnswerOption("A topic that is debatable or irrelevant", true),
                            new AnswerOption("An argument that is clearly resolved", false),
                            new AnswerOption("The crucial part of a discussion", false)
                    )
            ),
            new QuestionData(
                    "If you 'hold a candle to' something, you ___.",
                    "Se você 'hold a candle to' (segurar uma vela para) algo, você ___.",
                    "To 'hold a candle to' means to be anywhere near as good as someone or something else.",
                    "Segurar uma vela para algo significa estar sequer perto de ser tão bom quanto outra pessoa ou coisa.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Are clearly superior to it", false),
                            new AnswerOption("Are not nearly as good as it", true),
                            new AnswerOption("Are dedicated to improving it", false),
                            new AnswerOption("Are providing illumination for it", false)
                    )
            ),
            new QuestionData(
                    "When you say someone is 'a loose canon', you mean they are ___.",
                    "Quando você diz que alguém é 'a loose canon' (um canhão solto), você quer dizer que eles são ___.",
                    "A 'loose canon' is a person or thing that is unpredictable and potentially disruptive.",
                    "Um canhão solto é uma pessoa ou coisa que é imprevisível e potencialmente disruptiva.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Very reliable and organized", false),
                            new AnswerOption("A source of great stability", false),
                            new AnswerOption("Unpredictable and likely to cause damage", true),
                            new AnswerOption("Someone who travels frequently", false)
                    )
            ),
            new QuestionData(
                    "If you 'have an axe to grind', you have ___.",
                    "Se você 'have an axe to grind' (ter um machado para afiar), você tem ___.",
                    "To 'have an axe to grind' means to have a selfish reason for being involved in an action.",
                    "Ter um machado para afiar significa ter uma razão egoísta para estar envolvido numa ação.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("A genuine desire to help others", false),
                            new AnswerOption("A personal grievance or selfish motive", true),
                            new AnswerOption("An interest in woodworking", false),
                            new AnswerOption("A strong sense of fairness", false)
                    )
            ),
            new QuestionData(
                    "When you are 'at sixes and sevens', you are ___.",
                    "Quando você está 'at sixes and sevens' (em seis e setes), você está ___.",
                    "To be 'at sixes and sevens' means to be in a state of confusion, disarray, or disagreement.",
                    "Estar em seis e setes significa estar em estado de confusão, desordem ou desacordo.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Highly organized and efficient", false),
                            new AnswerOption("Feeling perfectly calm", false),
                            new AnswerOption("In a state of confusion and disorder", true),
                            new AnswerOption("Counting carefully to ten", false)
                    )
            ),
            new QuestionData(
                    "If you 'beg the question', you ___.",
                    "Se você 'beg the question' (pedir a questão), você ___.",
                    "To 'beg the question' means to assume the truth of what you are trying to prove, often used incorrectly to mean 'raise the question'.",
                    "Pedir a questão significa assumir a verdade daquilo que se está a tentar provar (petição de princípio), frequentemente usado incorretamente para significar 'levantar a questão'.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Raise a relevant question naturally", false),
                            new AnswerOption("Assume the conclusion of one's argument", true),
                            new AnswerOption("Ask for a clear explanation", false),
                            new AnswerOption("Avoid answering a direct question", false)
                    )
            ),
            new QuestionData(
                    "When you 'steal someone's thunder', you ___.",
                    "Quando você 'steal someone's thunder' (roubar o trovão de alguém), você ___.",
                    "To 'steal someone's thunder' means to take the credit for an idea or accomplishment by saying or doing it first.",
                    "Roubar o trovão de alguém significa levar o crédito por uma ideia ou realização, dizendo ou fazendo-a primeiro.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Give credit to someone else", false),
                            new AnswerOption("Take attention or credit away from someone else", true),
                            new AnswerOption("Encourage a shy person to speak", false),
                            new AnswerOption("Applaud loudly for a performance", false)
                    )
            ),
            new QuestionData(
                    "If you 'take umbrage', you ___.",
                    "Se você 'take umbrage' (levar a mal), você ___.",
                    "To 'take umbrage' means to feel offended or resentful.",
                    "Levar a mal significa sentir-se ofendido ou ressentido.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Feel greatly delighted", false),
                            new AnswerOption("Feel deeply offended", true),
                            new AnswerOption("Offer to help someone", false),
                            new AnswerOption("Accept criticism gracefully", false)
                    )
            ),
            new QuestionData(
                    "When you 'buy a pig in a poke', you ___.",
                    "Quando você 'buy a pig in a poke' (comprar um porco num saco), você ___.",
                    "To 'buy a pig in a poke' means to buy something without having inspected it; buying sight unseen.",
                    "Comprar um porco num saco significa comprar algo sem o ter inspecionado; comprar sem ver.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Buy something of high value after careful inspection", false),
                            new AnswerOption("Buy something without checking it first", true),
                            new AnswerOption("Get a bargain on livestock", false),
                            new AnswerOption("Trade fairly and openly", false)
                    )
            ),
            new QuestionData(
                    "If someone is 'hoist with their own petard', they are ___.",
                    "Se alguém é 'hoist with their own petard' (apanhado com o seu próprio petardo), eles são ___.",
                    "To be 'hoist with one's own petard' means to have one's own plan to harm others backfire against oneself.",
                    "Ser apanhado com o seu próprio petardo significa ter o seu próprio plano para prejudicar os outros a virar-se contra si.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Elevated to a high position", false),
                            new AnswerOption("Victimized by someone else's plan", false),
                            new AnswerOption("Hurt by their own scheme meant for others", true),
                            new AnswerOption("Praised for their inventive strategy", false)
                    )
            ),
            new QuestionData(
                    "When you 'take something with a grain of salt', you ___.",
                    "Quando você 'take something with a grain of salt' (levar algo com um grão de sal), você ___.",
                    "To 'take something with a grain of salt' means to view it with skepticism or not entirely believe it.",
                    "Levar algo com um grão de sal significa ver com ceticismo ou não acreditar inteiramente.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Believe everything you hear immediately", false),
                            new AnswerOption("Consume food slowly and carefully", false),
                            new AnswerOption("Treat information with skepticism", true),
                            new AnswerOption("Find the information very savory", false)
                    )
            ),
            new QuestionData(
                    "If you 'gild the lily', you ___.",
                    "Se você 'gild the lily' (dourar o lírio), você ___.",
                    "To 'gild the lily' means to decorate something that is already beautiful or perfect, thus potentially spoiling it.",
                    "Dourar o lírio significa decorar algo que já é bonito ou perfeito, estragando-o potencialmente.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Improve something flawed", false),
                            new AnswerOption("Ruin a piece of art", false),
                            new AnswerOption("Attempt to improve something already perfect", true),
                            new AnswerOption("Make something inexpensive look valuable", false)
                    )
            ),
            new QuestionData(
                    "When a situation is ' Hobson's choice', it is ___.",
                    "Quando uma situação é uma 'Hobson's choice' (escolha de Hobson), é ___.",
                    "A 'Hobson's choice' is a choice of taking what is offered or nothing at all.",
                    "Uma escolha de Hobson é a escolha de aceitar o que é oferecido ou nada.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("A variety of equally good options", false),
                            new AnswerOption("No real choice at all; take it or leave it", true),
                            new AnswerOption("A decision with many acceptable outcomes", false),
                            new AnswerOption("A difficult but necessary decision", false)
                    )
            ),
            new QuestionData(
                    "If you 'pay lip service', you ___.",
                    "Se você 'pay lip service' (prestar serviço labial), você ___.",
                    "To 'pay lip service' means to express loyalty or respect merely in words, but not in action.",
                    "Prestar serviço labial significa expressar lealdade ou respeito apenas em palavras, mas não em ação.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Express genuine support and follow up with action", false),
                            new AnswerOption("Show respect only in words, not deeds", true),
                            new AnswerOption("Provide full, sincere commitment", false),
                            new AnswerOption("Pay someone verbally for a small favor", false)
                    )
            ),
            new QuestionData(
                    "When you are 'in the offing', something is ___.",
                    "Quando algo está 'in the offing' (no horizonte), algo está ___.",
                    "To be 'in the offing' means that something is likely to happen soon.",
                    "Estar no horizonte significa que algo é provável de acontecer em breve.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Very far away in the future", false),
                            new AnswerOption("Unlikely to ever happen", false),
                            new AnswerOption("Likely to happen soon", true),
                            new AnswerOption("Completely finished and over", false)
                    )
            ),
            new QuestionData(
                    "If you 'leave no stone unturned', you ___.",
                    "Se você 'leave no stone unturned' (não deixar pedra sobre pedra), você ___.",
                    "To 'leave no stone unturned' means to do everything possible to achieve a result.",
                    "Não deixar pedra sobre pedra significa fazer tudo o que é possível para alcançar um resultado.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Take an easy approach to a problem", false),
                            new AnswerOption("Search and investigate thoroughly", true),
                            new AnswerOption("Give up easily on a difficult task", false),
                            new AnswerOption("Ignore minor details", false)
                    )
            ),
            new QuestionData(
                    "When you 'tilt at windmills', you ___.",
                    "Quando você 'tilt at windmills' (lutar contra moinhos de vento), você ___.",
                    "To 'tilt at windmills' means to attack imaginary enemies or fight pointless battles.",
                    "Lutar contra moinhos de vento significa atacar inimigos imaginários ou lutar batalhas sem sentido.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Achieve great success easily", false),
                            new AnswerOption("Fight imaginary or futile battles", true),
                            new AnswerOption("Engage in a productive, real conflict", false),
                            new AnswerOption("Attack a real enemy with great force", false)
                    )
            ),
            new QuestionData(
                    "If you 'read the riot act', you ___.",
                    "Se você 'read the riot act' (ler a lei de motim), você ___.",
                    "To 'read the riot act' means to issue a stern warning that if unacceptable behaviour does not cease, punishment will follow.",
                    "Ler a lei de motim significa emitir um aviso severo de que, se o comportamento inaceitável não cessar, haverá punição.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Encourage further discussion", false),
                            new AnswerOption("Issue a strict warning about bad behavior", true),
                            new AnswerOption("Ask politely for silence", false),
                            new AnswerOption("Begin a violent confrontation", false)
                    )
            ),
            new QuestionData(
                    "When something 'stands to reason', it is ___.",
                    "Quando algo 'stands to reason' (é lógico), é ___.",
                    "To 'stand to reason' means to be obvious or logical.",
                    "Ser lógico significa ser óbvio ou lógico.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Completely absurd", false),
                            new AnswerOption("Counter-intuitive", false),
                            new AnswerOption("Obvious or clearly logical", true),
                            new AnswerOption("A difficult philosophical problem", false)
                    )
            ),
            new QuestionData(
                    "If you are 'persona non grata', you are ___.",
                    "Se você é 'persona non grata', você é ___.",
                    "'Persona non grata' is a Latin phrase meaning an unacceptable or unwelcome person.",
                    "Persona non grata é uma frase em Latim que significa uma pessoa inaceitável ou indesejada.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("A highly popular figure", false),
                            new AnswerOption("An essential team member", false),
                            new AnswerOption("An unwelcome person", true),
                            new AnswerOption("A respected diplomat", false)
                    )
            ),
            new QuestionData(
                    "When you 'pour oil on troubled waters', you ___.",
                    "Quando você 'pour oil on troubled waters' (deitar azeite em águas turbulentas), você ___.",
                    "To 'pour oil on troubled waters' means to attempt to calm a difficult or quarrelsome situation.",
                    "Deitar azeite em águas turbulentas significa tentar acalmar uma situação difícil ou de desentendimento.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Make a problem worse", false),
                            new AnswerOption("Fuel an argument", false),
                            new AnswerOption("Try to calm a difficult situation", true),
                            new AnswerOption("Cause a large-scale conflict", false)
                    )
            ),
            new QuestionData(
                    "If something is 'in the pipeline', it is ___.",
                    "Se algo está 'in the pipeline' (no pipeline), está ___.",
                    "To be 'in the pipeline' means that something is being planned or prepared.",
                    "Estar no pipeline significa que algo está a ser planeado ou preparado.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Already finished and delivered", false),
                            new AnswerOption("Being prepared and is imminent", true),
                            new AnswerOption("Permanently cancelled", false),
                            new AnswerOption("An unforeseen emergency", false)
                    )
            ),
            new QuestionData(
                    "When you are 'in your element', you are ___.",
                    "Quando você está 'in your element' (no seu elemento), você está ___.",
                    "To be 'in your element' means to be in a situation that you are comfortable with and where you perform well.",
                    "Estar no seu elemento significa estar numa situação com a qual você se sente confortável e onde tem um bom desempenho.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("In a completely unfamiliar place", false),
                            new AnswerOption("Feeling awkward and incompetent", false),
                            new AnswerOption("In a comfortable, successful situation", true),
                            new AnswerOption("Struggling with a basic task", false)
                    )
            ),
            new QuestionData(
                    "If you 'get short shrift', you receive ___.",
                    "Se você 'get short shrift' (receber tratamento brusco), você recebe ___.",
                    "To 'get short shrift' means to receive little attention or sympathy.",
                    "Receber tratamento brusco significa receber pouca atenção ou simpatia.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("A generous financial reward", false),
                            new AnswerOption("Little or no attention or sympathy", true),
                            new AnswerOption("A detailed and lengthy explanation", false),
                            new AnswerOption("A polite and warm welcome", false)
                    )
            ),
            new QuestionData(
                    "When you 'strain at a gnat and swallow a camel', you ___.",
                    "Quando você 'strain at a gnat and swallow a camel' (coar um mosquito e engolir um camelo), você ___.",
                    "The idiom means to worry about trivial matters while ignoring important ones.",
                    "O idioma significa preocupar-se com assuntos triviais enquanto se ignora os importantes.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Pay careful attention to all details", false),
                            new AnswerOption("Focus too much on small issues while overlooking major ones", true),
                            new AnswerOption("Eat a large meal quickly", false),
                            new AnswerOption("Solve big problems with ease", false)
                    )
            ),
            new QuestionData(
                    "If you are 'damned with faint praise', you receive ___.",
                    "Se você é 'damned with faint praise' (condenado com elogios fracos), você recebe ___.",
                    "To be 'damned with faint praise' means to be criticized by insincere or weak commendation.",
                    "Ser condenado com elogios fracos significa ser criticado por meio de elogios insinceros ou fracos.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Sincere and strong admiration", false),
                            new AnswerOption("Seemingly positive but ineffective or insincere praise", true),
                            new AnswerOption("Harsh and direct criticism", false),
                            new AnswerOption("An undeserved promotion", false)
                    )
            ),
            new QuestionData(
                    "When something is 'the acid test', it is ___.",
                    "Quando algo é 'the acid test' (o teste de fogo), é ___.",
                    "'The acid test' is a crucial test that proves the worth or effectiveness of something.",
                    "O teste de fogo é um teste crucial que prova o valor ou a eficácia de algo.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("A minor, insignificant examination", false),
                            new AnswerOption("The final, definitive trial of worth", true),
                            new AnswerOption("A chemical experiment involving acid", false),
                            new AnswerOption("A gentle practice run", false)
                    )
            ),
            new QuestionData(
                    "If you 'cut the Gordian knot', you ___.",
                    "Se você 'cut the Gordian knot' (cortar o nó górdio), você ___.",
                    "To 'cut the Gordian knot' means to solve a difficult problem in a quick and decisive manner.",
                    "Cortar o nó górdio significa resolver um problema difícil de maneira rápida e decisiva.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Make a simple task complicated", false),
                            new AnswerOption("Avoid dealing with a problem", false),
                            new AnswerOption("Solve a complex problem directly and forcefully", true),
                            new AnswerOption("Tie a knot very securely", false)
                    )
            ),
            new QuestionData(
                    "When someone is 'a dog in the manger', they are ___.",
                    "Quando alguém é 'a dog in the manger' (um cão na manjedoura), eles são ___.",
                    "A 'dog in the manger' is a person who prevents others from having something that they themselves do not want or need.",
                    "Um cão na manjedoura é uma pessoa que impede os outros de ter algo que eles próprios não querem ou não precisam.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Generous and helpful", false),
                            new AnswerOption("Happy to share their resources", false),
                            new AnswerOption("Someone who keeps things others want but cannot use themselves", true),
                            new AnswerOption("A loyal pet owner", false)
                    )
            ),
            new QuestionData(
                    "If you 'put the cart before the horse', you ___.",
                    "Se você 'put the cart before the horse' (colocar a carroça à frente dos bois), você ___.",
                    "To 'put the cart before the horse' means to do things in the wrong order.",
                    "Colocar a carroça à frente dos bois significa fazer as coisas na ordem errada.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Prioritize tasks effectively", false),
                            new AnswerOption("Do things in the wrong sequence", true),
                            new AnswerOption("Work very quickly and efficiently", false),
                            new AnswerOption("Complete a project successfully", false)
                    )
            ),
            new QuestionData(
                    "When you 'throw down the gauntlet', you ___.",
                    "Quando você 'throw down the gauntlet' (lançar a luva), você ___.",
                    "To 'throw down the gauntlet' means to issue a challenge.",
                    "Lançar a luva significa emitir um desafio.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Withdraw from a competition", false),
                            new AnswerOption("Accept a challenge gracefully", false),
                            new AnswerOption("Issue a direct challenge", true),
                            new AnswerOption("Offer a peace treaty", false)
                    )
            ),
            new QuestionData(
                    "If you 'get your marching orders', you are ___.",
                    "Se você 'get your marching orders' (receber as suas ordens de marcha), você está ___.",
                    "To 'get your marching orders' means to be told that you must leave or that your employment is terminated.",
                    "Receber as suas ordens de marcha significa ser informado de que deve sair ou que o seu emprego foi terminado.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Receiving a promotion", false),
                            new AnswerOption("Being told to leave a job or place", true),
                            new AnswerOption("Getting instructions for a long journey", false),
                            new AnswerOption("Being hired for a new position", false)
                    )
            ),
            new QuestionData(
                    "When you 'have a bee in your bonnet', you are ___.",
                    "Quando você 'have a bee in your bonnet' (ter uma abelha no seu gorro), você está ___.",
                    "To 'have a bee in your bonnet' means to be obsessed or preoccupied with a particular idea or thing.",
                    "Ter uma abelha no seu gorro significa estar obcecado ou preocupado com uma determinada ideia ou coisa.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Feeling confused and disoriented", false),
                            new AnswerOption("Extremely concerned or obsessed with an idea", true),
                            new AnswerOption("Calm and unaffected by events", false),
                            new AnswerOption("Preparing for beekeeping", false)
                    )
            ),
            new QuestionData(
                    "If you are 'a flash in the pan', you are ___.",
                    "Se você é 'a flash in the pan' (um clarão na frigideira), você é ___.",
                    "A 'flash in the pan' is someone or something that shows great promise or success only for a short time.",
                    "Um clarão na frigideira é alguém ou algo que mostra grande promessa ou sucesso apenas por um curto período de tempo.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("A consistently successful person", false),
                            new AnswerOption("A sudden, but temporary, success", true),
                            new AnswerOption("A person with hidden talents", false),
                            new AnswerOption("Someone who works slowly but steadily", false)
                    )
            ),
            new QuestionData(
                    "When you are 'penny wise and pound foolish', you ___.",
                    "Quando você é 'penny wise and pound foolish' (sábio em centavos e tolo em libras), você ___.",
                    "The idiom means to be careful and thrifty in small matters but wasteful or extravagant in large ones.",
                    "O idioma significa ser cuidadoso e económico em pequenas questões, mas esbanjador ou extravagante nas grandes.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Are excellent at managing all finances", false),
                            new AnswerOption("Are careful with small amounts but wasteful with large ones", true),
                            new AnswerOption("Spend money wisely in all aspects", false),
                            new AnswerOption("Always avoid spending money", false)
                    )
            ),
            new QuestionData(
                    "If you 'flog a dead horse', you ___.",
                    "Se você 'flog a dead horse' (chicotear um cavalo morto), você ___.",
                    "To 'flog a dead horse' means to waste effort on something that is impossible to revive or irrelevant.",
                    "Chicotear um cavalo morto significa desperdiçar esforço em algo que é impossível de reviver ou irrelevante.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Revive an old project successfully", false),
                            new AnswerOption("Waste effort on a futile task", true),
                            new AnswerOption("Encourage a tired team member", false),
                            new AnswerOption("Engage in a productive activity", false)
                    )
            ),
            new QuestionData(
                    "When you 'pull strings', you ___.",
                    "Quando você 'pull strings' (puxar cordas), você ___.",
                    "To 'pull strings' means to use influential contacts to gain an unfair advantage.",
                    "Puxar cordas significa usar contactos influentes para obter uma vantagem injusta.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Act without any outside help", false),
                            new AnswerOption("Use influence or contacts to gain an advantage", true),
                            new AnswerOption("Perform surgery carefully", false),
                            new AnswerOption("Follow ethical rules strictly", false)
                    )
            ),
            new QuestionData(
                    "If you 'have two strings to your bow', you have ___.",
                    "Se você 'have two strings to your bow' (ter duas cordas no seu arco), você tem ___.",
                    "To 'have two strings to your bow' means to have more than one way of achieving something.",
                    "Ter duas cordas no seu arco significa ter mais do que uma maneira de alcançar algo.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Only one viable option", false),
                            new AnswerOption("Multiple resources or options available", true),
                            new AnswerOption("A primary and a secondary weapon", false),
                            new AnswerOption("A strong focus on a single goal", false)
                    )
            ),
            new QuestionData(
                    "When a person is 'a pillar of society', they are ___.",
                    "Quando uma pessoa é 'a pillar of society' (um pilar da sociedade), eles são ___.",
                    "A 'pillar of society' is a respected and influential member of a community.",
                    "Um pilar da sociedade é um membro respeitado e influente de uma comunidade.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("A destructive, anti-social individual", false),
                            new AnswerOption("A respected and supportive member of the community", true),
                            new AnswerOption("Someone who is completely isolated", false),
                            new AnswerOption("An expert in architecture", false)
                    )
            ),
            new QuestionData(
                    "If you 'have a chip on your shoulder', you are ___.",
                    "Se você 'have a chip on your shoulder' (ter um cavaco no ombro), você está ___.",
                    "To 'have a chip on your shoulder' means to hold a grudge or be resentful about a past injustice.",
                    "Ter um cavaco no ombro significa guardar rancor ou estar ressentido por uma injustiça passada.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Happy and carefree", false),
                            new AnswerOption("Resentful or holding a grudge over a past wrong", true),
                            new AnswerOption("Trying to carry a heavy load", false),
                            new AnswerOption("Ready to eat a snack", false)
                    )
            ),
            new QuestionData(
                    "When you 'pass muster', you ___.",
                    "Quando você 'pass muster' (passar na revista), você ___.",
                    "To 'pass muster' means to meet the required standard or necessary requirements.",
                    "Passar na revista significa cumprir o padrão exigido ou os requisitos necessários.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Fail to meet expectations", false),
                            new AnswerOption("Just barely meet the required standard", true),
                            new AnswerOption("Avoid inspection completely", false),
                            new AnswerOption("Exceed all required standards", false)
                    )
            ),
            new QuestionData(
                    "If you 'leave someone in the lurch', you ___.",
                    "Se você 'leave someone in the lurch' (deixar alguém na mão), você ___.",
                    "To 'leave someone in the lurch' means to abandon someone in a difficult situation.",
                    "Deixar alguém na mão significa abandonar alguém numa situação difícil.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Provide help in a difficult moment", false),
                            new AnswerOption("Leave someone suddenly when they are in trouble", true),
                            new AnswerOption("Encourage someone to be independent", false),
                            new AnswerOption("Take care of someone completely", false)
                    )
            ),
            new QuestionData(
                    "When you 'bite the hand that feeds you', you ___.",
                    "Quando você 'bite the hand that feeds you' (morder a mão que te alimenta), você ___.",
                    "To 'bite the hand that feeds you' means to turn against a benefactor or someone who helps you.",
                    "Morder a mão que te alimenta significa virar-se contra um benfeitor ou alguém que te ajuda.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Show great gratitude for help received", false),
                            new AnswerOption("Turn against a benefactor", true),
                            new AnswerOption("Help someone who is hungry", false),
                            new AnswerOption("Accept help gracefully", false)
                    )
            ),
            new QuestionData(
                    "If something is 'in the nick of time', it happens ___.",
                    "Se algo é 'in the nick of time' (no último momento), acontece ___.",
                    "To be 'in the nick of time' means to occur just at the last possible moment; barely in time.",
                    "Estar no último momento significa ocorrer exatamente no último momento possível; mal a tempo.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Far too early", false),
                            new AnswerOption("Too late to be useful", false),
                            new AnswerOption("Just at the last possible moment", true),
                            new AnswerOption("With ample time to spare", false)
                    )
            ),
            new QuestionData(
                    "When you 'fight tooth and nail', you ___.",
                    "Quando você 'fight tooth and nail' (lutar com unhas e dentes), você ___.",
                    "To 'fight tooth and nail' means to fight fiercely and with all your effort.",
                    "Lutar com unhas e dentes significa lutar ferozmente e com todo o seu esforço.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Fight very lazily", false),
                            new AnswerOption("Fight with great ferocity and effort", true),
                            new AnswerOption("Avoid any kind of conflict", false),
                            new AnswerOption("Use only minimal force", false)
                    )
            ),
            new QuestionData(
                    "If you are 'taken to the cleaners', you are ___.",
                    "Se você é 'taken to the cleaners' (levado para a lavandaria), você é ___.",
                    "To be 'taken to the cleaners' means to be completely cheated or defeated, especially financially.",
                    "Ser levado para a lavandaria significa ser completamente enganado ou derrotado, especialmente financeiramente.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Given a huge financial bonus", false),
                            new AnswerOption("Completely cheated or financially ruined", true),
                            new AnswerOption("Given a free professional service", false),
                            new AnswerOption("Told the unvarnished truth", false)
                    )
            ),
            new QuestionData(
                    "When you 'blow your own trumpet', you ___.",
                    "Quando você 'blow your own trumpet' (tocar a sua própria trombeta), você ___.",
                    "To 'blow your own trumpet' means to boast or talk proudly about one's own achievements.",
                    "Tocar a sua própria trombeta significa gabar-se ou falar com orgulho sobre as suas próprias conquistas.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Be very modest about your successes", false),
                            new AnswerOption("Speak humbly about your flaws", false),
                            new AnswerOption("Boast about your own achievements", true),
                            new AnswerOption("Play an instrument loudly", false)
                    )
            ),
            new QuestionData(
                    "If you 'keep someone at bay', you ___.",
                    "Se você 'keep someone at bay' (manter alguém à distância), você ___.",
                    "To 'keep someone at bay' means to prevent someone from coming near or from causing a problem.",
                    "Manter alguém à distância significa impedir que alguém se aproxime ou cause um problema.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Allow someone to approach freely", false),
                            new AnswerOption("Encourage someone to come closer", false),
                            new AnswerOption("Prevent someone from coming near or attacking", true),
                            new AnswerOption("Put someone on a boat", false)
                    )
            ),
            new QuestionData(
                    "When you 'cut your teeth on' a task, you ___.",
                    "Quando você 'cut your teeth on' (cortar os dentes em) uma tarefa, você ___.",
                    "To 'cut your teeth on' a task means to gain your first experience of a particular type of work or activity.",
                    "Cortar os dentes numa tarefa significa ganhar a sua primeira experiência num determinado tipo de trabalho ou atividade.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Become highly experienced in it", false),
                            new AnswerOption("Gain your first, often difficult, experience in it", true),
                            new AnswerOption("Avoid the responsibility entirely", false),
                            new AnswerOption("Perform the task flawlessly from the start", false)
                    )
            ),
            new QuestionData(
                    "If you are 'getting on your high horse', you are ___.",
                    "Se você está 'getting on your high horse' (montando no seu cavalo alto), você está ___.",
                    "To be 'getting on your high horse' means to act arrogantly or self-righteously.",
                    "Montar no seu cavalo alto significa agir de forma arrogante ou moralista.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Being very humble and cooperative", false),
                            new AnswerOption("Acting arrogantly or self-importantly", true),
                            new AnswerOption("Riding a very tall horse", false),
                            new AnswerOption("Showing great kindness to others", false)
                    )
            ),
            new QuestionData(
                    "When you 'bury your head in the sand', you ___.",
                    "Quando você 'bury your head in the sand' (enterrar a cabeça na areia), você ___.",
                    "To 'bury your head in the sand' means to ignore an obvious, unpleasant situation, hoping it will go away.",
                    "Enterrar a cabeça na areia significa ignorar uma situação óbvia e desagradável, esperando que ela desapareça.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Face a problem directly", false),
                            new AnswerOption("Confront an issue with courage", false),
                            new AnswerOption("Refuse to acknowledge an obvious problem", true),
                            new AnswerOption("Search meticulously for a hidden solution", false)
                    )
            ),
            new QuestionData(
                    "If you 'have a captive audience', your audience is ___.",
                    "Se você 'have a captive audience' (ter um público cativo), o seu público é ___.",
                    "A 'captive audience' is an audience that is forced to listen to a presentation or performance.",
                    "Um público cativo é um público que é forçado a ouvir uma apresentação ou performance.",
                    DifficultyLevel.ADVANCED, "Idioms",
                    Arrays.asList(
                            new AnswerOption("Free to leave at any moment", false),
                            new AnswerOption("Forced to listen; unable to leave", true),
                            new AnswerOption("Uninterested and unengaged", false),
                            new AnswerOption("Highly enthusiastic and voluntary", false)
                    )
            )

            // FIM
    );

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