import java.util.Scanner;

/*Implemente um programa que leia o saldo médio de uma conta corrente.
A seguir, o programa deve apresentar um menu de opções, semelhante a
um caixa eletrônico:
1 - Sacar
2 - Depositar
3 - Exibir limite
Para cada opção o programa deve ser comportar de uma forma diferente:
• Opção 1: solicita ao usuário o valor a ser sacado, se o valor for válido
e o usuário puder sacar (considerar o saldo e o limite), o programa
efetua o saque e exibe o saldo médio atual.
• Opção 2: solicita ao usuário o valor a ser depositado, se o valor for
válido, o programa efetua o depósito e exibe o saldo médio atual.
• Opção 3: exibe o limite conforme a tabela abaixo
Saldo Médio Limite
menor que R$ 500,00 não há limite
de R$ 500,00 a R$ 1.000,00 8% do saldo médio
maior ou igual a R$ 1.000,00 15% do saldo médio */

public class exercicio2_23 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int opcao;
        double sM, s, d, l;

        System.out.println("Digite o saldo médio inicial da conta: ");
        sM = in.nextDouble();

        System.out.println("Escolha uma opção\n 1 - Sacar\n 2 - Depositar\n 3 - Exibir limite");
        System.out.println("Digite a opção desejada: ");
        opcao = in.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Digite o valor a ser sacado: ");
                s = in.nextDouble();
                if (s > 0){
                    if (s <= sM){
                        sM -= s;
                        System.out.println("Saldo médio atual: " + sM);
                    }else{
                    System.out.println("Saldo insuficiente para saque");}
                }
                break;
            case 2:
                System.out.println("Digite o valor: ");
                d = in.nextDouble();
                if (d > 0){
                    sM += d;
                    System.out.println("Saldo médio atual: " + sM);
                }else{
                    System.out.println("Valor inválido");}
                break;
            case 3:
                if (sM < 500){
                    System.out.println("Não há limite");
                }else if (sM >= 500 && sM < 1000){
                    l = sM * 1.08;
                    System.out.println("Limite de: " + l);
                }else {
                    l = sM * 1.15;
                    System.out.println("Limite de: " + l);
                }
                break;
            default:
                System.out.println("Opção inválida");
        }
    }   
}