# Relatório de reorganização — Java Junior Prep

> **Registro histórico:** este documento descreve o estado do repositório na
> data indicada. Para a estrutura atual, consulte
> [ARQUITETURA_ATUAL_REPOSITORIO.md](ARQUITETURA_ATUAL_REPOSITORIO.md).

Data: 05/09/2026. Repositório local: `C:\Projetos\java-junior-prep`.
Branch utilizada: `chore/reorganiza-arquitetura`, criada a partir de `main`.
Remoto: `https://github.com/GabrielF0900/java-junior-prep.git`.

> Nota de continuidade — 11/09/2026: os caminhos de Two Sum citados neste relatório registram a reorganização de 05/09. O arquivo antes localizado em `relatorios/dsa/semana1/two-sum.md` foi posteriormente movido para [relatorios/dsa/semana1/two-sum/README.md](../relatorios/dsa/semana1/two-sum/README.md). Os registros e estados Git abaixo permanecem históricos. Consulte a [arquitetura atual](ARQUITETURA_ATUAL_REPOSITORIO.md) para a central criada depois.

## 1. Resultado

Java Core e DSA foram separados nos caminhos autorizados. A implementação final
de Two Sum está em DSA e ambas as tentativas anteriores foram preservadas no
relatório. Contains Duplicate continua sem solução. Materiais e relatórios foram
organizados por trilha e semana; SQL recebeu apenas um README. O calendário,
POM, regras do AGENTS e os seis exercícios pedagógicos de Java Core foram
preservados sem alterações de conteúdo.

Não houve commit, push, merge ou Pull Request. As alterações continuam locais,
parte no índice por efeito de `git mv` e `git rm --cached`, parte fora dele.

## 2. Estado inicial do Git

Foram executados `git status --short --untracked-files=all`,
`git branch --show-current` e `git remote -v` antes das alterações.
A branch inicial era `main`; não existia a branch de reorganização.

```text
?? ARQUITETURA_REPOSITORIO.md
?? src/main/java/br/com/gabrielfalcao/prep/javacore/semana1/ContainsDuplicate/ContainsDuplicate.java
?? target/classes/br/com/gabrielfalcao/prep/javacore/semana1/ContainsDuplicate/ContainsDuplicate.class
```

Não havia outras alterações não documentadas. A arquitetura não rastreada foi
movida sem modificar seus bytes. O fonte não rastreado de Contains Duplicate foi
lido novamente e confirmado como classe vazia antes de sua remoção autorizada.
O efeito da recompilação sobre a classe gerada preexistente é descrito na seção 7.

## 3. Arquivos criados e documentação atualizada

- `.gitignore`: ignora Maven, IDEs, arquivos de sistema e logs, conforme solicitado.
- `sql/README.md`: orienta criação gradual de semanas, sem scripts antecipados.
- `docs/RELATORIO_REORGANIZACAO.md`: este registro, movido da raiz para `docs/`
  após aprovação da reorganização. O estado Git transcrito abaixo é histórico,
  anterior a essa movimentação e ao commit autorizado.
- `README.md`: atualizado com responsabilidades, estado aparente dos exercícios,
  links e árvore gerada a partir dos arquivos reais, incluindo todos os fontes.
- `HISTORICO_ESTUDOS.md`: somente o parágrafo de localização de relatórios foi
  atualizado para `relatorios/<trilha>/semanaN/`, explicitando a convenção anterior.
  Nenhum registro cronológico, explicação ou pendência foi apagado ou reescrito.
- `AGENTS.md`: nenhuma alteração necessária; seus caminhos continuam corretos.

## 4. Movimentações

Os caminhos abaixo são relativos à raiz. Arquivos rastreados foram movidos com
`git mv`. O documento de arquitetura não rastreado foi movido com `Move-Item`.

