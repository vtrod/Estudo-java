import java.util.Scanner;

public class SomaEntreValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = sc.nextInt();

        int soma = 0;

        for (int i = valor1; i <= valor2; i++) {
            soma += i;
        }

        System.out.println("A soma dos valores entre " + valor1 + " e " + valor2 + " é: " + soma);
    }
}