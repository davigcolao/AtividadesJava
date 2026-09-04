import java.util.Scanner;

/*Faça um programa que leia o nome de 3 pessoas e os exiba em ordem
crescente */

public class exercicio2_29{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        String n1, n2, n3;

        System.out.println("Digite o nome da primeira pessoa: ");
        n1 = in.nextLine();
        System.out.println("Digite o nome da segunda pessoa: ");
        n2 = in.nextLine();
        System.out.println("Digite o nome da terceira pessoa: ");
        n3 = in.nextLine();

        if (n1.compareTo(n2) > 0 && (n1.compareTo(n3) > 0)){
            if (n2.compareTo(n3) > 0){
                System.out.println("Ordem crescente: " + n3 + ", " + n2 + ", " + n1);
            }else{
                System.out.println("Ordem crescente: " + n2 + ", " + n3 + ", " + n1);
            }
        }else if (n2.compareTo(n1) > 0 && (n2.compareTo(n3) > 0)){
            if (n1.compareTo(n3) > 0){
                System.out.println("Ordem crescente: " + n3 + ", " + n1 + ", " + n2);
            }else{
                System.out.println("Ordem crescente: " + n1 + ", " + n3 + ", " + n2);
            }
        }else if (n3.compareTo(n1) > 0 && (n3.compareTo(n2) > 0)){
            if (n1.compareTo(n2) > 0){}
                System.out.println("Ordem crescente: " + n1 + ", " + n2 + ", " + n3);
            }else{
                System.out.println("Ordem crescente: " + n2 + ", " + n1 + ", " + n3);
            }
        }
    }