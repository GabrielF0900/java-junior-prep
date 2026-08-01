# ☕ Java Junior Prep

Repositório pessoal de estudos e prática para preparação em vagas Java Júnior. Reúne exercícios comentados de Java Core, Estrutura de Dados e Algoritmos, Testes Unitários (JUnit/Mockito) e SQL, organizados por trilha e semana, seguindo um plano de 12 semanas com revisão ativa via Técnica de Feynman.

## 📖 Sobre o Projeto

Este repositório é o espaço de **prática** de um plano de estudos estruturado de 12 semanas, focado em preparação para entrevistas técnicas de Java Júnior no mercado brasileiro. O conteúdo cobre: Java Core (fundamentos da linguagem), DSA (estrutura de dados e algoritmos), Testes (JUnit 5 + Mockito) e SQL. O objetivo principal não é apenas resolver problemas, mas conseguir **explicar** cada solução em voz alta (usando a Técnica de Feynman), simulando a comunicação exigida em uma entrevista técnica real.

## 🗂️ Estrutura do Projeto

```text
java-junior-prep/
├── pom.xml
├── README.md
└── src/
    ├── main/java/br/com/gabrielfalcao/prep/
    │   ├── javacore/
    │   │   ├── semana1/
    │   │   │   ├── ColecoesExemplo.java
    │   │   │   └── EqualsEHashing.java
    │   │   └── semana2/
    │   │       └── StreamsExemplo.java
    │   └── dsa/
    │       ├── semana1/
    │       │   ├── ContainsDuplicate.java
    │       │   └── TwoSum.java
    │       └── semana2/
    │           └── ValidParentheses.java
    └── test/java/br/com/gabrielfalcao/prep/
        └── testes/
            ├── semana1/
            │   └── SafeWalletServiceTest.java
            └── SanityCheckTest.java
```

- **`javacore/`**: Exercícios focados em fundamentos da linguagem Java (Coleções, Streams, etc).
- **`dsa/`**: Problemas focados em Estruturas de Dados e Algoritmos.
- **`testes/`**: Testes unitários para validar a lógica e praticar JUnit 5 e Mockito.
- **`sql/`**: (Futuro) Scripts e exercícios de consultas a banco de dados relacionais.

## 💻 Tecnologias

- Java 17
- Maven
- JUnit 5
- Mockito

*Ambiente de desenvolvimento utilizado: Google Antigravity IDE.*

## 🚀 Como Rodar o Projeto

Para compilar o código fonte, execute:
```bash
mvn compile
```

Para rodar os testes unitários (isso executa todos os testes unitários das trilhas de Testes), execute:
```bash
mvn test
```

## 📅 Organização por Semana

| Semana | Conteúdo |
|--------|----------|
| Semana 1 | Java Core: `EqualsEHashing`, `ColecoesExemplo` <br> DSA: `TwoSum`, `ContainsDuplicate` <br> Testes: `SafeWalletServiceTest`, `SanityCheckTest` |
| Semana 2 | Java Core: `StreamsExemplo` <br> DSA: `ValidParentheses` |

## ✍️ Sobre o Autor

Gabriel Falcão da Cruz — Desenvolvedor Backend Java, estudante de Sistemas de Informação, certificado AWS SAA-C03.
