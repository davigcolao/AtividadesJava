public class teste {
    public static void main(String[] args) {
        // Criação do objeto usando 'new'
        Pessoa pessoa1 = new Pessoa();
        
        // Atribuição de valores aos atributos
        pessoa1.nome = "João";
        pessoa1.idade = 30;
        
        // Uso do método
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
    }
}

class Pessoa {
    String nome;
    int idade;

    public String getNome() {
        return nome;
    }
    public int getIdade(){
        return idade;   
    }
}   