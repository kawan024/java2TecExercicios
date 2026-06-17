public class filme{

    public static void main(String[] args) {
        system.out.println("Bem vindos ao TecFlix");
        system.out.println("Fúria de Titãs");

        int anoDeLancamento = 2010;
        system.out.println("Ano de lançamento " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 6.8;
        //Média calculada pelas notas do luiz, rafael e renan
        double media = (6.8 + 9.5 + 10) / 3;
        system.out.println("A média que o Segundo Tec deu " + media);

        string sinopse;

        sinopse = """
                Filme do Fúria de titãs moderno
                Estrado por Sam Worthington no papel do herói Perseu, Liam Neeson como Zeus e Ralph Fiennes como Hades
                o Filme tem nota mediana
                e foi lançado em 
                """ + anoDeLancamento;
                 
        system.out.println(sinopse);

    }
}