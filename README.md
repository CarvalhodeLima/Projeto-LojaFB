Grupo: Felipe Bezerra, Claudio Gabriel

# Projeto Loja

Sistema de gerenciamento de uma loja virtual, desenvolvido em Java, utilizando Maven para gerenciamento de dependências e MySQL como banco de dados

## Funcionalidades

- Lista, cadastra, atualiza e remove produtos com um usuário vendedor.
- Visualiza produtos se for um cliente.
- Registro e consulta de pedidos.
- Conexão com banco de dados MySQL via JDBC.

## Sistemas usados

- Java 17+
- Maven
- MySQL
- JDBC

## Como executar

1. Clone o repositório
2. Configure o banco de dados e execute o script `BancoLoja.sql` que está em src/main/resources
3. Compile o projeto: `mvn clean install` 
4. Execute: `mvn exec:java`

 Todas as dependências já estão inclusas em `pom.xml` 
 Confirme se o MySQL está ativo e utilize a senha `1234` para acessar o servidor

