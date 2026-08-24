import java.util.Scanner;
/* Em épocas de pouco dinheiro, os comerciantes estão procurando aumentar suas vendas oferecendo desconto. 
Faça um algoritmo que possa receber um valor de um produto e que escreva o novo valor tendo em vista que o desconto foi de 9% */
public class exercicio_ex3{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
    
        double v1, v2, d;
        
        System.out.println(" \f Digite o valor: ");
        v1 = in.nextDouble();

        v2 = v1 - (v1 * 0.09);
        d = v1 * 0.09;

        System.out.printf(" O valor com desconto é: %.2f\n", v2);
        System.out.printf(" O desconto é: %.2f\n", d);

    }
}