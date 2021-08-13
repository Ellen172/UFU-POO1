public class ContaBancaria {
    public String nome;
    public String CPF;
    public float saldo;

    public void saque(float valor){
        if(saldo >= valor) saldo = saldo - valor;
    }
    public void deposito(float valor){
        saldo+=valor;
    }
    public float retornaSaldo(){
        return saldo;
    }
}