| Origem | Destino | Conteúdo |
| --- | --- | --- |
| `colecoes_java_pdf.html` | `materiais/javacore/semana1/colecoes_java_pdf.html` | Idêntico por SHA-256 |
| `relatorios/guia-completo-string-pool-java17.html` | `materiais/javacore/semana1/guia-completo-string-pool-java17.html` | Idêntico por SHA-256 |
| `relatorios/guia-completo-string-pool-java17.pdf` | `materiais/javacore/semana1/guia-completo-string-pool-java17.pdf` | Idêntico por SHA-256 |
| `relatorios/laboratorio-01-igualdade-referencias.html` | `relatorios/javacore/semana1/laboratorio-01-igualdade-referencias.html` | Idêntico por SHA-256 |
| `relatorios/laboratorio-01-igualdade-referencias.pdf` | `relatorios/javacore/semana1/laboratorio-01-igualdade-referencias.pdf` | Idêntico por SHA-256 |
| `relatorios/exercicio01-two-sum.md` | `relatorios/dsa/semana1/two-sum.md` | Título sem numeração ambígua e apêndice com as duas tentativas; registro anterior preservado, desconsiderando espaços finais |
| `src/main/java/br/com/gabrielfalcao/prep/dsa/semana2/ValidParentheses.java` | `src/main/java/br/com/gabrielfalcao/prep/dsa/semana4/ValidParentheses.java` | Somente package atualizado; permanece TODO sem classe |
| `src/test/java/br/com/gabrielfalcao/prep/testes/semana1/SafeWalletServiceTest.java` | `src/test/java/br/com/gabrielfalcao/prep/testes/semana2/SafeWalletServiceTest.java` | Somente package atualizado; permanece TODO sem teste |
| `ARQUITETURA_REPOSITORIO.md` | `docs/ARQUITETURA_REPOSITORIO_ANTES_DA_REORGANIZACAO.md` | Idêntico por SHA-256; fotografia histórica |

As pastas antigas de DSA semana 2 e Testes semana 1 foram removidas somente após
confirmar que estavam vazias. Não foram criadas pastas vazias para semanas futuras.
Os HTMLs movidos não contêm links relativos de arquivos que exigissem correção;
as referências históricas da fotografia arquitetural foram mantidas como história.

## 5. Contains Duplicate e Two Sum

### Contains Duplicate

Destino único nos fontes:
`src/main/java/br/com/gabrielfalcao/prep/dsa/semana1/ContainsDuplicate.java`.
Package: `br.com.gabrielfalcao.prep.dsa.semana1`.

O destino, anteriormente package e TODO, agora contém somente a classe pública
vazia solicitada. Nenhum algoritmo foi implementado. A cópia vazia
`src/main/java/br/com/gabrielfalcao/prep/javacore/semana1/ContainsDuplicate/ContainsDuplicate.java`
foi excluída com sua pasta, após conferência de que não havia tentativa ou outro
conteúdo. Esta foi a única exclusão de fonte por ser duplicata vazia.

### Two Sum

Destino único nos fontes:
`src/main/java/br/com/gabrielfalcao/prep/dsa/semana1/TwoSum.java`.
Package: `br.com.gabrielfalcao.prep.dsa.semana1`; classe pública: `TwoSum`.

`TwoSumDesafioFinal.java` foi adotado como versão final após leitura e comparação:
o método já implementava busca do complemento com HashMap, usando `nums[i]`
diretamente, inserção depois do `if`, impressão do mapa, exemplo com
`{1,2,6,7,8,9}` e target 10. Tudo isso foi mantido.

Mudanças no fonte final: package, nome da classe e instanciação, remoção do TODO
incorreto “Sua implementação aqui” e espaços ao final das linhas. Não houve
otimização, novo tratamento de erros, mudança de retorno ou troca de estratégia.
A equivalência à transformação autorizada foi conferida antes da remoção dos
originais.

O relatório `relatorios/dsa/semana1/two-sum.md` contém um apêndice com os dois
fontes anteriores completos, seus comentários e exemplos, retirando somente
espaços finais. A primeira tentativa preserva `numeroAtual`, o `else`, target 8
e comentários didáticos. A segunda preserva inclusive o TODO como registro
histórico, claramente distinguido do estado atual do fonte canônico.

Somente depois dessa preservação e conferência foram removidos os dois fontes
antigos em `javacore/semana1/exercicio01twosum/` e a pasta. Eles não eram vazios:
foram consolidados, com conteúdo arquivado, não descartados. Os campos de testes,
complexidades e Feynman do roteiro continuam pendentes para o estudante.

## 6. Build e dependências retirados do versionamento

Foi executado `git rm -r --cached .m2 target`, sem remoção dessas pastas do disco.

| Área | Entradas retiradas do índice |
| --- | ---: |
| `.m2/` | 590 |
| `target/` | 12 |
| Total | 602 |

