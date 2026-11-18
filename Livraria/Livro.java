
/**
 *  


Em seguida, implemente uma Lista de livros. Para esta lista as seguintes
operações devem ser construídas: construtor (instancia a lista), cadastra
livro (insere um livro na lista e não permite que dois livros tenham o
mesmo código), busca livro por código, busca livro por autor, exclui livro
por código e toString (com todo o contéudo da lista). Implemente também
uma classe Aplicação com um menu de opções (com as operações da
lista).
*/

public class Livro{
    private int codigo,anoPublicacao;
    private String titulo, autores;

    /**
     * Construtor para objetos da classe Livro
     */
    public Livro()
    {
        codigo = 0;
        anoPublicacao = 1500;
        titulo = "";
        autores = "";
    }
    
    public Livro(int codigo, String titulo, int anoPublicacao, String autores){
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autores = autores;
    }

    public int getCodigo(){ return codigo;
    }
    
    public String getTitulo(){ return titulo;
    }
    
    public int getAnoPublicacao(){ return anoPublicacao;
    }
    
    public String getAutores(){ return autores;
    }
    
    public void setCodigo(int novoCodigo){
        if(novoCodigo>0) codigo = novoCodigo;
    }
    
    public void setTitulo(String novoTitulo){
        if(novoTitulo!=null && !novoTitulo.isEmpty()) titulo = novoTitulo;
    }
    
    public void setAutores(String novoAutores){
        if(novoAutores!=null && !novoAutores.isEmpty()) autores = novoAutores;
    }
    
    public void setAnoPublicacao(int novoAnoPublicacao){
        if(novoAnoPublicacao>1500)
            anoPublicacao = novoAnoPublicacao;
    }
    
    public String toString(){
        return "Codigo: " + codigo + "\nTitulo: " + titulo + "\nAno Publicação: " + anoPublicacao
        + "\nAutores: "+ autores;
    }
    
    
}