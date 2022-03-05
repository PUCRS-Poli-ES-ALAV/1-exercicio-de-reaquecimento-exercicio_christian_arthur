package br.pucrs.alav;

public class Recursion {
    public static void main (String args []){
        System.out.println("Resposta 1: " + mult(4,6));
        System.out.println("Resposta 2: " + soma(3,2));
        System.out.println("Resposta 3: " + divisao(5));
        String s1 = "Papagaio".replaceAll("\\s", "").toUpperCase();
        System.out.println("Resposta 4: " + Inverse(s1));
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
            return "É Palindromo"; 
        }
        if(word.charAt(0) == word.charAt(word.length()-1)) {
        	return Palindrome(word.substring(1, word.length()-1));
        }
        return "Não é Palindromo";
    }
}
