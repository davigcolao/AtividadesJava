/* Faça um programa que gere o números de 1000 a 1999 e escreva aqueles
que divididos por 11 dão resto igual a 5. */

public class exercicios3_6 {
    public static void main(String args[]){
    
    for(int i = 1000; i <= 1999; i++){
        if (i % 11 == 5){
            System.out.println(i);
            }
        }
    }
}
