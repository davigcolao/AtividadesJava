import java.util.Scanner;

public class exercicios2_15 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        double n1, n2, n3;
        int opcao;

        System.out.println("Digite os três números: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();
        n3 = in.nextDouble();

        System.out.println("Escolha a opção (1, 2 ou 3): ");
        opcao = in.nextInt();

        switch (opcao){
            case 1: 
                if (n1 > n2 && n1 > n3){
                    if (n2 > n3){
                        System.out.printf("%.1f, %.1f, %.1f", n1, n2, n3);
                    }else System.out.printf("%.1f, %.1f, %.1f", n1, n3, n2);
                }else if (n2 > n1 && n2 > n3){
                    if (n1 > n3){ 
                        System.out.printf("%.1f, %.1f, %.1f", n2, n1, n3);
                    }else System.out.printf("%.1f, %.1f, %.1f", n2, n3, n1);
                }else if (n3 > n1 && n3 > n2){
                    if (n1 > n2){
                        System.out.printf("%.1f, %.1f, %.1f", n3, n1, n2);
                    }else System.out.printf("%.1f, %.1f, %.1f", n3, n2, n1);
                }
            case 2:
                if (n1 > n2 && n1 > n3){
                    if (n2 > n3){
                        System.out.printf("%.1f, %.1f, %.1f", n3, n2, n1);
                    }else System.out.printf("%.1f, %.1f, %.1f", n2, n3, n1);
                }else if (n2 > n1 && n2 > n3){
                    if (n1 > n3){ 
                        System.out.printf("%.1f, %.1f, %.1f", n3, n1, n2);
                    }else System.out.printf("%.1f, %.1f, %.1f", n1, n3, n2);
                }else if (n3 > n1 && n3 > n2){
                    if (n1 > n2){
                        System.out.printf("%.1f, %.1f, %.1f", n2, n1, n3);
                    }else System.out.printf("%.1f, %.1f, %.1f", n1, n2, n3);
                }
            case 3: 
                if (n1 > n2 && n1 > n3){
                    if (n2 > n3){
                        System.out.printf("%.1f, %.1f, %.1f", n2, n1, n3);
                    }else System.out.printf("%.1f, %.1f, %.1f", n3, n1, n2);
                }else if (n2 > n1 && n2 > n3){
                    if (n1 > n3){ 
                        System.out.printf("%.1f, %.1f, %.1f", n1, n2, n3);
                    }else System.out.printf("%.1f, %.1f, %.1f", n3, n2, n1);
                }else if (n3 > n1 && n3 > n2){
                    if (n1 > n2){
                        System.out.printf("%.1f, %.1f, %.1f", n1, n3, n2);
                    }else System.out.printf("%.1f, %.1f, %.1f", n2, n3, n1);
                }
        }
    }
}
