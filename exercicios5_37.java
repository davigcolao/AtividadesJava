import java.util.Scanner;

/*Faça um programa que leia um matriz A(6,6) e escreve o menor elemento
da sua diagonal secundária. A leitura e a soma devem ser feitas em métodos. */

public class exercicios5_37 {
    public static void main(String args[]){
        int[][] matriz = matriz();
        int menor = menor(matriz);
        System.out.println("O menor número da diagonal secundaria é: " + menor);
    }   
    public static int[][] matriz(){
        Scanner in = new Scanner(System.in);

        int[][] matriz = new int[6][6];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.println("Entre um valor para ["+i+"]["+j+"]: ");
                matriz[i][j] = in.nextInt();
            }
        }
    return matriz;
    }
     public static int menor(int[][] matriz){
        int menor = Integer.MAX_VALUE;
            System.out.print("Diagonal Secundária: ");
            for(int i = 0; i < matriz.length; i++){
                if(menor > matriz[i][matriz.length - 1 - i]){
                    menor = matriz[i][matriz.length - 1 - i];
                }
            }
        return menor;
        }
}
