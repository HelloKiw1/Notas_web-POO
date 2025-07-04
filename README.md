# Aplicação de Anotações

Uma aplicação simples para armazenar anotações, permitindo adicionar e remover anotações de um quadro interativo. O sistema é construído com Spring Boot e utiliza banco de dados em memória para facilitar o desenvolvimento e testes.

> Esta aplicação é a entrega de um **trabalho final da disciplina de Programação Orientada a Objetos (POO)**, do curso de Ciência da Computação da **Universidade Federal do Tocantins (UFT) - 2025.1**.


## Como executar

Na pasta raiz do projeto, execute:

```bash
# Instala as dependências
mvnd clean install

# Inicia a aplicação
mvnd spring-boot:run
```

Caso o comando `mvnd` não funcione, instale o Maven Daemon (mvnd) ou utilize `mvn` no lugar.

## Links para acessar

| Recurso                 | URL                                      |
|-------------------------|------------------------------------------|
| [Acessar Home](http://localhost:8080/notes)            | http://localhost:8080/notes              |
| [Acessar Banco de Dados](http://localhost:8080/h2-console)  | http://localhost:8080/h2-console         |

## Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database (banco em memória)
- Maven Daemon (mvnd)

## Funcionalidades

- CRUD completo para a entidade User (Criar, Consultar, Atualizar, Remover)
- Estrutura organizada em camadas: Repository, Service, Resource (Controller)
- Tratamento de exceções com classe personalizada e handler global
- Banco H2 configurado para o perfil de testes

## Desenvolvedores
- [Samara Coelho](https://github.com/SamaraCdS-UFT)
- [HelloKiw1](https://github.com/HelloKiw1)