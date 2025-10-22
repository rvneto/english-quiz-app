// frontend/src/api/config.ts

export const API_BASE_URL = import.meta.env.VITE_API_BASE_URL || 'http://localhost:8080/api/v1';

// Exemplo de uso:
// axios.get(`${API_BASE_URL}/quiz/questions`)