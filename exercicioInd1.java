import java.util.Scanner;

/*Escreva um algoritmo que leia as coordenadas cartesianas $(x, y)$ de um ponto no plano e determine sua localização exata, 
informando se ele se encontra sobre a origem, sobre um dos eixos coordenados (Eixo X ou Eixo Y), ou em qual dos quatro quadrantes do plano cartesiano. */

public class exercicioInd1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        double x, y;

        System.out.println("Digite o X: ");
        x = in.nextDouble();
        System.out.println("Digite o Y: ");
        y = in.nextDouble();

        if (x == 0 && y == 0){
            System.out.println("O ponto se encontra sobre a origem.");
        }else if (x == 0){
            System.out.println("O ponto se encontra sobre o eixo Y.");
        }else if (y == 0){
            System.out.println("O ponto se encontra sobre o eixo X.");
        }else if (x > 0 && y > 0){
            System.out.println("O ponto se encontra no primeiro quadrante.");
        }else if (x < 0 && y > 0){
            System.out.println("O ponto se encontra no segundo quadrante.");
        }else if (x < 0 && y < 0){
            System.out.println("O ponto se encontra no terceiro quadrante.");
        }else if (x > 0 && y < 0){
            System.out.println("O ponto se encontra no quarto quadrante.");
        }

    }
}
