import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] vetor = new double[10];

    for(int i = 0; i < vetor.length; i++) {
      System.out.print("Digite o " + (i+1) + "º valor: ");
      vetor[i] = input.nextDouble();
    }

    System.out.print("Valores acima de 100: ");
    for(int i = 0; i < vetor.length; i++) {
      if(vetor[i] > 100) {
        System.out.print(vetor[i] + " ");
      }
    }
  }
}