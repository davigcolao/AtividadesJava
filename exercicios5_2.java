import java.util.Scanner;

/*Escreva um programa que leia 30 valores reais, todos pertencentes ao
intervalo [0;10], calcule a média aritmética desses valores e o seu desvio
padrão (fórmula abaixo). Os valores devem ser inseridos em um vetor. */

public class exercicios5_2 {
    public static void main(String args[]){
        double[] aux = inserir();
        double media = media(aux);
        System.out.println("A média é: " + media);
        double desvio = desvio(aux, media);
        System.out.println("O desvio padrão é: " + desvio);
    }
    public static double[] inserir() {
        Scanner in = new Scanner(System.in);

        double valor;
        double[] vetor = new double[30];

        for (int i = 1; i < 30; i++){
            do{
                System.out.println("Digite um valor entre 0 e 10 para a posição " + i + ": ");
                valor = in.nextDouble();   
            }while ( valor < 0 || valor > 10);
            vetor[i] = valor;
        }
        return vetor;
    }
    public static double media(double[] vetor){
        double sum = 0;
        for(double v : vetor){
            sum += v;
        }
        return sum / 30;
    }
    public static double desvio(double[] vetor, double media){
        double sum = 0;
        for (double v : vetor){
            sum += Math.pow(v - media, 2);
        }
        return Math.sqrt(sum / 30);
    }
}
