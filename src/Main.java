import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor do empréstimo:");
        double valor = scanner.nextDouble();
        Emprestimo.calcular(valor, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(valor, Emprestimo.getTresParcelas());


    }

}
