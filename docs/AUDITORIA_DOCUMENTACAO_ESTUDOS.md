# Auditoria da documentação de estudos

> **Auditoria anterior às correções:** este documento registra os problemas
> encontrados antes da revisão de navegação e simplificação. Alguns achados
> podem já ter sido resolvidos posteriormente.

Auditoria realizada em 11/09/2026, em modo de leitura. Nenhum arquivo existente,
código Java, imagem ou README foi alterado durante esta auditoria. O único
arquivo produzido é este relatório.

## 1. Resumo executivo

O repositório está limpo no início da auditoria, na branch
`chore/reorganiza-arquitetura`, com último commit `dc85243 docs(dsa): adiciona
evidencias de testes do Two Sum`. A estrutura atual de central, índices,
relatórios individuais e pastas de imagens é navegável e os 12 PNGs reais estão
presentes.

Os dois desafios têm evidências visuais coerentes com os resultados registrados.
Contains Duplicate permanece corretamente **Em validação**. Two Sum é tratado
como **concluído segundo o histórico de estudos**, mas seu README ainda contém
campos antigos de testes, complexidade e explicação pessoal em branco. Esses
campos não invalidam automaticamente a conclusão informada; precisam ser
separados entre dados que já podem ser preenchidos por evidência e conteúdo que
depende da autoria de Gabriel.

Os achados mais relevantes são:

- a tabela antiga de testes do Two Sum ainda diz `A preencher` e `Pendente`,
  embora seis casos já tenham imagens e resultados;
- a seção de complexidade do Two Sum está vazia, embora o código permita
  justificar tempo médio `O(n)`, espaço adicional `O(n)`, uma passagem pelo
  array e operações médias de `HashMap` em `O(1)`;
- o README de Contains Duplicate e a arquitetura dizem que o `main` usa
  `[1, 2, 3, 2]`, mas o fonte atual usa `[]`;
- histórico e documentos de reorganização preservam afirmações antigas sobre
  ausência de imagens ou pendências. Algumas são registros históricos legítimos,
  mas não estão sempre distinguíveis da situação atual;
- Two Sum repete cada evidência na tabela e na seção de imagens, e os documentos
  gerais repetem a mesma situação em vários locais;
- a documentação é maior e mais burocrática do que o mínimo necessário para
  entrevistas Java Júnior, especialmente o histórico e as duas arquiteturas.

### Classificação resumida

| Severidade | Quantidade | Escopo principal |
| --- | ---: | --- |
| Crítica | 2 | Entradas do `main` descritas incorretamente em documentação atual |
| Importante | 7 | Campos antigos pendentes, complexidade vazia, histórico desatualizado e duplicações que podem confundir |
| Opcional | 6 | Concisão, navegação, redução de repetição e política de evidências |

As quantidades correspondem aos achados classificados nas tabelas das seções 4,
5 e 6. Um achado pode recomendar mais de uma alteração no futuro.

## 2. Estado do repositório

### Diagnóstico inicial

| Item | Resultado |
| --- | --- |
| Branch | `chore/reorganiza-arquitetura` |
| Último commit | `dc85243 docs(dsa): adiciona evidencias de testes do Two Sum` |
| Estado inicial do Git | Limpo; `git status --short` não exibiu alterações |
| Markdown existentes | 14 |
| Java existentes | 13 |
| Imagens existentes | 12 PNGs |
| Commits recentes relacionados | `dc85243` Two Sum, `2943101` Contains Duplicate, `308f03a` central documental |

As contagens excluem `.git/`, `.m2/`, `target/`, caches e arquivos compilados.
Os 14 Markdown analisados foram `AGENTS.md`, `README.md`,
`HISTORICO_ESTUDOS.md`, os três documentos em `docs/`, os três índices em
`relatorios/`, os dois READMEs individuais e os dois READMEs de imagens, além
de `sql/README.md`.

### Java auditados e hashes SHA-256

Os hashes foram calculados antes da criação deste relatório. Eles servem como
linha de base para confirmar que a auditoria não alterou código:

