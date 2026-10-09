import java.util.Scanner;

/*Faça um programa que leia um vetor com 20 inteiros, todos positivos,
calcule e escreva a soma, o maior e a quantidade de pares existentes nesse
vetor. A leitura, a soma, o maior e quantidade de pares devem ser definidos
em métodos. */

public class exercicios5_9 {

    public static void main(String[] args) {
        int[] vet = lerVetor();
        printVet(vet);

        System.out.println("Soma: " + soma(vet));
        System.out.println("Maior: " + maior(vet));
        System.out.println("Menor: " + menor(vet));
        System.out.println("Quantidade de pares: " + quantidadePares(vet));
    }

    public static int[] lerVetor() {
        Scanner in = new Scanner(System.in);
        int[] vet = new int[20];
        int n;

        for (int i = 0; i < vet.length; i++) {
            do {
                System.out.println("Digite um numero positivo: ");
                n = in.nextInt();
            } while (n <= 0);
            vet[i] = n;
        }

        return vet;
    }

    public static void printVet(int[] vet) {
        System.out.println("Valores do vetor:");
        for (int valor : vet) {
            System.out.println("Valor: " + valor);
        }
    }

    public static int soma(int[] vet) {
        int total = 0;
        for (int valor : vet) {
            total += valor;
        }
        return total;
    }

    public static int maior(int[] vet) {
        int maior = vet[0];
        for (int i = 1; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
            }
        }
        return maior;
    }

    public static int menor(int[] vet) {
        int menor = vet[0];
        for (int i = 1; i < vet.length; i++) {
            if (vet[i] < menor) {
                menor = vet[i];
            }
        }
        return menor;
    }
    public static int quantidadePares(int[] vet) {
        int pares = 0;
        for (int valor : vet) {
            if (valor % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }
}