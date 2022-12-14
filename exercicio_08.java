// Peça ao usuário que digite um número positivo, caso contrário, continue pedindo até que a condição seja atendida.
// Utilize do while. 

package exercicios03;

import java.util.Scanner; 

public class exercicio_08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		int numero;
		
		do {
			System.out.print("Digite um número positivo: ");
			numero = entrada.nextInt(); 
			
		} while (numero < 0);
	}
}