| Arquivo | SHA-256 inicial |
| --- | --- |
| `src/main/java/br/com/gabrielfalcao/prep/dsa/semana1/ContainsDuplicate.java` | `44B5C73B33BBD4C26BB208D5B3F3C86FCB4D631692E5C629BE2540F772F54D1B` |
| `src/main/java/br/com/gabrielfalcao/prep/dsa/semana1/TwoSum.java` | `EBEAF985E56BC2C06C6246CB01D9257EED19626D1D11E53CC05786ED525DAAEB` |
| `src/main/java/br/com/gabrielfalcao/prep/dsa/semana4/ValidParentheses.java` | `FBA8E9620BF8CE4F5B82A10FBA5542B6F0C37D864D617D969F067940E346D1FD` |
| `src/main/java/br/com/gabrielfalcao/prep/javacore/semana1/exercicio01igualdadedereferencias/Exercicio01IgualdadeDeReferencias.java` | `E6D581E888B6ED5086759D40AE0E639F04D04B53AF511AD7BA165C59D3A5158F` |
| `src/main/java/br/com/gabrielfalcao/prep/javacore/semana1/exercicio01igualdadedereferencias/Produto.java` | `F9609CB4E836FECB6B0228261AFCBF4B50C142439911C2E7CCCE81EF6B0B16D3` |
| `src/main/java/br/com/gabrielfalcao/prep/javacore/semana1/exercicio02stringpool/Exercicio02StringPool.java` | `AE84F5BC2CBC48AB1FC55692575E4BD97FD2DF222DF8FB56D2E43C2BF3C7F66A` |
| `src/main/java/br/com/gabrielfalcao/prep/javacore/semana1/exercicio03equalsehashcode/Exercicio03EqualsEHashCode.java` | `F646F229FFA047DC191C122D698471BB87B108FC3F336E07A5740B1B6AFB7E65` |
| `src/main/java/br/com/gabrielfalcao/prep/javacore/semana1/exercicio04listas/Exercicio04Listas.java` | `F3A678CFACD5D5913BD391C9B39984E8DB46FD9487AEC28520B45C39F0DD761F` |
| `src/main/java/br/com/gabrielfalcao/prep/javacore/semana1/exercicio05sets/Exercicio05Sets.java` | `931494AA8A0DA3A22FE589709B47CC2F912C31B181659BB94DD4861DAC5E531F` |
| `src/main/java/br/com/gabrielfalcao/prep/javacore/semana1/exercicio06maps/Exercicio06Maps.java` | `FF8D9849F8E21BAAB540697D89197A14EC04632967E0D7E876DE70DE49DB447B` |
| `src/main/java/br/com/gabrielfalcao/prep/javacore/semana2/StreamsExemplo.java` | `B6BFE3B26D3A0824A34FFAA8C7808002230547E2B3421E09AA397A3475959601` |
| `src/test/java/br/com/gabrielfalcao/prep/testes/SanityCheckTest.java` | `60AD4A2B49CED0B2F219DF5400D94D72D45A56E325B2A8C1F61FC152D75A6CBE` |
| `src/test/java/br/com/gabrielfalcao/prep/testes/semana2/SafeWalletServiceTest.java` | `F1023CB86E01500654FCFB23F364D641570A543BFD7A623BD3E504CB03883F3B` |

## 3. O que está correto

- Os pacotes Java estão separados entre `dsa` e `javacore`, conforme as regras
  do projeto.
- `TwoSum.java` usa `HashMap`, calcula o complemento, consulta antes de inserir
  e retorna índices distintos; retorna `new int[0]` quando não encontra par.
- `ContainsDuplicate.java` usa `HashSet`, consulta antes de inserir e retorna
  `true` na primeira repetição ou `false` ao terminar.
- As 12 imagens são reais, legíveis e estão nas pastas corretas. Não existem
  PNGs vazios ou imagens fora dos dois desafios.
- Os seis resultados de cada desafio coincidem com o conteúdo visível das
  imagens e com as tabelas novas dos READMEs.
- A central de DSA mantém Two Sum como concluído segundo o histórico e
  Contains Duplicate como **Em validação**. O status de Contains Duplicate é
  consistente entre `README.md`, o índice de DSA, o relatório individual e a
  arquitetura atual.
- Os índices possuem links para os READMEs individuais e para os fontes
  canônicos.
- O README do Two Sum preserva o enunciado, o planejamento, o pseudocódigo e
  as duas tentativas antigas; a seção de evidências foi acrescentada antes do
  conteúdo histórico.
