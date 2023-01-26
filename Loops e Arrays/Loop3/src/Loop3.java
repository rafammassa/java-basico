import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Loop3 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int numero;
        int maior = 0;
        float media = 0;

        int cont = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            ++cont;
            media += numero;
            if (numero > maior) maior = numero;
        } while (cont < 5);

        System.out.println("O maior número digitado foi " + maior);
        System.out.println("A média dos valores é " + (media / 5));
    }
}
