package aula06.variaveisdeclasse;

public class GalinhaTeste {

	public static void main(String[] args) {
		Galinha galinha1 = new Galinha("Giselda");
		Galinha galinha2 = new Galinha("Matilde");
		Galinha galinha3 = new Galinha("Clotilde");
		
		for(int i = 0; i < 5; i++) {
			galinha1.botar();
		}
		
		galinha2.botar();
		
		for(int i = 0; i < 3; i++) {
			galinha3.botar();
		}
		
		System.out.println(galinha1.nome + " botou " + galinha1.quantOvos + " ovo(s).");
		System.out.println(galinha2.nome + " botou " + galinha2.quantOvos + " ovo(s).");
		System.out.println(galinha3.nome + " botou " + galinha3.quantOvos + " ovo(s).");
		System.out.println("Total de ovos da granja: " + Galinha.quantOvosGranja);
	}
}
