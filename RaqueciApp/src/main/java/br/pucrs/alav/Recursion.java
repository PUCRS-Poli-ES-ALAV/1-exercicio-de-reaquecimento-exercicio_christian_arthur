package br.pucrs.alav;

public class Recursion {
    public static void main (String args []){
        System.out.println("Resposta 1: " + mult(4,6));
        System.out.println("Resposta 2: " + soma(3,2));
        System.out.println("Resposta 2: " + divisao(5));
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

    private static int divisao(int num1, int num2){

    }
}
