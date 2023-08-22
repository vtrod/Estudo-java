import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, count = 0;

        for(int i=0; i<15; i++) {
            System.out.print("Digite um número: ");
            num = input.nextInt();

            if(num > 30) {
                count++;
            }
        }

        System.out.println("Foram digitados " + count + " números maiores que 30.");
    }
}