`git ls-files .m2 target` não retorna arquivos. Os 602 itens aparecem como
exclusões preparadas no Git porque ainda não houve commit; não significa que
foram apagados das revisões anteriores. O relatório não reproduz seu inventário
interno.

`git check-ignore -v target/ .m2/` confirmou:

```text
.gitignore:2:target/    target/
.gitignore:3:.m2/       .m2/
```

Ambas as pastas permanecem locais. Maven acrescentou dependências ausentes ao
cache durante a validação; nenhuma dependência foi acrescentada ao POM.

## 7. Compilação e testes

Ambiente encontrado: Maven 3.9.15, JDK Oracle 23.0.2. Não foi identificado um JDK
17 nos locais usuais consultados. A compilação foi restringida à linguagem e às
APIs Java 17 por `--release 17`, passado na linha de comando, sem alterar o POM.

O pedido combina `mvn clean compile` com a proibição de apagar `target` do disco.
Para respeitar a preservação da pasta, foi desativada somente a etapa clean:

```powershell
mvn clean compile '-Dmaven.clean.skip=true' '-Dmaven.compiler.release=17' '-Dmaven.compiler.staleMillis=-1' '-Dmaven.repo.local=.m2/repository'
mvn test '-Dmaven.compiler.release=17' '-Dmaven.repo.local=.m2/repository'
```

O cache local do projeto foi indicado para manter os downloads dentro do workspace.
A opção de recompilação foi usada para validar os fontes atuais sem depender de
classes antigas. O log confirmou recompilação de 11 arquivos principais.

| Validação | Resultado |
| --- | --- |
| `mvn clean compile` com opções acima | `BUILD SUCCESS`, saída 0; `Clean is skipped`; 11 fontes compilados com `javac [debug release 17]` |
| Primeira tentativa de `mvn test` | Bloqueio de rede do sandbox ao obter Surefire; não foi falha de teste nem de compilação |
| `mvn test` repetido com acesso autorizado | `BUILD SUCCESS`, saída 0 |
| Testes executados | 1: `br.com.gabrielfalcao.prep.testes.SanityCheckTest` |
| Falhas / erros / ignorados | 0 / 0 / 0 |
| Execução do `main` de Two Sum | Imprimiu os mapas e `Resultado: [1, 4]`, saída 0 |
| Bytecode de Two Sum | `major version: 61`, correspondente ao alvo Java 17 |

Limite: a execução dos testes e do main ocorreu no JDK 23; não é alegada uma
execução em JVM 17 nativa. `--release 17` valida a compatibilidade de compilação.
Não foi feita uma limpeza integral de build, pois ela contrariaria a preservação
de `target` solicitada.

Efeito observado: mesmo com clean desativado, a recompilação do Maven removeu a
classe gerada antiga de Contains Duplicate no package Java Core, antes não
rastreada. A pasta `target` permaneceu e recebeu as saídas atuais. A limpeza de
classes órfãs pelo compilador não foi uma exclusão manual de material de estudo;
nenhum fonte com tentativa do estudante foi perdido. Não se afirma preservação
byte a byte do build anterior, apenas dos fontes e materiais protegidos.

## 8. Conferências de preservação e arquitetura

- Os 13 arquivos Java finais foram conferidos: 11 em main e dois em test.
  Todos os packages correspondem às pastas, estão em minúsculas e as classes
  públicas declaradas correspondem aos nomes dos arquivos.
- Contains Duplicate e Two Sum existem uma única vez em `src`, ambos em DSA.
- Os sete arquivos das seis pastas de exercícios Java Core, incluindo Produto,
  mantêm os hashes anteriores. Nenhuma correção pedagógica foi feita.
- Os cinco HTMLs/PDFs movidos sem edição e a fotografia arquitetural têm hashes
  idênticos aos originais. Nenhum PDF foi regenerado ou descartado.
- As duas tentativas de Two Sum foram comparadas com os fontes de HEAD e estão
  completas no apêndice, desconsiderando espaços finais. O roteiro anterior
  também foi conferido, com apenas título e espaços finais normalizados.
- `AGENTS.md`, `pom.xml` e `index.html` mantêm seus hashes anteriores.
- A árvore do README foi gerada a partir do filesystem e conferida contra todos
  os arquivos relevantes. Build/cache/Git estão intencionalmente excluídos.
