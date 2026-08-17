package br.com.gabrielfalcao.prep.javacore.semana1.exercicio01twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {4,2,6,10};
        int target = 8;

        TwoSum desafio = new TwoSum();
        int[] resultado = desafio.twoSum(nums, target);

        System.out.println("Retorno: " + Arrays.toString(resultado));

    }

   public int[] twoSum(int[] nums, int target) {

    //Criar o HashMap.
    Map<Integer, Integer> mapa = new HashMap<>();

    //Percorrer a array
    for(int i = 0; i < nums.length; i++){
        int numeroAtual = nums[i];
       int numeroNecessario = target - numeroAtual;
       if(mapa.containsKey(numeroNecessario)){
        return new int[]{mapa.get(numeroNecessario), i};
       } else {
        mapa.put(numeroAtual, i);
       }
    }

    return new int[0];
}
    }
