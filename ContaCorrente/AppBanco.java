import java.util.Scanner;
/**
 * Escreva uma descrição da classe AppBanco aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AppBanco
{
    public static void main(String args[]){
        boolean resultado;
        Banco banco = new Banco("Bradesco", "456.879.0001-90", 4);
        Agencia ag1 = new Agencia("PUC", 1,6);
        Agencia ag2 = new Agencia("Passo da Areia", 2,6);
        Agencia ag3 = new Agencia("Iguatemi", 3,6);
        Agencia ag4 = new Agencia("Praia de Belas", 4,6);
        
        resultado = banco.adicionaAgencia(ag1);
        if (resultado==true) System.out.println("Agencia adicionada");
        else
            System.out.println("Agencia ja existe");
                
        
        resultado = banco.adicionaAgencia(ag2);
        if (resultado==true) System.out.println("Agencia adicionada");
        else
            System.out.println("Agencia ja existe");    
            
        resultado = banco.adicionaAgencia(ag3);
        if (resultado==true) System.out.println("Agencia adicionada");
        else
            System.out.println("Agencia ja existe");
            
        resultado = banco.adicionaAgencia(ag4);
        if (resultado==true) System.out.println("Agencia adicionada");
        else
            System.out.println("Agencia ja existe");
            
        System.out.println(banco.toString());
        
        Conta c1 = new Conta(1,500);
        Conta c2 = new Conta(2,500);
        Conta c3 = new Conta(3,500);
        Conta c4 = new Conta(4,500);
        ag2.incluiConta(c1);
        ag2.incluiConta(c2);
        ag4.incluiConta(c3);
        ag4.incluiConta(c4);
        
        System.out.println(banco.toString());
        
        ag2.transfereValorContas(2,1,500);
        
        System.out.println(banco.toString());
        
        
    }
}
