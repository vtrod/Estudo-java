import java.util.Scanner;

public class CalculoIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento da pessoa: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        int idadeAtual = anoAtual - anoNascimento;
        int idade2018 = 2018 - anoNascimento;

        System.out.println("A idade atual da pessoa é: " + idadeAtual);
        System.out.println("Em 2018, a pessoa terá " + idade2018 + " anos.");
    }
}