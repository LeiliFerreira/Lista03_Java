// Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inv�lido e continue 
// pedindo at� que o usu�rio informe um valor v�lido.

package exercicios03;

import java.util.Scanner; 

public class exercicio_02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		int nota; 
		
		System.out.println("Insira uma nota de 0 � 10: "); 
		nota = entrada.nextInt(); 
		
		while ((nota < 0) || (nota > 10)) {
			System.out.println("\nInsira uma nota de 0 � 10: "); 
			nota = entrada.nextInt(); 	
		}
	}
}

