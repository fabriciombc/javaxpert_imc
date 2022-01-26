package imc;

import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		
//		Declaring variables
		int pesoDoUsuario;
		double alturaDoUsuario, imc;
		String nomeDoUsuario, email;
		
//		Read user keyboard
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Qual o seu nome? ");
		nomeDoUsuario = reader.nextLine();
		
		System.out.println("Qual o seu e-mail?");
		email = reader.nextLine();
		
//		Creating IMC variables
		System.out.print("\nDigite o seu peso: ");
		pesoDoUsuario = reader.nextInt();
		
		System.out.print("\nDigite sua altura: ");
		alturaDoUsuario = reader.nextDouble();
		
		reader.close();
		
		imc = pesoDoUsuario / (alturaDoUsuario * alturaDoUsuario);
		
		System.out.println("");
		System.out.println("\n" + nomeDoUsuario + ", seu imc e " + imc + "." );
		System.out.println("----------------------------");
		
		
		// Determinar a classificacao do IMC
		if (imc < 18.5) {
			System.out.println("Voce esta abaixo do peso!!");
		} else if (imc >= 18.5 && imc <= 25) {
			System.out.println("Peso normal!!");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Sobrepeso!");
			
		}

	}

}
