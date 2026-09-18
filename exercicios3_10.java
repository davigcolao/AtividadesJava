import java.util.Scanner;

/*Implemente um programa que leia um valor inteiro, não negativo e escreva
o seu fatorial e seu somatório. */

public class exercicios3_10 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n=0, sum=0, f=1;

        do{
            System.out.println("Digite n: ");
            n = in.nextInt();
        }while(n <= 0);

        for(int i = 1; i <= n; i++){
            f = f * i;
            sum = sum + i;
        }
        System.out.println("Fatorial de " + n + "! é " + f);
        System.out.println("Somátorio " + n + " é " + sum);
    }
}
