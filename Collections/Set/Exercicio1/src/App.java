import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        //System.out.println("Exiba a posição da nota 5.0: "); - não é possível exibir a posição no HashSet, elementos ficam fora da ordem

        //System.out.println("Adicione a nota 8.0 na posição 4: "); - também não é possível

        // System.out.println("Substitua a nota 5.0 por 6.0: "); - não tem o método set

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5.0));

        //System.out.println("Exiba a terceira nota adicionada: "); - não tem o método get

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a mior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator(); // iterador para realizar soma
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        //System.out.println("Remova a nota na posição 0: "); - não consigo saber a posição 0

        System.out.println("Remova a nota 0.0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7.0 e exiba na lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()){
            Double next = iterator2.next();
            if (next < 7) iterator2.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();//exemplo adicionando 1 por 1
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);

        System.out.println(notas2); //não permite repetições (nota 7)

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto: ");
        notas.clear();
        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
    }
}
