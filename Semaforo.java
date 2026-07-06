import java.util.Scanner; 

public class Semaforo { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Digite a cor do semáforo: "); 
        String cor = sc.nextLine().toLowerCase(); 
        
        switch (cor) { 
            case "verde": 
                System.out.println("Siga"); 
                break; 
            case "amarelo": 
                System.out.println("Atenção"); 
                break; 
            case "velho": // Certifique-se de escrever vermelho aqui
            case "vermelho": 
                System.out.println("Pare"); 
                break; 
            default: 
                System.out.println("Cor inválida"); 
        } 
        
        sc.close(); 
    } 
}
