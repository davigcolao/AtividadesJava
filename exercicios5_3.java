import java.util.Scanner;

/*Implemente um programa que leia dois valores inteiros e positivos: a e b.
A seguir, o programa deve preencher um vetor com os valores pares entre
a e b. Escreva o vetor criado. */

public class exercicios5_3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a, b;
        do{
            do{
                System.out.println("Digite o valor de A: ");
                a = in.nextInt();
            }while (a < 0);
            do {
                System.out.println("Digite o valor de B: ");
                b = in.nextInt();
            }while (b < 0);
        } while (a > b);
        int[] vetor = par(a, b);

        if (vetor != null){    
            System.out.println("Vetor: " + java.util.Arrays.toString(vetor));
        }
    }
    public static int[] par(int a, int b){
        int tamanho = (b - a) / 2 + 1;
        int[] vetor = new int[tamanho];
        int j = 0;
        for (int i = a; i <= b; i++){
            if (i % 2 == 0){
                vetor[j] = i;
                j++;
            }
        }
        return vetor;
    }
}