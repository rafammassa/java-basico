public class Operadores {
    public static void main(String[] args) throws Exception {
        
        //operadores lógicos - cria expressões lógicas maiores
        // && operador lógico E
        // || operador lógico OU

        boolean condicao1 = true;
        boolean condicao2 = false;
        boolean resultado;

        if (condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        } else {
            System.out.println("Uma ou as duas condições são falsas");
        }
        
        if (condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        } else {
            System.out.println("As duas condições são falsas");
        } 
    }
}
