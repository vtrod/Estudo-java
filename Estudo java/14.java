import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salario = entrada.nextDouble();

        System.out.print("Digite a categoria do funcionário (m ou h): ");
        char categoria = entrada.next().charAt(0);

        if (categoria == 'm') {
            salario *= 1.1; // 10% de aumento para mensalista
            System.out.println("Aumento concedido! Novo salário: R$ " + salario);
        } else if (categoria == 'h') {
            salario *= 1.2; // 20% de aumento para horista
            System.out.println("Aumento concedido! Novo salário: R$ " + salario);
        } else {
            System.out.println("Categoria inválida!");
        }

        entrada.close();
    }
}