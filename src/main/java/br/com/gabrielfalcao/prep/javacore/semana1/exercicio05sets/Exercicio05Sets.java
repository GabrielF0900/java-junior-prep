package br.com.gabrielfalcao.prep.javacore.semana1.exercicio05sets;

import java.util.HashSet;
import java.util.Set;

/**
 * EXERCÍCIO 05 — HashSet, LinkedHashSet e TreeSet
 *
 * Objetivo:
 * Comparar conjuntos quanto a duplicatas, ordem de inserção, ordem natural e
 * custos relevantes.
 *
 * Problema:
 * Armazene a mesma sequência de valores, incluindo repetições, nas três
 * implementações de Set. Observe e explique as diferenças na saída.
 *
 * Dividir para conquistar:
 * 1. Defina uma única entrada que revele duplicatas e diferenças de ordem.
 * 2. Preveja a saída de cada implementação antes de programar.
 * 3. Crie e teste apenas um conjunto por vez.
 * 4. Compare a saída real com sua previsão.
 * 5. Relacione cada comportamento ao requisito que ele atende.
 * 6. Pesquise e registre os custos esperados de inserção e busca.
 * 7. Teste ao menos um caso-limite pertinente.
 *
 * Perguntas para orientar sua pesquisa:
 * - Qual implementação não oferece garantia de ordem?
 * - Preservar inserção é o mesmo que ordenar?
 * - O que os elementos precisam fornecer para a ordenação natural?
 *
 * Entrega:
 * Código executável, previsões, comparação das três saídas, caso-limite e Big O.
 */
public class Exercicio05Sets {

