package guilayouts.calculadora;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame {

	private JTextField txtVisor;
	private JButton btnNumero0;
	private JButton btnNumero1;
	private JButton btnNumero2;
	private JButton btnNumero3;
	private JButton btnNumero4;
	private JButton btnNumero5;
	private JButton btnNumero6;
	private JButton btnNumero7;
	private JButton btnNumero8;
	private JButton btnNumero9;
	private JButton btnSoma;
	private JButton btnSubtracao;
	private JButton btnMultiplicacao;
	private JButton btnDivisao;
	private JButton btnIgual;
	private JButton btnLimpar;
	
	private JPanel painelCentral;
	
	public Calculadora() {
		this.txtVisor = new JTextField();
		this.txtVisor.setText("0.0");
		this.txtVisor.setFont(new Font("Tahoma", 1, 24));
		this.txtVisor.setHorizontalAlignment(JTextField.RIGHT);
		this.txtVisor.setEnabled(false);
		
		this.add(txtVisor, BorderLayout.NORTH);
		
		this.btnNumero0 = new JButton("0");
		this.btnNumero0.setFont(new Font("Tahoma", 0, 24));
		
		this.btnNumero1 = new JButton("1");
		this.btnNumero1.setFont(new Font("Tahoma", 0, 24));
		
		this.btnNumero2 = new JButton("2");
		this.btnNumero2.setFont(new Font("Tahoma", 0, 24));
		
		this.btnNumero3 = new JButton("3");
		this.btnNumero3.setFont(new Font("Tahoma", 0, 24));
		
		this.btnNumero4 = new JButton("4");
		this.btnNumero4.setFont(new Font("Tahoma", 0, 24));
		
		this.btnNumero5 = new JButton("5");
		this.btnNumero5.setFont(new Font("Tahoma", 0, 24));
		
		this.btnNumero6 = new JButton("6");
		this.btnNumero6.setFont(new Font("Tahoma", 0, 24));
		
		this.btnNumero7 = new JButton("7");
		this.btnNumero7.setFont(new Font("Tahoma", 0, 24));
		
		this.btnNumero8 = new JButton("8");
		this.btnNumero8.setFont(new Font("Tahoma", 0, 24));
		
		this.btnNumero9 = new JButton("9");
		this.btnNumero9.setFont(new Font("Tahoma", 0, 24));
		
		this.btnSoma = new JButton("+");
		this.btnSoma.setFont(new Font("Tahoma", 0, 24));
		
		this.btnSubtracao = new JButton("-");
		this.btnSubtracao.setFont(new Font("Tahoma", 0, 24));
		
		this.btnMultiplicacao = new JButton("*");
		this.btnMultiplicacao.setFont(new Font("Tahoma", 0, 24));
		
		this.btnDivisao = new JButton("/");
		this.btnDivisao.setFont(new Font("Tahoma", 0, 24));
		
		this.btnIgual = new JButton("=");
		this.btnIgual.setFont(new Font("Tahoma", 0, 24));
		
		this.btnLimpar = new JButton("C");
		this.btnLimpar.setFont(new Font("Tahoma", 0, 24));
		
		this.painelCentral = new JPanel(new GridLayout(4, 4, 5, 5));
		this.painelCentral.add(btnNumero7);
		this.painelCentral.add(btnNumero8);
		this.painelCentral.add(btnNumero9);
		this.painelCentral.add(btnDivisao);
		
		this.painelCentral.add(btnNumero4);
		this.painelCentral.add(btnNumero5);
		this.painelCentral.add(btnNumero6);
		this.painelCentral.add(btnMultiplicacao);
		
		this.painelCentral.add(btnNumero1);
		this.painelCentral.add(btnNumero2);
		this.painelCentral.add(btnNumero3);
		this.painelCentral.add(btnSubtracao);
		
		this.painelCentral.add(btnNumero0);
		this.painelCentral.add(btnLimpar);
		this.painelCentral.add(btnSoma);
		this.painelCentral.add(btnIgual);
		
		this.add(painelCentral, BorderLayout.CENTER);
		
		this.setTitle("Calculadora");
		this.setSize(300, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
