import java.util.Scanner;

//O programa deve receber um valor e informar quantos digitos este valor possui. (Ex.: 123 possui 3 digitos, 12345 possui 5 digitos), Sem while, for ou do while. Apenas if e else if.

public class exercicios2_5{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        int v;
        String d;

        System.out.println("Digite um valor: ");
        v = in.nextInt();

        System.out.println("O valor " + v + " possui " + String.valueOf(v).length() + " dígitos.");

        /*if (v >= 0 && v < 10){
            d = 1;
        } else if (v >= 10 && v < 100){
            d = 2;
        } else if (v >= 100 && v < 1000){
            d = 3;
        } else if (v >= 1000 && v < 10000){
            d = 4;
        } else if (v >= 10000 && v < 100000){
            d = 5;
        } else if (v >= 100000 && v < 1000000){
            d = 6;
        } else if (v >= 1000000 && v < 10000000){
            d = 7;
        } else if (v >= 10000000 && v < 100000000){
            d = 8;
        } else if (v >= 100000000 && v < 1000000000){
            d = 9;
        } else {
            System.out.println("Valor inválido. Por favor, digite um valor entre 0 e 2147483647.");
        }
        
        System.out.println("O valor " + v + " possui " + d + " dígitos.");
*/


    }
}