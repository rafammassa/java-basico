public class Operadores {
    public static void main(String[] args) throws Exception {
        //operadores relacionais - avalia a relação entre duas variáveis
        // == para verificar se são iguais
        // != para verificar se são diferentes
        // > para verificar se a é maior que b
        // < para verificar se a é menor que b
        // >= para verificar se a é maior ou igual a b
        // <= para verificar se a é menor o igual a b

        int x, y;

        x = 1;
        y = 2;

        boolean trueOrFalse = x == y;

        System.out.println("X é igual a Y? " + trueOrFalse);

        trueOrFalse = x != y;

        System.out.println("X é diferente de Y? " + trueOrFalse);

        trueOrFalse = x > y;

        System.out.println("X é maior que Y? " + trueOrFalse);

        trueOrFalse = x < y;

        System.out.println("X é menor que Y? " + trueOrFalse);

        trueOrFalse = x >= y;

        System.out.println("X é maior ou igual a Y? " + trueOrFalse);

        trueOrFalse = x <= y;

        System.out.println("X é menor ou igual a Y? " + trueOrFalse);

        //.equals para comparar objetos
    }
}
