import java.util.Scanner;

//O programa deve pegar um valor em R$ e informar se o valor é positivo, negativo ou zero. Além disso, deve informar se o valor é pequeno (menor que 1) ou grande (maior que 1.000.000).

public class exercicios2_4{
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
        
        double vR;

       System.out.println("Digite o valor de R$: ");
       vR = in.nextDouble();
    
        if (vR == 0){
            System.out.println("O valor digitado é zero.");
        } else if (vR > 0){
            System.out.println("O valor digitado é positivo.");
        } else {
            System.out.println("O valor digitado é negativo.");
        }
        if (Math.abs(vR) < 1){
            System.out.println("O valor é pequeno");
        } else if (Math.abs(vR) > 1000000){
           System.out.println("O valor é grande");
        }
    
    }
}