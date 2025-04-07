# Usa uma imagem base com Java 17
FROM eclipse-temurin:17-jdk-alpine

# Cria um diretório dentro do container
WORKDIR /app

# Copia o .jar para o container
COPY producao app.jar

# Expõe a porta (Render cuida disso com a variável PORT)
EXPOSE 8080

# Comando para rodar o app
CMD ["java", "-jar", "app.jar"]
