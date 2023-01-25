public class Operadores {
    public static void main(String[] args) throws Exception {
    
        //operador ternário - define ma condição e escolhe um dentre dois valores
        //<expressão condicional> ? <caso condição seja true> : <caso condição seja false>
        int a, b;
        String resultado;

        a = 5;
        b = 6;

        //condicional com estrutura if/else
        if (a==b)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";
        System.out.println(resultado);

        //condicional com uso do operador ternário
        int x, y;

        x = 5;
        y = 6;

        String resposta = a==b ? "Verdadeiro" : "Falso";
        
        System.out.println(resposta);
    }
}
