import java.util.Scanner;
public class CalculoMedia{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do primeiro trimestre: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota do segundo trimestre: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota do terceiro trimestre: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média final é: ", media);

        if(media < 4.0){
            System.out.println("Reprovado");
        } else if (media <= 6.0){
            System.out.println("Se Liga");
        } else{
            System.out.println("Aprovado");
        }
    }
}