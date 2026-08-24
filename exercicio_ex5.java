import java.util.Scanner;
/*Faça um algoritmo que após a entrada de uma determinada distância entre dois pontos(Km), e uma determinada velocidade(Km/h),
 diga qual o tempo médio que levará para chegada à esse local e qual a velocidade em metros/segundos.. */
public class exercicio_ex5{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
    
        double d, v, t, ms;

        System.out.println(" \f Entre com as distâncias(km): ");
        d = in.nextDouble();

        System.out.println(" Entre com as velocidades(km/h): ");
        v = in.nextDouble();

        t = d / v;

        ms = v / 3.6;

        System.out.printf(" O tempo para chegar é %.2f horas e a velocidade em m/s é %.2f\n", t, ms);
    }
}