import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ler as notas dos alunos
        double[] notas = new double[10];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i+1) + ": ");
            notas[i] = input.nextDouble();
        }

        // Calcular a média da turma
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;

        // Contar quantos alunos obtiveram nota acima da média
        int acimaDaMedia = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                acimaDaMedia++;
            }
        }

        // Mostrar os resultados
        System.out.printf("Média da turma: %.2f\n", media);
        System.out.println("Alunos acima da média: " + acimaDaMedia);
    }
}