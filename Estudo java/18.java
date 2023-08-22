import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 10: ");
        int numero = input.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Número inválido! Digite um número entre 1 e 10.");
        } else {
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        }

        input.close();
    }
}