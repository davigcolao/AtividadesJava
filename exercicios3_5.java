import java.util.Scanner;

/*Implemente um programa que leia um valor n e escreva todos os quadrados
perfeitos menores que n. Exemplo : n=100, escreve 1, 4, 9, 16, 25, 36, 49, 64, 81 */

public class exercicios3_5 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n;

        System.out.println("Digite o número: ");
        n = in.nextInt();

        for(int sqr = 1; sqr < n; sqr++){
            if(sqr * sqr < n){
            System.out.println("Quadrado de " + sqr + " é " + Math.pow(sqr,2));
            }
        }
    }
}
