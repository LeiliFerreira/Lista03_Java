// Use switch/case para pedir um n�mero de 1 � 7 ao usu�rio e mostrar na tela o dia respectivo da semana. 

package exercicios03;

import java.util.Scanner; 

public class exercicio_01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		int numero; 
		
		System.out.print("Insira um n�mero de 1 � 7: "); 
		numero = entrada.nextInt(); 
		
		switch(numero) {
			case 1: 
				System.out.println("Domingo"); 
				break; 
			case 2: 
				System.out.println("Segunda"); 
				break; 
			case 3: 
				System.out.println("Ter�a"); 
				break; 
			case 4: 
				System.out.println("Quarta"); 
				break; 
			case 5: 
				System.out.println("Quinta"); 
				break; 
			case 6: 
				System.out.println("Sexta"); 
				break; 
			case 7: 
				System.out.println("S�bado"); 
				break; 
			default: 
				System.out.println("Inv�lido"); 
		}

	}

}