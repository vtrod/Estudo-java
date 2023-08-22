public class SomaNumeros {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 11; i <= 89; i++) {
            System.out.println(i);
            soma += i;
        }
        System.out.println("Soma: " + soma);
    }
}