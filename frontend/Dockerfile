# STAGE 1: Build da Aplicação
FROM node:20-alpine AS build

WORKDIR /app

# Adiciona um marcador de versão para invalidar o cache em caso de mudanças
RUN echo "build_v1.2_tailwind_fix" > .docker_version

# Instala dependências
COPY package.json .
COPY package-lock.json .
RUN npm install --legacy-peer-deps

# Copia arquivos de código e configuração ESSENCIAIS para o BUILD
# Estes são os arquivos de configuração do Tailwind e PostCSS
COPY .env .
COPY index.html .
COPY vite.config.ts .
COPY tsconfig.json .
COPY tsconfig.app.json .
COPY tsconfig.node.json .
COPY tailwind.config.js .
COPY postcss.config.js .

# Copia o código-fonte (incluindo o src/index.css e src/App.tsx)
COPY src /app/src

# O comando de build do Vite gera a pasta 'dist'
# Agora o build vai rodar, pois os arquivos de configuração foram copiados ANTES
RUN npm run build


# STAGE 2: Servindo com Nginx
FROM nginx:alpine AS final

# Remove a configuração padrão do Nginx
RUN rm /etc/nginx/conf.d/default.conf

# Copia o conteúdo estático (a pasta 'dist') do stage de build
# para o diretório de serviço do Nginx
COPY --from=build /app/dist /usr/share/nginx/html

# Copia a configuração personalizada do Nginx (que corrigimos antes)
COPY nginx/nginx.conf /etc/nginx/conf.d/default.conf

# O Nginx expõe a porta 80 por padrão, não precisa de EXPOSE, mas não faz mal:
# EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
