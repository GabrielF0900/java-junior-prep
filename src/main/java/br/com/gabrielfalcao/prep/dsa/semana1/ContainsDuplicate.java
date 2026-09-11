package br.com.gabrielfalcao.prep.dsa.semana1;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class ContainsDuplicate {

    public static void main(String[] args) {

        // Entrada utilizada apenas para testar localmente.
        int[] nums = {1, 2, 3, 2};

        ContainsDuplicate desafio = new ContainsDuplicate();
        boolean resultado = desafio.containsDuplicate(nums);
        System.out.println("Entrada: " + Arrays.toString(nums));

        System.out.println("Resultado: " + resultado);
    }

    public boolean containsDuplicate(int[] nums) {

        /*
         * Vamos usar a estrutura HashSet porque ela não armazena elementos
         * duplicados. Ela é apropriada para guardar os números que já foram
         * observados e verificar se determinado número apareceu anteriormente.
         *
         * O Contains Duplicate funciona da seguinte forma:
         * percorremos o array sequencialmente e analisamos cada número.
         * Durante o percurso, os números que já foram observados serão
         * armazenados em um HashSet.
         */

        // Criando a estrutura HashSet.
        Set<Integer> numerosObservados = new HashSet<>();

        // Percorrendo o array e verificando cada número.
        for (int i = 0; i < nums.length; i++) {

            if (numerosObservados.contains(nums[i])) {
                // Impressões usadas apenas para acompanhar o fluxo nos estudos.
                System.out.println("HashSet: " + numerosObservados);
                System.out.println("Número duplicado encontrado: " + nums[i]);

                return true;
            }

            numerosObservados.add(nums[i]);
        }

        // Impressões usadas apenas para acompanhar o fluxo nos estudos.
        System.out.println("HashSet: " + numerosObservados);
        System.out.println("Nenhum número duplicado foi encontrado.");

        return false;
    }
}
