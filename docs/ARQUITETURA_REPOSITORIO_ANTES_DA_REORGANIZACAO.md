# Arquitetura atual — Java Junior Prep

Documento de análise em 05/09/2026. Base: cópia local em `C:\Projetos\java-junior-prep`, cujo remoto `origin` aponta para `GabrielF0900/java-junior-prep`. Não foi feita comparação com o estado remoto no GitHub. Arquivos locais não rastreados também fazem parte deste retrato.

Escopo: leitura e documentação. As propostas abaixo não foram implementadas. Nenhum exercício foi concluído, movido, renomeado ou corrigido nesta tarefa. `AGENTS.md` foi lido primeiro.

## 1. Visão geral

O repositório é um ambiente pessoal de aprendizagem para Gabriel Falcão da Cruz se preparar para vagas Java Júnior. Reúne laboratórios, desafios algorítmicos, materiais de consulta e acompanhamento. Não há uma aplicação de negócio com camadas de controller, service e repository implementadas aqui.

- **Java:** versão 17 como linguagem e alvo, conforme `AGENTS.md` e as propriedades `maven.compiler.source` e `maven.compiler.target` do POM. Isso não determina qual JDK está instalado ou sendo usado hoje.
- **Maven:** projeto único, sem módulos; coordenadas `br.com.gabrielfalcao:java-junior-prep:1.0-SNAPSHOT`. Empacotamento padrão `jar`, pois não há `packaging` explícito. Fontes em `src/main/java` e testes em `src/test/java`; codificação UTF-8.
- **Dependências:** JUnit Jupiter 5.10.0, Mockito Core 5.5.0 e Mockito JUnit Jupiter 5.5.0, todas com escopo `test`. As classes principais usam a API padrão Java. Não há framework web ou driver SQL declarado.
- **Build:** o POM não fixa plugins de compilação ou execução de testes, nem configura cobertura, perfis ou toolchains. Não há Maven Wrapper no inventário local.
- **Pacote-base:** `br.com.gabrielfalcao.prep`; não confundir com o `groupId`, que é `br.com.gabrielfalcao`.
- **Trilhas físicas:** Java Core e DSA em `src/main/java`; Testes no pacote `testes` sob `src/test/java`. SQL consta do planejamento, mas não possui pasta ou scripts.
- **Semanas físicas:** Java Core e DSA possuem `semana1` e `semana2`; Testes possui `semana1` e um teste geral fora de semana. A existência de uma pasta não indica estudo concluído.

O plano geral é de 12 semanas. No calendário, Java Core tem seis semanas, DSA, Testes e SQL têm doze, e Storytelling ocupa as semanas 7–12. O hub também inclui Inglês, com calendário próprio de 16 semanas; isso amplia o escopo do HTML além das quatro trilhas de código descritas pelo README.

O método combina teoria previamente estudada, cerca de 20% de recuperação ativa e 80% de prática, previsões antes de executar, tentativa do estudante, dicas progressivas, casos-limite e explicação Feynman. DSA acrescenta reconhecimento de padrões e análise de tempo e espaço. Testes servem tanto como assunto de estudo quanto como validação dos exercícios, quando previstos ou solicitados. Compilar não demonstra, por si só, aprendizagem nem conclusão do laboratório.

As fontes têm papéis distintos: `index.html` define o calendário; `AGENTS.md` define método e regras; `HISTORICO_ESTUDOS.md` registra continuidade; código mostra a implementação presente. O histórico informa teoria concluída de Java Core 1.1 e 1.2 e uma pendência Feynman do exercício 01. Não é possível inferir avanço posterior a partir da data atual ou de placeholders.

## 2. Árvore real do repositório

Árvore obtida do sistema de arquivos, incluindo o documento criado nesta tarefa. Caminhos intermediários sem ramificações foram compactados com `/`. Todos os 16 arquivos `.java` de `src` aparecem abaixo. Não existem outros arquivos ou diretórios de recursos dentro de `src/main` e `src/test` neste retrato.

```text
java-junior-prep/
├── AGENTS.md
├── ARQUITETURA_REPOSITORIO.md
├── HISTORICO_ESTUDOS.md
├── README.md
├── pom.xml
├── index.html
├── colecoes_java_pdf.html
├── relatorios/
│   ├── exercicio01-two-sum.md
│   ├── guia-completo-string-pool-java17.html
│   ├── guia-completo-string-pool-java17.pdf
│   ├── laboratorio-01-igualdade-referencias.html
│   └── laboratorio-01-igualdade-referencias.pdf
└── src/
    ├── main/java/br/com/gabrielfalcao/prep/
    │   ├── dsa/
    │   │   ├── semana1/
    │   │   │   ├── ContainsDuplicate.java
    │   │   │   └── TwoSum.java
    │   │   └── semana2/
    │   │       └── ValidParentheses.java
    │   └── javacore/
    │       ├── semana1/
    │       │   ├── ContainsDuplicate/
    │       │   │   └── ContainsDuplicate.java
    │       │   ├── exercicio01igualdadedereferencias/
    │       │   │   ├── Exercicio01IgualdadeDeReferencias.java
    │       │   │   └── Produto.java
    │       │   ├── exercicio01twosum/
    │       │   │   ├── TwoSum.java
    │       │   │   └── TwoSumDesafioFinal.java
    │       │   ├── exercicio02stringpool/
    │       │   │   └── Exercicio02StringPool.java
    │       │   ├── exercicio03equalsehashcode/
    │       │   │   └── Exercicio03EqualsEHashCode.java
    │       │   ├── exercicio04listas/
    │       │   │   └── Exercicio04Listas.java
    │       │   ├── exercicio05sets/
    │       │   │   └── Exercicio05Sets.java
    │       │   └── exercicio06maps/
    │       │       └── Exercicio06Maps.java
    │       └── semana2/
    │           └── StreamsExemplo.java
    └── test/java/br/com/gabrielfalcao/prep/
        └── testes/
            ├── SanityCheckTest.java
            └── semana1/
                └── SafeWalletServiceTest.java
```

