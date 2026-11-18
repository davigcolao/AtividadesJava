import java.util.Scanner;
/**
 * Escreva uma descrição da classe AppLivro aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AppLivro
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int opcao;
        int codigo, anoPublicacao;
        String titulo, autores, nome, endereco;
        System.out.println("Digite o nome da livraria: ");
        nome = in.nextLine();
        Livraria filial = new Livraria(nome);
        Livrarias rede = new Livrarias(nome);
        
        do{
            menu();
            opcao = lerInteiro(in);
            switch(opcao){
                case 1: System.out.println("Digite o codigo do livro: ");
                        codigo = lerInteiro(in);
                        System.out.println("Digite o titulo do livro: ");
                        titulo = in.nextLine();
                        System.out.println("Digite o ano de publicação do livro: ");
                        anoPublicacao = lerInteiro(in);
                        System.out.println("Digite os autores do livro: ");
                        autores = in.nextLine();
                        Livro l = new Livro(codigo, titulo, anoPublicacao, autores);
                        System.out.println("Informe o endereço da filial: ");
                        endereco = in.nextLine();
                        filial = rede.buscaEndereco(endereco);
                        if(filial !=null && filial.cadastraLivro(l)==true) 
                            System.out.println("Livro adicionado");
                        else
                            System.out.println("Livro não adicionado");
                        break;
                case 2: System.out.println("Digite o endereço da filial: ");
                        endereco = in.nextLine();
                        filial = rede.buscaEndereco(endereco);
                        System.out.println("Digite o codigo do livro: ");
                        codigo = lerInteiro(in);
                        Livro livroEncontrado = filial.buscaLivroPorCodigo(codigo);
                        if(livroEncontrado != null) 
                            System.out.println(livroEncontrado.toString());
                        else
                            System.out.println("Livro não encontrado");
                        break;
                case 3: System.out.println("Digite o endereço da filial: ");
                        endereco = in.nextLine();
                        filial = rede.buscaEndereco(endereco);
                        System.out.println("Digite os autores do livro: ");
                        autores = in.nextLine();
                        Livro livroPorAutor = filial.buscaLivroPorAutores(autores);
                        if(livroPorAutor != null) 
                            System.out.println(livroPorAutor.toString());
                        else
                            System.out.println("Livro não encontrado");
                        break;
                case 4: System.out.println("Digite o endereço da filial: ");
                        endereco = in.nextLine();
                        filial = rede.buscaEndereco(endereco);
                        System.out.println("Digite o codigo do livro: ");
                        codigo = lerInteiro(in);
                        if(filial.excluiLivroPorCodigo(codigo)==true) 
                            System.out.println("livro excluido");
                        else
                            System.out.println("Livro não encontrado");
                        break;
                case 5: System.out.println("Digite o endereço da filial: ");
                        endereco = in.nextLine();
                        filial = rede.buscaEndereco(endereco);
                        System.out.println(filial.toString());
                        break;
                case 6: System.out.println("Digite o endereço da filial: ");
                        endereco = in.nextLine();
                         filial = new Livraria(endereco);
                        if(rede.cadastraLivraria(filial))
                            System.out.println("Filial cadastrada");
                        else
                            System.out.println("Filial não cadastrada");
                        break;
                case 7: System.out.println(rede.toString());
                        break;
                case 0: break;
                default: System.out.println("Opção inválida");
                         break;
            }
        }while (opcao!=0);
    }

    public static int lerInteiro(Scanner in){
        while(true){
            if(in.hasNextInt()){
                int valor = in.nextInt();
                in.nextLine();
                return valor;
            }
            System.out.println("Digite um número inteiro válido:");
            in.nextLine();
        }
    }
    
    
    public static void menu(){
        System.out.println("1 - Adiciona livro");
        System.out.println("2 - Busca livro por codigo");
        System.out.println("3 - Busca livro por autores");
        System.out.println("4 - Exclui livro por codigo");
        System.out.println("5 - Imprime a lista de livros");
        System.out.println("6 - Crie uma filial da livraria");
        System.out.println("7 - Imprime a lista das filiais da livraria");
        System.out.println("0 - sair do programa");
        
    }
}