- O histórico distingue, em vários trechos, informação declarada por Gabriel,
  evidência visual encontrada e situação pedagógica.
- O `pom.xml` mantém Java 17, JUnit e Mockito; a auditoria não encontrou
  documentação que afirme existir cobertura automatizada dos dois desafios.

## 4. Incoerências críticas

| ID | Severidade | Arquivo/seção | Problema | Evidência | Correção sugerida | Depende de Gabriel? |
| --- | --- | --- | --- | --- | --- | --- |
| C-01 | Crítica | `relatorios/dsa/semana1/contains-duplicate/README.md`, seção Código-fonte | O README afirma que o `main` atual contém `[1, 2, 3, 2]`. O fonte atual declara `int[] nums = {};`. | Leitura direta de `ContainsDuplicate.java` e do README. As imagens comprovam seis execuções, mas não alteram o `main` salvo. | Descrever a entrada realmente salva no `main` ou separar explicitamente o `main` da lista de casos manuais. | Não; correção factual segura. |
| C-02 | Crítica | `docs/ARQUITETURA_ATUAL_REPOSITORIO.md`, seção 6 | A tabela descreve o `main` do Two Sum como `{1,2,6,7,8,9}`, target `10`. O fonte atual usa `{1, 2, 3}`, target `10`. | Leitura direta de `TwoSum.java`; a entrada `[1,2,6,7,8,9]` existe como evidência manual, mas não como entrada atual do `main`. | Atualizar a descrição do `main` e rotular as seis entradas como execuções manuais independentes. | Não; correção factual segura. |

Esses conflitos comprometem a distinção entre código executável salvo e evidência
manual. Eles não invalidam os resultados das imagens.

## 5. Incoerências importantes

| ID | Severidade | Arquivo/seção | Problema | Evidência | Correção sugerida | Depende de Gabriel? |
| --- | --- | --- | --- | --- | --- | --- |
| I-01 | Importante | `relatorios/dsa/semana1/two-sum/README.md`, seção 7 | A tabela antiga ainda marca quatro cenários como `A preencher` e `Pendente`, embora seis casos, incluindo os quatro temas relacionados, já tenham resultados e imagens. | A nova seção `Evidências dos testes manuais` contém seis linhas aprovadas. | Preencher ou substituir a tabela antiga, preservando-a como histórico somente se isso for explicitamente sinalizado. | Não para os dados; sim se Gabriel quiser manter uma tabela histórica separada. |
| I-02 | Importante | `relatorios/dsa/semana1/two-sum/README.md`, seção 8 | Tempo, espaço e justificativa continuam `A preencher`. | O código faz uma passagem pelo array, usa consultas/inserções médias `O(1)` no `HashMap` e pode armazenar até `n` entradas; as seis imagens confirmam comportamento, não complexidade. | Registrar tempo médio `O(n)`, espaço adicional `O(n)`, uma passagem e a hipótese de custo médio `O(1)` do mapa, com eventual ressalva de pior caso. | Não para o texto técnico; sim para transformar isso em explicação pessoal. |
| I-03 | Importante | `HISTORICO_ESTUDOS.md`, Estado atual e registros cronológicos | O estado atual diz que o relatório do Two Sum ainda tem testes pendentes sem distinguir que os seis testes e imagens já foram adicionados. Registros anteriores também dizem que não havia prints. | O mesmo arquivo contém depois o registro de inclusão das seis evidências. | Marcar as frases antigas como situação histórica e atualizar apenas o estado corrente. | Não; correção documental segura, preservando o histórico. |
| I-04 | Importante | `docs/RELATORIO_REORGANIZACAO.md`, seção 5 e seção 9 | O relatório de reorganização diz que testes, complexidade e Feynman do Two Sum continuam pendentes. Isso era verdadeiro na reorganização, mas hoje só complexidade e Feynman continuam vazios; os testes têm evidência. | O documento se apresenta como registro histórico, mas não destaca a posterior inclusão das evidências no trecho de pendências. | Acrescentar uma nota de atualização histórica ou deixar a seção explicitamente limitada à data da reorganização. | Não; escolha de redação, sem alteração de conteúdo histórico. |
| I-05 | Importante | `docs/ARQUITETURA_ATUAL_REPOSITORIO.md`, seção 11 | A descrição do Two Sum preserva “campos pendentes” de forma ampla, sem separar testes já comprovados de complexidade e Feynman pessoais. | README atual possui seis resultados e imagens; as seções antigas continuam vazias. | Especificar quais campos são derivados de evidência e quais dependem de Gabriel. | Não para a separação; sim para o Feynman. |
| I-06 | Importante | `relatorios/dsa/semana1/contains-duplicate/README.md`, seção Código-fonte e `docs/ARQUITETURA_ATUAL_REPOSITORIO.md`, seção 7 | Além do conflito do `main`, a documentação usa a entrada antiga para explicar as impressões e mistura execução configurada com casos manuais. | `ContainsDuplicate.java` tem `nums = {}`, enquanto os seis PNGs mostram entradas diferentes. | Distinguir “entrada atualmente salva no main” de “casos manuais documentados”. | Não; correção factual segura. |
| I-07 | Importante | `HISTORICO_ESTUDOS.md`, Estado atual | O bloco “Próxima ação” mistura pendências de Contains Duplicate com a inclusão já concluída das evidências de Two Sum e fica distante dos registros cronológicos posteriores. | A seção começa pelo ponto de parada de Contains Duplicate e depois inclui Two Sum antes da próxima ação. | Separar o ponto de parada por desafio e deixar uma única próxima ação corrente. | Sim; Gabriel deve definir qual desafio será retomado. |