Também existem `.git/`, `.m2/` e `target/`, omitidos do desenho pedagógico. Não foram encontrados `.idea/`, `.vscode/`, `.gitignore`, `sql/`, configuração de CI, frontend com `package.json` ou implementação de `/api/progress` na árvore relevante. O nome `colecoes_java_pdf.html` designa um HTML, não um PDF; não há PDF homônimo na raiz.

## 3. Explicação por diretório

| Local | Responsabilidade e estado observado |
| --- | --- |
| `src/main/java/.../javacore` | Laboratórios de linguagem e APIs. Semana 1 tem seis pastas didáticas numeradas, um objeto auxiliar e desafios DSA indevidamente misturados. Semana 2 contém apenas o arquivo reservado a Streams. |
| `src/main/java/.../dsa` | Destino correto dos algoritmos. Os três arquivos presentes têm somente `package` e `TODO`; as implementações reais de Two Sum estão fora desta trilha. |
| `src/test/java/.../testes` | Fonte de testes Maven e trilha didática de JUnit/Mockito. Contém um teste aritmético com `@Test` e um arquivo reservado ao SafeWallet sem classe nem teste. Não há uso de Mockito nos fontes atuais. |
| `sql` | Não existe. O calendário prevê consultas, mas não há scripts, esquema, dados de exemplo ou conexão com banco neste projeto. |
| `relatorios` | Mistura relatório de aprendizagem, guia teórico e roteiro de resolução de DSA. Não está separado por trilha ou semana. |
| Raiz | Configuração Maven, instruções, visão do projeto, histórico, calendário interativo e guia de coleções. |

**HTMLs:** `index.html` é um hub em HTML/CSS/JavaScript, com dados de calendário e lógica de interface no mesmo arquivo. Carrega Tailwind pelo CDN e fontes do Google. Renderiza trilhas, semanas, subtópicos, progresso, check-ins e datas recalculadas a partir do início escolhido. Usa `localStorage`, incluindo `hubGabrielV3`, `hubGabrielStudyLog`, `hub_startedAt` e `syncToken`. Faz GET em `/api/progress` ao carregar e POST com token quando sincroniza. Não existe backend correspondente neste repositório; a integração depende de ambiente externo não verificado. O Maven não integra esse HTML ao build Java.

`colecoes_java_pdf.html` é material didático preparado para leitura/impressão, com Array, ArrayList, LinkedList, conjuntos, mapas, custos e padrões de entrevista. O guia de String Pool em `relatorios` aborda identidade, imutabilidade, literais, `new`, concatenação, `intern()`, `null`, experimentos e revisão. O HTML do laboratório 01 registra o estágio de 12/08/2026 com exemplos de `Pessoa` e pendência sobre `null`.

**Acompanhamento:** o histórico descreve sessões e retomada; o relatório Two Sum contém decomposição e pseudocódigo, com testes, complexidades e Feynman ainda a preencher. Progresso salvo no navegador não pode ser reconstruído apenas lendo os arquivos do Git.

**Gerados:** `target` contém saídas de build e `.m2` contém cache/dependências locais, sem responsabilidade pedagógica. Os PDFs de `relatorios` são artefatos de consulta, aparentemente exportações dos HTMLs homônimos; sua equivalência visual/textual não foi verificada. Não devem ser tratados como descartáveis apenas por serem PDFs. Não há script de geração desses documentos no inventário.

## 4. Mapeamento dos exercícios

Nesta tabela, caminhos Java são relativos a `src/main/java/br/com/gabrielfalcao/prep/`, exceto os prefixados por `TEST:`, relativos a `src/test/java/br/com/gabrielfalcao/prep/`. Os demais são relativos à raiz. “Implementado” descreve presença de lógica, não aprovação de testes nem conclusão pedagógica.

