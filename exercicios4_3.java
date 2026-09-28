import java.util.Scanner;

/* Faça um programa que leia as dimensões de uma casa (largura e comprimento) e as dimensões de um terreno (largura e comprimento). A seguir,
o programa deve calcular e escrever a área da casa, a área do terreno e a
área livre. O cálculo de cada área deve ser realizado por um método. */

public class exercicios4_3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        double l, c, aC, aT;

        System.out.println("Digite as dimensões da casa (largura e comprimento): ");
        l = in.nextDouble();
        c = in.nextDouble();
        aC = area(c, l);

        System.out.println("Digite as dimensões do terreno");
        l = in.nextDouble();
        c = in.nextDouble();
        aT = area(c, l);

        System.out.println("A casa possui " + aC + " metros quadrados");
        System.out.println("O terreno possui " + aT + " metros quadrados");
        System.out.println("Espaço livre " + areaL(aT, aC) + " metros quadrados");
        
    }
    public static double area(double l, double c){
        return l * c;
    }
    public static double areaL(double aT, double aC){
        return aT - aC;
    }
}
