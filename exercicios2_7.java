import java.util.Scanner;

//O programa deve receber o valor de um produto e calcular por quanto ele deva ser vendido

public class exercicios2_7 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        double v, l;

        System.out.println("\fDigite o valor do produto: ");
        v = in.nextDouble();

        if ( v < 10 ){
            l = v * 1.7;
            System.out.println("O produto deve ser vendido por: " + l);
        }else if (v >= 10 && v < 30 ){ 
            l = v * 1.5;
            System.out.println("O produto deve ser vendido por: " + l);
        }else if (v >= 30 && v < 50){
            l = v * 1.4;
            System.out.println("O produto deve ser vendido por: " + l);
        }else  if (v >= 50){
            l = v * 1.3;
            System.out.println("O produto deve ser vendido por: " + l);
        }
    }
}
