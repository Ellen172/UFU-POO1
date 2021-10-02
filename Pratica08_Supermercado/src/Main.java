
public class Main {
	public static void main(String [] args) {		

		Produto p1 = new Produto("Sabonete", 3.40, 132);
		Produto p2 = new Produto("Leite", 2.75, 450);
		Produto p3 = new Produto("Pão de Forma", 5.60, 320);
		
		
		Pedido pd1 = new Pedido("123");
		
		pd1.addProduto(p1);
		pd1.addProduto(p2);
		
		pd1.mostraDados();
		pd1.inserePag();
		
	}
}
