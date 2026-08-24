import java.util.Scanner;
/*
Faça um algoritmo que leia quatro números informados pelo usuário e que depois imprima a média ponderada, sabendo-se que os pesos são respectivamente: 1, 2, 3 e 4.*/
public class exercicio_ex1{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        
    double a, b, c, d, mP;
    
    System.out.println(" \f Digite os 4 números: ");
    a = in.nextDouble();
    b = in.nextDouble();
    c = in.nextDouble();
    d = in.nextDouble();
    
    mP =(a*1 + b*2 + c*3 + d*4) / 10;

    System.out.printf(" A média ponderada dos números informados é: %.2f\n", mP);

    }
}