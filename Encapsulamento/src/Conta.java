public class Conta {
    private int nro; 
    private float saldo;
    private String tipo; 

    public float getSaldo(){
        return saldo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getNro() {
        return nro;
    }
    public void setNro(int nro) {
        this.nro = nro;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public void cadastraConta(int n, float s, String t){
        setNro(n);
        if(s >= 100) saldo = s;
        else saldo = 100;
        setTipo(t);
    }
    public void depositar (float valor){
        saldo+=valor;
    }
    public boolean sacar(float valor){
        if(valor <= saldo+100){
            saldo -= valor;
            return true;
        }
        return false;
    }
}
