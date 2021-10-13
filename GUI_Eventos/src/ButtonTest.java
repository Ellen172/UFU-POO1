import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonTest extends JFrame {
	private JButton botao1, botao2;
	private JLabel label = new JLabel("Aperte um dos bot�es");
	
	public ButtonTest() {
		super("Testando bot�es");
		setLayout(new FlowLayout());
		
		TrataBotoes tratador = new TrataBotoes();
		add(label);
		
		botao1 = new JButton("Bot�o 1");
		botao1.addActionListener(tratador);
		add(botao1);
		
		botao2 = new JButton("Bot�o 2");
		botao2.addActionListener(tratador);
		add(botao2);
		
	}
	
	private class TrataBotoes implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == botao1) {
				label.setText("Pressionado bot�o 1");
			}
			else {
				label.setText("Pressionado bot�o 2");
			}
		}
	}
}
