import java.util.Scanner;

//O programa deve solicitar o saldo médio de uma conta corrente e dizer o limite 

public class exercicios2_6{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
    
        double s;

        System.out.println("\fDigite o saldo: ");
        s = in.nextDouble();

        if (s < 500){
            System.out.println("Não há limite");
        } else if (s >= 500 && s < 1000){
            s = s * 0.08;
            System.out.println("Limite é " + s + " reais");
        }else if (s >= 1000){
            s = s * 0.15;
            System.out.println("Limite é " + s + " reais");
        }

  }
}