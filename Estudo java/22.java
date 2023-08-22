import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, count = 0, soma = 0, countMulheres = 0;
        double media;
        char sexo;
        double salario;

        System.out.print("Quantas pessoas serão entrevistadas? ");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Pessoa " + (i+1));
            System.out.print("Idade: ");
            input.nextInt(); // não utilizamos a idade na solução
            System.out.print("Sexo (M/F): ");
            sexo = input.next().charAt(0);
            System.out.print("Salário: ");
            salario = input.nextDouble();

            soma += salario;
            count++;

            if (sexo == 'F' && salario <= 1500) {
                countMulheres++;
            }
        }

        media = (double) soma / count;

        System.out.printf("Média de salário do grupo: R$ %.2f\n", media);
        System.out.println("Quantidade de mulheres com salário até R$1500,00: " + countMulheres);
    }
}