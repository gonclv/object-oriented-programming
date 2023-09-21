package aula06.exercicio2;

public class ClinicaTeste {

	public static void main(String[] args) {
		Clinica clinica = new Clinica("1111111", "Clinica dos Pets");
		
		clinica.cadastrar("Luna", "Persa");
		clinica.cadastrar("Rex", "Vira-lata");
		clinica.cadastrar("Ponei", "Avelin");
		
		clinica.listarAnimais();
	}
}