## 6. Melhorias opcionais

| ID | Severidade | Arquivo/seção | Problema | Evidência | Correção sugerida | Depende de Gabriel? |
| --- | --- | --- | --- | --- | --- | --- |
| O-01 | Opcional | `relatorios/dsa/semana1/two-sum/README.md`, seção Evidências | Cada PNG é ligado uma vez na tabela e novamente como imagem renderizada, gerando 12 referências para seis arquivos. | A auditoria de links encontrou 36 referências a PNGs no total, 18 pares repetidos; cada desafio usa tabela + imagem + índice. | Manter a tabela como índice e reduzir a repetição visual, ou aceitar a repetição por finalidade pedagógica. | Sim; é uma escolha de apresentação. |
| O-02 | Opcional | `relatorios/dsa/semana1/contains-duplicate/README.md` e Two Sum | A mesma entrada, resultado e motivo reaparecem na tabela, no bloco visual e no índice de imagens. | Padrão repetido nos dois desafios. | Para desafios futuros, escolher tabela curta ou galeria curta, não ambos em seis casos. | Sim; depende do valor que Gabriel atribui aos prints. |
| O-03 | Opcional | `HISTORICO_ESTUDOS.md` | O histórico mistura protocolo, contexto, estado atual e narrativas detalhadas de reorganização, com mais de 500 linhas. | Há registros atuais e históricos que repetem caminhos, pendências e decisões. | Manter o histórico cronológico enxuto e mover diagnósticos arquiteturais para `docs/`. | Sim; histórico é registro de aprendizagem de Gabriel. |
| O-04 | Opcional | `docs/ARQUITETURA_ATUAL_REPOSITORIO.md` | A arquitetura tem 14 seções e repete estado de desafios, links, imagens, Git e pendências. | O documento possui mais de 300 linhas e repete informações dos índices e do histórico. | Atualizar arquitetura somente quando a estrutura mudar; não para cada nova captura. | Não para a regra; sim para decidir o nível de documentação. |
| O-05 | Opcional | `docs/ARQUITETURA_REPOSITORIO_ANTES_DA_REORGANIZACAO.md` e `docs/RELATORIO_REORGANIZACAO.md` | Arquivos históricos preservam caminhos antigos e estados já superados, o que pode parecer contraditório em buscas globais. | Há referências a `two-sum.md`, `exercicio01twosum` e arquivos removidos, todos em documentos de reorganização. | Adicionar um aviso visual único de “registro histórico, não estado atual”; não apagar o conteúdo. | Não; aviso editorial seguro. |
| O-06 | Opcional | Central geral e índices | A navegação funciona, mas a central não aponta diretamente para as duas pastas de evidências; o usuário precisa abrir o README individual. | Links relativos estão válidos, porém a descoberta das imagens depende de uma segunda navegação. | Adicionar um link de evidências por desafio nos índices, se isso facilitar o estudo. | Sim; decisão de navegação. |

