public class CadastroProfessor {
    private Professor[] grupo;
    private int index;

    public CadastroProfessor(){
        grupo = new Professor[10];
        index = 0;
    }

    public boolean acrescentaProfessor(Professor novo){
        if (index < 10){
            grupo[index] = novo;
            index++;
            return true;
        }else{
            return false;
        }
    }
    public int quantidade(){
        return index;
    }

    // Acrescentar método para imprimir todos os professores
    public void PrintProf(){
        for(int i = 0; i < index; i++){
            System.out.println(grupo[i].toString());
        }
    }

    // Acrescentar método para retornar o professor com o número de matrícula informado
    public Professor getProfessor(int matricula){
        for (Professor prof : grupo){
            if (prof.getMatricula() == matricula){
                return prof;
            }
        }
        return null;
    }

    // Acrescentar método para somar a carga horária dos professores
    public int somaCarga(){
        int soma = 0;
        for (int i = 0; i < index; i++){
            soma += grupo[i].getHoras();
        }
        return soma;
    }

    // Acrescentar método para retornar o somatório do salário dos professores
    public double somaSalario(){
        double soma = 0;
        for (int i = 0; i < index; i++){
            soma += grupo[i].getHoras() * grupo[i].getValorHora();
        }
        return soma;
    }

    /*
    Exercícios:
    Crie um método que retorne quantos professores existem cadastrados;
    Crie um método que retorne se um professor está cadastrado, passando pelo parâmetro o String referente ao nome do professor;
    Crie um método que retorne a quantidade de professores que possuem uma carga horária menor do que a informada pelo parâmetro;
    Crie um método que mostre a média salarial dos professores cadastrado;

    Demonstre que os métodos funcionam ativando os mesmos a partir do main
    */
}
