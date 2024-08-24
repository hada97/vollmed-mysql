# Usar uma imagem base do OpenJDK
FROM openjdk:17-jdk-slim

# Criar um diretório de trabalho dentro do container
WORKDIR /app

# Copiar o arquivo JAR para o diretório de trabalho
COPY target/vollmed_api.jar /app/vollmed_api.jar

# Expor a porta em que a aplicação vai rodar
EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "vollmed_api.jar"]
