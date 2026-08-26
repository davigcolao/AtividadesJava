/*  use 3 expressões lógicas (expr1, expr2 e expr3) e exiba a tabela
verdade do E */


public class TabelaVerdade {
public static void main(String args[]){

    boolean expr1, expr2, expr3;

    System.out.println("\fTabela Verdade do Operador &&");
    System.out.println("Expr1\tExpr2\tExpr3\tExpr1 && Expr2 && Expr3");

    expr1 = false; expr2 = false; expr3 = false;
    System.out.println(expr1+"\t"+expr2+"\t"+expr3+"\t"+(expr1 && expr2 && expr3));

    expr1 = false; expr2 = false; expr3 = true;
    System.out.println(expr1+"\t"+expr2+"\t"+expr3+"\t"+(expr1 && expr2 && expr3));
    
    expr1 = false; expr2 = true; expr3 = false;
    System.out.println(expr1+"\t"+expr2+"\t"+expr3+"\t"+(expr1 && expr2 && expr3));
    
    expr1 = false; expr2 = true; expr3 = true;
    System.out.println(expr1+"\t"+expr2+"\t"+expr3+"\t"+(expr1 && expr2 && expr3));
    
    expr1 = true; expr2 = false; expr3 = false;
    System.out.println(expr1+"\t"+expr2+"\t"+expr3+"\t"+(expr1 && expr2 && expr3));

    expr1 = true; expr2 = false; expr3 = true;
    System.out.println(expr1+"\t"+expr2+"\t"+expr3+"\t"+(expr1 && expr2 && expr3));

    expr1 = true; expr2 = true; expr3 = false;
    System.out.println(expr1+"\t"+expr2+"\t"+expr3+"\t"+(expr1 && expr2 && expr3));

    expr1 = true; expr2 = true; expr3 = true;
    System.out.println(expr1+"\t"+expr2+"\t"+expr3+"\t"+(expr1 && expr2 && expr3));

    }
}