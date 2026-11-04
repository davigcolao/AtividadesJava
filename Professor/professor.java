public class professor{
    private String nome;
    private int matricula, horas;
    private double vHora;
    public professor(String nome, int matricula, int horas, double vHora){
    this.nome = nome;
    this.matricula = matricula;
    if(horas >= 0 && horas <= 44){
    this.horas = horas;
    }
    else this.horas = 0;
    if(vHora >= 20){
    this.vHora = vHora;
    }else this.vHora = 0;
    }
    public String getnome(){return nome;}
    public int getMatricula(){return matricula;}
    public int getHoras(){return horas;}
    public double getvHora(){return vHora;}
    public void setNome(String novoNome){nome = novoNome;}
    public void setHoras(int nHoras){
        if (nHoras >= 0 && nHoras <= 44)
            horas = nHoras;}
    public void setVHora(double nVHora){
        if(nVHora >= 20)
            vHora = nVHora;}
    public double salario(){return vHora * horas * 4.5;}        
    public String toString(){
        return "Nome: " + nome + "\nMatricula: " + matricula + 
        "\nHoras: " + horas + "\nValor: " + vHora;
    }
}