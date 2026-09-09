import java.util.Scanner;

/*Faça um algoritmo que leia três valores correspondentes aos lados de um triângulo ($a$, $b$, $c$).
Verifique se eles formam um triângulo ($a < b + c$ e $b < a + c$ e $c < a + b$) e, caso afirmativo, classifique-o como Equilátero, Isósceles ou Escaleno. */

public class exercicioInd9 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite o valor de A, B, C: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println(" Não é um triângulo\n");    
        } else if (a != b && a == c || b != c && b == a || c != a && c == b) {
            System.out.println(" É um triângulo isósceles\n");
        } else if (a != b && b != c && a != c) {
            System.out.println(" É um triângulo escaleno\n");
        } else if (a == b && a == c) {
            System.out.println(" É um triângulo equilátero\n");
        }

    }    
}
