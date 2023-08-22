import java.util.Scanner;

public class MegaSena {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] gabarito = new int[6];
        for (int i = 0; i < gabarito.length; i++) {
            System.out.print("Digite o número " + (i+1) + " do gabarito: ");
            gabarito[i] = input.nextInt();
        }
  
        int[] aposta = new int[10];
        for (int i = 0; i < aposta.length; i++) {
            System.out.print("Digite o número " + (i+1) + " da aposta: ");
            aposta[i] = input.nextInt();
        }
    
        int acertos = 0;
        for (int i = 0; i < aposta.length; i++) {
            for (int j = 0; j < gabarito.length; j++) {
                if (aposta[i] == gabarito[j]) {
                    acertos++;
                    break;
                }
            }
        }

        System.out.println("Pontos: " + acertos);
        if (acertos == 6) {
            System.out.println("Sena!");
        } else if (acertos == 5) {
            System.out.println("Quina!");
        } else if (acertos == 4) {
            System.out.println("Quadra!");
        } else {
            System.out.println("Não ganhou nenhum prêmio.");
        }
    }
}