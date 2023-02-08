import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class CoresArcoIris {
    public static void main(String[] args) throws Exception {
        System.out.println("Crie um conjunto contendo as cores do arco-íris: ");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("vermelho");
        coresArcoIris.add("laranja");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("verde");
        coresArcoIris.add("azul");
        coresArcoIris.add("azul-escuro");
        coresArcoIris.add("violeta");

        System.out.println("Exiba todas as cores uma abaixo da outra:");
        for (String cor : coresArcoIris) {
                System.out.println(cor);
        }

        System.out.print("Quantidade de cores do arco-íris: " + coresArcoIris.size());

        System.out.println("\nExiba as cores em ordem alfabetica: ");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);

        System.out.println("Exiba as cores na ordem inversa da que foi informada: ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(
                Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "azul-escuro", "violeta"));
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("Exiba todas as cores que começam com a letra V:");
        for (String cor : coresArcoIris) {
            if(cor.startsWith("v", 0)) System.out.println(cor);
        }

        System.out.println("Remova todas cores que não começam com a letra V: ");
        Iterator<String> iterator = coresArcoIris.iterator();
        while(iterator.hasNext()){
            if (!(iterator.next().startsWith("v"))) iterator.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("Limpe o conjunto.");
        coresArcoIris.clear();
        System.out.println("Está limpo? " + coresArcoIris.isEmpty());
    }
}