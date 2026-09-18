import java.util.Scanner;

/*Faça um programa que leia um valor inteiro e positivo e escreva os divisores
desse valor. */

public class exercicios3_11{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n, d=0;
        do{
        System.out.println("Digite n: ");
        n = in.nextInt();
        }while(n <= 0);

        for(int i=1; i <= n; i++){
            if (n % i == 0){
                d = i;
                System.out.println(i);
            }
            else continue;
        } 
    }
}