## 7. Auditoria do Two Sum

### Comparação com o código

O código canônico percorre `nums` uma vez, calcula `target - nums[i]`, consulta
`containsKey`, retorna os índices encontrados e depois insere o valor e índice no
mapa. A implementação preserva `new int[0]` para o caso sem solução. O `main`
atual usa `[1, 2, 3]` e target `10`, enquanto as imagens são seis execuções
manuais separadas.

Os seis PNGs conferem com o código:

| Caso | Entrada e target visíveis | Resultado visível | Situação |
| --- | --- | --- | --- |
| 01 | `[1, 2, 6, 7, 8, 9]`, `10` | `[1, 4]` | Coerente |
| 02 | `[4, 2, 6, 10]`, `8` | `[1, 2]` | Coerente |
| 03 | `[3, 3]`, `6` | `[0, 1]` | Coerente; posições diferentes |
| 04 | `[-3, 4, 3, 90]`, `0` | `[0, 2]` | Coerente |
| 05 | `[0, 4, 3, 0]`, `0` | `[0, 3]` | Coerente; posições diferentes |
| 06 | `[1, 2, 3]`, `10` | `[]` | Coerente com o retorno local; caso adicional |

A ordem textual do `HashMap` nas imagens é apenas apresentação e não contradiz o
algoritmo.

### Campos antigos que já possuem resposta

A tabela `## 7. Testar` continua existindo com quatro linhas antigas:

```text
Caso comum       | A preencher | A preencher | Pendente
Valores repetidos| A preencher | A preencher | Pendente
Números negativos| A preencher | A preencher | Pendente
Resposta no final| A preencher | A preencher | Pendente
```

Ela pode ser preenchida com segurança a partir das evidências: caso comum,
valores repetidos e números negativos têm correspondentes diretos; “resposta no
final” pode ser associado ao caso comum somente se essa for a interpretação
pretendida, pois a imagem não rotula essa categoria. Os seis testes atuais são a
fonte mais precisa e devem ser mantidos como registro principal.

A seção `## 8. Analisar` também continua com três ocorrências de `A preencher`.
Com base no código, é seguro registrar:

- uma passagem pelo array: `O(n)` visitas no máximo;
- operações médias de consulta e inserção no `HashMap`: `O(1)`;
- tempo médio total: `O(n)`;
- espaço adicional: `O(n)` para o mapa, no pior caso de valores sem par até o
  fim.

Isso não exige nova sessão de estudo para preencher o dado técnico. A seção
Feynman e a retrospectiva contêm respostas pessoais ou metacognitivas e não
devem ser preenchidas pelo auditor.

### Contradições e excesso

O status “concluído segundo o histórico” é compatível com o índice de DSA e com
o histórico, mas convive com campos em branco porque o relatório preserva um
roteiro antigo. O problema é a ausência de um rótulo claro dizendo que esses
campos são históricos, não uma pendência atual de execução.

O README tem seis blocos visuais, uma tabela nova e uma tabela antiga, além de
duas tentativas completas. Preservar as tentativas é coerente com a regra do
projeto; manter duas tabelas de testes ativas é a duplicação que mais dificulta
encontrar o resultado atual.

## 8. Auditoria do Contains Duplicate

O código consulta `contains()` antes de `add()`, usa `HashSet` e retorna cedo ao
encontrar repetição. A justificativa documentada de tempo médio `O(n)` e espaço
adicional `O(n)` é coerente com essa estratégia. Também está correto registrar a
ausência de testes automatizados específicos: o único teste JUnit do projeto é
`SanityCheckTest.testMath()`.

As seis imagens conferem com os seis casos documentados. A ordem das mensagens
nas capturas, com mensagens do método antes de `Entrada`, não é uma incoerência:
o método imprime antes de o `main` imprimir a entrada.

O README individual não tem testes marcados como pendentes e mantém Feynman como
pendência pessoal. Porém, a frase “O main atual contém `{1, 2, 3, 2}`” está
desatualizada: o arquivo atual usa `int[] nums = {};`. A arquitetura atual repete
essa entrada antiga. A tabela de seis resultados, a seção de complexidade, a
ordem consulta-antes-da-inserção e a ausência de JUnit estão coerentes.

