public class SomaNumerosPares {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 26; i <= 200; i += 2) {
            soma += i;
        }
        System.out.println("A soma dos números pares entre 25 e 200 é: " + soma);
    }
}