| Arquivo | Trilha | Semana | Assunto | Estado aparente |
| --- | --- | --- | --- | --- |
| `javacore/semana1/ContainsDuplicate/ContainsDuplicate.java` | DSA pelo desafio; localizado em Java Core | 1 | Contains Duplicate, DSA 2.1 | Placeholder: classe pública vazia; arquivo não rastreado preexistente |
| `javacore/semana1/exercicio01igualdadedereferencias/Exercicio01IgualdadeDeReferencias.java` | Java Core | 1 | Identidade, String Pool, igualdade, HashSet e listas; mistura 1.1 e 1.2 | Parcialmente implementado em relação ao enunciado: tem `main` com experimentos, mas não corresponde mais às previsões e ao escopo original |
| `javacore/semana1/exercicio01igualdadedereferencias/Produto.java` | Java Core | 1 | Objeto auxiliar com `id` e `nome` | Implementado como objeto simples com construtor; sem sobrescrita de `equals()` ou `hashCode()` |
| `javacore/semana1/exercicio01twosum/TwoSum.java` | DSA; localizado em Java Core | 1 | Complemento e índices em HashMap, DSA 2.1/2.2 | Implementado: método e exemplo em `main`; sem testes automatizados correspondentes |
| `javacore/semana1/exercicio01twosum/TwoSumDesafioFinal.java` | DSA; localizado em Java Core | 1 | Segunda tentativa de Two Sum | Implementado: mesma estratégia, imprime mapa e mantém comentário TODO residual |
| `javacore/semana1/exercicio02stringpool/Exercicio02StringPool.java` | Java Core | 1 | String Pool, tópico 1.1 | Placeholder: classe vazia com enunciado detalhado |
| `javacore/semana1/exercicio03equalsehashcode/Exercicio03EqualsEHashCode.java` | Java Core | 1 | Contrato de igualdade em HashSet/HashMap, tópico 1.1 | Placeholder: classe vazia com enunciado detalhado |
| `javacore/semana1/exercicio04listas/Exercicio04Listas.java` | Java Core | 1 | Array, ArrayList e LinkedList, tópico 1.2 | Placeholder: classe vazia com enunciado detalhado |
| `javacore/semana1/exercicio05sets/Exercicio05Sets.java` | Java Core | 1 | HashSet, LinkedHashSet e TreeSet, tópico 1.2 | Placeholder: classe vazia com enunciado detalhado |
| `javacore/semana1/exercicio06maps/Exercicio06Maps.java` | Java Core | 1 | HashMap, LinkedHashMap e TreeMap, tópico 1.2 | Placeholder: classe vazia com enunciado detalhado |
| `javacore/semana2/StreamsExemplo.java` | Java Core | 2 | Streams e Lambdas, tópico 1.3 | Somente TODO e package, sem classe |
| `dsa/semana1/ContainsDuplicate.java` | DSA | 1 | HashSet aplicado a duplicatas, tópico 2.1 | Somente TODO e package, sem classe |
| `dsa/semana1/TwoSum.java` | DSA | 1 | HashMap aplicado a soma, tópico 2.1 | Somente TODO e package, sem classe |
| `dsa/semana2/ValidParentheses.java` | DSA | 2 física; 4 no calendário | Stack / Queue, tópico 2.4 | Somente TODO e package, sem classe |
| `TEST: testes/SanityCheckTest.java` | Testes | Geral; README associa à 1 | Sanidade de JUnit com `assertEquals(4, 2 + 2)` | Implementado: um método `@Test`; não testa laboratórios |
| `TEST: testes/semana1/SafeWalletServiceTest.java` | Testes | 1 física; aplicação SafeWallet na 2 do calendário | Testes de serviço SafeWallet | Teste vazio em sentido pedagógico: somente TODO e package, sem classe ou `@Test` |
| `relatorios/exercicio01-two-sum.md` | DSA | 1 por associação com Two Sum | Decomposição, HashMap e pseudocódigo | Parcialmente preenchido; validação e fechamento pendentes |
| `relatorios/laboratorio-01-igualdade-referencias.html` | Java Core | 1 | Relatório de igualdade, tópico 1.1 | Relatório preenchido de estágio anterior; pendência Feynman explícita |
| `relatorios/laboratorio-01-igualdade-referencias.pdf` | Java Core | 1 por associação ao HTML | Artefato de consulta do laboratório | Precisa de análise manual para confirmar equivalência ao HTML |
| `relatorios/guia-completo-string-pool-java17.html` | Java Core | 1, tópico 1.1 | Material teórico e roteiro de String Pool | Material preenchido; não comprova implementação do exercício 02 |
| `relatorios/guia-completo-string-pool-java17.pdf` | Java Core | 1 por associação ao HTML | Artefato de consulta sobre String Pool | Precisa de análise manual para confirmar equivalência ao HTML |
| `colecoes_java_pdf.html` | Java Core, com exemplos de padrões DSA | 1 como apoio a 1.2 | Guia de coleções e custos | Material preenchido; não é exercício Java executável |

Há 14 arquivos Java em `main` e dois em `test`: 11 declaram classe pública e cinco não declaram tipo algum. Nenhum arquivo de fonte é gerado automaticamente. Materiais teóricos adicionais não demonstram que Gabriel chegou a seus tópicos.

## 5. Pacotes Java

Comparação individual. Aqui `B` significa literalmente `br.com.gabrielfalcao.prep`; `M/` significa `src/main/java/br/com/gabrielfalcao/prep/` e `T/` significa `src/test/java/br/com/gabrielfalcao/prep/`.

