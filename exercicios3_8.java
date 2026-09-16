import java.util.Scanner;

/*Implemente um programa que lê 50 valores inteiros e positivos, calcule e
escreva:
(a) a média dos valores;
(b) o maior deles;
(c) o menor deles;
(d) a quantidade de valores que estão no intervalo [0;10]. */

public class exercicios3_8 {
    public static void main(String args){
        Scanner in = new Scanner(System.in);

        int i = 0, sum = 0, n, mai = 0, men=Integer.MAX_VALUE, val=0;

        while(i < 50){
            do{
                System.out.println("Digite um valor: ");
                n = in.nextInt();
            }while(n <= 0);
            
        }
    }
}
