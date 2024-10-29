package com.example;

public class FindEvenNumberDigits {
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12, 345, 2, 6, 7896}));  // 2
        System.out.println(findNumbers(new int[]{555, 901, 482, 1771}));  // 1
    }

    /*
     * Esta função verifica se o número é formado por um número par de digitos 
     * Exemplos de números que possuem um número par de digitos:
     *      - 12 - 2 digitos
     *      - 1234 - 4 digitos
     *      - 123456 - 6 digitos
     *      - 12345678 - 8 digitos
     *      - 1234567890 - 10 digitos
     */
    public static int findNumbers(int[] nums){
        int countEvenNumbers = 0;
        for (int i : nums) {
            int numDigits = String.valueOf(i).length();
            if(numDigits % 2 == 0){
                countEvenNumbers++;
            }
        }

        return countEvenNumbers;
    }
}
