import java.util.Scanner;

/*Imprimir números de 1 a 10
1. Usando for.
2. Usando while.
3. Usando do while. */

public class ExercicioFix{
    public static void main(String args[]){
        
   /*     for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
*/
    /*  int i = 1;

        while (i <= 10){
            System.out.println(i);
            i++;
        }
*/
        int i = 1;

        do{
            System.out.println(i);
            i++;
        }while(i <= 10);

    }
}