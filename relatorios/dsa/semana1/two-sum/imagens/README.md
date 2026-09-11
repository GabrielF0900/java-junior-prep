# Evidências visuais — Two Sum

[Início](../../../../../README.md) · [Voltar ao desafio](../README.md) · [DSA](../../../README.md)

Esta pasta reúne as evidências reais dos seis testes manuais de Two Sum, conferidas em 11/09/2026.

## Padrão utilizado

Os arquivos seguem `teste-NN-cenario.png`, com numeração de dois dígitos e cenário em minúsculas separado por hífens.

| Arquivo | Entrada | Target | Resultado obtido | Situação |
| ------- | ------- | -----: | ---------------- | -------- |
| [teste-01-caso-comum.png](teste-01-caso-comum.png) | `[1, 2, 6, 7, 8, 9]` | `10` | `[1, 4]` | Incluída e conferida |
| [teste-02-par-no-meio.png](teste-02-par-no-meio.png) | `[4, 2, 6, 10]` | `8` | `[1, 2]` | Incluída e conferida |
| [teste-03-valores-repetidos.png](teste-03-valores-repetidos.png) | `[3, 3]` | `6` | `[0, 1]` | Incluída e conferida |
| [teste-04-numeros-negativos.png](teste-04-numeros-negativos.png) | `[-3, 4, 3, 90]` | `0` | `[0, 2]` | Incluída e conferida |
| [teste-05-zeros-repetidos.png](teste-05-zeros-repetidos.png) | `[0, 4, 3, 0]` | `0` | `[0, 3]` | Incluída e conferida |
| [teste-06-sem-solucao.png](teste-06-sem-solucao.png) | `[1, 2, 3]` | `10` | `[]` | Incluída e conferida |

As imagens registram execuções manuais e não substituem testes automatizados
com JUnit.
