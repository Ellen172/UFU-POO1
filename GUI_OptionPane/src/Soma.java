import javax.swing.JOptionPane;

public class Soma {
	public static void main(String [] args) {
		String n1 = JOptionPane.showInputDialog("Entre com o primeiro numero: ");
		String n2 = JOptionPane.showInputDialog("Entre com o segundo numero: ");
		
		int soma = Integer.parseInt(n1) + Integer.parseInt(n2);
		
		JOptionPane.showMessageDialog(null, "O resultado da soma é : " + soma , "Soma de dois inteiros", JOptionPane.PLAIN_MESSAGE);
	}
}
