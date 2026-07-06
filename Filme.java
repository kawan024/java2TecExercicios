public class Filme { 
    public static void main(String[] args) { 
        System.out.println("Bem vindos ao TecFlix"); 
        System.out.println("Fúria de Titãs"); 
        
        int anoDeLancamento = 2010; 
        System.out.println("Ano de lançamento: " + anoDeLancamento); 
        
        boolean incluidoNoPlano = true; 
        double notaDoFilme = 6.8; 
        
        // Média calculada pelas notas do luiz, rafael e renan 
        double media = (6.8 + 9.5 + 10.0) / 3.0; 
        System.out.println("A média que o Segundo Tec deu: " + media); 
        
        String sinopse = "Filme do Fúria de titãs moderno estrelado por Sam Worthington no papel do herói Perseu, Liam Neeson como Zeus e Ralph Fiennes como Hades. O filme tem nota mediana e foi lançado em " + anoDeLancamento; 
        System.out.println(sinopse); 
    } 
}

