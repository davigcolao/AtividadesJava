import java.util.Scanner;

/*Implemente um programa que lê 50 valores inteiros e positivos, calcule e
escreva:
(a) a média dos valores;
(b) o maior deles;
(c) o menor deles;
(d) a quantidade de valores que estão no intervalo [0;10]. */

public class exercicios3_8 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int i = 0, sum = 0, n, mai = 0, men=Integer.MAX_VALUE, val=0;

        while(i < 10){
            do{
                System.out.println("Digite um valor: ");
                n = in.nextInt();
            }while(n <= 0);
            
            sum = sum + n;
            if (n > mai){
                mai = n;
            }if(n < men){
                men = n;
            }if(n >= 0 && n <= 10){
                val++;
            }
            i++;
        }

            System.out.printf("\nMédia: %.2f\n", (sum/10.0));
            System.out.println("\nMaior: " + mai + "\n");
            System.out.println("Menor: " + men + "\n");
            System.out.println("Entre 0 e 10: " + val + "\n");
            
    }
}
