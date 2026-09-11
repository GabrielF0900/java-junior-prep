# Contains Duplicate

[Início](../../../../README.md) · [Central de estudos](../../../README.md) · [DSA](../../README.md) · [Evidências](imagens/)

## Informações do desafio

| Campo | Valor |
| --- | --- |
| Trilha | DSA |
| Semana | 1 |
| Estrutura principal | HashSet |
| Status | Implementado e testado |
| Linguagem | Java |

Fontes: [histórico de estudos](../../../../HISTORICO_ESTUDOS.md), [arquitetura atual](../../../../docs/ARQUITETURA_ATUAL_REPOSITORIO.md) e código oficial. Os resultados manuais e as correções de tentativas foram informados por Gabriel em 11/09/2026; esta página não representa uma nova execução.

## Enunciado

O método recebe um array de inteiros e identifica se algum valor aparece mais de uma vez. Retorna `true` quando existe repetição e `false` quando todos os valores são diferentes.

## Compreensão do problema

Síntese da compreensão registrada por Gabriel, sem citação literal: receber os números, percorrer o array, guardar os números observados, verificar se algum se repete e devolver um booleano.

## Estratégia

A implementação atual segue estes passos:

1. criar um HashSet vazio;
2. percorrer o array;
3. consultar o número antes de adicioná-lo;
4. retornar `true` se ele já estiver presente;
5. adicionar se ainda não estiver;
6. retornar `false` depois do percurso completo.

## Fluxo visual

```mermaid
flowchart TD
    A["Receber array e criar HashSet vazio"] --> B{"Há próximo número?"}
    B -->|Sim| C{"Número já está no HashSet?"}
    C -->|Sim| D["Retornar true"]
    C -->|Não| E["Adicionar número e avançar"]
    E --> B
    B -->|Não| F["Retornar false"]
```

## Código-fonte

[Consultar ContainsDuplicate.java](../../../../src/main/java/br/com/gabrielfalcao/prep/dsa/semana1/ContainsDuplicate.java)

Assinatura: `public boolean containsDuplicate(int[] nums)`. O código oficial permanece somente em `src/`; esta página não mantém uma cópia da classe.

O main de demonstração contém `{1, 2, 3, 2}`. As impressões mostram o HashSet no caminho de retorno, a repetição encontrada ou sua ausência e o resultado final. Não há impressão do conjunto em toda iteração.

## Testes

| Nº | Cenário | Entrada | Esperado | Obtido | Evidência |
| -: | ------------------------ | ---------------- | -------: | ------: | ------------------ |
| 1 | Duplicata no final | `[1, 2, 3, 2]` | `true` | `true` | [Ver evidência](imagens/teste-01-duplicata-final.png) |
| 2 | Sem duplicata | `[1, 2, 3, 4]` | `false` | `false` | [Ver evidência](imagens/teste-02-sem-duplicata.png) |
| 3 | Duplicata consecutiva | `[5, 5, 8, 9]` | `true` | `true` | [Ver evidência](imagens/teste-03-duplicata-consecutiva.png) |
| 4 | Número negativo repetido | `[-1, 2, 3, -1]` | `true` | `true` | [Ver evidência](imagens/teste-04-numero-negativo.png) |
| 5 | Elemento único | `[7]` | `false` | `false` | [Ver evidência](imagens/teste-05-elemento-unico.png) |
| 6 | Array vazio | `[]` | `false` | `false` | [Ver evidência](imagens/teste-06-array-vazio.png) |

Os seis casos manuais produziram os resultados esperados. Foram validados
cenários com duplicata, sem duplicata, repetição consecutiva, número negativo,
elemento único e array vazio.

O array vazio é um teste local adicional de robustez e pode estar fora das
restrições de algumas plataformas.

Não existem testes automatizados específicos deste desafio. O SanityCheckTest geral não valida este algoritmo.

## Evidências visuais

[Índice das evidências](imagens/README.md).

<details>
<summary>Ver evidências visuais dos testes</summary>

### Teste 01 — Duplicata no final

![Teste 01 — Duplicata no final](imagens/teste-01-duplicata-final.png)

### Teste 02 — Sem duplicata

![Teste 02 — Sem duplicata](imagens/teste-02-sem-duplicata.png)

### Teste 03 — Duplicata consecutiva

![Teste 03 — Duplicata consecutiva](imagens/teste-03-duplicata-consecutiva.png)

### Teste 04 — Número negativo repetido

![Teste 04 — Número negativo repetido](imagens/teste-04-numero-negativo.png)

### Teste 05 — Elemento único

![Teste 05 — Elemento único](imagens/teste-05-elemento-unico.png)

### Teste 06 — Array vazio

![Teste 06 — Array vazio](imagens/teste-06-array-vazio.png)

</details>

## Complexidade

- **Operações do HashSet: `O(1)` em média.** A consulta e a inserção normalmente não precisam percorrer todos os elementos do conjunto.
- **Percurso do array: `O(n)`.** No máximo, cada um dos n números é visitado uma vez; uma repetição pode encerrar o percurso antes.
- **Tempo médio total: `O(n)`.** Até n visitas, com consulta e inserção de custo médio constante por visita.
- **Espaço adicional: `O(n)`.** Quando todos são diferentes, o conjunto pode guardar os n números.

Essa justificativa acompanha o código. Uma revisão pessoal de Big O pode ser
feita futuramente, sem bloquear o status técnico do desafio.

## Explicação Feynman

> Revisão pessoal opcional: Gabriel pode registrar uma explicação Feynman com
> suas próprias palavras.

## Erros corrigidos e aprendizados

As duas correções de tentativas abaixo foram relatadas por Gabriel no histórico; o fonte atual confirma a ordem e os escopos resultantes.

- Verificar antes de adicionar. Adicionar antes de consultar faria o próprio número ser encontrado imediatamente.
- `nums` já é parâmetro e não deve ser redeclarado dentro do mesmo método. A variável de entrada do main pertence a outro método.
- O `main` é usado somente para testes locais; plataformas normalmente fornecem os valores por testes externos.
- `return true` encerra o método ao encontrar a primeira repetição.
- `return false` fica depois do laço, quando o percurso terminou sem encontrar repetição.

## Próximas etapas

1. avançar para o próximo conteúdo do calendário;
2. registrar uma explicação Feynman pessoal se isso ajudar a revisão;
3. decidir sobre a permanência dos `println` didáticos em uma alteração futura.
