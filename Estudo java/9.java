import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário recebido: ");
        double salario = sc.nextDouble();

        System.out.print("Digite o total gasto: ");
        double gastos = sc.nextDouble();

        if (gastos <= salario) {
            System.out.println("Gastos dentro do orçamento");
        } else {
            System.out.println("Orçamento estourado");
        }

        sc.close();
    }
}