O relatório é longo para um desafio pequeno: estratégia, fluxo, tabela, seis
blocos de imagem, complexidade, erros e próximas etapas repetem parte do mesmo
conteúdo. Isso é uma melhoria opcional, não um erro de resultado.

## 9. Auditoria das evidências visuais

Foram encontrados exatamente 12 PNGs. Todos foram vistos individualmente, sem
alteração, recorte ou conversão.

| Arquivo | Desafio | Entrada visível | Resultado visível | README utiliza? | Situação |
| --- | --- | --- | --- | --- | --- |
| `teste-01-duplicata-final.png` | Contains Duplicate | `[1, 2, 3, 2]` | `true` | Sim, duas vezes no README e uma no índice de imagens | Coerente |
| `teste-02-sem-duplicata.png` | Contains Duplicate | `[1, 2, 3, 4]` | `false` | Sim | Coerente |
| `teste-03-duplicata-consecutiva.png` | Contains Duplicate | `[5, 5, 8, 9]` | `true` | Sim | Coerente |
| `teste-04-numero-negativo.png` | Contains Duplicate | `[-1, 2, 3, -1]` | `true` | Sim | Coerente |
| `teste-05-elemento-unico.png` | Contains Duplicate | `[7]` | `false` | Sim | Coerente |
| `teste-06-array-vazio.png` | Contains Duplicate | `[]` | `false` | Sim | Coerente; caso local |
| `teste-01-caso-comum.png` | Two Sum | `[1, 2, 6, 7, 8, 9]`, target `10` | `[1, 4]` | Sim, duas vezes no README e uma no índice | Coerente |
| `teste-02-par-no-meio.png` | Two Sum | `[4, 2, 6, 10]`, target `8` | `[1, 2]` | Sim | Coerente |
| `teste-03-valores-repetidos.png` | Two Sum | `[3, 3]`, target `6` | `[0, 1]` | Sim | Coerente; índices diferentes |
| `teste-04-numeros-negativos.png` | Two Sum | `[-3, 4, 3, 90]`, target `0` | `[0, 2]` | Sim | Coerente |
| `teste-05-zeros-repetidos.png` | Two Sum | `[0, 4, 3, 0]`, target `0` | `[0, 3]` | Sim | Coerente; índices diferentes |
| `teste-06-sem-solucao.png` | Two Sum | `[1, 2, 3]`, target `10` | `[]` | Sim | Coerente; caso local |

Não há imagens existentes sem link correspondente. Não há links de imagem
quebrados. A repetição “duas vezes no README” é intencionalmente tabela mais
renderização, mas é candidata à simplificação.

## 10. Links e navegação

A verificação encontrou 111 links relativos em todos os Markdown existentes,
com zero destinos quebrados. Os links para os 12 PNGs resolvem corretamente.
Os READMEs individuais têm links de retorno para a central de DSA; os índices
apontam para os desafios e fontes.

Foram identificados 18 pares de destino repetidos. Os principais grupos são:

- seis imagens de cada desafio repetidas na tabela e na imagem renderizada;
- links da central e dos READMEs repetidos em diferentes trechos do histórico;
- referências duplicadas à documentação individual na arquitetura.

Referências a `relatorios/dsa/semana1/two-sum.md`,
`exercicio01twosum` e arquivos removidos aparecem somente em documentos
históricos (`ARQUITETURA_REPOSITORIO_ANTES_DA_REORGANIZACAO.md`,
`RELATORIO_REORGANIZACAO.md` e apêndice preservado). Não são links ativos
quebrados, mas uma busca global pode confundi-los com caminhos atuais.

## 11. Informações duplicadas

Os mesmos fatos aparecem em vários níveis:

1. cada resultado está na tabela do desafio, no bloco visual, no índice de
   imagens, na central DSA, no histórico e na arquitetura;
2. a escolha do `HashMap`/`HashSet` e os custos aparecem no código comentado,
   README, histórico e arquitetura;
3. o histórico contém tanto um estado atual quanto registros cronológicos que
   repetem os mesmos caminhos e pendências;
4. o README do Two Sum contém uma tabela de testes atualizada e uma tabela antiga
   ainda ativa;
5. a arquitetura atual, o relatório de reorganização e a arquitetura anterior
   descrevem árvores e caminhos com níveis de detalhe diferentes.

