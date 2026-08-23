package br.com.gabrielfalcao.prep.javacore.semana1.exercicio01twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumDesafioFinal {


    public static void main(String[] args) {
        int nums [] = {1,2,6,7,8,9};
        int target = 10;

         TwoSumDesafioFinal desafio = new TwoSumDesafioFinal();
        int[] resultado = desafio.twoSum(nums, target);

        System.out.println("Resultado: " + Arrays.toString(resultado));
        
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapa = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int numeroNecessario = target - nums[i];
            if(mapa.containsKey(numeroNecessario)){
                return new int[]{mapa.get(numeroNecessario), i};
            } 
            mapa.put(nums[i], i);
            System.out.println(mapa);
            
        }
        // TODO: Sua implementação aqui
        return new int[0];
    }

    
}
