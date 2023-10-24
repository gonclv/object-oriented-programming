package guilayouts;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutFrame extends JFrame {

	private JButton btnBotao1;
	private JButton btnBotao2;
	private JButton btnBotao3;
	private FlowLayout layout;
	
	public FlowLayoutFrame() {
		this.layout = new FlowLayout(FlowLayout.CENTER, 20, 20);
		this.setLayout(layout);
		
		this.btnBotao1 = new JButton("Botão 1");
		this.btnBotao2 = new JButton("Botão 2");
		this.btnBotao3 = new JButton("Botão 3");
		
		this.add(btnBotao1);
		this.add(btnBotao2);
		this.add(btnBotao3);
		
		this.setTitle("Exemplo FlowLayout");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
