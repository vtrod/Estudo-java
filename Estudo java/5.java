import java.util.Scanner;

public class NumerosIguaisOuDiferentes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();

        if (num1 == num2) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
        }
    }
}