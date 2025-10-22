// frontend/src/api/quizService.ts

import axios from 'axios';
import { API_BASE_URL } from './config';
import { Category, QuizFilters } from '../types/quiz';

// Endpoint para buscar a lista de categorias
export const getCategories = async (): Promise<Category[]> => {
    // Usaremos '/categories' porque o Nginx Proxy no Docker já roteia '/api/v1'
    const response = await axios.get<Category[]>(`${API_BASE_URL}/categories`);
    return response.data;
};

// Endpoint para buscar as perguntas (para FE-3, mas já deixamos o tipo pronto)
export const getQuestions = async (filters: QuizFilters) => {
    // O Backend espera: category (nome), level (string do ENUM), limit (number)
    const response = await axios.get(`${API_BASE_URL}/quiz/questions`, {
        params: {
            category: filters.category,
            level: filters.level,
            limit: filters.quantity,
        },
    });
    return response.data;
};