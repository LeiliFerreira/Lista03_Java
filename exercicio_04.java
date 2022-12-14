// Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. 
// Depois modifique o programa para que ele mostre os números um ao lado do outro.

package exercicios03;
 
public class exercicio_04 {

	public static void main(String[] args) {
		
		int q1 = 1; 
		int q2 = 1;
		
		while(q1 < 21) {
			System.out.println(q1); 
			q1 = q1 + 1; 
		}	
		
		System.out.println(""); 
		
		while(q2 < 21) {
			System.out.print(" " + q2); 
			q2 = q2 + 1; 
		}
	}
}