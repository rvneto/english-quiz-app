# frontend/Dockerfile (Atualizado)

FROM nginx:alpine

WORKDIR /usr/share/nginx/html

RUN rm /etc/nginx/conf.d/default.conf

# Copia os dois ficheiros HTML
COPY index.html .
COPY quiz.html .  

# Copia a configuração do Nginx
COPY nginx/nginx.conf /etc/nginx/conf.d/default.conf

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]