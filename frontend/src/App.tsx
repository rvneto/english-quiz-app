// frontend/src/App.tsx
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
// Alterado para importação nomeada para corresponder ao novo formato de exportação de HomePage
import { HomePage } from './pages/HomePage';
// import QuizPage from './pages/QuizPage'; // Vamos criar no FE-3
// import ResultsPage from './pages/ResultsPage'; // Vamos criar depois

function App() {
  return (
    <Router>
      <div className="min-h-screen bg-gray-50">
        <Routes>
          <Route path="/" element={<HomePage />} />
          {/* Rotas futuras */}
          {/* <Route path="/quiz" element={<QuizPage />} /> */}
          {/* <Route path="/results" element={<ResultsPage />} /> */}
        </Routes>
      </div>
    </Router>
  );
}

export default App;
