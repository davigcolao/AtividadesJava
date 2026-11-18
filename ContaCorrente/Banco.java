public class Banco{
    private String nome;
    private String cnpj;
    private Agencia[] listaAgencias;
    private int index;
    
    public Banco(String nome, String cnpj, int tamanho){
        this.nome = nome;
        this.cnpj = cnpj;
        listaAgencias = new Agencia[tamanho];
        index= 0;        
    }
    
    public boolean adicionaAgencia(Agencia a){
        if(buscaAgenciaPorNumero(a.getNumero())) return false;
        else {
            listaAgencias[index] = a;
            index++;
            return true;
        }
    }
    
    public boolean buscaAgenciaPorNumero(int numero){
        for(Agencia ag: listaAgencias){
            if(ag!=null && ag.getNumero()==numero)
                return true;
        }
        return false;
    }
    
    public Agencia buscaAgenciaPorNome(String nome){
        for(Agencia ag: listaAgencias){
            if(ag !=null && ag.getNome().equalsIgnoreCase(nome)==true)
                    return ag;
        }
        return null;
    }
    
    
    public XXXX transfereValoresEntreAgencias(int ag1, int conta1, int age2, int conta2, double valor){
        for(Agencia agO: listaAgencias){
            if(agO !=null && ag.getNumero()==ag1){
                if(agO.consultaConta(conta1)!=null)
                    for(Agencia agD: listaAgencias){
                        if(agD !=null && ag.getNumero()==ag2){
                            if(agD.consultaConta(conta2)!=null)
                                    
            }
            
            
                    return ag;
        }
        
    }
    @Override
    public String toString(){
        String resultado = "Nome do Banco: " + nome + "\nCNPJ:: "+ cnpj;
        for(Agencia ag: listaAgencias){
            if(ag!=null) resultado += "\n"+ag.toString();
        }
        return resultado;
    }
}
