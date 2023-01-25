public class Operadores {
    public static void main(String[] args) throws Exception {
        //operador de atribuição
        String nome = "Rafaella"; //operador de atribuição "="
        char sexo = 'F';
        boolean doadorOrgao = false;

        //operadores aritméticos
        double soma = 10.5 + 6.2; //adição
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 19 % 3;
        double resultado = (10 * 7) + (20 / 4);
        //operador "+" em variáveis de texto realiza a concatenação (concat)

        String concatenação = "1"+1+1+1;
            System.out.print(concatenação);
        concatenação = 1+"1"+1+1;
            System.out.println(concatenação);
        concatenação = 1+1+1+"1";
            System.out.println(concatenação);
        
        //operadores unários - incrementam/decrementam/invertem valores numéricos e booleanos
        //(+) operador unário de valor positivo - números que são positivos sem esse operador expicitamente
        //(-) operador unário de valor negativo - nega um número/expressão aritmética
        //(++) operador unário de incremento de valor - incrementa +1
        //(--) operador unário de decremento de valor - decrementa -1
        //(!) operador unário lógico de negação - nega o valor de uma expressão booleana

        int numero = 5;
        System.out.println(- numero);
        System.out.println(-- numero);
        
        boolean afirmacao = false;
        System.out.println(! afirmacao);
    }
}
