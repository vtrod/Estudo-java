import java.util.Scanner;

public class SomaPositivosTotalNegativos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num, somaPositivos = 0, totalNegativos = 0;
        
        for (int i = 1; i <= 20; i++) {
            System.out.printf("Digite o %dº número: ", i);
            num = input.nextInt();
            
            if (num > 0) {
                somaPositivos += num;
            } else {
                totalNegativos++;
            }
        }
        
        System.out.printf("Soma dos positivos: %d\n", somaPositivos);
        System.out.printf("Total de negativos: %d\n", totalNegativos);
        
        input.close();
    }
}