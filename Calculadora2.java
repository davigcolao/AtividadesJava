import java.util.Scanner;


public class Calculadora2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        double resultado, v1, v2;;
        int op;

       

        do{  
            menu();    
            op = in.nextInt();

            System.out.println("Digite o valor 1: ");
            v1 = in.nextDouble();

            System.out.println("Digite o valor 2: ");
            v2 = in.nextDouble();
        switch(op){
            case 1:
            resultado = somar(v1,v2);
            System.out.println("resulado da soma " + resultado);
            break;
        
            case 2:
            resultado = subtrair(v1,v2);
            System.out.println("resulado da soma " + resultado);
            break;

            case 3:
            resultado = multiplicar(v1,v2);
            System.out.println("resulado da soma " + resultado);
            break;

            case 4:
            resultado = dividir(v1,v2);
            System.out.println("resulado da soma " + resultado);
            break;

            default: System.out.println("Opção inválida");
        }while(op != 0);
    }
    }

    public static void menu(){
        System.out.println("Digite 0 para cancelar");
        System.out.println("Digite 1 para somar");
        System.out.println("Digite 2 para subtrair");
        System.out.println("Digite 3 para multiplicar");
        System.out.println("Digite 4 para dividir");
    }

    public static double somar(double v1, double v2){
        return v1 + v2;
    }
    public static double subtrair(double v1, double v2){
        return v1 - v2;
    }
    public static double multiplicar(double v1, double v2){
        return v1 * v2;
    }
    public static double dividir(double v1, double v2){
        return v1 / v2;
    }
}
