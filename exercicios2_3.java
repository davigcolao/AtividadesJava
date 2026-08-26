import java.util.Scanner;

// Programa deve pegar o peso e o sexo do usuário e calcular o peso ideal baseado na altura e sexo. (Para homens: 72.7 * altura - 58; Para mulheres: 62.1 * altura - 44.7)

public class exercicios2_3{
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
        double h, s, p;
    
        System.out.println("Digite a sua altura (Ex.: 1,70): ");
        h = in.nextDouble();
        System.out.println("Digite seu sexo (1 para feminino e 2 para masculino): ");
        s = in.nextDouble();

        if (s == 1){
            p = 62.1 * h - 44.7;
            System.out.printf("Seu peso ideal é: %.2f kg", p);
        } else if (s == 2){
            p = 72.7 * h - 58;
            System.out.printf("Seu peso ideal é: %.2f kg", p);
        } else {
            System.out.println("Sexo inválido. Por favor, digite 1 para feminino ou 2 para masculino.");
        }
    }
}