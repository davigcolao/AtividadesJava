import java.util.Scanner;

public class appLivro{

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        listaLivros lista = new listaLivros();
        int opcao = 0;
        while (opcao != 6){
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Buscar livro por código");
            System.out.println("3 - Buscar livro por autor");
            System.out.println("4 - Listar todos os livros");
            System.out.println("5 - Excluir livro por código");
            System.out.println("6 - Sair");
            System.out.println("Digite a opção desejada: ");
            opcao = in.nextInt();
            switch (opcao){
                case 1: 
                    System.out.println("Digite o código do livro: ");
                    int codigo = in.nextInt();
                    System.out.println("Digite o ano do livro: ");
                    int ano = in.nextInt();
                    System.out.println("Digite o título do livro: ");
                    String titulo = in.next();
                    System.out.println("Digite o autor do livro: ");
                    String autor = in.next();
                    livro novo = new livro(codigo, ano, titulo, autor);
                    if (lista.cadastraLivro(novo)){
                        System.out.println("Livro cadastrado com sucesso!");
                    }else{
                        System.out.println("Não foi possível cadastrar o livro. Lista cheia.");
                    }
                    break;
                case 2: 
                    System.out.println("Digte o código do livro: ");
                    int cod = in.nextInt();
                    System.out.println(lista.buscaCodigo(cod));
                    break;
                case 3: 
                    System.out.println("Digte o autor do livro: ");
                    String aut = in.next();
                    System.out.println(lista.buscaAutor(aut));
                    break;
                case 4:
                    System.out.println("\nListando o grupo de professores");
                    for(int i = 0; i < 10; i++){
                    System.out.println(lista.toString());}
                    break;
                case 5:
                    System.out.println("Digite o codigo do livro: ");
                    int codExclui = in.nextInt();
                    if (lista.excluiCodigo(codExclui)){
                        System.out.println("Livro excluido com sucesso!");
                    }else{
                        System.out.println("Não foi possível excluir o livro. Livro não encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }
    }

}