A duplicação mais problemática é a que mantém `Pendente` ao lado de evidência
aprovada. A duplicação puramente visual dos PNGs é menos grave, mas aumenta o
volume de manutenção.

## 12. Campos pendentes que já podem ser preenchidos

Podem ser preenchidos de modo seguro, usando código e evidências existentes:

| Arquivo/seção | Campo | Base disponível |
| --- | --- | --- |
| Two Sum, `## 7. Testar` | entradas e resultados dos seis casos | Seis PNGs e nova tabela de evidências |
| Two Sum, `## 8. Analisar` | tempo médio `O(n)` | Uma passagem e operações médias do `HashMap` |
| Two Sum, `## 8. Analisar` | espaço adicional `O(n)` | Mapa pode armazenar até `n` valores antes de encontrar par |
| Two Sum, `## 8. Analisar` | justificativa técnica | Código canônico e comportamento observado |
| Two Sum, seção de testes | ausência de solução | Caso local `[1,2,3]`, target `10`, retorna `[]` |
| Arquitetura e histórico, estado corrente | existência das imagens e seis resultados | 12 PNGs conferidos e links válidos |
| Contains Duplicate, descrição do `main` | entrada atualmente salva | Fonte atual usa `[]` |

O Feynman de Two Sum, a retrospectiva, dificuldades pessoais e decisões sobre o
valor pedagógico das capturas não devem ser inventados nem preenchidos pelo
auditor.

## 13. Pendências que ainda dependem de Gabriel

- Escrever uma explicação Feynman curta do Two Sum com suas próprias palavras.
- Decidir se a tabela antiga de testes será convertida em histórico ou
  substituída pelos seis casos atuais.
- Confirmar se a justificativa de complexidade deve ser registrada como “média”
  e se deve mencionar o pior caso teórico do `HashMap`.
- Decidir quais dificuldades e aprendizados pessoais ainda merecem permanecer
  no README.
- Definir se seis prints por desafio ajudam no estudo ou se três ou quatro
  casos representativos bastam para desafios futuros.
- Decidir se os `println` didáticos continuarão no código em uma tarefa futura;
  isso não é uma correção documental desta auditoria.
- Confirmar quando Two Sum deve ser considerado pedagogicamente fechado caso
  Feynman e complexidade permaneçam fora do README.

## 14. Conteúdo que pode ser removido ou consolidado

Nada deve ser removido automaticamente nesta auditoria. Para uma revisão
posterior, são candidatos:

- a tabela antiga de quatro testes do Two Sum, após preservar uma nota histórica
  curta;
- a repetição integral de cada PNG em tabela e galeria, se o objetivo for uma
  documentação mais compacta;
- descrições de estrutura e estado repetidas entre histórico e arquitetura;
- detalhes de reorganização já encerrados, que podem permanecer apenas no
  relatório histórico;
- instruções operacionais de inclusão de imagens depois que a pasta já contém
  evidências, mantendo somente uma orientação geral reutilizável.

O apêndice com as duas tentativas do Two Sum deve ser preservado enquanto a
decisão pedagógica de Gabriel não mudar, pois ele documenta o raciocínio e não é
uma cópia executável adicional.

## 15. Processo simplificado para próximos desafios

O padrão mínimo recomendado para um desafio novo é:

1. enunciado curto;
2. explicação da estratégia;
3. link para o código;
4. três ou quatro testes relevantes, incluindo um caso-limite quando fizer
   sentido;
5. complexidade em duas ou três frases;
6. explicação pessoal curta;
7. aprendizados principais.

Se houver captura visual, uma tabela simples com entrada, resultado e um link já
é suficiente. Seis prints por desafio são úteis como prática interna, mas são
excessivos como documentação pública quando todos repetem a mesma estrutura.
Podem ser mantidos como evidência bruta em uma pasta sem exigir que cada um
apareça em uma galeria extensa.

O histórico deve registrar a decisão e o ponto de parada, não repetir toda a
arquitetura. A arquitetura deve mudar quando diretórios, responsabilidades ou
contratos mudarem, não a cada nova imagem. A central deve apontar para o README
individual, que deve ser a fonte operacional do desafio.

## 16. Plano de correção proposto

Ordem recomendada, sem execução nesta tarefa:

