import java.util.Scanner;

/*Elabore um programa que leia 30 valores em Fahrenheit, em um vetor,
calcula a conversão de cada temperatura de Fahrenheit (F) para Celsius
(C) e guarda em outro vetor. O programa deve escrever os dois vetores
na tela. Para calcular a conversão defina um método e use a fórmula
C = 5/9 × (F − 32). Crie métodos também para ler e escrever os vetores. */

public class exercicios5_11{
    public static void main(String args[]){
        double[] fah = vet();


    }
    public static double[] vet(){
        Scanner in = new Scanner(System.in);
        double[] fah = new double[30];

        for(int i = 0; i < 30; i++){
            System.out.println("Digite as temperaturas em fahrenheit: ");
            fah[i] = in.nextInt();
        }
    return fah;
    }
    public static double[] celsius(double[] celsius){
        double[] celsius = new double[30];
        for(int i = 0; i < 30; i++){
            celsius = 5/9 * (fah)
        }
    }
}