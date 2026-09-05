# ☕ Java Junior Prep

Repositório pessoal de Gabriel Falcão da Cruz para preparação em vagas Java
Júnior. Reúne prática de Java Core, estruturas de dados e algoritmos (DSA),
testes e materiais de estudo, seguindo um plano geral de 12 semanas.

A aprendizagem usa Active Recall e Técnica de Feynman: prever, implementar,
executar e explicar. Um arquivo existente ou um build bem-sucedido não significa
que o exercício esteja pedagogicamente concluído. Não criar soluções ou semanas
antecipadamente.

## Tecnologias e execução

- Java 17; pacote-base `br.com.gabrielfalcao.prep`.
- Maven, em um único projeto.
- JUnit Jupiter 5.10.0 e Mockito 5.5.0, disponíveis para testes.
- IDE principal: Google Antigravity.

Na raiz, com JDK 17 e Maven configurados:

```bash
mvn compile
mvn test
```

O teste implementado atualmente é `SanityCheckTest`, com uma asserção aritmética.
Não existem testes específicos dos desafios nem uso de Mockito nos fontes atuais.
`target/` e `.m2/` são saídas/cache locais ignorados pelo Git, não conteúdo de estudo.

## Responsabilidades

| Local | Finalidade |
| --- | --- |
| `src/main/java/br/com/gabrielfalcao/prep/javacore/` | Fundamentos da linguagem e APIs: igualdade, String Pool, hashing e coleções. |
| `src/main/java/br/com/gabrielfalcao/prep/dsa/` | Desafios algorítmicos, como Two Sum e Contains Duplicate, organizados por semana. |
| `src/test/` | Testes dos exercícios e trilha de estudo de JUnit/Mockito. |
| `materiais/` | Conteúdo teórico de estudo, separado por trilha e semana. |
| `relatorios/` | Registros de tentativas, resultados e explicações de aprendizagem, por trilha e semana. |
| `sql/` | Área para exercícios e scripts SQL, criada gradualmente conforme o calendário. |
| `docs/` | Documentação de arquitetura, incluindo a fotografia anterior à reorganização. |
| `index.html` | Calendário/hub e fonte de verdade dos tópicos e semanas. Inclui também Inglês e Storytelling. |
| `HISTORICO_ESTUDOS.md` | Continuidade das sessões, pontos de retomada e registros históricos. |
| `AGENTS.md` | Regras pedagógicas e de colaboração. |
| `docs/RELATORIO_REORGANIZACAO.md` | Movimentações e validações da limpeza arquitetural. |

O hub pode ser aberto no navegador. Salva progresso localmente e referencia uma
API `/api/progress` cuja implementação não está neste repositório. Sua interface
HTML é independente do build Maven.

## Estado dos estudos

- Java Core semana 1: seis exercícios pedagógicos preservados, incluindo os
  experimentos atuais do exercício 01 e `Produto.java`. A separação interna dos
  assuntos e as correções conceituais ficam para revisões pedagógicas.
- Java Core semana 2: `StreamsExemplo.java` permanece reservado, sem implementação.
- DSA semana 1: `TwoSum.java` preserva a implementação do estudante;
  `ContainsDuplicate.java` é somente uma classe vazia.
- DSA semana 4: `ValidParentheses.java` permanece somente com package e TODO,
  alinhado ao calendário de Stack / Queue.
- Testes: `SanityCheckTest.java` permanece geral; `SafeWalletServiceTest.java`
  está reservado na semana 2, sem classe de teste implementada.
- SQL: somente orientações em `sql/README.md`; ainda não há scripts.

O plano geral dura 12 semanas; Java Core ocupa seis semanas no hub. A numeração
dos tópicos não equivale à semana: por exemplo, Java Core 1.3 está na semana 2.
Os registros históricos não devem ser reescritos para simular avanço do estudante.

## Estrutura real

A árvore abaixo lista os arquivos de estudo e documentação presentes. Pastas de
Git, cache, build e IDE não fazem parte deste desenho pedagógico.

```text
java-junior-prep/
├── docs/
│   ├── ARQUITETURA_REPOSITORIO_ANTES_DA_REORGANIZACAO.md
│   └── RELATORIO_REORGANIZACAO.md
├── materiais/
│   └── javacore/
│       └── semana1/
│           ├── colecoes_java_pdf.html
│           ├── guia-completo-string-pool-java17.html
│           └── guia-completo-string-pool-java17.pdf
├── relatorios/
│   ├── dsa/
│   │   └── semana1/
│   │       └── two-sum.md
│   └── javacore/
│       └── semana1/
│           ├── laboratorio-01-igualdade-referencias.html
│           └── laboratorio-01-igualdade-referencias.pdf
├── sql/
│   └── README.md
├── src/
│   ├── main/
│   │   └── java/
│   │       └── br/
│   │           └── com/
│   │               └── gabrielfalcao/
│   │                   └── prep/
│   │                       ├── dsa/
│   │                       │   ├── semana1/
│   │                       │   │   ├── ContainsDuplicate.java
│   │                       │   │   └── TwoSum.java
│   │                       │   └── semana4/
│   │                       │       └── ValidParentheses.java
│   │                       └── javacore/
│   │                           ├── semana1/
│   │                           │   ├── exercicio01igualdadedereferencias/
│   │                           │   │   ├── Exercicio01IgualdadeDeReferencias.java
│   │                           │   │   └── Produto.java
│   │                           │   ├── exercicio02stringpool/
│   │                           │   │   └── Exercicio02StringPool.java
│   │                           │   ├── exercicio03equalsehashcode/
│   │                           │   │   └── Exercicio03EqualsEHashCode.java
│   │                           │   ├── exercicio04listas/
│   │                           │   │   └── Exercicio04Listas.java
│   │                           │   ├── exercicio05sets/
│   │                           │   │   └── Exercicio05Sets.java
│   │                           │   └── exercicio06maps/
│   │                           │       └── Exercicio06Maps.java
│   │                           └── semana2/
│   │                               └── StreamsExemplo.java
│   └── test/
│       └── java/
│           └── br/
│               └── com/
│                   └── gabrielfalcao/
│                       └── prep/
│                           └── testes/
│                               ├── semana2/
│                               │   └── SafeWalletServiceTest.java
│                               └── SanityCheckTest.java
├── .gitignore
├── AGENTS.md
├── HISTORICO_ESTUDOS.md
├── index.html
├── pom.xml
└── README.md
```

## Materiais e continuidade

- [Guia de coleções](materiais/javacore/semana1/colecoes_java_pdf.html).
- [Guia de String Pool](materiais/javacore/semana1/guia-completo-string-pool-java17.html).
- [Relatório do laboratório 01](relatorios/javacore/semana1/laboratorio-01-igualdade-referencias.html).
- [Two Sum: roteiro e duas tentativas preservadas](relatorios/dsa/semana1/two-sum.md).
- [Arquitetura anterior](docs/ARQUITETURA_REPOSITORIO_ANTES_DA_REORGANIZACAO.md).
- [Relatório da reorganização](docs/RELATORIO_REORGANIZACAO.md).
- [Histórico de estudos](HISTORICO_ESTUDOS.md).

Gabriel Falcão da Cruz — estudante de Sistemas de Informação e certificado AWS SAA-C03.
