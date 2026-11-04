public class professor{
    private String nome;
    private int matricula, horas;
    private double vHora;
    public professor(String nome, int matricula, int horas, double vHora){
    this.nome = nome;
    this.matricula = matricula;
    if(horas > 0 && horas < 44){
    this.horas = horas;
    }
    else this.horas = 0;
    if(vHora > 20){
    this.vHora = vHora;
    }else this.vHora = 20;
    }
    
    public String getnome(){return nome;}
    
    public int getMatricula(){return matricula;}
    
    public int getHoras(){return horas;}
    
    public double vHora(){return vHora;}
}