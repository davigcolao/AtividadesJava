import java.util.Scanner;

/*2. Faça um programa que escreve todos os pares entre 1000 e 2000 */

public class exercicios3_2 {
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);

    for(int i = 1000; i <= 2000; i+=2){
        System.out.println(i);
     }
    for(int i = 1000; i <= 2000; i++){
        if (i % 2 == 0){
            System.out.println(i);
        }
     }
    int i = 1000;
    while (i <= 2000){
        if (i % 2 == 0){
            System.out.println(i);
        }
        i++;
     }
    while (i <= 2000){
        System.out.println(i);
        i += 2;
     }
    }
}
