import java.util.Scanner;

/* Faça um programa que leia as dimensões de uma casa (largura e comprimento) e as dimensões de um terreno (largura e comprimento). A seguir,
o programa deve calcular e escrever a área da casa, a área do terreno e a
área livre. O cálculo de cada área deve ser realizado por um método. */

public class exercicios4_3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        double lC, cC, lT, cT;

        System.out.println("Digite as dimensões da casa (largura e comprimento): ");
        lC = in.nextDouble();
        cC = in.nextDouble();

        System.out.println("Digite as dimensões do terreno");
        lT = in.nextDouble();
        cT = in.nextDouble();

        System.out.println("A casa possui " + areaC(lC, cC) + " metros quadrados");
        System.out.println("O terreno possui " + areaT(lT, cT) + " metros quadrados");
        System.out.println("Espaço livre " + areaL(lC, lT, cC, cT) + " metros quadrados");
        
    }
    public static double areaC(double lC, double cC){
        return lC * cC;
    }
    public static double areaT(double lT, double cT){
        return lT * cT;
    }
    public static double areaL(double lC, double lT, double cC, double cT){
        return (lT * cT) - (lC * cC);
    }
}
