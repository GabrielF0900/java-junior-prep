package br.com.gabrielfalcao.prep.javacore.semana1.exercicio03equalsehashcode;

/**
 * EXERCÍCIO 03 — Contrato entre equals() e hashCode()
 *
 * Objetivo:
 * Tornar observável como a igualdade lógica afeta objetos armazenados em
 * HashSet e usados como chaves de HashMap.
 *
 * Problema:
 * Modele um produto identificado por código. Compare o comportamento de dois
 * produtos logicamente iguais antes e depois de implementar equals() e
 * hashCode(). Use HashSet e HashMap para demonstrar as consequências.
 *
 * Dividir para conquistar:
 * 1. Defina o que torna dois produtos logicamente iguais.
 * 2. Crie o menor objeto necessário para representar essa regra.
 * 3. Preveja o comportamento sem sobrescrever equals() e hashCode().
 * 4. Teste primeiro apenas a comparação com equals().
 * 5. Depois observe a inserção no HashSet.
 * 6. Em seguida observe o uso como chave no HashMap.
 * 7. Implemente o contrato e repita exatamente os mesmos experimentos.
 * 8. Compare os resultados das duas fases.
 *
 * Perguntas para orientar sua pesquisa:
 * - Qual implementação de equals() uma classe herda de Object?
 * - O que deve acontecer com o hashCode de objetos considerados iguais?
 * - Objetos com o mesmo hashCode são obrigatoriamente iguais?
 *
 * Entrega:
 * Código executável, classe de domínio criada por você, resultados das duas
 * fases e explicação do contrato com suas próprias palavras.
 */
public class Exercicio03EqualsEHashCode {
}
