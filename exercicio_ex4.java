import java.util.Scanner;
/* Faça o algoritmo que calcule o valor em Reais, correspondente aos dólares que um turista possui no cofre do hotel. 
O programa deve solicitar os seguintes dados: Quantidade de dólares guardados no cofre e cotação do dólar naquele dia. */
public class exercicio_ex4{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
    
        double d, c, r;

        System.out.println(" \f Entre a quantidade de doláres: ");
        d =  in.nextDouble();

        System.out.println(" Entre a cotação de hoje: ");
        c = in.nextDouble();

        r = d * c;

        System.out.printf(" O valor em reais é: %.2f\n", r);


    }
}