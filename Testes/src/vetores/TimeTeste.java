package vetores;

public class TimeTeste {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Neymar", 11111);
		Pessoa pessoa2 = new Pessoa("Messi", 22222);
		Pessoa pessoa3 = new Pessoa("Vinicius Jr", 33333);
		Pessoa pessoa4 = new Pessoa("Cristiano Ronaldo", 44444);
		Pessoa pessoa5 = new Pessoa("Pelé", 55555);
		
		Pessoa pessoas[] = {pessoa1, pessoa2, pessoa3, pessoa4, pessoa5};
		
		Time time1 = new Time("Operário", "Ponta Grossa", pessoas);
		System.out.println(time1);
	}
}
