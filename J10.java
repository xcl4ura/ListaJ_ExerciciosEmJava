package listaJ;

import java.util.Scanner;

/*Desenvolva um programa para realizar uma pesquisa de mercado sobre os autom�veis:
CORSA, PALIO e GOL. O programa dever� receber o voto de cada entrevistado e ao final dever�
apresentar a coloca��o, o total de votos e o percentual de votos de cada autom�vel. Os poss�veis
empates tamb�m dever�o ser verificados. O programa dever� realizar a pesquisa enquanto houver a
solicita��o de uma nova entrada de dados atrav�s da vari�vel RESP.*/

public class J10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Laura Xavier Chagas
		
		int cont=0, pessoa, car; 
		double perCor, perPal, perGol, corVot = 0, palVot = 0, golVot = 0;
		
		
		
		
		//Quantidade pessoas
		pessoa = sc.nextInt();
		
		
	
		if(pessoa>1){
			
		while(cont < pessoa) {

					
		System.out.println("Escolha um carro sendo: \n 1 (Corsa) \n 2 (Palio) \n 3 Gol ");
		car = sc.nextInt();
			
			if(car==1) {
				
			 corVot++;
				
			} else if (car==2) {
				
				palVot++;
				
				
			}else if (car==3) {
				
				golVot++;
				
				
			}
			
	
			cont++;
			
			
		}
		perCor = (corVot/pessoa)*100;
		perPal = (palVot/pessoa)*100;
		perGol = (golVot/pessoa)*100;
		
		System.out.println(perCor + "%");
		System.out.println(perPal + "%");
		System.out.println(perGol + "%");
		//
		
		}
		
			
			
		
		
		
		
		

	}

}
