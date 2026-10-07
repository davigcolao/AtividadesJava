import java.util.Scanner;

/* 2) Faça um programa que use String
    Mostre a palavra em letras maiusculas
    Informe a quantidade de caracteres da palavra
    Mostre a primera e a ultima letra
    Verique se a letra contem a
    Substitua a letra a por * */

public class correcaoprova1_2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        String palavra;

        System.out.println("Digite uma palavra: ");
        palavra = in.nextLine();

        System.out.println("Palavra em maiusculas: " + palavra.toUpperCase());
        System.out.println("Quantidade de caracteres: " + (palavra.length()));
        System.out.println("Primeira letra: " + palavra.charAt(0));
        System.out.println("Ultima letra: " + palavra.charAt(palavra.length() - 1));
        if (palavra.contains("a")){
            System.out.println("Contem 'a'");
        }else System.out.println("Não tem 'a'");
        System.out.println("Substituindo a letra 'a' por '*': " + palavra.replace("a", "*"));
    } 
}
