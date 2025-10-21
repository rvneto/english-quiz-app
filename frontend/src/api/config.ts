// frontend/src/api/config.ts

// Acessa a variável de ambiente que é injetada pelo Docker/Vite
const API_URL = import.meta.env.VITE_REACT_APP_API_URL || 'http://localhost:8080/api/v1';

export const API_BASE_URL = API_URL;

// Exemplo de uso:
// axios.get(`${API_BASE_URL}/quiz/questions`)