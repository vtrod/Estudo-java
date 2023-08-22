import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num2 <= num1) {
            System.out.println("O segundo número deve ser maior que o primeiro!");
        } else {
            System.out.println("Números ímpares entre " + num1 + " e " + num2 + ":");

            for (int i = num1 + 1; i < num2; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }

        sc.close();
    }
}