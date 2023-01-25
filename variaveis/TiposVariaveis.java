public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        String meuNome = "Rafaella Monteiro Massa";
        byte idade = 123;
        short ano = 2023;
        int cep = 78673000; //se começar com 0 precisará ser de outro tipo
        long cpf = 47632225897L; //precisa ter um L/l no final
        float pi = 3.14F; //precisa ter um F/f no final
        double salario = 1200;

        int numero = 1; //variável declarada com atribuição de valor
        numero = 2; //mudando o valor da variável

        final int VALOR = 1; //constante, não mudará durante todo código
        final double PI = 3.14; //constante PI

        System.out.print(meuNome);
    }
}
