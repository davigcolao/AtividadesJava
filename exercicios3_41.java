import java.util.Scanner;

/* Faça um programa que lê uma frase e escreve a primeira e a última letra
dessa frase. */

public class exercicios3_41 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        String frase = null;
        char pri, ult;
        int tamanho;

        do{
            System.out.println("Digite a frase: ");
            frase = in.nextLine();
        }while(frase == null);

        tamanho = frase.length();
        pri = frase.charAt(0);
        ult = frase.charAt(tamanho - 1);

        System.out.println("A primeira letra é " + pri + ", e a última é " + ult + ", o tamanho da frase é: " + tamanho);
    }
}
