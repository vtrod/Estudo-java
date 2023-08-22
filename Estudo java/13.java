import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo;
        String cargo;
        double salarioAntigo, novoSalario, aumento;

        System.out.print("Digite o código do cargo: ");
        codigo = sc.nextInt();

        switch(codigo) {
            case 101:
                cargo = "gerente";
                aumento = 0.1;
                break;
            case 102:
                cargo = "engenheiro";
                aumento = 0.2;
                break;
            case 103:
                cargo = "técnico";
                aumento = 0.3;
                break;
            default:
                cargo = "outro";
                aumento = 0.4;
                break;
        }

        System.out.print("Digite o salário atual: ");
        salarioAntigo = sc.nextDouble();

        novoSalario = salarioAntigo + salarioAntigo * aumento;

        System.out.printf("Cargo: %s\n", cargo);
        System.out.printf("Salário antigo: R$ %.2f\n", salarioAntigo);
        System.out.printf("Novo salário: R$ %.2f\n", novoSalario);
        System.out.printf("Aumento de: R$ %.2f\n", novoSalario - salarioAntigo);
        
        sc.close();
    }
}