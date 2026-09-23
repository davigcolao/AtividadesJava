import java.util.Scanner;

/*Faça um programa que leia uma frase e escreva quantas letras ’a’ esta
frase possui. */

public class exercicios3_42 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        String frase = null;
        int cont = 0;

        do{
            System.out.println("Digite a frase: ");
            frase = in.nextLine();
        }while(frase == null);

        for(int i = 0; i < frase.length() - 1; i++){
            if(frase.charAt(i) == 'a') cont++;
        }

        System.out.println("A quantidade de letras 'A' é " + cont);
    }
}
