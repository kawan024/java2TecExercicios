import java.util.Scanner;

public class LimiteVelocidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a velocidade do carro (km/h): ");
        double velocidade = sc.nextDouble();

        if (velocidade > 80) {
            System.out.println("Você foi multado!");
        } else {
            System.out.println("Boa viagem!");
        }
        sc.close();
    }
}