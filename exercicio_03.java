// Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a senha igual ao nome do usu�rio, 
// mostrando uma mensagem de erro e voltando a pedir as informa��es.

package exercicios03;

import java.util.Scanner; 

public class exercicio_03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		String nome_usuario; 
		String senha; 
		
		System.out.print("Novo nome de usu�rio: "); 
		nome_usuario = entrada.nextLine(); 
		
		System.out.print("Nova senha: "); 
		senha = entrada.nextLine(); 
		
		while(nome_usuario.equals(senha))  {
			System.out.println("\nA senha n�o pode ser igual ao nome de usu�rio!"); 
			System.out.print("Insira uma nova senha: "); 
			senha = entrada.nextLine(); 
		}
		
		System.out.println("Usu�rio criado com sucesso!"); 
	}
}
