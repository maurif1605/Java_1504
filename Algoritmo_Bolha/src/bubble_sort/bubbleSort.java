package bubble_sort;// pacote onde contem a classe bubbleSort

public class bubbleSort { // Clasee p�blica para acesso de todos 

	public static void main(String[] args) { // modificador p�blico, m�todo static(classe n�o necessita ser instanciada),
		//void (retorna qualquer tipo do projeto e main � o nome do metodo(pr� inicializado
		// com nome main).
		
		
		int[] numeros = {2, 10, 3, 7, 1};// numerosor pr� definido com 5 posi��es
		int aux = 0; // termo para auxiliar na compara��o durante o sort
		int c = 0; //igual a zero para indicar que o inicio do la�o de repeti��o no for come�a com zero	      
	    System.out.println("numerosor desordenado: "); //indica que ser� mostrado os valores inseridos antes do sort
	    for(c = 0; c<5; c++){ //for para incrementar 5 posi��es no numerosor
	        System.out.print(" "+numeros[c]); // mostra o valor de cada posi��o no numerosor
	    }
	    System.out.println(" "); // aplica espa�o entre caracteres para ficar mais visual
	     
	    for(c = 0; c<5; c++){ //for para incrementar 5 posi��es no numerosor
	        for(int j = 0; j<4; j++){ //for auxiliar para as compara��es
	            if(numeros[j] > numeros[j + 1]){ // condi��o para a compara��o( se o valor do numerosor na posi��o "j" for maior que o pr�ximo numerosor 
	                aux = numeros[j]; // Ent�o o valor do numerosor � atribuido ao termo auxiliar para ser utilzado como "termo maior" na compara��o 
	                numeros[j] = numeros[j+1]; // Aribui a pr�xima variavel o valor de maior termo para a pr�xima compara��o 
	                numeros[j+1] = aux; //
	            }
	        }
	    }
	    System.out.println("numerosor organizado:"); // indica que ser�o mostrados os valores ordenados 
	    for(c = 0; c<5; c++){ //for para incrementar 5 posi��es no numerosor
	        System.out.println(" "+numeros[c]); // mostra valor de cada posic�o no numerosor
	    }

	}

}
