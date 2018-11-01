import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class teste {

	int[] vetor = new int [100000];
	int i = 0;
	
	public void escrever () throws IOException {

		Random gerador = new Random();
		PrintWriter gravarArq = new PrintWriter("desordenado.txt");
		
		for (int i = 0; i < 100000; i++) {
			int x = gerador.nextInt(100000) + 1;
			gravarArq.println(x);
		}	
	}

	public void read () throws IOException{

		BufferedReader bufferedReader = null; 

		try {
			String linhaAtual;
			bufferedReader = new BufferedReader (new FileReader("desordenado.txt"));
			while ((linhaAtual = bufferedReader.readLine()) != null) {
					vetor[i] = Integer.parseInt(linhaAtual);
					i++;
			}
			
		} catch (Exception ex){
			System.out.println(ex.getMessage());
		} finally {
			bufferedReader.close();
		}
	}
	
	public void ordenarQuick() {
		long tempoInicio = System.currentTimeMillis();
		quicksort sorter = new quicksort();
		sorter.ordena(vetor);
		
		try {
			PrintWriter arqS = new PrintWriter ("ordenadoQuick.txt");
			
			for (int i = 0; i < vetor.length; i++) {
				arqS.println(vetor[i]);
		}
		
			arqS.close();
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		} 
		
		long tempoFinal = System.currentTimeMillis();
		
		long tempoTotal = tempoFinal - tempoInicio;
		
		System.out.println("Tempo Total: "+tempoTotal /1000d);	
	}
}

