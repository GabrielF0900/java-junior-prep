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
concluir um exercício, será criado um arquivo `.md` em
`relatorios/<trilha>/semanaN/`, baseado no código e nas explicações realmente
apresentados. Caminho atualizado na reorganização de 05/09/2026; anteriormente
a orientação era guardar o relatório dentro da pasta do exercício.

Atualização de 11/09/2026: o padrão definido passou a ser `relatorios/<trilha>/semanaN/<desafio>/README.md`, com evidências em `imagens/`. A estrutura documental pode ser criada durante a validação para registrar pendências; a avaliação final e a conclusão continuam dependendo da aprendizagem demonstrada. Os relatórios HTML/PDF antigos permanecem preservados.

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

## Estado atual — 11/09/2026

Este estado substitui o ponto de retomada de 12/08/2026. As seções iniciais sobre objetivo, separação das trilhas e organização criada descrevem o contexto original; os registros cronológicos anteriores permanecem preservados. Não se presume que todas as pendências antigas de Java Core tenham sido encerradas.

### Contexto e progresso informado pelo estudante

Informações fornecidas por Gabriel em 11/09/2026, que não podem ser comprovadas somente pela existência dos arquivos:

- foco em preparação para entrevistas e testes técnicos de Java Júnior, priorizando compreensão, prática e explicação, sem conteúdos excessivamente avançados;
- Two Sum foi estudado e tratado como desafio concluído;
- foram estudados `Set`, `HashSet`, ausência de duplicatas, `add()`, `contains()`, `remove()`, ausência de índice, hashing, buckets, `hashCode()`, `equals()` e colisões;
- o material de Set e HashSet foi estudado até o início da parte de Big O;
- foi decidido não aprofundar Big O além do necessário para entrevista Júnior.

O calendário posiciona Contains Duplicate em **DSA, semana 1, tópico 2.1 — HashMap/HashSet aplicado a problemas**, com complexidade no **2.2 — Big O na prática**. O apoio conceitual vem de Java Core, semana 1, **1.1 — Igualdade e Hashing** e **1.2 — Coleções na prática**. Usar HashSet não transforma o desafio em Java Core. Não iniciar 1.3 — Streams e Lambdas a partir deste registro.

### Evidências encontradas no repositório

- `src/main/java/br/com/gabrielfalcao/prep/dsa/semana1/ContainsDuplicate.java` implementa `public boolean containsDuplicate(int[] nums)` com `Set<Integer> numerosObservados = new HashSet<>();`.
- O algoritmo percorre o array, consulta `contains()` antes de `add()`, retorna `true` ao encontrar repetição e `false` ao terminar sem repetição.
- Há `main` com `{1, 2, 3, 2}` e impressões didáticas do HashSet no retorno, da presença ou ausência de repetição e do resultado.
- `Exercicio05Sets.java`, em `javacore/semana1/exercicio05sets/`, contém prática de HashSet e comentários sobre interface, generics, referências, hashing, colisões e complexidade média. A presença desses comentários não comprova quanto do material foi estudado.
- Two Sum está implementado com HashMap em `src/main/java/br/com/gabrielfalcao/prep/dsa/semana1/TwoSum.java`. Seu relatório `relatorios/dsa/semana1/two-sum/README.md` ainda contém campos de testes, complexidade e Feynman pendentes; a conclusão do estudo é informação do estudante, não uma conclusão inferida desse relatório.
- Contains Duplicate agora possui [documentação individual](relatorios/dsa/semana1/contains-duplicate/README.md) e pasta de imagens com README de orientação. Não foram encontrados testes automatizados específicos nem prints versionados. O único método JUnit encontrado é `SanityCheckTest.testMath()`, sem cobertura dos desafios.

### Testes manuais e pendências

**Executados manualmente, segundo Gabriel em 11/09/2026:** `[1, 2, 3, 2]` → `true`; `[1, 2, 3, 4]` → `false`. O primeiro caso está no main atual; o segundo não está salvo no fonte. Nenhuma dessas execuções foi repetida nesta tarefa documental.