| Caminho físico | Package declarado (prefixo B expandível) | Classe pública / correspondência |
| --- | --- | --- |
| `M/dsa/semana1/ContainsDuplicate.java` | `B.dsa.semana1` | Não declarada; pasta/package coincidem |
| `M/dsa/semana1/TwoSum.java` | `B.dsa.semana1` | Não declarada; pasta/package coincidem |
| `M/dsa/semana2/ValidParentheses.java` | `B.dsa.semana2` | Não declarada; pasta/package coincidem |
| `M/javacore/semana1/ContainsDuplicate/ContainsDuplicate.java` | `B.javacore.semana1.ContainsDuplicate` | `ContainsDuplicate`; nome coincide; pacote contém maiúsculas |
| `M/javacore/semana1/exercicio01igualdadedereferencias/Exercicio01IgualdadeDeReferencias.java` | `B.javacore.semana1.exercicio01igualdadedereferencias` | `Exercicio01IgualdadeDeReferencias`; coincide |
| `M/javacore/semana1/exercicio01igualdadedereferencias/Produto.java` | `B.javacore.semana1.exercicio01igualdadedereferencias` | `Produto`; coincide |
| `M/javacore/semana1/exercicio01twosum/TwoSum.java` | `B.javacore.semana1.exercicio01twosum` | `TwoSum`; coincide |
| `M/javacore/semana1/exercicio01twosum/TwoSumDesafioFinal.java` | `B.javacore.semana1.exercicio01twosum` | `TwoSumDesafioFinal`; coincide |
| `M/javacore/semana1/exercicio02stringpool/Exercicio02StringPool.java` | `B.javacore.semana1.exercicio02stringpool` | `Exercicio02StringPool`; coincide |
| `M/javacore/semana1/exercicio03equalsehashcode/Exercicio03EqualsEHashCode.java` | `B.javacore.semana1.exercicio03equalsehashcode` | `Exercicio03EqualsEHashCode`; coincide |
| `M/javacore/semana1/exercicio04listas/Exercicio04Listas.java` | `B.javacore.semana1.exercicio04listas` | `Exercicio04Listas`; coincide |
| `M/javacore/semana1/exercicio05sets/Exercicio05Sets.java` | `B.javacore.semana1.exercicio05sets` | `Exercicio05Sets`; coincide |
| `M/javacore/semana1/exercicio06maps/Exercicio06Maps.java` | `B.javacore.semana1.exercicio06maps` | `Exercicio06Maps`; coincide |
| `M/javacore/semana2/StreamsExemplo.java` | `B.javacore.semana2` | Não declarada; pasta/package coincidem |
| `T/testes/SanityCheckTest.java` | `B.testes` | `SanityCheckTest`; coincide |
| `T/testes/semana1/SafeWalletServiceTest.java` | `B.testes.semana1` | Não declarada; pasta/package coincidem |

Não foi encontrada incompatibilidade entre caminho e declaração de pacote, nem entre classe pública existente e nome do arquivo. Cada arquivo que declara classe pública contém apenas uma. `ContainsDuplicate` como segmento de pacote é permitido sintaticamente, mas foge da convenção de pacotes em minúsculas. Os cinco arquivos sem classe não produzem as classes sugeridas por seus nomes; isso não equivale, isoladamente, a erro de compilação.

Os dois arquivos chamados `TwoSum.java` têm pacotes diferentes e o de DSA não declara classe. Portanto a duplicação atual é de localização/intenção e implementação pedagógica, não de nome totalmente qualificado. Mover arquivos sem reconciliar destinos existentes criaria conflito físico mesmo que hoje não haja conflito de classes.

## 6. Separação entre Java Core e DSA

**Contains Duplicate:** ambos os caminhos identificam um desafio algorítmico. O destino em `dsa/semana1` está correto. O arquivo em `javacore/semana1/ContainsDuplicate` está na trilha errada, embora vazio. Não existe implementação de detecção de duplicatas em nenhum dos dois.

**Two Sum:** as duas classes de `exercicio01twosum` executam a mesma estratégia: percorrem o array, procuram o complemento no mapa e armazenam valor associado ao índice. A segunda muda a entrada e imprime o mapa; não constitui um novo padrão algorítmico. As duas pertencem a DSA semana 1, tópicos 2.1 e 2.2, e não ao laboratório de APIs de mapas. O arquivo já existente em DSA é somente uma reserva. O TODO residual de `TwoSumDesafioFinal` não significa que o método esteja vazio.

**Sets:** `Exercicio05Sets.java` está corretamente em Java Core: seu enunciado compara duplicatas, ordem e custos de três implementações. O uso de `HashSet<Produto>` para observar igualdade também pertence a Java Core 1.1. A presença da mesma coleção em Contains Duplicate não torna os objetivos equivalentes.

**Igualdade e hashing:** as pastas dos exercícios 01, 02 e 03 pertencem corretamente à trilha Java Core. Entretanto o `main` do exercício 01 contém Strings, `equals()`, produtos, HashSet e listas, apesar de o enunciado limitar o exercício a `==` e proibir `equals()`. O exercício 03, reservado ao contrato, continua vazio.

`Produto` não sobrescreve `equals()` nem `hashCode()`. Por leitura do código, `p1.equals(p2)` para as duas instâncias será `false`, diferentemente do comentário que prevê `true`. Ter um atributo String não transfere a implementação de igualdade de String para Produto. O tamanho dois do conjunto decorre da ausência de igualdade lógica entre os objetos; não é correto afirmar que instâncias distintas necessariamente têm hashes distintos. Esses são problemas conceituais registrados, não corrigidos nesta tarefa.

