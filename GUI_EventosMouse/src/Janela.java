import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Janela extends JFrame {
	private JLabel textoMouse = new JLabel("Ola usuario!");
	
	public Janela() {
		super("Janela Exemplo");
		setLayout(new FlowLayout());
		
		textoMouse = new JLabel("Movimente o mouse");
		add(textoMouse);
		
		TratadorMouse tratador = new TratadorMouse();
		 
		addMouseListener(tratador);
		addMouseMotionListener(tratador);
	}
	
	private class TratadorMouse implements MouseListener, MouseMotionListener {
		public void mouseClicked(MouseEvent e) {
			textoMouse.setText("Clicou em ["+ e.getX() + "," + e.getY() +"]");
		}
		public void mousePressed(MouseEvent e) {
			textoMouse.setText("Pressionou em ["+ e.getX() + "," + e.getY() +"]");
		}
		public void mouseReleased(MouseEvent e) {
			textoMouse.setText("Soltou em ["+ e.getX() + "," + e.getY() +"]");
		}
		public void mouseEntered(MouseEvent e) {
			textoMouse.setText("Mouse dentro da janela");
		}
		public void mouseExited(MouseEvent e) {
			textoMouse.setText("Mouse fora da janela");
		}
		public void mouseDragged(MouseEvent e) {
			textoMouse.setText("Carregou em ["+ e.getX() + "," + e.getY() +"]");
		}
		public void mouseMoved(MouseEvent e) {
			textoMouse.setText("Moveu em ["+ e.getX() + "," + e.getY() +"]");
		}
		
	}
}


