import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double valor = 0;

        System.out.println("Menu da Lanchonete:");
        System.out.println("100 - Cachorro quente - R$ 1,20");
        System.out.println("101 - Bauru simples - R$ 1,30");
        System.out.println("102 - Bauru com ovo - R$ 1,50");
        System.out.println("103 - Hamburger - R$ 1,20");
        System.out.println("104 - Cheeseburger - R$ 1,30");
        System.out.println("105 - Refrigerante - R$ 1,00");

        System.out.print("Digite o código do item pedido: ");
        codigo = sc.nextInt();

        System.out.print("Digite a quantidade: ");
        quantidade = sc.nextInt();

        switch (codigo) {
            case 100:
                valor = quantidade * 1.2;
                break;
            case 101:
                valor = quantidade * 1.3;
                break;
            case 102:
                valor = quantidade * 1.5;
                break;
            case 103:
                valor = quantidade * 1.2;
                break;
            case 104:
                valor = quantidade * 1.3;
                break;
            case 105:
                valor = quantidade * 1.0;
                break;
            default:
                System.out.println("Código inválido!");
                System.exit(0);
        }

        System.out.printf("Valor a ser pago: R$ %.2f", valor);

        sc.close();
    }
}