**Listas e mapas:** os exercícios 04 e 06 estão corretamente em Java Core 1.2, mas vazios. Os experimentos de ArrayList e LinkedList já escritos estão concentrados no exercício 01. Eles precisam ser preservados e avaliados antes de qualquer extração. As implementações Two Sum não substituem comparação entre HashMap, LinkedHashMap e TreeMap.

**Testes e SQL:** o teste de sanidade está na fonte de testes correta, mas não valida nenhum algoritmo ou laboratório. Não há teste implementado para SafeWallet nem classe de serviço SafeWallet no repositório. SQL ainda é somente planejamento. Nenhuma dependência de banco deve ser presumida a partir do nome SafeWallet.

## 7. Divergências

| Fontes comparadas | Divergência observada | Consequência |
| --- | --- | --- |
| README × arquivos | `ColecoesExemplo.java` e `EqualsEHashing.java` não existem nos fontes. | A árvore e a tabela semanal do README estão desatualizadas. |
| README × arquivos | Não descreve as seis pastas de exercícios, Produto, Two Sum em Java Core, Contains Duplicate extra, relatórios, HTMLs e histórico. | O README sozinho não representa a arquitetura. |
| AGENTS/histórico × arquivos | Algoritmos Two Sum e Contains Duplicate estão em Java Core. | Separação de trilhas não é respeitada nesses caminhos. |
| Enunciado do exercício 01 × corpo | Proíbe `equals()`, mas o código o usa; também mistura coleções com identidade. Previsões antigas de primitivos/Pessoa permanecem nos comentários. | Nome, objetivo e experimentos já não coincidem. |
| Histórico/relatório 01 × fontes | Registram `Pessoa.java`, comparações de primitivos e referência compartilhada; hoje há `Produto.java`, Strings, HashSet e listas. `Pessoa.java` não existe em `src`. | O registro é de um estágio anterior; não deve ser apresentado como descrição atual do código. |
| Histórico × relatórios | Prevê avaliação Markdown junto a cada exercício; há relatório HTML/PDF em `relatorios` e roteiro Markdown de DSA centralizado. | Local e formato de acompanhamento estão inconsistentes; falta uma decisão explícita sobre relatórios versus guias. |
| README/DSA físico × calendário | `ValidParentheses.java` está na semana 2; o calendário o coloca em semana 4, tópico 2.4 Stack / Queue. | A semana física não acompanha a fonte de calendário. |
| README/Testes físico × calendário | `SafeWalletServiceTest.java` está na semana 1; aplicação no SafeWallet Core é semana 2. Semana 1 trata JUnit 5 Core. | Confirmar se era reserva para semana 2 ou exercício introdutório antes de mover. |
| Plano × progresso | Java Core 1.3 aparece na semana 2, mas o histórico mantém foco em 1.1/1.2; datas do hub são recalculáveis e progresso é externo aos fontes. | Não inferir atividade atual nem iniciar tópicos a partir do relógio. |
| Numeração | Existem `exercicio01igualdadedereferencias` e `exercicio01twosum` na mesma semana de Java Core. | “Exercício 01” fica ambíguo; o relatório Two Sum também usa esse número. |
| Numeração dos tópicos × semanas | Streams é tópico 1.3 e fica na semana 2. | O prefixo do tópico não é o número da semana; não há erro nessa localização. |
| Planejamento SQL × arquivos | Calendário prevê SQL desde a semana 1, mas README diz futuro e não há pasta SQL. | Ausência real de implementação; não prova atraso sem confirmar progresso. |
| Testes declarados × testes existentes | Mockito está no POM, mas não é utilizado; só há um `@Test` aritmético. | Configuração de dependências não representa cobertura dos laboratórios. |
| Git × desenho pedagógico | `git ls-files` identifica 590 arquivos rastreados em `.m2` e 12 em `target`. Não há `.gitignore` local. | Cache e saídas de build estão versionados; contagens são do índice, sem usar conteúdo interno como arquitetura. |
| Hub × repositório | Chamadas a `/api/progress` não possuem implementação local. | Sincronização não é serviço deste projeto Maven; implantação externa não foi verificada. |
| Calendário × ambiente | Java Core 1.7 se chama “Java Moderno (17/21)” e uma revisão cita IntelliJ; AGENTS exige Java 17 e indica Antigravity. | Não autoriza introduzir recursos exclusivos de Java 21; referência à IDE está desalinhada. |

Há ainda imprecisões no próprio texto de DSA do calendário: “Group Anagrams — usar hashCode da string ordenada como chave” pode sugerir usar apenas um inteiro sujeito a colisões; a representação ordenada completa é diferente de seu hash isolado. O título da semana 2 promete três problemas extras, mas os subtópicos nomeiam Ransom Note e Isomorphic Strings, além de Feynman. O texto de Two Sum fala em guardar o complemento, enquanto os códigos atuais guardam o valor e buscam o complemento, uma estratégia válida. Registrar essas diferenças não exige alterar o calendário nesta etapa.

Placeholders são compatíveis com aprendizagem orientada por tentativas e não devem ser completados automaticamente. A ausência de arquivos das semanas futuras tampouco exige criá-los antecipadamente.

Antes de qualquer reorganização que resolva conflitos entre README, calendário e arquivos, Gabriel deverá decidir qual referência prevalece em cada divergência, como exige `AGENTS.md`. A proposta seguinte é material para essa decisão, não autorização de execução.

