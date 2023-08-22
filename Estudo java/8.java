import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do salário bruto: ");
        double salarioBruto = sc.nextDouble();
        System.out.print("Digite o valor da prestação: ");
        double prestacao = sc.nextDouble();
        sc.close();

        double valorMaximoPrestacao = salarioBruto * 0.3;

        if (prestacao <= valorMaximoPrestacao) {
            System.out.println("Empréstimo concedido");
        } else {
            System.out.println("Empréstimo não concedido");
        }
    }
}