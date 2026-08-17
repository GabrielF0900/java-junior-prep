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

O **Exercício 01 — Igualdade de valores e de referências** foi implementado e
executado. Gabriel concluiu a decomposição, registrou previsões e comparou o
comportamento de `==` em valores primitivos e em referências.

Gabriel apresentou corretamente a explicação Feynman principal, identificando
dois objetos, três variáveis de referência, duas instâncias distintas e a cópia
da referência em `c = a`. O exercício ainda não deve ser marcado como concluído:
falta apenas Gabriel reconstruir corretamente, com suas palavras, o caso-limite
em que duas referências são `null`. O relatório individual ainda não foi
criado, pois depende desse último fechamento.

### Ponto exato de parada

O código executável do Exercício 01 está pronto. Ele demonstra:

- dois primitivos com valores iguais, cujo resultado com `==` é `true`;
- dois primitivos com valores diferentes, cujo resultado é `false`;
- duas referências para instâncias distintas de `Pessoa`, cujo resultado é
  `false`;
- duas variáveis que referenciam a mesma instância de `Pessoa`, cujo resultado
  é `true`.

Gabriel demonstrou compreender que cada execução de `new Pessoa()` cria uma
instância e que uma atribuição como `terceiraPessoa = primeiraPessoa` copia a
referência, não o objeto. Também explicou corretamente por que `a == b` é
`false` para instâncias distintas e por que `a == c` é `true` após `c = a`.
Ainda precisa consolidar uma linguagem precisa, preferindo “mesma instância” ou
“mesmo objeto” a “mesmo endereço de memória”.

### Próxima ação

Na retomada, não reimplementar nem repetir toda a explicação Feynman. Pedir
somente que Gabriel explique, com suas palavras, por que o código abaixo imprime
`true`, distinguindo imprimir uma variável de imprimir uma expressão booleana:

```java
Pessoa a = null;
Pessoa b = null;
System.out.println(a == b);
```

Se a explicação estiver correta, marcar o Exercício 01 como concluído, criar o
relatório individual em Markdown e avançar para o **Exercício 02 — String
Pool**, ainda dentro de Java Core 1.1.

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

### 12/08/2026 — Implementação do Exercício 01

#### Assuntos trabalhados

- diferença do comportamento de `==` entre primitivos e referências;
- diferença entre variável de referência e objeto;
- criação de instâncias com `new`;
- cópia de referência por atribuição;
- distinção entre identidade do objeto e igualdade de conteúdo;
- modelo didático de stack e heap e seus limites de precisão;
- declaração de variável, instanciação, atribuição e construtor vazio;
- previsão do resultado antes da execução.

#### Arquivos criados ou modificados

- `src/main/java/br/com/gabrielfalcao/prep/javacore/semana1/exercicio01igualdadedereferencias/Exercicio01IgualdadeDeReferencias.java`:
  recebeu as previsões, os casos de primitivos e referências e as mensagens de
  resultado;
- `src/main/java/br/com/gabrielfalcao/prep/javacore/semana1/exercicio01igualdadedereferencias/Pessoa.java`:
  criado como objeto simples com construtor vazio;
- `HISTORICO_ESTUDOS.md`: atualizado neste encerramento.

#### Decisões tomadas

- manter `Pessoa` sem atributos, pois o objetivo atual é observar identidade de
  objetos, não igualdade lógica;
- usar um construtor explícito e vazio, compatível com `new Pessoa()`;
- manter mensagens de saída detalhadas, conforme a preferência de Gabriel;
- não usar `equals()`, em conformidade com o escopo do exercício;
- não criar ainda o relatório individual nem marcar o exercício como concluído,
  porque falta a explicação Feynman.

#### O que Gabriel acertou

- previu corretamente os quatro resultados antes da execução;
- entendeu que `==` compara os valores dos operandos primitivos;
- entendeu que duas execuções de `new Pessoa()` criam instâncias distintas;
- identificou que `terceiraPessoa = primeiraPessoa` copia a referência;
- explicou corretamente que duas variáveis podem referenciar o mesmo objeto;
- implementou corretamente o `main`, as variáveis primitivas e a estrutura
  básica das comparações de referência.

#### Erros, dúvidas e lacunas identificadas

- houve confusão inicial entre igualdade lógica, identidade e endereço de
  memória;
- Gabriel associou inicialmente a escolha entre `==` e `equals()` diretamente
  a stack e heap; revisar que o tipo dos operandos e o objetivo da comparação
  determinam o uso;
- houve confusão entre declarar uma variável novamente e apenas atribuir uma
  nova referência a ela;
- houve confusão entre `Pessoa segunda = primeira` e `segunda = primeira`,
  agravada por exemplos apresentados em contextos diferentes;
- em uma tentativa, o conteúdo do exercício foi colocado em `Pessoa.java`, a
  classe principal desapareceu e um `println` ficou fora de método;
- foi criado `Pessoa(String)` quando as instanciações usavam `new Pessoa()`;
- o construtor foi tentado dentro do método `main`; revisar que construtores são
  declarados no corpo da própria classe;
- ainda é necessário praticar mensagens concatenadas com espaços e nomes
  consistentes;
- continuar substituindo “endereço físico” por “referência administrada pela
  JVM” ou simplesmente “mesma instância”, conforme o nível da explicação.

#### Validações executadas

- `mvn compile`: executado com sucesso após a organização final;
- execução direta de `Exercicio01IgualdadeDeReferencias`: concluída com sucesso;
- resultados observados: `true`, `false`, `false`, `true`, todos de acordo com
  as previsões;
- `mvn test` não foi executado nesta sessão, pois não existem testes específicos
  para este exercício e a alteração foi validada por compilação e execução;
- permaneceu o aviso do Maven recomendando `--release 17`; o `pom.xml` não foi
  alterado;
- o Maven utilizou o JDK 23 para compilar com alvo 17; o comando `java` não
  estava no `PATH`, portanto a execução utilizou diretamente o executável do JDK
  localizado pelo Maven.

#### Ponto de retomada

Gabriel concluiu a explicação Feynman principal. No caso-limite, previu
inicialmente que `a == b`, com ambas as referências `null`, poderia imprimir
`null` ou `false`. Foi explicado que o resultado é `true`, pois o `println`
recebe o resultado booleano da comparação e ambas as referências possuem o
valor `null`. Também foi diferenciada a impressão direta de `a`, que imprime
`null`, da expressão `a == b`, que imprime `true`, e registrado que chamar
`a.equals(b)` causaria `NullPointerException`.

Na próxima sessão, solicitar apenas que Gabriel reconstrua essa explicação em
uma frase. Se acertar, concluir formalmente o Exercício 01, criar seu relatório
individual e iniciar o **Exercício 02 — String Pool**. Não recomeçar a
implementação nem repetir toda a explicação Feynman.
