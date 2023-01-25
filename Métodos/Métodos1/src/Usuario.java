//classe definida por atributos e métodos
//atributos são variáveis de diversos tipos
//métodos são funções ou sub-rotinas
//nomeado como verbo com camelCase
//devem SEMPRE ser definidos dentro de uma classe
//método VOID não retorna nada

public class Usuario {
    public static void main(String[] args) throws Exception {
    
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("A TV está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.abaixarVolume();
        System.out.println("Volume: " + smartTv.volume);

        smartTv.mudarCanal(15);
        System.out.println("Canal: " + smartTv.canal);

        smartTv.desligar();
        System.out.println("A TV está ligada? " + smartTv.ligada);
    }
}