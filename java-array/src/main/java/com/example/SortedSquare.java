package com.example;

import java.util.*;

public class SortedSquare {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
        System.out.println(Arrays.toString(sortedSquares(new int[]{-7, -3, 2, 3, 11})));
    }

    /*
     * Essa função calcula o quadrado de cada numero em um array
     * retorna um array com os quadrados de cada numero do array de entrada em ordem crescente
     */
    public static int[] sortedSquares(int[] nums){
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = (int) Math.pow(nums[i], 2);
        }

        Arrays.sort(result);
        return result;
    }
}
