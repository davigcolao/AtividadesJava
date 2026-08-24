import java.util.Scanner;

public class exercicio_11{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);    
        
        int n, m, c, d, u, nI;
        
        System.out.println("Digite um número inteiro de 4 dígitos: ");
        n = in.nextInt();

        m = n / 1000;
        c = (n / 100) % 10;
        d = (n / 10) % 10;
        u = n % 10;

        nI = (u * 1000) + (d * 100) + (c * 10) + m;

        System.out.println("Milhar: " + m);
        System.out.println("Centena: " + c);
        System.out.println("Dezena: " + d);
        System.out.println("Unidade: " + u);

        System.out.println("Número invertido: " + nI);
    }
}