package listaJ;

import java.util.Scanner;

/*Desenvolva um programa para ler um número e calcular o fatorial deste número.
Fatorial: F(4) = 4! = 4*3*2*1 = 24
 F(0) = 0! = 1 */



public class J11 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//Laura Xavier Chagas
	
		int fat=1, num, cont;
		
		//entrada
		num = sc.nextInt();
		
		cont = num;
				
		while(cont > 1) {
			
			fat = (fat*cont);
			
			cont--;
			
			System.out.println(fat);
			
		}
		
		
		
		

	
	}
	

}