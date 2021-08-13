public class TestaProduto {
    public static void main(String[] args){
        Produto p1 = new Produto();

        p1.nomeProduto = "arroz";
        p1.atribuiPreco(0,10);
        p1.atribuiPreco(1,12);
        p1.atribuiPreco(2,14);
        p1.atribuiPreco(3,9);
        p1.atribuiPreco(4,23);
        
        for(int i=0; i<5; i++){
            System.out.println(p1.retornaValor(i));
        }

        System.out.println("Maior preço: " + p1.calculaMaiorPreco());
    }
}
