public class Carro{
    private String placa, cor, modelo, marca;
    private double km, tanque;
    
    public Carro(String placa, String cor, String modelo, String marca, double km, double tanque){
     this.placa = placa;
     this.cor = cor;
     this.modelo = modelo;
     this.marca = marca;
     this.km = km;
     if(tanque > 0){
     this.tanque = tanque;}
     else tanque = 0;
     
    }
}