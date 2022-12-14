// Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, 
// mostrando uma mensagem de erro e voltando a pedir as informações.

package exercicios03;

import java.util.Scanner; 

public class exercicio_03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		String nome_usuario; 
		String senha; 
		
		System.out.print("Novo nome de usuário: "); 
		nome_usuario = entrada.nextLine(); 
		
		System.out.print("Nova senha: "); 
		senha = entrada.nextLine(); 
		
		while(nome_usuario.equals(senha))  {
			System.out.println("\nA senha não pode ser igual ao nome de usuário!"); 
			System.out.print("Insira uma nova senha: "); 
			senha = entrada.nextLine(); 
		}
		
		System.out.println("Usuário criado com sucesso!"); 
	}
}
