import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

public class Array3 {
    public static void main(String[] args) {
        
        Random random = new Random();

        int [] numeros = new int[20];
        
        for (int i = 0; i < numeros.length; i++){
            int numero = random.nextInt(100);
            numeros[i] = numero;

        }

        System.out.println("Números aleatórios:");
        for (int numero : numeros) {
            System.out.print(numero + " ");   
        }

        System.out.println("\nSucessores:");
        for (int numero : numeros) {
            System.out.print(++numero + " ");   
        }
    }
}
