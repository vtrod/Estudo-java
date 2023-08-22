import java.util.Scanner;

public class MediaIdades {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int soma = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a " + i + "ª idade: ");
            int idade = entrada.nextInt();
            soma += idade;
        }
        
        double media = (double) soma / 5;
        
        System.out.println("A média das idades é: " + media);
    }

}