**Ainda precisam ser executados e registrados:**

| Entrada | Resultado esperado |
| --- | --- |
| `[5, 5, 8, 9]` | `true` |
| `[-1, 2, 3, -1]` | `true` |
| `[7]` | `false` |
| `[]` | `false` |

### Ponto exato de parada

Contains Duplicate permanece **Em validação**, implementado e não concluído. A estrutura documental foi criada; continuam pendentes quatro testes, inclusão dos seis prints, atualização dos resultados, explicação Feynman, revisão da justificativa de complexidade e revisão final antes de qualquer commit aprovado.

O escopo combinado para Big O é: operações de HashSet como `O(1)` em média; percurso do array como `O(n)`; tempo médio total como `O(n)`; espaço adicional como `O(n)`, considerando até n valores distintos. Esses custos descrevem a estratégia implementada, não medições de execução. Os println serão mantidos temporariamente para fins didáticos, conforme decisão informada por Gabriel.

A central hierárquica foi definida e criada em 11/09/2026: [README principal](README.md) → [central geral](relatorios/README.md) → [DSA](relatorios/dsa/README.md) → [Contains Duplicate](relatorios/dsa/semana1/contains-duplicate/README.md). A análise em `docs/ARQUITETURA_ATUAL_REPOSITORIO.md` representa essa estrutura. O código oficial permanece em src/ e os prints ficam na subpasta imagens/ do desafio. Gabriel informou que já capturou os dois primeiros prints; nenhum arquivo de imagem foi encontrado no repositório.

### Próxima ação

1. inserir os dois prints já capturados na pasta de imagens;
2. executar `{5, 5, 8, 9}`;
3. salvar `teste-03-duplicata-consecutiva.png`;
4. executar os três testes restantes;
5. atualizar o README individual;
6. realizar Feynman e revisão de Big O.

Os dois prints capturados são informação de Gabriel, ainda aguardando inclusão como `teste-01-duplicata-final.png` e `teste-02-sem-duplicata.png`. Revisão final e aprovação continuam necessárias antes de preparar commit.

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

### 11/09/2026  Set, HashSet e implementação de Contains Duplicate

As compreensões, decisões, execuções manuais e correções de tentativas descritas abaixo foram informadas pelo estudante em 11/09/2026. A leitura dos arquivos confirma a implementação atual e as anotações indicadas, mas não comprova execuções passadas nem demonstração oral de aprendizagem.

#### Assuntos trabalhados

- Set e HashSet, generics, ausência de duplicatas, `add()`, `contains()` e `remove()`.
- Ausência de `get(i)` no Set e percurso dos elementos sem depender de índice ou ordem.
- Variável de referência, objeto HashSet e referências dos elementos administradas pela estrutura.
- Hashing, hash code, buckets, colisões e confirmação de igualdade com `equals()`.
- Contains Duplicate em DSA 2.1, semana 1; Big O no nível do tópico 2.2, com apoio de Java Core 1.1 e 1.2.
- Material de Set e HashSet estudado até o início da parte de Big O, conforme relato.

#### O que Gabriel compreendeu

Segundo Gabriel, Set é a interface que define o contrato de conjunto, enquanto HashSet é uma implementação que usa hashing. Em `Set<Integer> numeros = new HashSet<>();`, o generic indica o tipo dos elementos, a variável guarda a referência do conjunto e o conjunto administra as referências dos elementos. Esses conceitos também aparecem nas anotações de `Exercicio05Sets.java`.

O hash code ajuda a selecionar a região de busca (bucket); ele não é um endereço de memória nem uma identidade obrigatoriamente única. Colisões não significam duplicatas: `equals()`, quando necessário, confirma a igualdade lógica. Objetos iguais precisam ter hash codes iguais; o inverso não é obrigatório.

Gabriel informou ter compreendido o risco de alterar campos participantes de `equals()` e `hashCode()` enquanto o objeto está no conjunto: a busca pode deixar de encontrá-lo corretamente. A estratégia estudada é remover o objeto antes de alterar sua identidade lógica e adicioná-lo novamente, observando se já existe um elemento equivalente. Não foi encontrado experimento desse caso de mutação nos fontes atuais.

