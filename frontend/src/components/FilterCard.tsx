// frontend/src/components/FilterCard.tsx

import React from 'react';

interface FilterCardProps {
    title: string;
    subtitle: string;
    icon?: React.ReactNode; // Para os ícones da categoria
    isSelected: boolean;
    onClick: () => void;
    // Estilo (simplificado, mas você usará CSS/Tailwind)
    styleType: 'category' | 'level' | 'quantity'; 
}

const FilterCard: React.FC<FilterCardProps> = ({ title, subtitle, icon, isSelected, onClick, styleType }) => {
    
    // Estilos dinâmicos para refletir o layout
    const baseStyle = "p-4 border rounded-lg cursor-pointer transition-all duration-200 text-center";
    const selectedStyle = "border-4 border-indigo-500 bg-indigo-50 shadow-lg";
    const defaultStyle = "border-gray-200 bg-white hover:border-indigo-300";

    return (
        <div 
            className={`${baseStyle} ${isSelected ? selectedStyle : defaultStyle}`}
            onClick={onClick}
        >
            {icon && <div className="text-3xl mx-auto mb-2">{icon}</div>}
            <h3 className="font-semibold text-lg">{title}</h3>
            <p className="text-sm text-gray-500">{subtitle}</p>
            
            {/* O SELECIONADO roxo que aparece no layout */}
            {isSelected && (
                <div className="mt-2 text-xs font-bold text-indigo-700">
                    Selecionado
                </div>
            )}
        </div>
    );
};

export default FilterCard;