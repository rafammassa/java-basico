public class Array1 {
    public static void main(String[] args) throws Exception {
        
        int[] vetor = {0, 2, 30, 7, 5, 84};

        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nVetor inverso: ");
        for (int i = (vetor.length -1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
