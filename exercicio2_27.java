import java.util.Scanner;

/*Faça um programa que leia 3 cartas (valor e naipe) de um baralho, verifique
e escreva se as três cartas formam uma trinca. Para ser uma trinca, os
valores devem ser iguais, mas os naipes diferentes. */

public class exercicio2_27 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int v1, v2, v3;
        String n1, n2, n3;
        
        System.out.println("Digite o valor e naipe da primeira carta: ");
        v1 = in.nextInt();
        n1 = in.next();
        System.out.println("Digite o valor e naipe da segunda carta: ");
        v2 = in.nextInt();
        n2 = in.next();
        System.out.println("Digite o valor e naipe da terceira carta: ");
        v3 = in.nextInt();
        n3 = in.next();

        if (v1 == v2 && v2 == v3 && (n1.compareToIgnoreCase(n2) != 0 || (n2.compareToIgnoreCase(n3) != 0 || (n1.compareToIgnoreCase(n3) != 0)))){
            System.out.println("As cartas formam uma trinca");
        }else{
            System.out.println("As cartas não formam uma trinca");
        }
    }
}