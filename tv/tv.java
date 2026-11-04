public class tv {
    private String marca;
    private int polegadas;
    private double valor;
    private int anoFab;
    private String cor;
    private int canal;
    private int volume;

    public tv(String m, int p, double v, int a, String c, int ca, int vol) {
        marca = m;
        polegadas = p;
        valor = v;
        anoFab = a;
        cor = c;
        canal = ca;
        volume = vol;
    }
    
    public void trocaCor(String novaCor){
        cor = novaCor;
    }
    
    public String mostraCor(){
        return cor;
    }
    public void aumentaCanal(){
        canal++;
    }

    public void diminuiCanal(){
        canal--;
    }

    public void trocaVolume(int novoVolume){
        volume = novoVolume;
    }
    
    public void trocaCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentaVolume(){
        volume++;
    }
    
    public void diminuiVolume(){
        volume--;
    }

    public double ajustaPreco (){
        valor = valor - valor * 0.1;
        return valor;
    }
}

