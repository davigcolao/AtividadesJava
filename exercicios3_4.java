/*Faça um programa que escreve os 100 primeiros quadrados perfeitos (números naturais): 0, 1, 4, 9, 16, ... */

public class exercicios3_4 {
    public static void main(String args[]){

        for(int i = 0; i < 100; i++){
            System.out.println("Quadrado de " + i + " é " +Math.pow(i,2));
        }
    }    
}
