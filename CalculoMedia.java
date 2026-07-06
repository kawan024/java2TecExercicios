import java.util.Scanner;
import java.util.Locale; // Importe o Locale para usar ponto em vez de vírgula se preferir

public class CalculoMedia {
    public static void main(String[] args) {
        // Define o padrão dos EUA (ponto em vez de vírgula) para facilitar a digitação
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a nota do primeiro trimestre: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota do segundo trimestre: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota do terceiro trimestre: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        // Adicionada a máscara %.2f para formatar a média com 2 casas decimais
        System.out.printf("A média final é: %.2f%n", media);

        if (media < 4.0) {
            System.out.println("Reprovado");
        } else if (media <= 6.0) {
            System.out.println("Se Liga");
        } else {
            System.out.println("Aprovado");
        }
        
        scanner.close(); // Fecha o scanner para liberar recursos
    }
}
