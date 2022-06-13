package listaJ;

import java.util.Scanner;

/*Desenvolva um programa para realizar uma pesquisa de cursos universit�rios para uma
Universidade. Os cursos que estar�o na pesquisa s�o: Ci�ncia da Computa��o, Direito e Letras. O
programa dever� receber o voto de cada entrevistado e ao final dever� apresentar a coloca��o, o
total de votos e o percentual de votos de cada curso. Os poss�veis empates tamb�m dever�o ser
verificados. O programa dever� realizar a pesquisa enquanto houver a solicita��o de uma nova
entrada de dados atrav�s da vari�vel RESP.*/

public class J9 {

	public static void main(String[] args) {
		
		//Laura Xavier Chagas
		
		Scanner sc = new Scanner(System.in);
		
		int cont=0, pessoa, curso; 
		double perComp, perDir, perLet, compVot = 0, dirVot = 0, letVot = 0;
		
		
		
		
		//Quantidade pessoas
		pessoa = sc.nextInt();
		
		
	
		if(pessoa>=1){
			
		while(cont < pessoa) {

					
		System.out.println("Escolha um curso sendo: \n 1 (Ci�ncias da Computa��o) \n 2 (Direito) \n 3 (Letras) ");
		curso = sc.nextInt();
			
			if(curso==1) {
				
			 compVot++;
				
			} else if (curso==2) {
				
				dirVot++;
				
				
			}else if (curso==3) {
				
				letVot++;
				
				
			}
			
	
			cont++;
			
			
		}
		perComp = (compVot/pessoa)*100;
		perDir = (dirVot/pessoa)*100;
		perLet = (letVot/pessoa)*100;
		
		if (perComp > perDir && perComp > perLet && perDir > perLet){
			
			//Comp Dir Let
			System.out.println(compVot + " Ci�ncias da Computa��o " + perComp + "% \n " + dirVot +  
			" Direito " + perDir + "%\n" + letVot + " Letras "+ perLet + "%");
			
		
			
		}else if (perComp > perDir && perComp > perLet && perLet > perDir){
			
			//Comp Let Dir
			System.out.println(compVot + " Ci�ncias da Computa��o " + perComp + "% \n " + letVot + 
			" Letras "+ perLet + "%\n" + dirVot +  " Direito " + perDir + "%" );
			
		
			
		}else if (perDir > perLet && perDir > perComp && perLet > perComp){
			
			//Dir Let Comp
			System.out.println(dirVot +  " Direito " + perDir + "%\n" + letVot + " Letras "+ perLet + "%\n" + compVot +
			" Ci�ncias da Computa��o " + perComp);
		
			
		}else if (perDir > perLet && perDir > perComp && perComp > perLet){
			
			//Dir Comp Let
			System.out.println(dirVot +  " Direito " + perDir + "%\n" + compVot +
			" Ci�ncias da Computa��o " + perComp + letVot + " Letras "+ perLet + "%");
			
			
		} else if(perLet > perDir && perLet > perComp && perComp > perDir) {
			
			//Let Comp Dir
			System.out.println(letVot + " Letras "+ perLet + "%\n" + compVot +
			" Ci�ncias da Computa��o " + perComp + "%\n" + dirVot +  " Direito " + perDir + "%");
			
		}else if(perLet > perDir && perLet > perComp && perDir > perComp) {
			
			//Let Dir Comp
			System.out.println(letVot + " Letras "+ perLet + "%\n" + dirVot + 
			" Direito " + perDir + "%\n" + compVot + " Ci�ncias da Computa��o " + perComp + "%");
			
			
		}else if (perComp == perDir || perComp == perLet || perDir == perLet) {
			
			
			System.out.println("EMPATE");
			
		}else {
			
			System.out.println("ERROR, TRY AGAIN \n ERRO, TENTE NOVAMENTE");
		}
		
		
		}
			

	}

}
