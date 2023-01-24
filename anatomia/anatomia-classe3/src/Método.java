public class Método {
    public static void main(String[] args) {
    String primeiroNome = "Rafaella";
    String segundoNome = "Massa";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); //chamando o método nomeCompleto
    System.out.println(nomeCompleto); // saída na tela da variável nomeCompleto
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome); // + ou concat para juntar strings
    }
}
