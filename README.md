# 💼 Sistema de Caixa para Loja

Este projeto consiste em um sistema de caixa para uma loja, desenvolvido utilizando **Spring Boot** seguindo a arquitetura **MVC**. O objetivo é fornecer uma solução eficiente para gerenciamento de vendas e controle financeiro.

## ✨ Tecnologias Utilizadas

- **Java** (Spring Boot)
- **Spring MVC**
- **PostgreSQL** (Banco de dados)
- **JPA/Hibernate**
- **Swagger** (Documentação da API)
- **Lombok**

## ⚡ Funcionalidades

- Registro de vendas e produtos
- Controle de estoque
- Cadastro de clientes
- Geração de relatórios de vendas
- Autenticação e autorização de usuários

## ⚙ Configuração e Execução

1. Clone o repositório:
   ```sh
   git clone https://github.com/RobertoSantos98/comercio.git
   ```

2. Configure o banco de dados PostgreSQL no arquivo `application.properties`:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   ```

3. Execute o projeto:
   ```sh
   mvn spring-boot:run
   ```

4. Acesse a documentação da API via Swagger:
   ```
   http://localhost:8080/swagger-ui.html
   ```

## 📈 Roadmap
- [ ] Implementação de testes automatizados
- [ ] Implementação de um painel administrativo web

## ✅ Contribuição
Sinta-se à vontade para abrir issues e enviar PRs com melhorias ou novas funcionalidades!

