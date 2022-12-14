// Faça um programa que imprima na tela apenas os números PARES entre 1 e 50.

package exercicios03;

public class exercicio_06 {

	public static void main(String[] args) {
		
		int numero = 1; 
		
		while(numero < 51) {
			if (numero % 2 == 0) {
				System.out.println(numero); 
			}
			numero = numero + 1; 
		}
	}
}