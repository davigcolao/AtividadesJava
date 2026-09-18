import java.util.Scanner;

/*Faça um programa que escreve os n primeiros termos da série de fibonacci:
1, 1, 2, 3, 5, 8, 13, 21, ... */

public class exercicios3_20 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n, i=1, fib = 1;

        System.out.println("Digite a quantidade de n");
        n = in.nextInt();

        for(int v =1; v <= n; v++ ){
            System.out.println("F de " + v + " é " + fib);
            int antes = fib + i;
            fib = i;
            i = antes;
        }
    }
}
