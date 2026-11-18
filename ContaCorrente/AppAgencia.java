import java.util.Scanner;
public class AppAgencia{
    
    public static void main(String args[]){
        Agencia ag = new Agencia("Teste", 1, 6);
        Scanner in = new Scanner(System.in);
        int opcao,numero, numero1;
        double saldo,valor;
        Conta aux=null;
        boolean resultado;
        do{
            menu();
            opcao = in.nextInt();
            switch(opcao){
                case 1: System.out.println("Digite o numero da conta: ");
                        numero = in.nextInt();
                        System.out.println("Digite o saldo inicial da conta: ");
                        saldo = in.nextDouble();
                        Conta c = new Conta(numero,saldo);
                        ag.incluiConta(c);
                        break;                
                case 2: System.out.println("Digite o numero da conta: ");
                        numero = in.nextInt();
                        aux = ag.consultaConta(numero);
                        if(aux !=null) System.out.println("Os dados completos da conta são:" + aux.toString());
                        else
                            System.out.println("Conta não localizada");
                        break;                        
                case 3: aux = ag.consultaContaMaiorSaldo();
                        System.out.println("Os dados completos da conta com maior saldo é:" + aux.toString());
                        break;
                case 4: System.out.println("O saldo médio das contas desta agência é de: "+ ag.calculaSaldoMedio());
                        break;                    
                case 5: System.out.println("A quantidade de contas negativas é de: "+ ag.mostraContasNegativas());
                        break;
                case 6: System.out.println("Digite o numero da conta: ");
                        numero = in.nextInt();
                        System.out.println("Digite o valor a ser depositado: ");
                        valor = in.nextDouble();
                        resultado = ag.depositaValorConta(numero,valor);
                        if(resultado) System.out.println("O deposito foi efetivado");
                        else
                            System.out.println("Conta não encontrada na agencia");
                        break;
                case 7: System.out.println("Digite o numero da conta de origem: ");
                        numero = in.nextInt();
                        System.out.println("Digite o numero da conta de destino: ");
                        numero1 = in.nextInt();
                        System.out.println("Digite o valor a ser transferido: ");
                        valor = in.nextDouble();
                        resultado = ag.transfereValorContas(numero,numero1,valor);
                        if(resultado) System.out.println("a transferencia foi efetivada");
                        else
                            System.out.println("Contas de origem ou destino não válidas");
                        break;
                case 8: System.out.println(ag.toString());
                        break;
                case 9: 
                    
                case 10: 
                default: System.out.println("Opção inválida");                
            }
    
        }while(opcao!=0);
                
    }
        
    public static void menu(){
        System.out.println("1- Incluir uma conta");
        System.out.println("2-Consultar uma conta");
        System.out.println("3-Consulta Conta Maior Saldo: ");
        System.out.println("4-Consulta saldo medio: ");
        System.out.println("5-Mostra quandidade de contas Negativas: ");
        System.out.println("6-Deposita valor conta: ");
        System.out.println("7-Transfere valor entre contas: ");  
        System.out.println("8-Imprime dados da Agencia e suas contas: ");  
        System.out.println("9-Sacar dinheiro de uma conta: ");  
        System.out.println("10-Excluir uma conta: ");  
        System.out.println("0 para sair: ");  
    }
}