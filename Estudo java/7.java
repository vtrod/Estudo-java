import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        sc.close();

        if (numero % 5 == 0) {
            System.out.println(numero + " é divisível por 5");
        } else {
            System.out.println(numero + " não é divisível por 5");
        }
    }
}