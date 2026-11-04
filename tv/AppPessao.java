import java.util.Scanner;

public class AppPessao extends pessoa{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String nome, telefone, email;
    int idade;
    
    System.out.println("Digite o nome de uma pessoa: ");
    nome = in.next();
    System.out.println("Digite a idade de uma pessoa: ");
    idade = in.nextInt();
    System.out.println("Digite o telefone de uma pessoa: ");
    telefone = in.next();
    System.out.println("Digite o email de uma pessoa: ");
    email = in.next();
    Pessoa pessoa1 = new Pessoa(nome, idade, telefone, email);
    
    System(pessoa1.getNome() + pessoa1.getIdade()+ pessoa1.getEmail() + pessoa1.getTelefone());
    }
}