/*implemente uma Lista de livros. Para esta lista as seguintes
operações devem ser construídas: construtor (instancia a lista), cadastra
livro (insere um livro na lista e não permite que dois livros tenham o
mesmo código), busca livro por código, busca livro por autor, exclui livro
por código e toString (com todo o contéudo da lista). */


public class listaLivros {
    private livro[] lista;
    private int index;

    public listaLivros(){
        lista = new livro[10];
        index = 0;
    }

    public boolean cadastraLivro(livro l){
        if (index < 10){
            lista[index] = l;
            index++;
            return true;
        }
        for(livro aux : lista){
            if (aux != null && aux.getCodigo() == l.getCodigo()){
            return false;
            }
        }
        lista[index] = l;
        index++;
        return true;
    }

    public String buscaCodigo(int codigo){
        if(index == 0) return null;
        for (livro aux : lista){
            if (aux.getCodigo() == codigo){
                return aux.toString();
            }
        }
        return null;
    }

    public String buscaAutor(String autor){
        if(index == 0) return null;
        for (livro l : lista){
            if (l.getAutor().equalsIgnoreCase(autor)){
                return l.toString();
            }
        }
        return null;
    }
    
    public boolean excluiCodigo(int codigo){
        livro aux = buscaCodigo(codigo);
        for (int i = 0; i < index; i++){
            if (lista[i].getCodigo() == codigo){
                for (int j = i; j < index - 1; j++){
                    lista[j] = lista[j + 1];
                }
                lista[index - 1] = null;
                index--;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return "codigo=" + codigo + ", ano=" + ano + ", titulo=" + titulo + ", autor=" + autor;
    }

}
