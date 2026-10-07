import java.util.Scanner;

public class vetores1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        int[] vetor = new int[10];
        int sum = 0;
        
        for(int i = 0; i < 10; i++){
            System.out.println("Digite um valor: ");
            vetor[i] = in.nextInt();
        }

        // imprime o vetor;

        // for (int n : vetor){
        //     System.out.println(n);
        // }
        
        // imprime os valores pares do vetor;

        // for (int n : vetor){
        //     if (n % 2 == 0){
        //         System.out.println(n);
        //     }
        // }
        
        // Imprime posições pares do vetor;

        // for (int i = 0; i < 10; i++){
        //     if ( i % 2 == 0){
        //         System.out.println(vetor[i]);
        //     }
        //}

        // Imprime o conteúdo impares das posições pares;

        // for (int i = 0; i < 10; i++){
        //     if ( i % 2 != 0 && vetor[i] % 2 == 0){
        //             System.out.println(vetor[i]);
        //         }
        //    }
        
        // Soma todos os elementos e faz média aritmetica;

        // for(int n : vetor){
        //     sum += n;
        // }    
        // System.out.println("Media " + (sum / vetor.length));

        // Pega cada elemento do vetor e mostra a sua quantidade de divisores;

        for (int n : vetor){
            int count = 0;
            for (int i = 1; i < n; i++){
                if (n % i == 0){
                    count++;
                }
            }
            System.out.println("O numero " + n + " tem " + (count + 1) + " divisores");
        }
    }
}