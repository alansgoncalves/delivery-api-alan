# Delivery Tech API

Sistema de delivery desenvolvido com Spring Boot e Java 21.

## 🚀 Tecnologias

- **Java 21 LTS** (versão mais recente)
- Spring Boot 3.2.x
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## ⚡ Recursos Modernos Utilizados

- Records (Java 14+)
- Text Blocks (Java 15+)
- Pattern Matching (Java 17+)
- Virtual Threads (Java 21)

## 🏃‍♂️ Como executar

1. **Pré-requisitos:** JDK 21 instalado
2. Clone o repositório: `git clone git@github.com:alansgoncalves/delivery-api-alan.git`
3. Navegue até a pasta do projeto: `cd delivery-api-alan`
4. Execute: `./mvn spring-boot:run` (Linux/Mac) ou `mvnw.cmd spring-boot:run` (Windows)
5. Acesse: http://localhost:8080/health

## 📋 Endpoints

| Método | Endpoint    | Descrição                                |
| ------ | ----------- | ---------------------------------------- |
| GET    | /health     | Status da aplicação (inclui versão Java) |
| GET    | /info       | Informações da aplicação                 |
| GET    | /h2-console | Console do banco H2 (habilitado em dev)  |

## 🔧 Configuração

- Porta: 8080
- Banco: H2 em memória (JDBC URL: `jdbc:h2:mem:deliverydb`)
- Profile: development
- Acesso H2 Console: http://localhost:8080/h2-console
  - JDBC URL: `jdbc:h2:mem:deliverydb`
  - Usuário: `sa`
  - Senha: (vazia)

## 👨‍💻 Desenvolvedor

Alan Gonçalves - Turma TI 27 - Arquitetura de Sistemas (noite)
Desenvolvido com **JDK 21** e **Spring Boot 3.5.x**
