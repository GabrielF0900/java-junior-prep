# Histórico de estudos — Java Junior Prep

## Finalidade deste arquivo

Este documento é o ponto de continuidade das sessões práticas de Gabriel
Falcão da Cruz. Ele registra o que estamos estudando, as decisões tomadas, o
que já foi feito, as dificuldades encontradas, o ponto exato de parada e a
próxima ação.

O `index.html` continua sendo a fonte de verdade do calendário. O `AGENTS.md`
continua sendo a fonte de verdade do método de ensino e das regras do projeto.
Este arquivo não substitui nenhum dos dois; ele registra o andamento real.

## Protocolo obrigatório de encerramento

Toda vez que Gabriel for sair, ele dirá explicitamente que irá sair.

Após esse aviso, o assistente deverá revisar o histórico disponível da
conversa e o estado atual dos arquivos do projeto. Antes de encerrar, deverá
atualizar este documento com:

1. data da atualização;
2. assuntos trabalhados na sessão;
3. arquivos criados ou modificados;
4. decisões tomadas;
5. o que Gabriel acertou;
6. erros, dúvidas ou lacunas identificadas;
7. validações executadas e seus resultados;
8. ponto exato em que o estudo parou;
9. próxima atividade combinada.

Na sessão seguinte, este arquivo deverá ser consultado para que o estudo seja
retomado do ponto registrado, sem reiniciar exercícios concluídos e sem
antecipar tópicos futuros.

## Objetivo atual

Consolidar na prática os assuntos já estudados da semana 1 de Java Core:

- **1.1 — Igualdade e Hashing**;
- **1.2 — Coleções na prática**.

O objetivo não é receber soluções prontas. Gabriel escreverá o código, fará
previsões, testará, corrigirá e explicará o raciocínio como faria em uma
entrevista para Desenvolvedor Java Júnior.

Não avançaremos para **1.3 — Streams e Lambdas** até que o momento correto seja
confirmado pelo calendário ou por Gabriel.

## Método de estudo combinado

O bloco de estudo usará aproximadamente:

- 20% para recuperação ativa da teoria;
- 80% para implementação, testes, correção e explicação.

O ciclo de cada exercício será:

1. ler o problema;
2. reescrevê-lo com as próprias palavras;
3. dividir o problema em partes menores;
4. pesquisar apenas as dúvidas específicas reveladas pela decomposição;
5. prever resultados antes da execução;
6. realizar a primeira tentativa sem solução pronta;
7. executar e testar;
8. revisar com dicas progressivas;
9. analisar Big O quando pertinente;
10. finalizar com uma explicação Feynman;
11. registrar a avaliação em Markdown.

As dicas deverão avançar gradualmente:

1. pergunta orientadora;
2. indicação do conceito ou estrutura;
3. pseudocódigo ou esqueleto incompleto;
4. solução completa somente após tentativa ou pedido explícito.

Todas as perguntas, alternativas e opções apresentadas a Gabriel deverão ser
escritas em português.

## Separação das trilhas

Os exercícios atuais pertencem a Java Core. Exercícios como Contains
Duplicate, Two Sum e Valid Anagram pertencem a DSA, mesmo quando usam
`HashSet` ou `HashMap`.

LeetCode poderá complementar a prática posteriormente, mas não substituirá os
laboratórios de Java Core sobre igualdade, hashing e funcionamento das
coleções.

## Organização criada para a semana 1

Cada exercício possui uma pasta própria. O arquivo Java contém apenas:

- declaração do pacote;
- declaração da classe vazia;
- comentários com o objetivo, o problema, a decomposição, perguntas de
  pesquisa e os critérios de entrega.

Não foi fornecido código-base nem solução parcial.

Sequência atual:

1. `exercicio01igualdadedereferencias/Exercicio01IgualdadeDeReferencias.java`;
2. `exercicio02stringpool/Exercicio02StringPool.java`;
3. `exercicio03equalsehashcode/Exercicio03EqualsEHashCode.java`;
4. `exercicio04listas/Exercicio04Listas.java`;
5. `exercicio05sets/Exercicio05Sets.java`;
6. `exercicio06maps/Exercicio06Maps.java`.

