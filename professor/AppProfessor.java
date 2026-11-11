import java.util.Scanner;

public class AppProfessor {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // Passo 1: apresentar a classe professor e o operador de atribuição condicional
        // Professor prof = new Professor("Ana Paula",102323,50,40);
        // System.out.println(prof.toString());

        // Passo 2: Mostrar a criação de um arranjo de objetos (Professor)
        // Destacar que é um arranjo de referências
        Professor[] grupo = new Professor[5]; // Cria arranjo de 5 posições 
        grupo[0] = new Professor("Bernardo",1010,40,500);
        grupo[1] = new Professor("Ana Paula",1011,40,50);
        grupo[2] = new Professor("Katerine",1012,30,50);
        grupo[3] = new Professor("Soraia",1013,40,50);

        // Passo 3: acessando as posições do arranjo
        System.out.println(grupo[1].toString());
        Professor aux = grupo[1];
        System.out.println(aux.toString());
        System.out.println(grupo[0].getNome());
        grupo[2].setHoras(35);
        System.out.println(grupo[2].toString());

        // Passo 4: visitando as posições do arranjo com laços
        // Até que posição pode ir?
        grupo[4] = new Professor("Agustini",1014,40,500);
        System.out.println("\nListando o grupo de professores");
        for(int i=0;i<grupo.length;i++){
            System.out.println(grupo[i].toString());
        }

        System.out.println("\nUsando for each:");
        for(Professor prof:grupo){
           System.out.println(prof.toString());
        }

        // // Passo 5: mostrar como funciona o método criaProfessor
        Professor novo = criaProfessor();
        grupo[3] = novo; // sobrepoem a Soraia
        System.out.println(novo);

        // // Passo 6: acrescentando professores no cadastro
        CadastroProfessor cad = new CadastroProfessor();
        int continua = 0;
        do{
            Professor novoI = criaProfessor();
            boolean cadastrado = cad.acrescentaProfessor(novo);
            if (cadastrado) System.out.println("Profesor "+novoI.getNome()+" cadastrado");
            else System.out.println("Professor não cadastrado");
            System.out.println("\nDigite 0 para continuar ou qq outro número para parar");
            continua = in.nextInt();
        }while(continua == 0);

        // Passo 7: acrescentar métodos em CadastroProfessor

    }

    
    public static Professor criaProfessor(){
        System.out.println("Digite o nome do professor:");
        String nome = in.next();
        System.out.println("Digite a matricula do professor:");
        int matricula = in.nextInt();
        System.out.println("Digite a carga horária semanal do professor:");
        int cargaHoraria = in.nextInt();
        System.out.println("Digite o valor da hora do professor:");
        double valorHora = in.nextDouble();

        Professor prof = new Professor(nome,matricula,cargaHoraria,valorHora);
        return prof;
    }
}
