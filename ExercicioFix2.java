import java.util.Scanner;

/*Programa leia valor de 10 produtos e mostre a media dos valores, no final */

public class ExercicioFix2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int p = 0, v = 0;
        double m;

        for(int i = 1; i <= 10; i++){
            System.out.println("Valor" + i + ": ");
            p = in.nextInt();

            v = v + p;
        }

        System.out.println(p1);

        m = (double)v / 10;
        System.out.println("Média é " + m);
    }
}
