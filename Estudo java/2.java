
import java.util.Scanner;

public class PolegadasParaCentimetros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida em polegadas: ");
        double polegadas = scanner.nextDouble();

        double centimetros = polegadas * 2.54;

        System.out.println(polegadas + " polegadas é equivalente a " + centimetros + " centímetros.");
    }
}