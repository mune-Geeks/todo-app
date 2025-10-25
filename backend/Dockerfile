# ==== Java 25 の開発用コンテナ ====
FROM eclipse-temurin:25-jdk

# コンテナ内の作業ディレクトリ
WORKDIR /app

# 依存関係を先にキャッシュ（Maven Wrapper使用）
COPY .mvn/ .mvn/
COPY mvnw pom.xml ./
RUN ./mvnw -q -DskipTests dependency:go-offline

# ソースコードは docker-compose の volume でマウントされるので COPY 不要

# ポート設定
EXPOSE 8080 5005

# Spring Boot の設定
ENV SPRING_PROFILES_ACTIVE=dev
ENV JAVA_TOOL_OPTIONS="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005"

# 開発モードでアプリを起動（ホットリロード対応）
CMD ["./mvnw", "-q", "-Dspring-boot.run.fork=true", "spring-boot:run"]
