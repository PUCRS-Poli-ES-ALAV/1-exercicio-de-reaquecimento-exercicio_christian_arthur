package br.pucrs.alav;
import java.util.Arrays;

public class Recursion {
    public static void main (String args []){
        System.out.println("Resposta 1: " + mult(4,6));
        System.out.println("Resposta 2: " + soma(3,2));
        System.out.println("Resposta 3: " + divisao(5));
        String s1 = "Papagaio".replaceAll("\\s", "").toUpperCase();
        System.out.println("Resposta 4: " + Inverse(s1));
        System.out.println("Resposta 5: " + sequencia1(5));
        //System.out.println("Resposta 6: " + sequenciaAckerman(7,4)); Erro estranho
        System.out.println("Resposta 7: " + somaDeVetor(new int[]{5,5,6,9,8,2,3}));
        String s2 = "Luz Azul".replaceAll("\\s", "").toUpperCase();
        System.out.println("Resposta 8: " + Palindrome(s2));
    
    }
	
    private static int mult(int num1, int num2){
        if(num2 == 1){
            return num1;
        }else{
            num2 = num2 - 1;
            return num1 = num1 + mult(num1, num2);
        }
    }

    private static int soma(int num1, int num2){
        if(num2 == 0){
            return num1;
        }else{
            num2 = num2 - 1;
            return 1 + soma(num1, num2);
        }
    }

    private static double divisao (double num){
    	if(num == 1){
            return num;
        }else{
        	double result = 1 / num;
            return result + divisao(num-1);
        }
    }
    
    public static String Inverse(String word)
    {   
    	if(word.length() == 0 || word.length() == 1){
            return word;
        }else{
        	char w1 = word.charAt(0);
        	char w2 = word.charAt(word.length()-1);
    	
        	return w2 + Inverse(word.substring(1, word.length()-1)) + w1;
        }
    }
    
    public static String Palindrome(String word)
    {   
        if(word.length() == 0 || word.length() == 1) {
            return "� Palindromo"; 
        }
        if(word.charAt(0) == word.charAt(word.length()-1)) {
        	return Palindrome(word.substring(1, word.length()-1));
        }
        return "N�o � Palindromo";
    }

    public static int sequencia1(int num){
        if(num == 1){
            return 1;
        }
        if(num == 2){
            return 2;
        }else{
            return (2*sequencia1(num-1)) + (3*sequencia1(num-2));
        }
    }

    public static int sequenciaAckerman(int m, int n){
        if(m == 0){
            return n+1;
        }
        if(n == 0){
            return sequenciaAckerman(m-1,1);
        }
        else{
            return sequenciaAckerman(m - 1, sequenciaAckerman(m, n - 1));
        }
    }

    public static int somaDeVetor(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }else{
            int[] newNums = Arrays.copyOfRange(nums, 1, nums.length);
            return nums[0] + somaDeVetor(newNums);
        }
    }
}
