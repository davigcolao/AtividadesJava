import java.util.Scanner;

//Uma simples calculadora

public class Calculadora {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int v1, v2, resultado = 0;
        char op;
        String operacao;

        System.out.println("Digite o primeiro valor: ");
        v1 = in.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        v2 = in.nextInt();
        
        System.out.println("Digite o simoblo da operação (*, /, +, -): ");
        operacao = in.next();
        op = operacao.charAt(0);

        switch(op){
            case '+': 
                resultado = v1 + v2;
                break;
            case '-':
                resultado = v1 - v2;
                break;
            case '*':  
                resultado = v1 * v2;
                break;
            case '/':
                resultado = v1 / v2;
                break;
            default: 
                System.out.println("Operação não existe");
                break;
        }

       if (op == '+' || op == '-' || op == '/' || op == '*')
         System.out.println(resultado);

    }
}
