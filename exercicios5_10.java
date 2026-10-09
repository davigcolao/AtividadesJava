import java.util.Scanner;

/*Crie um programa que leia 2 vetores, A e B, ambos de 10 valores reais. O
programa deve calcular e guardar em um vetor soma, a soma dos elementos
de A com B. A leitura dos vetores, o cálculo e escrita do vetor soma devem
ser feitos por métodos. */

public class exercicios5_10 {
    public static void main(String[] args) {
        double[] vetA = lerVetor("A");
        double[] vetB = lerVetor("B");
        double[] soma = somarVetores(vetA, vetB);

        System.out.println("Vetor soma:");
        imprimirVetor(soma);
    }

    public static double[] lerVetor(String nomeVetor) {
        Scanner in = new Scanner(System.in);
        double[] vet = new double[10];

        for (int i = 0; i < vet.length; i++) {
            System.out.printf("Digite o %dº número do vetor %s: ", i + 1, nomeVetor);
            vet[i] = in.nextDouble();
        }
        System.out.println("===== Vetor " + nomeVetor + " finalizado =====");
        return vet;
    }

    public static double[] somarVetores(double[] vetA, double[] vetB) {
        double[] soma = new double[10];

        for (int i = 0; i < soma.length; i++) {
            soma[i] = vetA[i] + vetB[i];
        }
        return soma;
    }

    public static void imprimirVetor(double[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("Posição %d: %.2f%n", i, vet[i]);
        }
    }
}
