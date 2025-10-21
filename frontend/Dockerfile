# --- Stage 1: Build (Compilação do React) ---
FROM node:20-alpine AS build

WORKDIR /app

# Copia package.json e instala dependências (otimiza o cache)
COPY package.json .
# CUIDADO: Se você usar 'yarn' ou outra ferramenta, ajuste aqui.
# No FE-1 criaremos o package.json
RUN npm install

# Copia o código-fonte
COPY . .

# Variável de ambiente para a URL da API (definida no docker-compose)
ARG VITE_REACT_APP_API_URL
ENV VITE_REACT_APP_API_URL=$VITE_REACT_APP_API_URL

# Roda o build (Vite/React gera a pasta 'dist')
RUN npm run build 

# --- Stage 2: Serve (Servir com Nginx) ---
FROM nginx:alpine AS final

# Remove o arquivo de configuração default do Nginx
RUN rm /etc/nginx/conf.d/default.conf

# Copia a pasta de build (dist) do Stage 1 para o diretório de serviço do Nginx
# Se o seu build gerar pasta 'build', mude '/app/dist' para '/app/build'
COPY --from=build /app/dist /usr/share/nginx/html

# Copia a configuração customizada do Nginx
COPY nginx/nginx.conf /etc/nginx/conf.d/default.conf

# Porta padrão de acesso HTTP
EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]