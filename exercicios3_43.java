import java.util.Scanner;

/*Construa um programa que lê o nome de uma pessoa e o escreve ao contrário (de trás para frente). */

public class exercicios3_43 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        String nome = null;
        char letra;

        do{
            System.out.println("Digite o nome: ");
            nome = in.nextLine();
        }while(nome == null);

        for(int i = nome.length()-1; i >= 0; i--){
            System.out.print(nome.charAt(i));
        }

    }
}
