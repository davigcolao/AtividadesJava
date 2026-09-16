/*. Implemente um programa que soma todos os impares entre 500 e 700.*/

public class exercicios3_3 {
    public static void main(String args[]){
        
        int sum = 0;

        for(int i=500; i <= 700;i++){
            if(i % 2 != 0){
            sum += i;}
        }
        System.out.println(sum);
    }
}
