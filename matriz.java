import java.util.Scanner;

public class matriz{
    public static void main(String args[]){
        int[][] resultado = escrever();
        int sum = sum(resultado);
        System.out.println("Soma é: " + sum);
        DiagonalPrincipal(resultado);
        DiagonalSecundaria(resultado);
    }
    public static int[][] escrever(){
        Scanner in = new Scanner(System.in);

        int[][] matrizA = new int[5][5];

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
                sum += matrizA[i][j];
            }
        }
    return sum;
    }

        public static void DiagonalPrincipal(int[][] matrizA){
            System.out.print("Diagonal principal: ");
            for(int i = 0; i < matrizA.length; i++){
                System.out.print(matrizA[i][i] + " ");
            }
            System.out.println();
        }
    
        public static void DiagonalSecundaria(int[][] matrizA){
            System.out.print("Diagonal Secundária: ");
            for(int i = 0; i < matrizA.length; i++){
                System.out.print(matrizA[i][matrizA.length - 1 - i] + " ");
            }
            System.out.println();
        }
}
