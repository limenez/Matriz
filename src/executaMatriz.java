
public class executaMatriz {

	public static void main(String[] args) {
		//Criando uma variável do tipo Matriz
		String[] carros= {"HB20","Uno","Gol","Onix","Compass","Cruze","Spin","Fusca","Tracker","C3"};
		
		//Mostrado o conteúdo da variável do tipo Matriz
		/*System.out.println(carros[0]);
		System.out.println(carros[1]);
		System.out.println(carros[2]);
		System.out.println(carros[3]);
		System.out.println(carros[4]);*/
		
		//Criando a quantidade de registros de uma matriz
		/*System.out.println(carros.length);*/
		
		int contagem=1;
		System.out.println("Quantidade de carro: "+ carros.length);
		//criando um laço de repetição para mostrar os registros
		for(int contador=0;contador<carros.length;contador++) {
			System.out.println((contagem+contador)+" - "+carros[contador]);
		}
		
	}

}
