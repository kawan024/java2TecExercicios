import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaPadrao = "1234";

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        if (senha.equals(senhaPadrao)) {
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Acesso Negado");
        }
        sc.close();
    }
}