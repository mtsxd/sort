import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class executavel {

	public static void main(String[] args) throws IOException{
	
		
		teste teste = new teste();
		int opcao;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog
					("1 - Gerar n�meros aleat�rios \n"
				    +"2 - Quicksort \n"
				    +"3 - Mergesort \n"
				    +"4 - Shellsort \n"
				    +"5 - Compara��o \n"
				    +"6 - Informa��es \n"
				    +"7 - Sair") );
			
			switch (opcao) {
			case 1: 
				teste.escrever();
				System.out.println("N�meros gerados com sucesso!");
				break;
			case 2:
				teste.read();
				teste.ordenarQuick();
				System.out.println("Ordenados com sucesso!");
				break;
			case 3:
				teste.read();
				//teste.ordenarMerge();
				System.out.println("Ordenados com sucesso!");
				break;
			case 4:
				teste.read();
				//teste.ordenarShell();
				System.out.println("Ordenados com sucesso!");
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				System.out.println("Op��o Inv�lida!");
				break;
			}
		} while (opcao != 7);
		
		
	}
}
