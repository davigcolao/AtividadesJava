import java.util.Scanner;
/**
 * Escreva uma descrição da classe AppConta aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AppConta
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Conta conta1 = new Conta(123,1000);
        Conta conta2 = new Conta(456,2000);
        int opcao;
        double valor;
        
        do{
            menu();
            opcao = in.nextInt();
            switch(opcao){
                case 1: System.out.println("digite o valor a ser depositado:");
                        valor = in.nextDouble();
                        conta1.depositar(valor);
                        break;                    
                case 2: System.out.println("digite o valor a ser sacar:");
                        valor = in.nextDouble();
                        conta1.sacar(valor);
                        break;                       
                case 3: conta1.geraDV();
                        break;                    
                case 4: System.out.println(conta1.getSaldo());
                        break;                    
                case 5: System.out.println(conta1.getDv());
                        break;                                                          
                case 6: System.out.println(conta1.toString());
                        break;                                       
                case 7: System.out.println("digite o valor a ser transferido:");
                        valor = in.nextDouble();
                        conta1.transferir(conta2,valor);
                        break;
                case 8: System.out.println("digite o valor a ser depositado:");
                        valor = in.nextDouble();
                        conta2.depositar(valor);
                        break;                    
                case 9: System.out.println("digite o valor a ser sacar:");
                        valor = in.nextDouble();
                        conta2.sacar(valor);
                        break;                       
                case 10: conta2.geraDV();
                        break;                    
                case 11: System.out.println(conta2.getSaldo());
                        break;                    
                case 12: System.out.println(conta2.getDv());
                        break;                                                          
                case 13: System.out.println(conta2.toString());
                        break;                                       
                case 14: System.out.println("digite o valor a ser transferido:");
                        valor = in.nextDouble();
                        conta2.transferir(conta1,valor);
                        break;
                default: System.out.println("Opção inválida");
                        break;
                
            }                        
        }while (opcao!=0);
    }

    public static void menu(){
        System.out.println("1 - Depositar na conta 1");
        System.out.println("2 - Sacar da conta 1");
        System.out.println("3 - Gerar DV da conta 1");
        System.out.println("4 - Mostrar o saldo da conta 1");
        System.out.println("5 - Mostrar o DV da conta 1");
        System.out.println("6 - Mostrar os dados da conta 1");
        System.out.println("7 - Transferir valor da conta 1 pra conta 2");
        System.out.println("8 - Depositar na conta 2");
        System.out.println("9 - Sacar da conta 2");
        System.out.println("10 - Gerar DV da conta 2");
        System.out.println("11 - Mostrar o saldo da conta 2");
        System.out.println("12 - Mostrar o DV da conta 2");
        System.out.println("13 - Mostrar os dados da conta 2");
        System.out.println("14 - Transferir valor da conta 2 pra conta 1");
        System.out.println("Digite 0 para sair do menu");                
    }
}
