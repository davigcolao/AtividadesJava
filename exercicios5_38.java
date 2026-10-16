import java.util.Scanner;

/* Crie uma matriz para armazenar as médias de G1 de 20 alunos de 5 turmas
de Fundamentos de programação. Todos os valores lidos devem pertencer
ao intervalo [0;10]. A seguir,
(a) crie e escreva um vetor contendo a média de cada turma.
(b) crie e escreva um vetor com as posições dos melhores alunos de cada
turma.
 */

public class exercicios5_38{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        double[][] matriz = matriz();

        System.out.println("Digite o número da turma: ");
        int turma = in.nextInt();
        double[] vetor = turma(matriz, turma);

        System.out.println(media(vetor));   
        System.out.println(melhor(vetor));
    }
    
    public static double[][] matriz(){
        Scanner in = new Scanner(System.in);

        double[][] matriz = new double[20][5];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                do{
                    System.out.println("Digite as notas de ["+i+"]["+j+"]: ");
                    matriz[i][j] = in.nextDouble();
                }while (matriz[i][j] > 10 || matriz[i][j] < 0);
            }
        }
    return matriz;
    }

    public static double[] turma(double[][] matriz, int turma){
        double[] vetor = new double[20];

        for(int i = 0; i < matriz.length; i++){
            vetor[i] = matriz[i][turma-1];
        }
    return vetor;
    }

    public static double media(double[] vetor){
        double sum = 0;

        for(double matriz : vetor){
            sum += matriz;
        }
        double media = sum / 20;

    return media;
    }
    
    public static int melhor(double[] vetor){
        double melhor = vetor[0];
        int pMelhor = 0;
        
        for (int i = 1; i < vetor.length; i++){
            if(melhor < vetor[i]){
                melhor = vetor[i];
                pMelhor = i;
            }
        }

        return pMelhor;
    }
}