/**
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Livraria
{
    private Livro[] lista;
    private int index;
    private String endereco;

    public Livraria(){
        lista = new Livro[10];
        index = 0;
    }

    public Livraria(String endereco){
        this();
        this.endereco = endereco;
    }

    public boolean cadastraLivro(Livro l){        
        if(l == null) return false;
        if(index==0){
             lista[0] = l;
             index++;
             return true;
        }
        for(Livro aux: lista){
            if(aux!=null && aux.getCodigo()==l.getCodigo())
                return false;
        }
        if(index >= lista.length) return false;
        lista[index] = l;
        index++;
        return true;
    }
    
    public Livro buscaLivroPorCodigo(int codigo){
        if(index ==0) return null;
        for(Livro aux: lista){
            if(aux != null && aux.getCodigo()== codigo) return aux;
        }
        return null;
    }
    
    public int buscaPosicaoLivroPorCodigo(int codigo){
        for(int i=0;i<index;i++){
            if(lista[i] != null && lista[i].getCodigo()== codigo) return i;
        }
        return -1;
    }
    public Livro buscaLivroPorAutores(String autores){
        if(index ==0) return null;
        for(Livro aux: lista){
            if(aux != null && aux.getAutores().equalsIgnoreCase(autores)) return aux;
        }
        return null;
    }
    
    public boolean excluiLivroPorCodigo(int codigo){
        Livro aux = buscaLivroPorCodigo(codigo);
        int posicao = buscaPosicaoLivroPorCodigo(codigo);
        if(aux == null) return false;
        else{
            for(int i = posicao; i < index - 1; i++){
                lista[i] = lista[i + 1];
            }
            lista[index - 1] = null;
            index--;
            return true;
        } 
    }

    public String getEndereco(){
        return endereco;
    }

    public String toString(){
        String resultado = "Lista de todos os livros da livraria com endereço: " + endereco;
        for(Livro aux : lista){
            if(aux!=null) resultado += "\n"+ aux.toString();
        }
        return resultado;
    }
}