    public static void main(String[] args) {

        /*
         * Set é uma interface que define o contrato de um conjunto.
         * Esse contrato oferece operações para adicionar, consultar, remover
         * e percorrer elementos, além de não permitir duplicatas.
         *
         * HashSet é a implementação concreta que escolhi para cumprir o
         * contrato de Set utilizando hashing.
         *
         * Integer define o tipo de elemento permitido dentro do conjunto.
         *
         * numeros é a variável que guarda uma referência para o objeto
         * HashSet criado com new HashSet<>().
         *
         * A variável numeros permite que eu chegue ao HashSet e execute as
         * operações definidas pelo contrato de Set.
         *
         * De forma simplificada:
         *
         * numeros -> HashSet -> buckets -> referências dos elementos
         *
         * A variável numeros aponta para o objeto HashSet. O HashSet é a
         * estrutura que administra internamente as referências dos elementos
         * adicionados.
         */
        Set<Integer> numeros = new HashSet<>();

        numeros.add(5);
        numeros.add(45);
        numeros.add(40);
        numeros.add(25);

        /*
         * O HashSet não garante a ordem em que os elementos serão apresentados.
         *
         * Isso significa que, mesmo que eu tenha adicionado 5, 45, 40 e 25
         * nessa sequência, não posso utilizar essa ordem como parte da lógica
         * do programa.
         *
         * A impressão pode até parecer seguir alguma ordem, mas o contrato do
         * HashSet não garante que essa ordem será mantida.
         */
        System.out.println(numeros);

        /*
         * O método add() tenta adicionar um elemento ao conjunto e retorna
         * um boolean.
         *
         * Exemplo:
         *
         * numeros.add(5);
         * Antes:   {}
         * Retorno: true
         * Depois:  {5}
         *
         * O retorno foi true porque o 5 ainda não existia e o conjunto mudou.
         *
         * numeros.add(6);
         * Antes:   {5}
         * Retorno: true
         * Depois:  {5, 6}
         *
         * O retorno foi true porque o 6 também não existia.
         *
         * numeros.add(5);
         * Antes:   {5, 6}
         * Retorno: false
         * Depois:  {5, 6}
         *
         * O retorno foi false porque já existia um elemento equivalente ao 5.
         * O HashSet não adiciona primeiro para depois remover. Ele identifica
         * que o elemento já existe e não altera o conjunto.
         *
         * Portanto:
         *
         * true  -> o elemento foi adicionado e o conjunto mudou;
         * false -> o elemento já existia e o conjunto não mudou.
         */

        boolean existe = numeros.contains(5);
        System.out.println(existe); // true

        /*
         * contains() consulta se existe um elemento equivalente no HashSet.
         *
         * Ele retorna:
         *
         * true  -> encontrou um elemento equivalente;
         * false -> não encontrou um elemento equivalente.
         *
         * O contains() apenas consulta. Ele não adiciona nem remove elementos.
         */

        boolean removeu = numeros.remove(5);
        System.out.println(removeu); // true

        System.out.println(numeros); // não possui mais o número 5

        /*
         * remove() tenta remover um elemento equivalente do conjunto.
         *
         * Ele retorna:
         *
         * true  -> o elemento existia e foi removido;
         * false -> o elemento não existia e o conjunto não mudou.
         */

        /*
         * CONSULTA NO HASHSET E NO HASHMAP
         *
         * No HashSet, consultamos diretamente o próprio elemento:
         *
         * numeros.contains(5);
         *
         * A pergunta é:
         *
         * "O elemento 5 existe no conjunto?"
         *
         * No HashMap, temos uma associação no formato:
         *
         * chave -> valor
         *
         * Por isso, podemos procurar uma chave usando:
         *
         * mapa.containsKey(chave);
         *
         * A pergunta é:
         *
         * "Esta chave existe no mapa?"
         *
         * Resumo:
         *
         * HashSet -> contains(elemento)
         * HashMap -> containsKey(chave)
         */

        // clear(), size() e isEmpty()

        /*
         * clear():
         * remove todos os elementos do conjunto e retorna void.
         *
         * size():
         * retorna um int com a quantidade de elementos únicos armazenados.
         *
         * isEmpty():
         * verifica se o conjunto está vazio e retorna um boolean.
         */

        int quantidade = numeros.size();
        System.out.println(quantidade); // 3

        boolean estaVazio = numeros.isEmpty();
        System.out.println(estaVazio); // false

        /*
         * No início, foram armazenados quatro elementos:
         *
         * 5, 45, 40 e 25.
         *
         * Como o número 5 foi removido, permaneceram três elementos.
         *
         * Por isso:
         *
         * size() retorna 3;
         * isEmpty() retorna false.
         */

        // Percorrendo o HashSet usando for-each.

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        /*
         * O HashSet não possui acesso por índice. Por isso, não existe:
         *
         * numeros.get(0);
         *
         * O contrato de Set não representa uma sequência indexada. Isso
         * significa que os elementos não ficam associados publicamente às
         * posições 0, 1, 2 e assim por diante.
         *
         * Para visitar os elementos, posso utilizar o for-each. A variável
         * numero recebe um elemento em cada passagem.
         *
         * Entretanto, essa passagem não representa uma posição fixa e eu
         * não devo depender da ordem apresentada.
         *
         * O HashSet permite um único null. Se eu tentar adicionar null
         * novamente, a segunda tentativa será considerada uma duplicata.
         *
         * Essa é uma característica do HashSet. Não significa que toda
         * implementação de Set necessariamente aceitará null.
         */

        // Hashing no HashSet

        /*
         * O HashSet organiza internamente as referências dos elementos usando
         * hashing.
         *
         * Quando adiciono, consulto ou removo um elemento, o HashSet recebe a
         * referência desse elemento e chama o método hashCode() correspondente
         * ao tipo real do objeto.
         *
         * Por exemplo:
         *
         * - se o elemento for Integer, será utilizado o hashCode de Integer;
         * - se o elemento for String, será utilizado o hashCode de String;
         * - se for uma classe criada pelo programador, ela poderá possuir sua
         *   própria implementação de hashCode().
         *
         * Todos os objetos possuem acesso a hashCode(), porque esse método é
         * definido originalmente em Object. Cada classe pode sobrescrever o
         * método e definir um cálculo adequado para seus objetos.
         *
         * O HashSet não cria sozinho o hash code. Ele chama hashCode() no
         * elemento e recebe como resultado um número inteiro.
         *
         * Esse número não é um endereço de memória, não é a localização direta
         * do objeto e não é uma identificação obrigatoriamente única.
         *
         * O HashSet utiliza o hash code em um cálculo interno para descobrir
         * qual bucket deve ser consultado.
         *
         * Um bucket é uma região da estrutura interna do HashSet. De maneira
         * simplificada, é nessa região que o conjunto administra referências
         * para os elementos.
         *
         * Depois de encontrar o bucket correspondente, o HashSet utiliza
         * equals(), quando necessário, para fazer uma comparação lógica e
         * confirmar se já existe um elemento equivalente.
         *
         * Fluxo simplificado:
         *
         * 1. A variável numeros permite chegar ao objeto HashSet;
         * 2. O HashSet recebe a referência do elemento;
         * 3. O HashSet chama o hashCode() apropriado para o tipo do objeto;
         * 4. O método hashCode() retorna um número inteiro;
         * 5. O HashSet utiliza esse número para calcular o bucket;
         * 6. O HashSet consulta os candidatos encontrados nessa região;
         * 7. equals() confirma se existe um elemento logicamente equivalente.
         *
         * O HashSet guarda internamente a referência para o elemento. A
         * variável numeros guarda a referência para o próprio objeto HashSet.
         *
         * Portanto:
         *
         * numeros -> HashSet -> bucket -> referência do elemento -> objeto
         */

        /*
         * CONTRATO ENTRE equals() E hashCode()
         *
         * equals() define quando dois objetos devem ser considerados
         * logicamente iguais.
         *
         * hashCode() precisa ser coerente com essa regra de igualdade para que
         * o HashSet consiga procurar os objetos na região correta.
         *
         * Regra obrigatória:
         *
         * Se a.equals(b) retornar true, então a e b precisam possuir o mesmo
         * hash code durante o uso na coleção.
         *
         * Entretanto, a relação contrária não é obrigatória:
         *
         * Dois objetos com o mesmo hash code não precisam ser iguais.
         *
         * Também não é obrigatório que dois objetos diferentes possuam hash
         * codes diferentes.
         */

        /*
         * COLISÕES
         *
         * Uma colisão acontece quando objetos diferentes produzem o mesmo hash
         * code ou são direcionados para a mesma região interna.
         *
         * Isso não significa automaticamente que os objetos sejam iguais e
         * também não significa necessariamente que exista um defeito.
         *
         * Quando existem candidatos na mesma região, o HashSet utiliza
         * equals() para verificar qual objeto é realmente equivalente ao
         * elemento procurado.
         *
         * Portanto:
         *
         * hashCode igual não garante objetos iguais.
         *
         * O hashCode reduz a área da busca.
         * O equals confirma a igualdade lógica.
         */

        /*
         * COMPLEXIDADE MÉDIA
         *
         * Como o hashing reduz a região que precisa ser consultada, o HashSet
         * normalmente não precisa percorrer todos os elementos.
         *
         * Por isso, as operações abaixo possuem custo médio O(1):
         *
         * add()
         * contains()
         * remove()
         *
         * O(1) médio significa que o tempo da operação normalmente não cresce
         * na mesma proporção da quantidade total de elementos armazenados.
         */



        /*
        * Uma colisão acontece quando elementos diferentes produzem o mesmo
        * hash code ou são direcionados para a mesma região interna.
        *
        * Isso não significa que os elementos sejam duplicados. O hashCode()
        * ajuda o HashSet a encontrar a região de busca, mas equals() é quem
        * confirma se os elementos são logicamente iguais.
        *
        * Se o hash code for igual e equals() retornar false, temos uma
        * colisão, mas os dois elementos podem ser armazenados.
        *
        * Se o hash code for igual e equals() retornar true, o HashSet
        * identifica uma duplicata e não adiciona o segundo elemento.
        *
        * Portanto:
        *
        * hashCode igual não garante igualdade;
        * equals true exige hashCode igual.
        */
    }
}