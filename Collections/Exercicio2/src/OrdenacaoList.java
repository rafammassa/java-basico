import java.util.ArrayList;
import java.util.Collections;
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
