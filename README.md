# Java Junior Prep

Repositório pessoal de preparação para entrevistas e testes técnicos de Java
Júnior. O estudo combina Java 17, Java Core, estruturas de dados, algoritmos,
JUnit, Mockito e SQL com prática, testes e explicação das decisões técnicas.

## Visão rápida

| Item | Informação |
| --- | --- |
| Linguagem principal | Java 17 |
| Build | Maven |
| Foco | Java Core, DSA, testes e SQL |
| Método | Prática, testes e explicação |
| Desafios documentados | Two Sum e Contains Duplicate |

## Navegação rápida

| Quero acessar | Link |
| --- | --- |
| Central de estudos | [relatorios/](relatorios/README.md) |
| Desafios de DSA | [relatorios/dsa/](relatorios/dsa/README.md) |
| Laboratórios de Java Core | [relatorios/javacore/](relatorios/javacore/README.md) |
| Código-fonte DSA | [src/main/java/.../dsa/](src/main/java/br/com/gabrielfalcao/prep/dsa/) |
| Código-fonte Java Core | [src/main/java/.../javacore/](src/main/java/br/com/gabrielfalcao/prep/javacore/) |
| Testes automatizados | [src/test/java/.../testes/](src/test/java/br/com/gabrielfalcao/prep/testes/) |
| Calendário de estudos | [index.html](index.html) |
| Arquitetura atual | [docs/ARQUITETURA_ATUAL_REPOSITORIO.md](docs/ARQUITETURA_ATUAL_REPOSITORIO.md) |

## Desafios em destaque

| Desafio | Estrutura | Código | Explicação | Evidências | Status técnico |
| --- | --- | --- | --- | --- | --- |
| Two Sum | `HashMap` | [TwoSum.java](src/main/java/br/com/gabrielfalcao/prep/dsa/semana1/TwoSum.java) | [README](relatorios/dsa/semana1/two-sum/README.md) | [Imagens](relatorios/dsa/semana1/two-sum/imagens/) | Implementado e testado |
| Contains Duplicate | `HashSet` | [ContainsDuplicate.java](src/main/java/br/com/gabrielfalcao/prep/dsa/semana1/ContainsDuplicate.java) | [README](relatorios/dsa/semana1/contains-duplicate/README.md) | [Imagens](relatorios/dsa/semana1/contains-duplicate/imagens/) | Implementado e testado |

Cada desafio possui seis testes manuais aprovados e evidências visuais. Os
relatórios individuais preservam o raciocínio e a evolução da implementação.

## Competências demonstradas

- arrays e percursos;
- `HashMap` e `HashSet`;
- busca por complemento;
- detecção de duplicatas;
- testes de casos comuns e casos-limite;
- análise básica de tempo e espaço;
- organização e documentação técnica.

## Como executar

Com Java 17 e Maven configurados, execute na raiz:

```bash
mvn compile
mvn test
```

Os desafios também possuem um método `main` para demonstrações locais. Na IDE,
abra a classe Java do desafio e execute o método `main`; as entradas, targets e
resultados são impressos no console.

O projeto possui um teste JUnit geral (`SanityCheckTest`). As evidências dos
desafios são execuções manuais e não substituem testes automatizados específicos.

## Estrutura do projeto

```text
java-junior-prep/
├── docs/                 # Arquitetura, reorganização e auditorias
├── materiais/            # Materiais teóricos
├── relatorios/           # Índices, desafios, resultados e evidências
├── sql/                  # Estudos e scripts SQL
├── src/main/java/        # Código Java oficial
├── src/test/java/        # Testes automatizados
├── AGENTS.md             # Regras pedagógicas e de colaboração
├── HISTORICO_ESTUDOS.md  # Continuidade e próximo ponto de estudo
├── index.html            # Calendário e hub de estudos
└── pom.xml               # Configuração Maven
```

## Trilhas e continuidade

- [Central de estudos](relatorios/README.md): entrada geral para relatórios,
  testes e evidências.
- [DSA](relatorios/dsa/README.md): algoritmos, estruturas de dados e Big O.
- [Java Core](relatorios/javacore/README.md): linguagem e APIs do Java.
- [Histórico de estudos](HISTORICO_ESTUDOS.md): decisões e ponto de retomada.
- [Relatório de reorganização](docs/RELATORIO_REORGANIZACAO.md): registro
  histórico da organização dos arquivos.

O calendário em `index.html` é a fonte de verdade das semanas e tópicos. A
existência de um arquivo ou um build bem-sucedido não significa conclusão
pedagógica.

Gabriel Falcão da Cruz — estudante de Sistemas de Informação e certificado AWS
SAA-C03.
