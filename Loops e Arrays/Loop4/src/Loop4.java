/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in);

        int numero;
        int quantidadeNumeros = 0;
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        System.out.print("Qual é a quantidade de números? ");
        quantidadeNumeros = scan.nextInt();

        int contador = 0;

        do{
            System.out.print("Número: ");
            numero = scan.nextInt();
            ++ contador;

            if (numero % 2 == 0) quantidadePares++;
            else quantidadeImpares++;

        } while (contador < quantidadeNumeros);

        System.out.println("A quantidade de números pares é: " + quantidadePares);
        System.out.println("A quantidade de números ímpares é: " + quantidadeImpares);
    }
}
