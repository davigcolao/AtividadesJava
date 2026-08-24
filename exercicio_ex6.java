import java.util.Scanner;
/* Elabore um algoritmo que leia o tamanho do lado de um quadrado e informe a área e o perímetro do quadrado. (Perímetro = 4*L; área = L^2). */
public class exercicio_ex6{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
    
        double l1, a, p;

        System.out.println("Digite o tamanho do lado do quadrado: ");
        l1 = in.nextDouble();

        a = l1 * l1;
        p = 4 * l1;

        System.out.println("A área do quadrado é: " + a);
        System.out.println("O perímetro do quadrado é: " + p);

    }
}