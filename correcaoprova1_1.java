// 1.1) Final é uma variavel que não pode ser alterada, ou seja, uma constante;

// 1.2) Total = 225,0000;
//      Desconto = 37,5000;

// 1.3) Reescrever o programa para que ele leia o teclado, valide que a quantidade e o preço sejam maiores que zero, e mostrar o valor final com o desconto.

import java.util.Scanner;

public class correcaoprova1_1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int quant;
        double preco;
        final double taxa = 0.15;

        do{
            System.out.println("Digite a quantidade: ");
            quant = in.nextInt();
        } while (quant <= 0);
        do{
            System.out.println("Digite o preço: ");
            preco = in.nextDouble();
        } while (preco <= 0);

        double total = quant * preco;
        double desconto = total * taxa;

        System.out.println("Total = " + total);
        System.out.println("Desconto = " + (total - desconto));
    }
}
