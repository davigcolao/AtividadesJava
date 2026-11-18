
/**
 * Escreva uma descrição da classe Agencia aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Agencia
{
    private String nome;
    private int numero;
    private Conta[] listaContas;
    private int index;
    
    /**
     * Construtor para objetos da classe Agencia
     */
    public Agencia(String nome, int numero, int quantidade){
        this.nome = nome;
        index =0;
        if (numero>0)
            this.numero = numero;
        listaContas = new Conta[quantidade];        
    }
    
    public int getNumero(){ return numero;
    }
    
    public String getNome(){return nome;
    }

    public void incluiConta(Conta c){
        listaContas[index] = c;
        index++;
    }
    
    public Conta consultaConta(int numero){
        for(int i=0; i<index;i++){
            if(listaContas[i].getNumero()==numero)
                    return listaContas[i];
        }
        return null;     
    }
    
    public Conta consultaContaMaiorSaldo(){
        Conta maior = listaContas[0];
        for(int i=1; i<index;i++){
            if(maior.getSaldo()<listaContas[i].getSaldo())
                maior = listaContas[i];
        }
        return maior;
    }
    
    public double calculaSaldoMedio(){
        double saldos=0;
        for (int i=0; i<index;i++){
            saldos += listaContas[i].getSaldo();
        }
        return saldos/index;
    }
    
    public int mostraContasNegativas(){
        int cont=0;
        for (int i=0; i<index;i++){
            if(listaContas[i].getSaldo()<0) 
                cont++;
        }
        return cont;                
    }
    
    public boolean depositaValorConta(int numero, double valor){
        for(int i =0; i<index; i++){
            if(listaContas[i].getNumero()==numero){
                listaContas[i].depositar(valor);
                return true;
            }
        }
        return false;        
    }
    
    public boolean transfereValorContas(int numeroOrigem, int numeroDestino, double valor){
        Conta origem=null;
        Conta destino = null;
        for(int i =0; i<index; i++){
            if(listaContas[i].getNumero()==numeroOrigem)
                origem = listaContas[i];
            if(listaContas[i].getNumero()==numeroDestino)
                destino = listaContas[i];
        }
        if(origem!=null && destino!=null && origem!=destino){
            origem.transferir(destino,valor);
            return true;
        }
        else
            return false;
    }
    
    @Override
    public String toString(){
        String resultado = "Nome da Agência: " + nome + "\nNúmero da Agência: "+ numero;
        for(Conta c: listaContas){
            if(c!=null) resultado += "\n"+c.toString();
        }
        return resultado;
    }
    
    
    
    
}
