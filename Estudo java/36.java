public class ProdutoVetor {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        int produto = 1;
        
        // Lendo os valores do vetor
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = sc.nextInt();
        }
        
        // Calculando o produto dos valores
        for (int i = 0; i < vetor.length; i++) {
            produto *= vetor[i];
        }
        
        // Exibindo o resultado
        System.out.println("O produto dos valores do vetor é: " + produto);
    }
}