## 8. Organização recomendada

Proposta simples: manter o projeto Maven único, preservar os seis diretórios atuais de Java Core, consolidar cada desafio DSA em um arquivo canônico na semana correspondente e separar materiais teóricos de relatos de prática. Não criar novas camadas de aplicação nem módulos Maven.

A árvore abaixo é **futura e condicional**. `...` significa expansão conforme o calendário e o avanço confirmado, não diretórios que existem hoje. Testes indicados são exemplos de correspondência para quando forem solicitados ou previstos, sem antecipar sua implementação. O Markdown do histórico orienta relatórios junto ao exercício; a centralização abaixo precisaria de aprovação e atualização dessa convenção.

```text
java-junior-prep/
├── AGENTS.md
├── ARQUITETURA_REPOSITORIO.md
├── HISTORICO_ESTUDOS.md
├── README.md
├── pom.xml
├── .gitignore                         (proposto)
├── index.html                         (calendário mantido na raiz)
├── materiais/
│   └── javacore/semana1/
│       ├── colecoes_java_pdf.html
│       ├── guia-completo-string-pool-java17.html
│       └── guia-completo-string-pool-java17.pdf
├── relatorios/
│   ├── javacore/semana1/
│   │   ├── laboratorio-01-igualdade-referencias.html
│   │   └── laboratorio-01-igualdade-referencias.pdf
│   ├── dsa/semana1/
│   │   └── exercicio01-two-sum.md       (preservar tentativas e diferenças)
│   └── ...                            (testes/sql quando houver registros)
├── sql/
│   ├── semana1/                       (scripts de INNER JOIN quando iniciados)
│   └── ...                            (semanas 2–12 conforme avanço)
└── src/
    ├── main/java/br/com/gabrielfalcao/prep/
    │   ├── javacore/
    │   │   ├── semana1/
    │   │   │   ├── exercicio01igualdadedereferencias/
    │   │   │   │   ├── Exercicio01IgualdadeDeReferencias.java
    │   │   │   │   └── Produto.java
    │   │   │   ├── exercicio02stringpool/Exercicio02StringPool.java
    │   │   │   ├── exercicio03equalsehashcode/Exercicio03EqualsEHashCode.java
    │   │   │   ├── exercicio04listas/Exercicio04Listas.java
    │   │   │   ├── exercicio05sets/Exercicio05Sets.java
    │   │   │   └── exercicio06maps/Exercicio06Maps.java
    │   │   ├── semana2/StreamsExemplo.java
    │   │   └── ...                    (semanas 3–6; revisões conforme calendário)
    │   └── dsa/
    │       ├── semana1/
    │       │   ├── ContainsDuplicate.java
    │       │   └── TwoSum.java
    │       ├── semana4/ValidParentheses.java
    │       └── ...                    (demais semanas até 12, quando necessárias)
    └── test/java/br/com/gabrielfalcao/prep/
        ├── testes/
        │   ├── SanityCheckTest.java
        │   ├── semana2/SafeWalletServiceTest.java
        │   └── ...                    (laboratórios de testes até semana 12)
        ├── javacore/semana1/
        │   └── exercicio03equalsehashcode/Exercicio03EqualsEHashCodeTest.java
        └── dsa/semana1/
            ├── ContainsDuplicateTest.java
            └── TwoSumTest.java
```

Testes de um laboratório podem espelhar o pacote da classe testada em `src/test/java`; a trilha `testes` fica para exercícios cujo objetivo é aprender JUnit/Mockito. Isso separa responsabilidade sem criar um segundo projeto. Os testes futuros não precisam todos nascer juntos.

Manter `Produto` inicialmente no exercício 01 evita retirar uma dependência ainda utilizada. Na reorganização interna de igualdade, decidir se o modelo passará ao exercício 03 e atualizar referências em conjunto; não criar um modelo global apenas para compartilhar dois campos. A árvore não presume uma segunda classe Produto.

## 9. Plano de reorganização seguro

**Não executado.** Nos itens Java, `M/` e `T/` têm o mesmo significado da seção 5. Primeiro aprovar a resolução das divergências; depois preservar conteúdo e validar uma mudança por vez. Nenhum arquivo com tentativa de Gabriel deve ser sobrescrito silenciosamente.

1. **Conciliar as fontes de orientação.** Origem: árvore/tabela do `README.md`, estado registrado em `HISTORICO_ESTUDOS.md` e divergências deste documento. Destino: os mesmos documentos, revisados após decisão de Gabriel; preservar entradas cronológicas e acrescentar atualização, sem apagar o passado. Motivo: estabelecer calendário, semana e convenção de relatórios. Package: nenhum. Testes: nenhum impacto direto. Risco de compilação: nenhum. Prioridade: **alta**.

2. **Consolidar Contains Duplicate.** Origem: `M/javacore/semana1/ContainsDuplicate/ContainsDuplicate.java`; destino canônico já existente: `M/dsa/semana1/ContainsDuplicate.java`. Aproveitar a reserva DSA e, se desejado, incorporar a declaração da classe vazia. O primeiro não possui algoritmo nem comentários pedagógicos; o segundo contém apenas TODO. Package final: `br.com.gabrielfalcao.prep.dsa.semana1`. Testes: nenhum atual referencia esses arquivos; futuros testes usarão o pacote DSA. Risco: **baixo**, desde que não se sobrescreva uma tentativa adicionada após esta análise. A retirada do placeholder redundante e da pasta vazia só ocorreria depois da conferência e autorização. Prioridade: **alta**.

