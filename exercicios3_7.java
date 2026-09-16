/*Elabore um programa que escreve 50 valores acima de 100 que são divisiveis por 7. */

public class exercicios3_7 {
    public static void main(String args[]){

        int c = 0;

        for(int i = 101; c < 50; i++){
            if(i % 7 == 0){
                System.out.println(i);
                c++;
            }
        }
    }
}
