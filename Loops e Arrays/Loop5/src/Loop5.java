import java.text.BreakIterator;
import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Loop5 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in);
        
        int numero;
        int contador = 1;
        int resultado;

        System.out.println("De qual número você deseja ver a tabuada? ");
        numero = scan.nextInt();
    
        if (numero < 0 || numero > 10) {
            System.out.println("VALOR INVÁLIDO!");
        } else {
            
        
            System.out.println("TABUADA DO " + numero);

            while (contador <= 10 && numero >=0 && numero <= 10) {
                resultado = numero * contador;

                System.out.println(numero + " x " + contador + " = " + resultado);

                contador++;
           }
        }   
    }
}
