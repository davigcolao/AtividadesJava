import java.util.Scanner;

/*Elabore um programa que leia 30 valores em Fahrenheit, calcula a conversão de cada temperatura de Fahrenheit (F) para Celsius (C) e escreve
o valor resultante na tela. Para calcular a conversão defina um método e
use a fórmula C = 5/9 × (F − 32). */

public class exercicios4_6 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        double f; 

        for(int i = 1; i <= 30; i++){
            System.out.println("Digite a temperatura em fahrenheit: ");
            f = in.nextDouble();
            System.out.printf("A temperatura é %.2f\n", celsius(f));
        }

    }
    public static double celsius(double f){
        return 5.0 / 9 * (f - 32);
    }

}
