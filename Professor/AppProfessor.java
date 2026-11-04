import java.util.Scanner;

public class AppProfessor{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String nome;
        int matricula, horas;
        double vHora;
        
        professor p1 = new professor("Ana Paula", 12345, 40, 10.50);
        System.out.println(p1.toString());
        System.out.println("O salario de " + p1.getnome() + " e de " +
        p1.salario());
        
        System.out.println("Digite o nome do professor: ");
        nome = in.nextLine();
        System.out.println("Digite a matricula do professor: ");
        matricula = in.nextInt();
        System.out.println("Digite a carga do professor: ");
        horas = in.nextInt();
        System.out.println("Digite o valor do professor: ");
        vHora = in.nextDouble();
        
        professor p2 = new professor(nome, matricula, horas, vHora);
        System.out.println(p2.toString());
        System.out.println("O salario de " + p2.getnome() + " e de " +
        p2.salario());
        
        System.out.println("Digite novo valor para " + p2.getnome() + ": ");
        vHora = in.nextDouble();
        p2.setVHora(vHora);
        System.out.println("O novo salario de " + p2.getnome() + " e de " +
        p2.salario());
        
        System.out.println("Digite o nome do professor: ");
        nome = in.next();
        System.out.println("Digite a matricula do professor: ");
        matricula = in.nextInt();
        System.out.println("Digite a carga do professor: ");
        horas = in.nextInt();
        System.out.println("Digite o valor do professor: ");
        vHora = in.nextDouble();
        
        professor p3 = new professor(nome, matricula, horas, vHora);
        System.out.println(p2.toString());
        System.out.println("O salario de " + p3.getnome() + " e de " +
        p3.salario());
        
        System.out.println("Digite novo valor para " + p3.getnome() + ": ");
        vHora = in.nextDouble();
        p3.setVHora(vHora);
        System.out.println("O novo salario de " + p3.getnome() + " e de " +
        p3.salario());
        
        System.out.println("Professor 1\n" + p1.toString() + "\ne o salario " 
        + p1.salario());
        System.out.println("Professor 2\n" + p2.toString() + "\ne o salario " 
        + p2.salario());
        System.out.println("Professor 3\n" + p3.toString() + "\ne salario " 
        + p3.salario());
        
    }
}