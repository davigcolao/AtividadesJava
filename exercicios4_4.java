import java.util.Scanner;

/*Crie um programa que lê o tempo atual em hora, minuto e segundo, e o
escreve em segundos quanto tempo se passou desde que o dia começou.
Essa conversão deve ser calculada por um método. */

public class exercicios4_4 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int h, m, s;
        do{
        System.out.println("Digite o tempo agora (h-m-s): ");
        h = in.nextInt();
        m = in.nextInt();
        s = in.nextInt();
        } while(h > 24 || m > 60 || s > 60 || h < 0 || m < 0 || s < 0);
        
        System.out.println("Se passaram " + tempo(h, m, s) + " segundos");

    }

    public static int tempo(int h, int m, int s){
        h = h * 3600;
        m = m * 60;

        int t = h + m + s;

        return t;
    }
}
