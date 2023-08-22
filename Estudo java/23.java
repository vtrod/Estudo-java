import java.util.Scanner;

public class NumerosEntreDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();

        System.out.println("Os números inteiros entre " + num1 + " e " + num2 + " são:");

        for (int i = num1 + 1; i < num2; i++) {
            System.out.println(i);
        }
    }
}