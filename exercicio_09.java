// Fa�a uma calculadora com um menu para que o usu�rio possa escolher qual opera��o realizar. 
// O menu deve se repetir na tela at� que o usu�rio escolhar sair. 

package exercicios03;

import java.util.Scanner; 

public class exercicio_09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		int opcao_menu = 0; 
		double operacao; 
		double num1; 
		double num2; 
		
		while ((opcao_menu < 1) || (opcao_menu > 5)) {
			
			System.out.println("\n---- CALCULADORA ----"); 
			System.out.println("1 - somar"); 
			System.out.println("2 - subtrair"); 
			System.out.println("3 - multiplicar"); 
			System.out.println("4 - dividir"); 
			System.out.println("5 - sair"); 
			System.out.print("Escolha uma op��o: "); 
			opcao_menu = entrada.nextInt(); 
			
			switch (opcao_menu) {
				case 1:
					System.out.print("Primeiro n�mero: "); 
					num1 = entrada.nextDouble(); 
					
					System.out.print("Segundo n�mero: "); 
					num2 = entrada.nextDouble(); 
					
					operacao = (num1 + num2); 
					System.out.println("\nResultado: " + operacao); 
					break; 
				
				case 2: 
					System.out.print("Primeiro n�mero: "); 
					num1 = entrada.nextDouble(); 
					
					System.out.print("Segundo n�mero: "); 
					num2 = entrada.nextDouble(); 
					
					operacao = (num1 - num2); 
					System.out.println("\nResultado: " + operacao); 
					break; 
				
				case 3: 
					System.out.print("Primeiro n�mero: "); 
					num1 = entrada.nextDouble(); 
					
					System.out.print("Segundo n�mero: "); 
					num2 = entrada.nextDouble(); 
					
					operacao = (num1 * num2); 
					System.out.println("\nResultado: " + operacao); 
					break; 
					
				case 4: 
					System.out.print("Primeiro n�mero: "); 
					num1 = entrada.nextDouble(); 
					
					System.out.print("Segundo n�mero: "); 
					num2 = entrada.nextDouble(); 
					
					operacao = (num1 / num2); 
					System.out.println("\nResultado: " + operacao); 
					break; 
				
				case 5: 
					System.out.println("\nVoc� saiu!"); 
			}
		}	
	}
}