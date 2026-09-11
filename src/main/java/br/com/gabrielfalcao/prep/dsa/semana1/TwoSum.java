package br.com.gabrielfalcao.prep.dsa.semana1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public static void main(String[] args) {
        
    int[] nums = {1, 2, 3};
    int target = 10;

    TwoSum desafio = new TwoSum();

    System.out.println("Entrada: " + Arrays.toString(nums));
    System.out.println("Target: " + target);

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
        return new int[0];
    }


}
