import java.awt.*;
import javax.swing.*;

public class Janela extends JFrame{
	// componentes criados como parametros
	private JLabel label1;
	private JTextField campoTexto;
	private JButton botao;
	private JCheckBox checkBold;
	private JCheckBox checkItalic;
	private String nomes[] = {"Um", "Dois", "Tres", "Quatro", "Cinco"};
	private JComboBox combo;
	
	public Janela() {
		super("Janela Exemplo");
		setLayout(new FlowLayout());
		
		label1 = new JLabel("Texto Qualquer");
		add(label1);
		
		campoTexto = new JTextField(25);
		add(campoTexto);
		
		botao = new JButton("Botão de teste");
		add(botao);
		
		checkBold = new JCheckBox("Negrito");
		add(checkBold);
		
		checkItalic = new JCheckBox("Italico");
		add(checkItalic);
		
		combo = new JComboBox(nomes);
		add(combo);
	}
	
	
}
