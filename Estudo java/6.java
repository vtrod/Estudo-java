import java.util.Scanner;

public class CalculoDesconto {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double valorCompra, valorTotal;
        int codigoComprador;

        System.out.print("Digite o valor total da compra: R$ ");
        valorCompra = input.nextDouble();

        System.out.println("Digite o código do comprador:");
        System.out.println("1 - Cliente comum");
        System.out.println("2 - Funcionário");
        System.out.println("3 - Cliente VIP");
        codigoComprador = input.nextInt();

        if (codigoComprador == 1) {
            valorTotal = valorCompra;
        } else if (codigoComprador == 2) {
            valorTotal = valorCompra * 0.9;
        } else if (codigoComprador == 3) {
            valorTotal = valorCompra * 0.95;
        } else {
            System.out.println("Código inválido");
            return;
        }

        System.out.printf("Valor total a ser pago: R$ %.2f\n", valorTotal);
    }
}