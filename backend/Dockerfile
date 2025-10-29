# Stage 1: Build (Ambiente de Compilação)
# Altera para Java 21 JDK
FROM eclipse-temurin:21-jdk-jammy AS build
WORKDIR /app

RUN apt-get update && apt-get install -y dos2unix

# Copia os arquivos de configuração essenciais
COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn
COPY src src

RUN dos2unix ./mvnw

RUN chmod +x ./mvnw

# Compila e empacota o JAR do Spring Boot
RUN ./mvnw package -DskipTests

# Stage 2: Run (Ambiente de Execução)
# Altera para Java 21 JRE para o runtime final
FROM eclipse-temurin:21-jre-jammy
WORKDIR /app

# Copia o JAR compilado da Stage 1
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]