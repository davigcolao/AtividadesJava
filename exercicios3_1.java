import java.util.Scanner;

/* */

public class exercicios3_1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int v = 0;

        while (v <= 0){
            System.out.println("Digite um número positivo: ");
            v = in.nextInt();
        }
        System.out.println("Digitou " + v);
    }
}
