// frontend/src/types/quiz.ts

// Enum para o Nível de Dificuldade (corresponde ao ENUM Java)
export enum DifficultyLevel {
    BEGINNER = 'BEGINNER',
    INTERMEDIATE = 'INTERMEDIATE',
    ADVANCED = 'ADVANCED',
}

// Interface para as Categorias (Consumida do GET /categories)
export interface Category {
    id: string;
    name: string; // Ex: Grammar, Vocabulary
    description: string; // Explicação breve
    // Opcional: Adicionar um ícone/emoji para refletir o layout
}

// Estado de configuração que a Home Page gerencia
export interface QuizFilters {
    category: string | null; // ID ou Nome da categoria selecionada
    level: DifficultyLevel;
    quantity: number;
}