3. **Consolidar Two Sum preservando as duas tentativas.** Origens: `M/javacore/semana1/exercicio01twosum/TwoSum.java` e `TwoSumDesafioFinal.java`. Destino executável: `M/dsa/semana1/TwoSum.java`, hoje somente TODO. Destino das diferenças e tentativas: seção no relatório `relatorios/dsa/semana1/exercicio01-two-sum.md`, após preservar integralmente comentários, entradas de exemplo e impressão de depuração que Gabriel desejar manter. Package: substituir `br.com.gabrielfalcao.prep.javacore.semana1.exercicio01twosum` por `br.com.gabrielfalcao.prep.dsa.semana1` na classe canônica. Testes: atualizar futuros imports e comandos de execução; não há testes atuais dos métodos. Risco: **médio**, por colisão com arquivo de destino e seleção de conteúdo. Não recomendar exclusão das tentativas antes de preservá-las e confirmar a consolidação. Prioridade: **alta**.

4. **Realinhar o conteúdo do exercício 01 por objetivo.** Origem: blocos de `M/javacore/semana1/exercicio01igualdadedereferencias/Exercicio01IgualdadeDeReferencias.java`. Destinos: manter identidade no exercício 01; avaliar Strings para `exercicio02stringpool/Exercicio02StringPool.java`, igualdade/HashSet de Produto para `exercicio03equalsehashcode/Exercicio03EqualsEHashCode.java` e listas para `exercicio04listas/Exercicio04Listas.java`, todos sob `M/javacore/semana1/`. Preservar previsões e comentários, explicando correções conceituais ao estudante. Package: classes de destino já têm seus pacotes; mover blocos não exige renomeá-las. Se Produto mudar de pasta, revisar package/imports e todos os usos juntos. Testes: ainda não há testes correspondentes; validar cada `main` e casos pertinentes após autorização. Risco: **médio**, por escopo de variáveis, dependência Produto e imports. Prioridade: **média**. Não preencher os demais exercícios nem implementar o contrato como efeito colateral da organização.

5. **Alinhar a semana de Valid Parentheses.** Origem: `M/dsa/semana2/ValidParentheses.java`; destino proposto: `M/dsa/semana4/ValidParentheses.java`, se Gabriel confirmar a prevalência do calendário. Package: de `br.com.gabrielfalcao.prep.dsa.semana2` para `br.com.gabrielfalcao.prep.dsa.semana4`. Conteúdo a preservar: package e TODO; não há solução. Testes: nenhum atual. Risco: **baixo**. Prioridade: **média**. Mover uma reserva não autoriza iniciar o assunto.

6. **Confirmar o papel de SafeWalletServiceTest.** Origem: `T/testes/semana1/SafeWalletServiceTest.java`; destino proposto: `T/testes/semana2/SafeWalletServiceTest.java`, apenas se corresponder à aplicação SafeWallet prevista na semana 2. Package: de `br.com.gabrielfalcao.prep.testes.semana1` para `br.com.gabrielfalcao.prep.testes.semana2`. Conteúdo a preservar: TODO; não há classe. Testes: não há método a migrar nem serviço local para testar. Risco: **baixo** para deslocar a reserva; qualquer futura integração exige escopo próprio. Prioridade: **média**.

7. **Separar materiais de relatos sem perder exportações.** Origens: `colecoes_java_pdf.html` e `relatorios/guia-completo-string-pool-java17.{html,pdf}`; destinos: `materiais/javacore/semana1/` com os mesmos nomes. Origens: `relatorios/laboratorio-01-igualdade-referencias.{html,pdf}` e `relatorios/exercicio01-two-sum.md`; destinos: respectivamente `relatorios/javacore/semana1/` e `relatorios/dsa/semana1/`. Motivo: distinguir teoria e registro de tentativa. Preservar todos os arquivos; verificar equivalência dos PDFs separadamente, sem exclusão presumida. Package: nenhum. Testes: nenhum impacto Java; revisar links e referências textuais. Risco de compilação: nenhum. Prioridade: **baixa**. Requer aprovação da convenção centralizada em lugar da localização junto aos exercícios prevista no histórico.

8. **Preparar SQL somente no momento de estudo.** Origem: planejamento SQL do `index.html`, sem arquivo de exercício existente. Destino proposto: `sql/semana1/`, com scripts apenas quando Gabriel iniciar/confirmar a prática; ampliar por semana até 12 conforme necessário. Motivo: separar consultas de Java. Package: não se aplica. Testes: nenhum impacto nos testes Java; execução SQL dependerá do banco e dos dados escolhidos posteriormente. Risco de compilação Java: nenhum. Prioridade: **baixa**. Não criar esquema, conexão ou dependência Maven sem necessidade.

