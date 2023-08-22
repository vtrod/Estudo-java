import java.util.Scanner;

public class ContagemParesImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num, pares = 0, impares = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            num = input.nextInt();
            
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        
        System.out.println("\nTotal de números pares: " + pares);
        System.out.println("Total de números ímpares: " + impares);
        
        input.close();
    }
}