- Contains Duplicate está vazio; Valid Parentheses, SafeWalletServiceTest e
  StreamsExemplo continuam reservados. Não foram criados novos testes, soluções
  SQL, dependências, módulos ou camadas.
- `git diff --check` e `git diff --cached --check`: saída 0, sem erros de whitespace.
  Git emitiu avisos de conversão futura LF/CRLF em alguns arquivos, sem falha.
- `git diff --stat`, `git diff --name-status` e `git status --short --untracked-files=all`
  foram executados. Mudanças no índice foram verificadas separadamente, pois
  `git diff` sem `--cached` não inclui os movimentos já preparados.

## 9. Pontos para revisão humana

1. A mistura de assuntos e os comentários sobre igualdade no exercício 01 e em
   Produto permanecem para revisão pedagógica, conforme solicitado.
2. O histórico e o relatório de igualdade descrevem o estágio antigo com Pessoa.
   Esses registros foram preservados; não foi simulada atualização da aprendizagem.
3. Os campos de testes, complexidades e Feynman de Two Sum continuam pendentes.
   O teste aritmético existente não comprova a correção geral dos algoritmos.
4. Revisar esta reorganização antes de autorizar staging adicional, commit ou push.
   `git mv` e `git rm --cached` já prepararam parte das alterações; o índice não
   contém sozinho todo o resultado final, pois edições posteriores estão no disco.
5. Se desejado, validar posteriormente em uma JVM 17 instalada e autorizar uma
   limpeza completa de target. Nesta tarefa foram usados release 17 e build sem clean.

Nenhuma movimentação ficou bloqueada por conflito de destino. Não há decisão
arquitetural pendente necessária para completar o escopo autorizado.

## 10. Estado final do Git

O bloco abaixo registra os arquivos de estudo/documentação. As 602 exclusões
preparadas de `.m2/` e `target/` foram omitidas somente da transcrição, conforme
o requisito de não listar seu conteúdo interno; as contagens estão na seção 6.
`R` indica movimento no índice; `RM` indica movimento no índice com edição
posterior; ` M`/` D` indicam mudança no disco; `??` indica arquivo não rastreado.

```text
 M HISTORICO_ESTUDOS.md
 M README.md
R  colecoes_java_pdf.html -> materiais/javacore/semana1/colecoes_java_pdf.html
R  relatorios/guia-completo-string-pool-java17.html -> materiais/javacore/semana1/guia-completo-string-pool-java17.html
R  relatorios/guia-completo-string-pool-java17.pdf -> materiais/javacore/semana1/guia-completo-string-pool-java17.pdf
RM relatorios/exercicio01-two-sum.md -> relatorios/dsa/semana1/two-sum.md
R  relatorios/laboratorio-01-igualdade-referencias.html -> relatorios/javacore/semana1/laboratorio-01-igualdade-referencias.html
R  relatorios/laboratorio-01-igualdade-referencias.pdf -> relatorios/javacore/semana1/laboratorio-01-igualdade-referencias.pdf
 M src/main/java/br/com/gabrielfalcao/prep/dsa/semana1/ContainsDuplicate.java
 M src/main/java/br/com/gabrielfalcao/prep/dsa/semana1/TwoSum.java
RM src/main/java/br/com/gabrielfalcao/prep/dsa/semana2/ValidParentheses.java -> src/main/java/br/com/gabrielfalcao/prep/dsa/semana4/ValidParentheses.java
 D src/main/java/br/com/gabrielfalcao/prep/javacore/semana1/exercicio01twosum/TwoSum.java
 D src/main/java/br/com/gabrielfalcao/prep/javacore/semana1/exercicio01twosum/TwoSumDesafioFinal.java
RM src/test/java/br/com/gabrielfalcao/prep/testes/semana1/SafeWalletServiceTest.java -> src/test/java/br/com/gabrielfalcao/prep/testes/semana2/SafeWalletServiceTest.java
?? .gitignore
?? RELATORIO_REORGANIZACAO.md
?? docs/ARQUITETURA_REPOSITORIO_ANTES_DA_REORGANIZACAO.md
?? sql/README.md
```

Branch final: chore/reorganiza-arquitetura. Nenhum commit ou push realizado.
