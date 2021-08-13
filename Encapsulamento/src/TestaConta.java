public class TestaConta {
    public static void main(String [] args) {
        Conta c1 = new Conta();
        // c1.saldo = 50; // não pode ser acessado fora dos metodos

        System.out.println("Saldo: " + c1.getSaldo());
    }
}
