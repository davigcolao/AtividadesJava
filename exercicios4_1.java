import java.util.Scanner;

/* Faça um programa que leia 3 valores, calcule e escreva a média aritmética
desses valores. A média deve ser calculada por um método. */

public class exercicios4_1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        double v1, v2, v3;

        System.out.println("Digite os três valores: ");
        v1 = in.nextDouble();
        v2 = in.nextDouble();
        v3 = in.nextDouble();

        System.out.printf("%.2f", mediaA(v1, v2, v3));
        System.out.printf("\n%.2f", mediaP(v1, v2, v3));
        System.out.println("\n" + maior(v1,v2,v3));

    }
    public static double mediaA(double v1, double v2, double v3){
        return (v1 + v2 + v3) / 3;
    }
    public static double mediaP(double v1, double v2, double v3){
        return (v1*2 + v2*3 + v3*4) / 9;
    }
    public static double maior(double v1, double v2, double v3){
        if (v1 > v2  && v1 > v3){
            return v1;
        }else if (v2 > v1 && v2 > v3){
            return v2;
        }else{
            return v3;
        }
    }
}
