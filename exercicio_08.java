// Pe�a ao usu�rio que digite um n�mero positivo, caso contr�rio, continue pedindo at� que a condi��o seja atendida.
// Utilize do while. 

package exercicios03;

import java.util.Scanner; 

public class exercicio_08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		int numero;
		
		do {
			System.out.print("Digite um n�mero positivo: ");
			numero = entrada.nextInt(); 
			
		} while (numero < 0);
	}
}