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
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha um valor de 1 a 10: ");
        int numero = scan.nextInt();

        System.out.println("TABUADA DO " + numero);
        for(int i = 1; i <= 10; i = i + 1) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }
}