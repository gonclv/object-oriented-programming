package aula05.exercicio;

public class DataTeste {

	public static void main(String[] args) {
		Data data1 = new Data(25, 8, 2023);
		Data data2 = new Data(8, 2023);
		Data data3 = new Data(25);
		Data data4 = new Data();
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
	}
}
