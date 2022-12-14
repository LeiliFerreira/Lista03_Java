// Faça um programa que leia e valide as seguintes informações:
//       Nome: maior que 3 caracteres;
//       Idade: entre 0 e 150;
//       Salário: maior que zero;
//       Sexo: 'f' ou 'm';
//       Estado Civil: 's', 'c', 'v', 'd'; 

// OBS: Resolver bug na parte de pedir ao usuário que informe seu sexo. 

package exercicios03;

import java.util.Scanner; 

public class exercicio_10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		String nome; 
		int quant_caract_nome;
		int idade; 
		double salario; 
		String sexo; 
		String estado_civil; 
		
		System.out.print("Insira o nome: "); 
		nome = entrada.nextLine(); 
		quant_caract_nome = nome.length(); 
		
		while(quant_caract_nome <= 3) {
			System.out.print("Insira um nome válido: "); 
			nome = entrada.nextLine(); 
			quant_caract_nome = nome.length(); 
		}
		
		System.out.print("Informe a idade: ");
		idade = entrada.nextInt(); 
		
		while((idade < 0) || (idade > 150)) {
			System.out.print("Informe uma idade válida: ");
			idade = entrada.nextInt(); 
		}
		
		System.out.print("Insira o salário: R$");
		salario = entrada.nextDouble(); 
		
		while(salario <= 0) {
			System.out.print("O salário deve ser acima de zero: R$ ");
			salario = entrada.nextDouble(); 
		}
		
		// BUG...
		System.out.print("Informe o sexo: F / M "); 
		sexo = entrada.nextLine().toUpperCase(); 
		
		while(!sexo.equals("F") && !sexo.equals("M")) {
			System.out.print("Informe o sexo válido: F / M "); 
			sexo = entrada.nextLine().toUpperCase(); 	
		}
		//
		
		System.out.print("Informe o estado civil: S / C / V / D"); 
		estado_civil = entrada.nextLine().toUpperCase(); 
		
		while(!estado_civil.equals("S") && !estado_civil.equals("C") && !estado_civil.equals("V") && !estado_civil.equals("D")) {
			System.out.print("Informe um estado civil válido:  S / C / V / D"); 
			estado_civil = entrada.nextLine().toUpperCase(); 
		}
		
		System.out.println("Validação realizada com sucesso!"); 
		
	}

}