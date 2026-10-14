import java.util.Scanner;

/*Faça um programa que leia um matriz A(7,6) e escreve a soma dos elementos soma dos elementos da linha 5 e da coluna 3. A leitura e as somas
devem ser feitas por métodos. */

public class exercicios5_36 {
    public static void main(String args[]){
    int[][] resultado = escrever();
    int sum = sum(resultado);
    System.out.println("Soma: " + sum);
    }
    public static int[][] escrever(){
        Scanner in = new Scanner(System.in);

        int [][] matrizA = new int[7][6];

        for(int i = 0; i < matrizA.length; i++){
            for(int j=0; j < matrizA[i].length; j++){
            System.out.println("Digite o elemento da matrizA ["+i+"]["+j+"]: ");
            matrizA[i][j] = in.nextInt();
            }
        }
        return matrizA;
    }
    public static int sum(int[][] matrizA){
        int sum = 0;
        for(int i = 0; i < matrizA.length; i++){
            for(int j =0; j < matrizA[i].length; j++){
                if(i == 5 || j == 3){
                sum += matrizA[i][j];
                }
            }
        }
    return sum;
    }
}