9. **Retirar build e cache do versionamento, preservando arquivos locais.** Origem: entradas rastreadas de `target/` e `.m2/`. Destino: permanecerem somente no disco local, ignoradas por um futuro `.gitignore` na raiz. Motivo: separar fontes de artefatos reproduzíveis. Package: nenhum. Testes: podem precisar regenerar build e resolver dependências em outros ambientes. Risco de compilação: **baixo a médio** em outro ambiente sem cache disponível; não há mudança de fonte. Prioridade: **alta**. Isso altera muitos arquivos no índice e exige confirmação específica; não é proposta de apagar caches do disco. Conferir o inventário antes, mesmo sendo saídas/dependências, e não mexer no arquivo `.class` não rastreado preexistente nesta tarefa.

10. **Adicionar testes correspondentes conforme o estudo.** Origem: casos normais, limites e erros dos laboratórios/desafios, ainda sem testes correspondentes. Destino: pacotes espelhados em `src/test/java`, exemplificados na árvore futura. Motivo: validar comportamento quando previsto no calendário ou solicitado. Package: espelhar `br.com.gabrielfalcao.prep.javacore...` ou `br.com.gabrielfalcao.prep.dsa...`; manter exercícios de JUnit/Mockito em `testes`. Testes: novas verificações reais, sem transformar TODOs em soluções automáticas. Risco: **médio** se forem criados antes das classes/API; por isso só após a implementação pertinente. Prioridade: **baixa**, condicionada ao avanço pedagógico.

## 10. Decisão específica sobre Contains Duplicate

- **É necessária uma nova pasta?** Não. `src/main/java/br/com/gabrielfalcao/prep/dsa/semana1/` já existe e é suficiente. Não é necessário criar subpacote para um único desafio.
- **Caminho canônico:** `src/main/java/br/com/gabrielfalcao/prep/dsa/semana1/ContainsDuplicate.java`.
- **Package:** `br.com.gabrielfalcao.prep.dsa.semana1`.
- **Aproveitar o arquivo existente?** Sim: usar o arquivo DSA já reservado. O outro arquivo, em Java Core, é apenas uma classe vazia, sem algoritmo a recuperar. Após autorização e nova conferência, consolidar a declaração no destino e retirar a reserva redundante, sem criar uma terceira cópia. Nada disso foi feito agora.
- **Onde ficam os exercícios teóricos/práticos de Set?** A comparação entre HashSet, LinkedHashSet e TreeSet permanece em `src/main/java/br/com/gabrielfalcao/prep/javacore/semana1/exercicio05sets/Exercicio05Sets.java`. Experimentos de igualdade lógica e contrato com objetos personalizados pertencem ao exercício 03, `exercicio03equalsehashcode/Exercicio03EqualsEHashCode.java`. Materiais de consulta podem seguir a proposta `materiais/javacore/semana1/`.
- **Por que DSA?** O objetivo do desafio é decidir se há valores repetidos em uma entrada e justificar o algoritmo e seus custos, tema explícito de DSA 2.1/2.2 na semana 1. HashSet é uma ferramenta da solução. O laboratório Java Core investiga garantias e diferenças da API e não é substituído por esse desafio.

## 11. Comandos de validação

Após uma reorganização futura autorizada, na raiz:

```bash
mvn compile
mvn test
git diff --check
git diff --name-status
git status --short --untracked-files=all
```

`mvn compile` verifica compilação das fontes principais. `mvn test` também compila fontes de testes e executa os testes descobertos; conferir quantidade executada, falhas e erros, pois um build bem-sucedido sem testes descobertos não comprova execução do JUnit. Hoje há somente um método `@Test` no código. Erro de compilação, falha de asserção e problema conceitual são resultados diferentes.

**Nesta tarefa, Maven não foi executado.** O pedido limita a alteração a este documento e reserva a validação Maven para depois; executá-lo poderia modificar `target` e caches, inclusive arquivos rastreados. Os sucessos citados no histórico são registros anteriores, não validação do estado atual. Nenhum resultado de compilação ou teste atual é alegado.

### Verificação documental e estado Git

A árvore foi confrontada com a enumeração física; os 16 arquivos Java foram lidos e mapeados, incluindo os placeholders e o fonte não rastreado. A análise de pacotes usa os fontes, sem tomar classes compiladas antigas como evidência de arquitetura. Foram comparados hashes dos arquivos existentes antes e depois da criação do documento para verificar preservação de conteúdo.

Antes desta tarefa, `git status --short --untracked-files=all` já apresentava:

```text
?? src/main/java/br/com/gabrielfalcao/prep/javacore/semana1/ContainsDuplicate/ContainsDuplicate.java
?? target/classes/br/com/gabrielfalcao/prep/javacore/semana1/ContainsDuplicate/ContainsDuplicate.class
```

Após a criação, o estado é:

```text
?? ARQUITETURA_REPOSITORIO.md
?? src/main/java/br/com/gabrielfalcao/prep/javacore/semana1/ContainsDuplicate/ContainsDuplicate.java
?? target/classes/br/com/gabrielfalcao/prep/javacore/semana1/ContainsDuplicate/ContainsDuplicate.class
```

O único arquivo criado ou alterado por esta tarefa é `ARQUITETURA_REPOSITORIO.md`. Os outros dois itens são preexistentes e foram preservados. Nenhum código, configuração, histórico, material de estudo ou índice Git foi alterado. Não houve commit, push, Pull Request ou reorganização.
