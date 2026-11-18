public class Livrarias {
    private String nome, endereco;
    private Livraria[] Livrarias;
    private int index;

    public Livrarias(String nome){
        this(nome, "");
    }

    public Livrarias(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        Livrarias = new Livraria[10];
        index = 0;
    }

    public boolean cadastraLivraria(Livraria l){
        if(l == null) return false;
        for(Livraria aux: Livrarias){
            if(aux!=null && aux.getEndereco().equalsIgnoreCase(l.getEndereco()))
                return false;
        }
        if(index >= Livrarias.length) return false;
        Livrarias[index] = l;    
        index++;
        return true;
    }

    public Livraria buscaEndereco(String endereco){
        for(Livraria aux: Livrarias){
            if(aux!=null && aux.getEndereco().equalsIgnoreCase(endereco))
                return aux;
        }
        return null;
    }

    public String toString(){
        String resultado = "As filiais desta livraria " + nome + " são:\n";
        for(Livraria aux : Livrarias){
            if(aux != null) resultado += aux.toString()+"\n";
        }
        return resultado;
    }
}