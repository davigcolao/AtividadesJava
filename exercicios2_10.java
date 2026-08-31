import java.util.Scanner;

public class exercicios2_10 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        double notas;
        
        System.out.println("Digite a nota: ");
        notas = in.nextDouble();

        if ( notas > 0 && notas <= 10){
            if (notas > 9 && notas <= 10){
                System.out.println("Você tirou nota A!");
            }else if (notas > 7 && notas <= 8.9){
                System.out.println("Você tirou nota B!");
            }else if (notas > 5 && notas <= 6.9){
                System.out.println("Você tirou nota C!");
            }else if (notas > 3 && notas <= 5.9){
                System.out.println("Você tirou nota D!");
            }else
                System.out.println("Você tirou nota E!");
        }else System.out.println("Nota falsa!");    



    }
}
