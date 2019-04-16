package bubble_sort;// pacote onde contem a classe bubbleSort

public class bubbleSort { // Clasee pública para acesso de todos 

	public static void main(String[] args) { // modificador público, método static(classe não necessita ser instanciada),
		//void (retorna qualquer tipo do projeto e main é o nome do metodo(pré inicializado
		// com nome main).
		
		
		int[] numeros = {2, 10, 3, 7, 1};// numerosor pré definido com 5 posições
		int aux = 0; // termo para auxiliar na comparação durante o sort
		int c = 0; //igual a zero para indicar que o inicio do laço de repetição no for começa com zero	      
	    System.out.println("numerosor desordenado: "); //indica que será mostrado os valores inseridos antes do sort
	    for(c = 0; c<5; c++){ //for para incrementar 5 posições no numerosor
	        System.out.print(" "+numeros[c]); // mostra o valor de cada posição no numerosor
	    }
	    System.out.println(" "); // aplica espaço entre caracteres para ficar mais visual
	     
	    for(c = 0; c<5; c++){ //for para incrementar 5 posições no numerosor
	        for(int j = 0; j<4; j++){ //for auxiliar para as comparações
	            if(numeros[j] > numeros[j + 1]){ // condição para a comparação( se o valor do numerosor na posição "j" for maior que o próximo numerosor 
	                aux = numeros[j]; // Então o valor do numerosor é atribuido ao termo auxiliar para ser utilzado como "termo maior" na comparação 
	                numeros[j] = numeros[j+1]; // Aribui a próxima variavel o valor de maior termo para a próxima comparação 
	                numeros[j+1] = aux; //
	            }
	        }
	    }
	    System.out.println("numerosor organizado:"); // indica que serão mostrados os valores ordenados 
	    for(c = 0; c<5; c++){ //for para incrementar 5 posições no numerosor
	        System.out.println(" "+numeros[c]); // mostra valor de cada posicão no numerosor
	    }

	}

}
