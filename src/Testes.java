
public class Testes {

	public static void main(String[] args) {
		//Criando uma variável do tipo Matriz
		String[] frutas= {"banana","mamão","goiaba","pitaya","laranja","limão","melancia","manga","abacaxi","uva"};
		
			
		int contagem=1;
		System.out.println("Quantidade de frutas: "+ frutas.length);
		//criando um laço de repetição para mostrar os registros
		for(int contador=0;contador<frutas.length;contador++) {
			System.out.println((contagem+contador)+" - "+frutas[contador]);
		}
		
	}

}
