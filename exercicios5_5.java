import java.util.Scanner;

/*. Escreva um programa que lê um valor n inteiro e guarde em um vetor os
n primeiros termos da série de fibonacci: 1, 1, 2, 3, 5, 8, 13, 21, ... O
programa deve escrever o vetor, ao seu final. */

public class exercicios5_5 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n;
        do{ 
            System.out.println("Digite o valor de n: ");
            n = in.nextInt();
        }while (n <= 0);
        int[] vetor = fibonacci(n);
    }
    public static int[] fibonacci(int n){
        int[] vetor = new int[n];
        int i = 1, fib = 1;
        for(int v =1; v <= n; v++ ){
            System.out.println("F de " + v + " é " + fib);
            int antes = fib + i;
            fib = i;
            i = antes;
        }
        return vetor;
    }
}
