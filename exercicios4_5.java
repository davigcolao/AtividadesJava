import java.util.Scanner;

/*Faça um programa que leia as coordenadas de 2 pontos no plano (x1, y1) e
(x2, y2). A seguir, o programa deve calcular e escrever a distância euclidiana e também a distância de Manhattan entre esses pontos. Para isso,
dena um método que calcula a distância euclidiana usando a fórmula:
distanciae = p (x1 − x2) 2 + (y1 − y2)2. 
Dena também um método que calcula a distância de Manhattan pela fórmula: distanciam = |x1 − x2| + |y1 − y2|.
 */

public class exercicios4_5 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int x1, y1, x2, y2;

        System.out.println("Digite as primeiras coordenadas (X, Y): ");
        x1 = in.nextInt();
        y1 = in.nextInt();

        System.out.println("Digite as segundas coordenadas (X, Y): ");
        x2 = in.nextInt();
        y2 = in.nextInt();

        System.out.println("A distancia euclidiana é " + euclidiana(x1, y1, x2, y2));
        System.out.println("A distancia de manhattan é " + manhattan(x1, y1, x2, y2));
    }
    public static double euclidiana(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
    public static double manhattan(double x1, double y1, double x2, double y2){
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
    
}
