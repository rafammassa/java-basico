public class Operadores {
    public static void main(String[] args) throws Exception {
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
