import java.util.Scanner;

public class NumerosEntre100e200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cont = 0;

        do {
            System.out.print("Digite um número (0 para sair): ");
            num = sc.nextInt();
            if (num >= 100 && num <= 200) {
                cont++;
            }
        } while (num != 0);

        System.out.println("Quantidade de números entre 100 e 200: " + cont);
    }
}