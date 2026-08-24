import java.util.Scanner;
/*
 * Construa um programa que calcula o digito verificador de uma conta corrente de 3 dígitos. Para isso, inicialmente o programa deve solicitar ao
 * usuário o número dessa conta. O programa deve, então, calcular o dígito
 * verificador da seguinte forma:
 * (a) Soma o número da conta com um valor que corresponde ao número
 * na ordem inversa. (Ex: para numero = 235, o valor na ordem inversa
 * é 532. Faça 235 + 532 = 767)
(b) Multiplica cada dígito do valor encontrado em (a) pela sua posição e
soma os valores encontrados. (Ex:7x1 + 6x2 + 7x3 = 40)
(c) O último dígito do valor encontrado em (b) é o dígito verificador
(Ex:40 → 0).
O programa, o final da execução, deve escrever a conta e o seu digito
verificador (Exemplo: 235.0).*/
public class exercicio_18{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        
    int nC, nCInv, soma, somaPos, digitoVerificador;

    System.out.println(" \f Digite o número da conta (3 dígitos): ");
    nC = in.nextInt();

    nCInv = (nC % 10) * 100 + ((nC / 10) % 10) * 10 + (nC / 100);
    soma = nC + nCInv;  

    System.out.printf(" A soma do número da conta com o seu inverso é: %d\n", soma);   

    somaPos = (soma % 10) * 1 + ((soma / 10) % 10) * 2 + (soma / 100) * 3;
    digitoVerificador = somaPos % 10;

    System.out.printf(" A conta %d tem o dígito verificador: %d\n", nC, digitoVerificador);

    }
}