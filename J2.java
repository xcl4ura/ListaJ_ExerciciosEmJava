package listaJ;

import java.util.Scanner;

/*Desenvolva um programa para ler um n�mero e escrever todos os n�meros de 0 at� este
n�mero, indicando se cada um � par ou �mpar.*/


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
			System.out.println(cont + " �mpar ");
			

	}
}
}
}