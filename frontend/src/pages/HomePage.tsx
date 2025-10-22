// frontend/src/pages/HomePage.tsx

import React, { useState, useEffect } from 'react';
import { useNavigate } from 'react-router-dom';
import { getCategories } from '../api/quizService';
import FilterCard from '../components/FilterCard';
import { Category, DifficultyLevel, QuizFilters } from '../types/quiz';

// Estado inicial com seleções obrigatórias
const initialFilters: QuizFilters = {
    // Valor inicial nulo ou ID da primeira categoria (será definido no useEffect)
    category: null, 
    level: DifficultyLevel.INTERMEDIATE, // Padrão
    quantity: 10, // Padrão
};

const QUANTITY_OPTIONS = [5, 10, 15, 20];

// Exportação nomeada (para contornar problema de cache do Docker)
export const HomePage: React.FC = () => {
    const [categories, setCategories] = useState<Category[]>([]);
    const [filters, setFilters] = useState<QuizFilters>(initialFilters);
    const [isLoading, setIsLoading] = useState(true);
    const navigate = useNavigate();

    // 1. CARREGAR CATEGORIAS DO BACKEND
    useEffect(() => {
        const fetchCategories = async () => {
            try {
                const fetchedCategories = await getCategories();
                setCategories(fetchedCategories);
                
                // Define a primeira categoria como padrão (como no layout)
                if (fetchedCategories.length > 0) {
                    setFilters(prev => ({
                        ...prev,
                        category: fetchedCategories[0].name, // Usamos o nome como filtro
                    }));
                }
            } catch (error) {
                console.error("Erro ao buscar categorias:", error);
                // Tratar erro (ex: setar estado de erro para o usuário)
            } finally {
                setIsLoading(false);
            }
        };
        fetchCategories();
    }, []);
    
    // Handlers
    const handleStartQuiz = () => {
        // Validação básica
        // NOTE: Usando console.error em vez de alert/window.alert devido às regras do ambiente
        if (!filters.category) {
            console.error('Por favor, escolha uma categoria!');
            return;
        }
        
        // Navega para a rota do quiz (FE-3 usará esta rota)
        // Passamos os filtros via state para não expor tudo na URL
        navigate('/quiz', { state: { filters } });
    };

    if (isLoading) {
        return <div className="text-center mt-20">Carregando filtros...</div>;
    }

    return (
        <div className="p-8 max-w-4xl mx-auto">
            {/* Seção Principal (Header) */}
            <header className="text-center mb-12">
                <div className="text-6xl text-indigo-600 mb-4">📖</div>
                <h1 className="text-4xl font-bold text-gray-800">English Practice</h1>
                <p className="text-lg text-gray-500 mt-2">
                    Melhore seu inglês com exercícios personalizados. Escolha um tema e teste seus conhecimentos.
                </p>
            </header>

            {/* 1. Escolha uma Categoria */}
            <section className="mb-10 p-6 bg-white rounded-xl shadow-lg">
                <h2 className="text-xl font-semibold text-indigo-700 mb-4">
                    <span className="mr-2">✨</span> Escolha uma Categoria
                </h2>
                <div className="grid grid-cols-2 md:grid-cols-3 gap-4">
                    {categories.map((cat) => (
                        <FilterCard
                            key={cat.id}
                            title={cat.name}
                            subtitle={cat.description}
                            icon={null} // Ícones serão CSS/SVG para o MVP
                            isSelected={filters.category === cat.name}
                            onClick={() => setFilters({ ...filters, category: cat.name })}
                            styleType='category'
                        />
                    ))}
                </div>
            </section>

            {/* 2. Nível de Dificuldade */}
            <section className="mb-10 p-6 bg-white rounded-xl shadow-lg">
                <h2 className="text-xl font-semibold text-indigo-700 mb-4">
                    <span className="mr-2">🧠</span> Nível de Dificuldade
                </h2>
                <div className="grid grid-cols-3 gap-4">
                    {Object.values(DifficultyLevel).map(level => (
                        <FilterCard
                            key={level}
                            title={level.charAt(0).toUpperCase() + level.slice(1).toLowerCase()} // Formatação simples: Beginner
                            subtitle={level === DifficultyLevel.BEGINNER ? "Conceitos básicos" : level === DifficultyLevel.INTERMEDIATE ? "Estruturas complexas" : "Linguagem sofisticada"}
                            isSelected={filters.level === level}
                            onClick={() => setFilters({ ...filters, level: level })}
                            styleType='level'
                        />
                    ))}
                </div>
            </section>
            
            {/* 3. Quantidade de Exercícios */}
            <section className="mb-10 p-6 bg-white rounded-xl shadow-lg">
                <h2 className="text-xl font-semibold text-indigo-700 mb-4">
                    <span className="mr-2">⏱️</span> Quantidade de Exercícios
                </h2>
                <div className="grid grid-cols-4 gap-4">
                    {QUANTITY_OPTIONS.map(qty => (
                        <FilterCard
                            key={qty}
                            title={String(qty)}
                            subtitle="exercícios"
                            isSelected={filters.quantity === qty}
                            onClick={() => setFilters({ ...filters, quantity: qty })}
                            styleType='quantity'
                        />
                    ))}
                </div>
            </section>

            {/* Botão de Começar */}
            <div className="text-center">
                <button
                    onClick={handleStartQuiz}
                    className="bg-indigo-600 hover:bg-indigo-700 text-white font-bold py-3 px-8 rounded-full shadow-lg transition-all"
                >
                    <span className="mr-2">▶️</span> Começar Exercícios
                </button>
            </div>
        </div>
    );
};
