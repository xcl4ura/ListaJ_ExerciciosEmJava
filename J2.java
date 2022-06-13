package listaJ;

import java.util.Scanner;

/*Desenvolva um programa para ler um número e escrever todos os números de 0 até este
número, indicando se cada um é par ou ímpar.*/


public class J2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Laura Xavier Chagas
		
		int cont=-1;
		
		//Leitura de dado (numero)	
		int num = sc.nextInt();
		
		while(cont<num) {
			 
			cont++; 
		
			 if (cont % 2 == 0) { 
			System.out.println(cont + " par ");
			  
			
			 
		} if(cont % 2 == 1) {
			System.out.println(cont + " ímpar ");
			

	}
}
}
}