1. corrigir as duas descrições incorretas dos `main`;
2. preencher os resultados e a complexidade do Two Sum com dados comprovados;
3. remover ou marcar como histórica a tabela antiga do Two Sum;
4. marcar estados antigos de ausência de imagens como históricos;
5. consolidar tabelas, galerias e descrições repetidas;
6. simplificar os READMEs para o padrão mínimo;
7. atualizar central, histórico corrente e arquitetura sem apagar registros
   cronológicos;
8. validar novamente links e hashes;
9. revisar a decisão pedagógica com Gabriel.

### Correções automáticas e seguras

- Atualizar a entrada descrita como `main` para coincidir com o fonte atual.
- Preencher tabelas com os seis resultados já visíveis.
- Registrar `O(n)` médio de tempo e `O(n)` de espaço do Two Sum, com a ressalva
  de custo médio do `HashMap`.
- Atualizar contagens e existência das imagens nos documentos correntes.
- Marcar frases de “não existem prints” como históricas quando o contexto e a
  data permitirem.

### Correções que precisam de confirmação de Gabriel

- Remover, resumir ou manter as tentativas e a tabela antiga do Two Sum.
- Escrever ou revisar o Feynman e a retrospectiva pessoal.
- Escolher três ou quatro testes representativos para o padrão futuro.
- Decidir o grau de detalhe desejado no histórico e na arquitetura.
- Decidir se a conclusão de Two Sum continuará sendo declarada segundo o
  histórico mesmo com Feynman e complexidade fora do roteiro antigo.

### Melhorias que podem ser adiadas

- Reorganização visual das galerias de PNG.
- Redução das 14 páginas Markdown para uma central mais curta.
- Inclusão de links diretos para imagens nos índices gerais.
- Ajustes de comentários didáticos nos fontes.

## 17. Arquivos que seriam alterados na correção

Uma correção futura provavelmente envolveria:

- `relatorios/dsa/semana1/two-sum/README.md`;
- `relatorios/dsa/semana1/contains-duplicate/README.md`;
- `relatorios/dsa/README.md`;
- `HISTORICO_ESTUDOS.md`;
- `docs/ARQUITETURA_ATUAL_REPOSITORIO.md`;
- eventualmente `relatorios/README.md` e `README.md` se a política geral de
  evidências for simplificada.

Os arquivos históricos de reorganização só devem receber notas de contexto;
suas narrativas não devem ser reescritas como se fossem o estado atual. Nenhum
arquivo Java ou PNG precisa ser alterado para corrigir os achados documentais.

## 18. Decisões que Gabriel precisa tomar

1. O Feynman e a retrospectiva do Two Sum serão escritos agora ou continuarão
   fora do relatório operacional?
2. A complexidade `O(n)` média e `O(n)` de espaço deve ser registrada no README
   com uma nota sobre o custo médio do `HashMap`?
3. A tabela antiga de quatro testes deve ser removida, marcada como histórica ou
   mantida junto da tabela de seis evidências?
4. Seis imagens por desafio continuarão sendo o padrão ou três/quatro casos
   bastarão para as próximas atividades?
5. O histórico deve conservar todos os diagnósticos detalhados ou registrar
   somente decisões, evidências e o próximo passo?
6. A arquitetura será atualizada apenas quando a estrutura mudar?

## 19. Conclusão

A documentação possui uma base coerente: os códigos canônicos existem, as 12
imagens conferem com os resultados, a navegação não tem links quebrados e os
status centrais distinguem Two Sum concluído segundo o histórico de Contains
Duplicate em validação. A principal dificuldade é a coexistência de um roteiro
antigo ainda marcado como pendente com evidências novas já aprovadas, somada a
duas descrições de entrada do `main` que não correspondem ao código atual.

Os campos técnicos do Two Sum podiam ser preenchidos com segurança a partir do
código e dos testes existentes. Feynman, retrospectiva, seleção de evidências e
grau de concisão continuam decisões de Gabriel. As correções aplicadas depois
desta auditoria estão resumidas na seção seguinte; a revisão de Gabriel continua
necessária antes de qualquer commit.

## Resultado da correção

- incoerências factuais dos métodos `main`: corrigidas;
- tabela antiga do Two Sum: removida;
- complexidade do Two Sum: preenchida;
- navegação rápida: implementada;
- status técnicos: atualizados;
- histórico corrente: simplificado;
- documentos históricos: preservados.
