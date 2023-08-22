public class Crescimento {
    public static void main(String[] args) {
        double chico = 1.50; // altura inicial de Chico
        double juca = 1.10; // altura inicial de Juca
        int anos = 0; // anos necessários para Juca ser mais alto que Chico

        while (juca <= chico) {
            chico += 0.02; // Chico cresce 2 cm por ano
            juca += 0.03; // Juca cresce 3 cm por ano
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para Juca ser mais alto que Chico.");
    }
}