Todos estão dentro de:

```text
src/main/java/br/com/gabrielfalcao/prep/javacore/semana1/
```

## Relatório individual de cada exercício

O relatório de avaliação não será criado antecipadamente. Depois que Gabriel
concluir um exercício, será criado um arquivo `.md` dentro da mesma pasta,
baseado no código e nas explicações realmente apresentados.

Cada relatório individual deverá conter:

- resumo da abordagem adotada;
- o que Gabriel acertou;
- ponto principal a corrigir;
- explicação do motivo da correção;
- melhorias secundárias relevantes;
- dica progressiva utilizada;
- testes normais, casos-limite e erros pertinentes;
- análise de tempo e espaço, quando aplicável;
- abordagem alternativa e seus custos;
- explicação Feynman;
- nota dividida por critérios;
- lacunas que precisam de revisão posterior.

## Avaliação do código anterior à reorganização

Antes da limpeza, os arquivos continham anotações e experimentos iniciais.
Foram identificados os seguintes pontos:

### Acertos

- reconhecimento de métodos importantes de `ArrayList`;
- identificação de vários custos de operações;
- distinção inicial entre `List`, `Deque` e `LinkedList`;
- compreensão inicial de que `==` possui comportamentos diferentes conforme o
  tipo comparado.

### Pontos para revisão

- `String` não é um tipo primitivo;
- em objetos, `==` compara referências, não igualdade lógica;
- sobrescrever `hashCode()` retornando sempre zero respeita parte do contrato,
  mas prejudica fortemente o desempenho e não demonstra uma implementação
  adequada;
- os experimentos precisam registrar previsão, resultado observado e
  explicação;
- a notação correta de complexidade é `O(1)`, e não `0(1)`.

Os antigos arquivos de Java Core da semana 1 foram removidos com autorização
de Gabriel e substituídos pela sequência atual. Arquivos de DSA, Testes e Java
Core da semana 2 foram preservados.

## Validações já realizadas

Após a reorganização:

- `mvn compile`: executado com sucesso;
- `mvn test`: executado com sucesso;
- testes executados: 1;
- falhas: 0;
- erros: 0.

O Maven apresentou um aviso recomendando `--release 17` no lugar da combinação
de `-source 17` e `-target 17`. Esse aviso não impediu a compilação e o
`pom.xml` não foi alterado, pois isso não é necessário para os exercícios
atuais.

## Estado atual — 12/08/2026

O ambiente dos exercícios está preparado e validado. Nenhum exercício foi
implementado ainda.

### Ponto exato de parada

Estamos no início do **Exercício 01 — Igualdade de valores e de referências**.

Gabriel deve abrir `Exercicio01IgualdadeDeReferencias.java` e realizar somente
o primeiro passo da decomposição: escrever, em comentário e com suas próprias
palavras, como entendeu o problema.

### Próxima ação

Depois dessa escrita, o assistente revisará a compreensão do problema antes de
Gabriel começar a implementação. A revisão deverá dar apenas a menor orientação
necessária para permitir o próximo passo.

## Registro cronológico

### 12/08/2026 — Preparação do ambiente prático

- As instruções do `AGENTS.md` foram lidas e adotadas.
- O calendário de Java Core 1.1 e 1.2 foi conferido no `index.html`.
- Foi confirmado que Gabriel já estudou a teoria desses dois tópicos.
- Foi definida a proporção aproximada de 20% de revisão e 80% de prática.
- Foi esclarecida a separação entre Java Core e DSA.
- Os arquivos antigos da semana 1 foram avaliados antes da limpeza.
- A primeira estrutura criada continha código-base e não correspondia à
  intenção de Gabriel.
- Após a correção do entendimento, os exercícios foram separados em pastas e
  ficaram sem código-base.
- A nova estrutura compilou e os testes existentes passaram.
- O estudo ficou preparado para começar pelo exercício 01.