Também foi compreendida a diferença entre o método fornecido por plataformas de desafios e o `main` usado como ponto de entrada para testes locais.

#### Implementação realizada

O arquivo `src/main/java/br/com/gabrielfalcao/prep/dsa/semana1/ContainsDuplicate.java` contém `public boolean containsDuplicate(int[] nums)`, usa HashSet e percorre o array. Para cada número, verifica com `contains()` antes de adicionar com `add()`. Retorna `true` na primeira repetição e `false` ao terminar sem repetição.

Há impressões didáticas do estado do conjunto no retorno e mensagens sobre o resultado da busca. O main contém somente `{1, 2, 3, 2}`. O fonte e `Exercicio05Sets.java` já estavam modificados no início desta tarefa; nenhum Java foi editado durante a documentação.

#### Testes já executados

Relato de Gabriel em 11/09/2026, sem prints versionados encontrados:

| Entrada | Resultado informado |
| --- | --- |
| `[1, 2, 3, 2]` | `true` |
| `[1, 2, 3, 4]` | `false` |

A presença da primeira entrada no main confirma apenas o caso configurado. Não há teste automatizado específico de Contains Duplicate. Nenhum caso foi executado nesta atualização documental.

#### Decisões tomadas

- Two Sum foi estudado e tratado como concluído, conforme informação do estudante; os campos pendentes no relatório antigo foram identificados e preservados.
- Manter Contains Duplicate em DSA e os exercícios sobre a API de conjuntos em Java Core.
- Priorizar compreensão, prática e explicação para entrevistas e testes técnicos de Java Júnior.
- Manter os `println` temporariamente para acompanhar o fluxo nos estudos.
- Limitar Big O ao necessário: operações de HashSet `O(1)` em média, percurso `O(n)`, tempo médio total `O(n)` e espaço adicional `O(n)`.
- Definir o local definitivo do README e dos prints depois de analisar a arquitetura; a recomendação documentada é usar `relatorios/dsa/semana1/contains-duplicate/`, ainda não criado.
- Não marcar Contains Duplicate como concluído antes dos testes, documentação, Feynman e revisão.

#### Dificuldades e correções importantes

Segundo o estudante, uma tentativa adicionava o número antes de consultar: assim, `contains()` retornava verdadeiro imediatamente, porque o próprio número acabara de ser inserido. A ordem atual foi conferida no código: primeiro consultar, depois adicionar quando ainda não foi visto.

Outra tentativa redeclarava `nums` dentro do método, embora `nums` já fosse um parâmetro. Essa redeclaração não existe na implementação atual; a entrada local é declarada no main, em outro método. O histórico dessas duas tentativas foi fornecido por Gabriel, não recuperado de versões anteriores do fonte nesta tarefa.

Pontos para revisão posterior: explicar sem consulta a diferença entre interface e implementação, entre referência do conjunto e elementos, por que colisão não implica duplicata e por que a consulta deve anteceder a inserção no algoritmo atual. Retomar também o cuidado com identidade lógica mutável.

#### Ponto exato de parada

Implementação com HashSet pronta para continuar a validação manual. Pendem `[5, 5, 8, 9]` → `true`, `[-1, 2, 3, -1]` → `true`, `[7]` → `false` e `[]` → `false`.

Depois faltam README individual, prints, explicação Feynman com as próprias palavras, justificativa breve de tempo médio `O(n)` e espaço `O(n)`, e revisão final. Nenhum print foi encontrado no repositório; a estrutura proposta não foi criada. Contains Duplicate permanece em andamento.

#### Próxima ação

1. executar o teste `{5, 5, 8, 9}`;
2. salvar o print como evidência;
3. executar os demais casos pendentes;
4. definir o local da documentação após análise da arquitetura;
5. criar o README individual do Contains Duplicate;
6. escrever a explicação Feynman;
7. justificar Big O no nível de entrevista Júnior;
8. revisar e somente depois preparar o commit.

