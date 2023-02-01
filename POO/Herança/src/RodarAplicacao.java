public class RodarAplicacao {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();//instanciando objeto Funcionario na classe

        Funcionario gerente = new Gerente(); //upcast - subclasse Gerente "subindo" para classe mãe Funcionário
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();
    
    
        Vendedor vendedor_ = (Vendedor) new Funcionario(); 
        /*downcast - classe mãe Funcionario "descendo" para subclasse Vendedor
        não se trabalha com downcast em orientação a objeto
        o exemplo dará errado porque tudo que está em Funcionário estará em Vendedor, mas o que está em vendedor pode não estar em Funcionário
        */
    }

}
