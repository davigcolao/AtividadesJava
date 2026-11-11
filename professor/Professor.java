public class Professor {
    private String nome;
    private int matricula;
    private int horas;
    private double valorHora;
    
    // Construtor: observe o operador de atribuição condicional
    public Professor(String nome, int matricula, int horas, double valorHora) {
        this.nome = nome;
        this.matricula = matricula;
        this.horas = (horas > 0 && horas < 44) ? horas : 0;
        this.valorHora = (valorHora > 20) ? valorHora : 20;
    }

    // Getters
    public String getNome() { return nome; }
    public int getMatricula() { return matricula; }
    public int getHoras() { return horas; }
    public double getValorHora() { return valorHora; }
    
    // Setters somente onde faz sentido
    public void setHoras(int novasHoras){
        this.horas = (novasHoras > 0 && novasHoras < 44) ? novasHoras : this.horas;
    }

    public void setValorHora(double novoValorHora){
        this.valorHora = (novoValorHora > 20) ? novoValorHora : this.valorHora;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", matricula=" + matricula + ", horas=" + horas + ", valorHora=" + valorHora;
    }
}