### 11/09/2026 — Central hierárquica de documentação

#### Organização implementada

Foi definida e criada a navegação README principal → central geral → trilha → documentação individual. A [central](relatorios/README.md) possui índices de [DSA](relatorios/dsa/README.md) e [Java Core](relatorios/javacore/README.md).

O código oficial permanece em `src/`; relatórios individuais seguem `relatorios/<trilha>/semanaN/<desafio>/README.md` e imagens ficam na subpasta `imagens/`. O histórico mantém a continuidade das sessões, materiais teóricos permanecem em `materiais/` e documentos de arquitetura em `docs/`.

Two Sum teve o relatório movido com `git mv` de `relatorios/dsa/semana1/two-sum.md` para [relatorios/dsa/semana1/two-sum/README.md](relatorios/dsa/semana1/two-sum/README.md), preservando todas as tentativas, respostas, observações e campos pendentes. O caminho antigo acima e as decisões de localização no registro anterior são históricos; a navegação atual usa o novo caminho.

Contains Duplicate recebeu [README individual](relatorios/dsa/semana1/contains-duplicate/README.md), fluxo, tabela de testes, justificativa curta de complexidade e espaço pendente para Feynman. Cada desafio recebeu `imagens/README.md`, sem imagens artificiais. Os relatórios Java Core HTML/PDF foram preservados no mesmo local.

O README principal, AGENTS e arquitetura foram atualizados. O método pedagógico permanece válido; a nova estrutura não encerra exercícios.

#### Estado pedagógico e evidências

Contains Duplicate permanece **Em validação**. Os resultados de `[1, 2, 3, 2]` → true e `[1, 2, 3, 4]` → false continuam atribuídos ao relato de Gabriel. Ele informou nesta solicitação que os dois prints já foram capturados; os arquivos ainda não foram encontrados no repositório.

Os quatro testes pendentes continuam pendentes: `[5, 5, 8, 9]`, `[-1, 2, 3, -1]`, `[7]` e `[]`. Nenhuma imagem foi considerada existente sem arquivo real; as seis evidências aguardam inclusão. Feynman será escrito por Gabriel, e a justificativa de Big O ainda será revisada por ele.

#### Ponto de retomada

1. inserir os dois prints já capturados na pasta `relatorios/dsa/semana1/contains-duplicate/imagens/`;
2. executar `{5, 5, 8, 9}`;
3. salvar `teste-03-duplicata-consecutiva.png`;
4. executar os três testes restantes;
5. atualizar o README individual;
6. realizar Feynman e revisão de Big O.

Depois, decidir sobre as impressões didáticas do código e realizar revisão final. Commit somente após aprovação; nenhum commit ou push é parte desta tarefa.

#### Validação técnica da central

- `mvn compile '-Dmaven.repo.local=.m2/repository'`: BUILD SUCCESS, saída 0, 11 fontes principais compilados.
- `mvn test '-Dmaven.repo.local=.m2/repository'`: BUILD SUCCESS, saída 0; 1 teste (SanityCheckTest.testMath), 0 falhas, 0 erros e 0 ignorados. Esse teste não cobre os desafios DSA.
- Permaneceu o aviso Maven sobre source/target 17 recomendando --release 17; o POM não foi alterado.
- Os 13 arquivos Java mantiveram SHA-256 idêntico ao início da tarefa. Nenhum código, teste existente, configuração de build, material teórico ou relatório HTML/PDF foi alterado.
- Foram verificados 72 links relativos para arquivos/diretórios, sem links quebrados. O conteúdo original de Two Sum foi preservado integralmente após o título, e o caminho antigo não permaneceu duplicado.
- `git diff --check` e `git diff --cached --check` não apontaram erros de whitespace. Nenhum PNG foi criado, e nenhuma pendência de evidência ou aprendizagem foi concluída automaticamente.
- O git mv registrou somente a movimentação solicitada no índice; não houve commit nem push. Os testes manuais pendentes não foram executados nesta tarefa.
