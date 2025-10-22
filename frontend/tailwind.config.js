// frontend/tailwind.config.js
/** @type {import('tailwindcss').Config} */
export default {
  content: [
    // ESSENCIAL: Garante que o Tailwind escaneie todos os arquivos React na pasta src
    "./index.html",
    "./src/**/*.{js,ts,jsx,tsx}",
  ],
  theme: {
    extend: {},
  },
  plugins: [],
}
