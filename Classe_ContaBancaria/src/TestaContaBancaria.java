public class TestaContaBancaria {
    public static void main(String[] args){
        
        ContaBancaria c1 = new ContaBancaria();
        c1.CPF = "111";
        c1.nome = "Elaine";
        c1.deposito(100);
        
        ContaBancaria c2 = new ContaBancaria();
        c2.CPF = "222";
        c2.nome = "João";
        c2.deposito(300);
        
        System.out.println(c1.nome + "....." + c1.retornaSaldo());
        System.out.println(c2.nome + "....." + c2.retornaSaldo());
    }
}
