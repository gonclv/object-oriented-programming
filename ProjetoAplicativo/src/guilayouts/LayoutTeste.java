package guilayouts;

import java.util.Scanner;

import javax.swing.JFrame;

public class LayoutTeste {

	public static void main(String[] args) {
		JFrame window = null;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== TESTE DE LAYOUTS =====");
		System.out.println("Digite opção: ");
		System.out.println("1 - Flow Layout");
		System.out.println("2 - Border Layout");
		System.out.println("3 - Grid Layout");
		int option = input.nextInt();
		
		switch(option) {
		case 1: {
			window = new FlowLayoutFrame();
			window.setVisible(true);
			break;
		}
		case 2: {
			window = new BorderLayoutFrame();
			window.setVisible(true);
			break;
		}
		case 3: {
			window = new GridLayoutFrame();
			window.setVisible(true);
			break;
		}
		}
		
		input.close();
	}
}
