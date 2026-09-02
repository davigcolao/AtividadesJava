import java.util.Scanner;

public class exercicios2_19 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        double p, h, imc;

        System.out.println("Digite o peso (em kg): ");
        p = in.nextDouble();
        System.out.println("Digite a altura (em m):");
        h = in.nextDouble();

        imc = p / (Math.pow(h, 2));

        if (imc < 20){
            System.out.println("Abaixo do peso");
        }else if (imc >= 20 && imc < 25){
            System.out.println("Normal");
        }else if (imc >= 25 && imc < 30){
            System.out.println("Acima do peso");
        }else if (imc >= 30 && imc < 35){
            System.out.println("Obesidade");
        }else if (imc >= 35){
            System.out.println("Obesidade mórbida");
        }else System.out.println("Valor inválido"); 
    }
}
