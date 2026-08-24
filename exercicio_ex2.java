import java.util.Scanner;
/*
 Faça um algoritmo que o usuário informe os valores dos catetos de um triângulo retângulo e que ao final escreva a sua hipotenusa.*/
public class exercicio_ex2{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        
        int c1, c2;
        double h;
    
        System.out.println(" \f Entre com os catetos: ");
        c1 = in.nextInt();
        c2 = in.nextInt();

        h = Math.pow(c1,2) + Math.pow(c2,2);
        h = Math.sqrt(h);

        System.out.printf(" A hipotenusa é: %.2f\n", h);
    }
}