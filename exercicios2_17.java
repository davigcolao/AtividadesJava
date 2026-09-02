import java.util.Scanner;
/*Faça um programa que leia 5 valores reais, calcula e escreve a média desses
valores conforme descrito a seguir:
(a) descarta o maior e o menor valor, calcula a média dos valores restantes.
(b) descarta os dois menores valores, calcula a média dos valores restantes. */
public class exercicios2_17 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int v1, v2, v3, v4, v5;
        int menor = 0, maior = 0, menor2 = 0;

        System.out.println("Digite os valores: ");
        v1 = in.nextInt();
        v2 = in.nextInt();
        v3 = in.nextInt();
        v4 = in.nextInt();
        v5 = in.nextInt();

        if (v1 < v2 && v1 < v3 && v1 < v4 && v1 < v5){
            menor = v1;
        }else if (v2 < v1 && v2 < v3 && v2 < v4 && v2 < v5){
            menor = v2;
        }else if (v3 < v2 && v3 < v1 && v3 < v4 && v3 < v5){
            menor = v3;
        }else if (v4 < v1 && v4 < v2 && v4 < v3 && v4 < v5){
            menor = v4;
        }else if (v5 < v1 && v5 < v2 && v5 < v3 && v5 < v4){
            menor = v5;
        }
        if (v1 > v2 && v1 > v3 && v1 > v4 && v1 > v5){
            maior = v1;
        }else if (v2 > v1 && v2 > v3 && v2 > v4 && v2 > v5){
            maior = v2; 
        }else if (v3 > v1 && v3 > v2 && v3 > v4 && v3 > v5){
            maior = v3;
        }else if (v4 > v1 && v4 > v2 && v4 > v3 && v4 > v5){
            maior = v4;
        }else if (v5 > v1 && v5 > v2 && v5 > v3 && v5 > v4){
            maior = v5;
        }

        System.out.printf("\nA média dos intermediarios é: %.1f\n", (v1 + v2 + v3 + v4 + v5 - maior - menor) / 3.0);

        if (v1 < v2 && v1 < v3 && v1 < v4 && v1 < v5){
            menor = v1;
        }else if (v2 < v1 && v2 < v3 && v2 < v4 && v2 < v5){
            menor = v2;
        }else if (v3 < v2 && v3 < v1 && v3 < v4 && v3 < v5){
            menor = v3;
        }else if (v4 < v1 && v4 < v2 && v4 < v3 && v4 < v5){
            menor = v4;
        }else if (v5 < v1 && v5 < v2 && v5 < v3 && v5 < v4){
            menor =v5;
        }   
        if (v1 == menor){
            v1 = 0;
            if (v2 < v3 && v2 < v4 && v2 < v5){
                menor2 = v2;
            }else if (v3 < v2 && v3 < v4 && v3 < v5){
                menor2 = v3;
            }else if (v4 < v3 && v4 < v2 && v4 < v5){
                menor2 = v4;
            }else if (v5 < v3 && v5 < v4 && v5 < v2){
                menor2 = v5;
        }
        }else if (v2 == menor){
            v2 = 0;
            if (v1 < v3 && v1 < v4 && v1 < v5){
                menor2 = v1;
            }else if (v3 < v1 && v3 < v4 && v3 < v5){
                menor2 = v3;
            }else if (v4 < v3 && v4 < v1 && v4 < v5){
                menor2 = v4;
            }else if (v5 < v3 && v5 < v4 && v5 < v1){
                menor2 = v5;
            }
        }else if (v3 == menor){
            v3 = 0;
            if (v1 < v2 && v1 < v4 && v1 < v5){
                menor2 = v1;
            }else if (v2 < v1 && v2 < v4 && v2 < v5){
                menor2 = v2;
            }else if (v4 < v1 && v4 < v2 && v4 < v5){
                menor2 = v4;
            }else if (v5 < v2 && v5 < v4 && v5 < v1){
                menor2 = v5;
            }
        }else if (v4 == menor){
            v4 = 0;
            if (v1 < v2 && v1 < v3 && v1 < v5){
                menor2 = v1;
            }else if (v2 < v1 && v2 < v3 && v2 < v5){
                menor2 = v2;
            }else if (v3 < v2 && v3 < v1 && v3 < v5){
                menor2 = v3;
            }else if (v5 < v2 && v5 < v3 && v5 < v1){
                menor2 = v5;
            }
        }else if (v5 == menor){
            v5 = 0;
            if (v1 < v2 && v1 < v3 && v1 < v4){
                menor2 = v1;
            }else if (v2 < v1 && v2 < v3 && v2 < v4){
                menor2 = v2;
            }else if (v3 < v4 && v3 < v1 && v3 < v2){
                menor2 = v3;
            }else if (v4 < v3 && v4 < v2 && v4 < v1){
                menor2 = v4;
            }
        }    

        System.out.printf("\nA média sem os dois menores é: %.1f", (v1 + v2 + v3 + v4 + v5 - menor2) / 3.0);
        }
}
