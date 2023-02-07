import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class Temperaturas {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();

        double soma = 0d;
        int cont = 1;
        while (cont <= 6){
            System.out.print("Digite a " + cont + "ª temperatura: ");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            soma += temp;
            cont++;
        }
        System.out.println("MÉDIA: " + (soma/temperaturas.size()));

        System.out.println("---- Temperaturas acima da média ----");
        for (Double temp : temperaturas) {
            if (temp > (soma/temperaturas.size())){
                int numeroMes = temperaturas.indexOf(temp);
                switch (numeroMes){
                    case (0):
                        System.out.println("Janeiro: " + temp + "ºC");
                        break;
                    case (1):
                        System.out.println("Fevereiro: " + temp + "ºC");
                        break;
                    case (2):
                        System.out.println("Março: " + temp + "ºC");
                        break;
                    case (3):
                        System.out.println("Abril: " + temp + "ºC");
                        break;
                    case (4):
                        System.out.println("Maio: " + temp + "ºC");
                        break;
                    case (5):
                        System.out.println("Junho: " + temp + "ºC");
                        break;
                }
            }
        }
    }
}