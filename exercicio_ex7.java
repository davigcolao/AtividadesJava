import java.util.Scanner;
public class exercicio_ex7{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
    
        double l1, l2, a, p;

        System.out.println("Digite o tamanho os lados do retangulo: ");
        l1 = in.nextDouble();
        l2 = in.nextDouble();

        if(l1 > 0 && l2 > 0){
            a = l1 * l2;
            p = 2 * (l1 + l2);

            System.out.println("A área do retangulo é: " + a);
            System.out.println("O perímetro do retangulo é: " + p);
        }
    }
}
