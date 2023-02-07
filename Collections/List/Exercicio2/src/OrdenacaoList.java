import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoList {
    public static void main(String[] args) throws Exception {
        List<Gato> meusGatos = new ArrayList<>(){{
            add (new Gato("Jon", 18, "preto"));
            add (new Gato("Simba", 6, "tigrado"));
            add (new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println("ORDEM DE INSERÇÃO");
        System.out.println(meusGatos);

        System.out.println("ORDEM ALEATÓRIA");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("ORDEM NATURAL");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("ORDEM IDADE");
        Collections.sort(meusGatos, new ComparatorIdade());
       // meusGatos.sort(null);
       System.out.println(meusGatos);

       System.out.println("ORDEM COR");
       Collections.sort(meusGatos, new ComparatorCor());
       System.out.println(meusGatos);

       System.out.println("ORDEM NOME/COR/IDADE");
       Collections.sort(meusGatos, new ComparatorNomeCorIdade());
       System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato (String nome, Integer idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome(){
        return nome;
    }

    public Integer getIdade(){
        return idade;
    }

    public String getCor(){
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome=' " + nome + '\'' +
                ", idade= " + idade +
                ", cor=' " + cor +  '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato){
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator <Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
       // meusGatos.sort(new ComparatorIdade());
    }
}

class ComparatorCor implements Comparator <Gato> {

     @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
        // meusGatos.sort(new ComparatorCor());
    }
}

class ComparatorNomeCorIdade implements Comparator <Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;
        
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
