// Pe�a um n�mero ao usu�rio e mostre sua tabuada de adi��o, subtra��o e multiplica��o utilizando for. 

package exercicios03;

import java.util.Scanner; 

public class exercicio_07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		int numero; 
		int i;
		int soma; 
		int multiplicacao; 

		System.out.println("Digite um n�mero: "); 
		numero = entrada.nextInt(); 
		
		System.out.println("\nSOMA"); 
		for(i = 1; i < 11; i++ ) {
			soma = numero + i; 
			System.out.println("" + numero + " + " + i + "= " + "" + soma); 
		}
		
		System.out.println("\nSUBTRA��O"); 
		for(i = 1; i < 11; i++ ) {
			soma = numero - i; 
			System.out.println("" + numero + " - " + i + "= " + "" + soma); 
		}
		
		System.out.println("\nMULTIPLICA��O"); 
		for(i = 1; i < 11; i++ ) {
			multiplicacao = numero * i; 
			System.out.println("" + numero + " x " + i + "= " + "" + multiplicacao); 
		}
	}
}