
public class quicksort {

	private int vetor[];
	private int tamanhoVetor;
	
	public void ordena(int[] vetorEntrada) {
		if (vetorEntrada == null || vetorEntrada.length == 0) {
			return;
		}
		this.vetor = vetorEntrada;
		tamanhoVetor = vetor.length;
		quicksort(0, tamanhoVetor-1);
	}
	
	private void quicksort(int menor, int maior) {
		int i = menor;
		int j = maior;
		int pivo = vetor[menor+(maior-menor)/2];
		
		while (i <= j) {
			while (vetor[i] < pivo) {
				i++;
			}
			while (vetor[j] > pivo) {
				j--;
			}
			if (i <= j) {
				trocaOrdem(i, j);
				i++;
				j--;
			}
		}
			
		if (menor < j) 
			quicksort(menor, j);
		if (i < maior) 
			quicksort(i, maior);
	}
	
		private void trocaOrdem(int i, int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}
		
		public static void main(String a[]){

			quicksort sorter = new quicksort();
			int[] input = {24,2,45,20,56,75,2,56,99,53,12};
			sorter.ordena(input);
			for(int i = 0; i < input.length; i++){
				System.out.print(input[i]);
				System.out.print(" ");
			}
		}

}
