public class livro {
    private int codigo, ano;
    private String titulo, autor;

    //Constructor
    public livro(int c, int a, String t, String au){
        codigo = c;
        ano = a;
        titulo = t;
        autor = au;

    }
    //Getters
    public int getCodigo() { return codigo; }
    public int getAno() { return ano;}
    public String getTitulo() { return titulo;}
    public String getAutor() {return autor;}
    

    //Setters
    public void setCodigo(int novoCodigo) {if(novoCodigo > 0) codigo = novoCodigo;}
    public void setTitulo(String novoTitulo) {if (novoTitulo != null && !novoTitulo.isEmpty()) titulo = novoTitulo; }
    public void setAutor(String novoAutor) {if (novoAutor != null && !novoAutor.isEmpty()) autor = novoAutor; }
    public void setAno(int novoAno) {if(novoAno > 1500) ano = novoAno;}

    @Override
    public String toString(){
        return "codigo=" + codigo + ", ano=" + ano + ", titulo=" + titulo + ", autor=" + autor;
    }
}