package pacote;

import java.util.Scanner;


public class AntSuc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir ao usuário para digitar um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        // Calcular o antecessor e o sucessor do número digitado
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        // Imprimir o antecessor e o sucessor na tela
        System.out.println("O antecessor de " + numero + " é " + antecessor);
        System.out.println("O sucessor de " + numero + " é " + sucessor);

        sc.close();
    }

}