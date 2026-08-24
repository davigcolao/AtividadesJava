import java.util.Scanner;

public class exercicio_17{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        
        double r1, r2, h1, h2, h3, vCl1, vCl2, vCn, vT;

        System.out.println(" \fDigite os raios (1 e 2): ");
        r1 = in.nextDouble();
        r2 = in.nextDouble();
        System.out.println(" Digite as alturas (1, 2 e 3): ");
        h1 = in.nextDouble();
        h2 = in.nextDouble();
        h3 = in.nextDouble();   

        vCl1 = (double) Math.PI * Math.pow(r1, 2) * h1;
        vCl2 = (double) Math.PI * Math.pow(r2, 2) * h2;
        vCn = (double) Math.PI * ((Math.pow(r1, 2) + r1 * r2 + Math.pow(r2, 2) ) * h3 / 3);
        System.out.printf(" O volume do cilindro 1 é: %.2f\n", vCl1);
        System.out.printf(" O volume do cilindro 2 é: %.2f\n", vCl2);
        System.out.printf(" O volume do cone é: %.2f\n", vCn);

        vT = vCl1 + vCl2 + vCn;
        System.out.printf(" O volume total é: %.2f", vT);

    }
}