import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da conta de luz: ");
        double cl = sc.nextDouble();

        if (cl > 150.0) {
            System.out.println("Você está gastando muito");
        } else {
            System.out.println("Seu gasto foi normal");
        }

        sc.close();
    }
}