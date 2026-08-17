package br.com.gabrielfalcao.prep.javacore.semana1.exercicio01igualdadedereferencias;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;




/**
 * EXERCÍCIO 01 — Igualdade de valores e de referências
 *
 * Objetivo:
 * Investigar o comportamento do operador == com tipos primitivos e objetos.
 *
 * Problema:
 * Crie comparações que permitam observar quando == compara um valor e quando
 * compara se duas variáveis apontam para o mesmo objeto.
 *
 * Entrega:
 * Código executável, previsões registradas e uma explicação curta do resultado.
 * Não use equals() neste exercício.
 */
public class Exercicio01IgualdadeDeReferencias {

    /*
     * 1. Reescreva o problema com suas palavras:
     *
     * == compara valores primitivos.
     * == com referências compara se as duas variáveis apontam para o mesmo objeto.
     *
     * Toda vez que executo new Pessoa(), estou criando uma nova instância.
     * Se eu tiver duas instâncias diferentes e comparar primeiro == segundo,
     * o resultado será false.
     *
     * Quando faço segundo = primeiro, copio a referência de primeiro para segundo.
     * Depois disso, primeiro == segundo retorna true porque ambos referenciam
     * o mesmo objeto.
     */

    /*
     * Previsões — primitivos:
     *
     * primeiro == segundo
     * Resultado esperado: true
     * Motivo: as duas variáveis armazenam o valor 10.
     *
     * primeiro == terceiro
     * Resultado esperado: false
     * Motivo: as variáveis armazenam valores diferentes, 10 e 20.
     *
     * Previsões — referências:
     *
     * primeiraPessoa == segundaPessoa
     * Resultado esperado: false
     * Motivo: as variáveis referenciam objetos distintos.
     *
     * primeiraPessoa == terceiraPessoa
     * Resultado esperado: true
     * Motivo: as variáveis referenciam o mesmo objeto.
     */

    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";

        String c = new String("Java");
        String d = new String("Java");

        System.out.println(a == b); //True porque ambos apontam pro mesmo endereço.
        System.out.println(a.equals(b)); //True porque ambos apontam pro mesmo valor.

        System.out.println(c == d); //False porque c e d sao instancias diferentes.
        System.out.println(c.equals(d)); //True porque ambos apontam pro mesmo valor.
        

        

        Produto p1 = new Produto(1L, "Notebook");
        Produto p2 = new Produto(1L, "Notebook");

        System.out.println(p1 == p2); //False porque sao instancias diferentes.
        System.out.println(p1.equals(p2)); //True porque ambos tem o mesmo valor e quando é String ele sobrescreve e compara o valor do elemento.


       
        System.out.println(a.hashCode() == b.hashCode()); //True porque ambos tem o mesmo valor.


        Set<Produto> produtos = new HashSet<>();
        produtos.add(p1);
        produtos.add(p2);

        System.out.println(produtos.size()); //Aqui ele mostra 2 porque mesmo tendo o mesmo valor, são instancias diferentes, então o hashcode é diferente.
        

        List<String> nomes = new ArrayList<>();
        nomes.add("Gabriel");
        nomes.add("Fulano");
        nomes.add("Ciclano");

        

        System.out.println(nomes.get(0)); //Retorna o elemento.
        nomes.set(0,"Adriano"); //Ele substitui o elemento.
        System.out.println(nomes);

        System.out.println(nomes.contains("Gabriel")); //Verifica se o elemento existe.
        System.out.println(nomes.size()); //Retorna o tamanho da lista.
        System.out.println(nomes.get(1)); //Retorna o elemento do index 1.
        System.out.println(nomes.remove(0)); //Remove o elemento do index 0.
        System.out.println(nomes);

        nomes.clear();


        LinkedList<String> nomes2 = new LinkedList<>();
        nomes2.add("Gabriel");
        nomes2.add("Fulano");
        nomes2.add("Ciclano");

        System.out.println(nomes2.get(0));
        System.out.println(nomes2);

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // MÉTODOS QUE EXISTEM TANTO NO ARRAYLIST QUANTO NO LINKEDLIST
        arrayList.add("Gabriel");
        linkedList.add("Gabriel");

        arrayList.add(0, "Adriano");
        linkedList.add(0, "Adriano");

        System.out.println(arrayList.get(0));
        System.out.println(linkedList.get(0));

        arrayList.set(0, "Maria");
        linkedList.set(0, "Maria");

        System.out.println(arrayList.contains("Gabriel"));
        System.out.println(linkedList.contains("Gabriel"));

        System.out.println(arrayList.size());
        System.out.println(linkedList.size());

        arrayList.remove("Gabriel");
        linkedList.remove("Gabriel");

        arrayList.clear();
        linkedList.clear();

        // MÉTODOS DO ARRAYLIST QUE NÃO EXISTEM NO LINKEDLIST
        arrayList.ensureCapacity(20); // Reserva capacidade no array interno.
        arrayList.trimToSize(); // Reduz a capacidade para o tamanho atual da lista.

        // MÉTODOS DO LINKEDLIST QUE NÃO EXISTEM NO ARRAYLIST
        linkedList.addFirst("Primeiro");
        linkedList.addLast("Último");
        linkedList.offerFirst("Novo primeiro");
        linkedList.offerLast("Novo último");

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.pollFirst();
        linkedList.pollLast();

        // LinkedList também pode ser utilizada como pilha.
        linkedList.push("Topo");
        System.out.println(linkedList.pop());
       
    }
    
     
}
