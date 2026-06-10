import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Você já é maior de idade.");
        } else {
            System.out.println("Você ainda não é maior de idade.");
        }
        sc.close();
    }
}