import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da compra: R$ ");
        double valor = sc.nextDouble();
        double desconto = 0;

        if (valor > 200) {
            desconto = valor * 0.20;
        } else if (valor > 100) {
            desconto = valor * 0.10;
        }

        double valorFinal = valor - desconto;

        System.out.printf("Desconto: R$ %.2f\n", desconto);
        System.out.printf("Valor final: R$ %.2f\n", valorFinal);
        sc.close();
    }
}