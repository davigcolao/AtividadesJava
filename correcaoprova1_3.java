import java.util.Scanner;

/* 3.1) Reecreva este programa propondo 3 métodos estáticos
        Meotodo que imprime menu
        Metodo sacar que recebe parâmetro e saldo e o valor a ser sacado e devolve um valor booleano equivalente ao resultado da operação (TRUE se o sque foi feito e FALSE se não foi feito)  
        Metodo depostiar que recebe no parâmetro o valora  ser depositado e o saldo atual da conta e que devolve o valor do saldo atualizado
    3.2) Reestra o método main de maneira que
            ele solite um valor incial de saldo da conta
            coloque uma esturtra de repetição a chamada dos métodos que imprime o menu de opções e o switch case com a chamada dos métodos solicitados na questão 3.1
            esta estrutra de repetição deve ser aprsentada enquanto a opção desejada for diferente de 0*/

public class correcaoprova1_3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        double saldo, valor;
        int opcao;

        System.out.println("Digite o saldo incial da conta: ");
        saldo = in.nextDouble();

        do{
            System.out.println(menu());
            opcao = in.nextInt();

            switch(opcao){
                case 1 : 
                        System.out.println("Saldo atual: R$ " + saldo);
                        break;
                case 2 : 
                        System.out.println("Digite o valor a ser depositado: ");
                        valor = in.nextDouble();
                        saldo = deposito(valor, saldo);
                        System.out.println("Saldo atual: R$ " + saldo);
                        break;
                case 3 :
                        System.out.println("Digite o valor a ser sacado: ");
                        valor = in.nextDouble();
                        if (saque(valor,saldo) == true){
                            saldo = saldo - valor;
                            System.out.println("Saldo atual: R$ " + saldo);
                        } else {
                            System.out.println("Saldo insuficiente");
                        }
                        break;
                case 0 : 
                        System.out.println("finalizando programa");
                        break;
                default : 
                        System.out.println("Opção inválida");
                        break;
            }
        }while (opcao != 0);
    }
    public static int menu(){
        System.out.println("== Menu ==");
        System.out.println("1 - Saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("0 - Sair");
        return 0;
    }
    public static double deposito(double valor, double saldo){
        return saldo + valor;
    }
    public static boolean saque (double valor, double saldo){
        if (valor <= saldo){
            return true;
        } else return false;
    }
}
