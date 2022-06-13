package listaJ;

import java.util.Scanner;

/*Desenvolva um programa para realizar uma pesquisa de cursos universitários para uma
Universidade. Os cursos que estarão na pesquisa são: Ciência da Computação, Direito e Letras. O
programa deverá receber o voto de cada entrevistado e ao final deverá apresentar a colocação, o
total de votos e o percentual de votos de cada curso. Os possíveis empates também deverão ser
verificados. O programa deverá realizar a pesquisa enquanto houver a solicitação de uma nova
entrada de dados através da variável RESP.*/

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

					
		System.out.println("Escolha um curso sendo: \n 1 (Ciências da Computação) \n 2 (Direito) \n 3 (Letras) ");
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
			System.out.println(compVot + " Ciências da Computação " + perComp + "% \n " + dirVot +  
			" Direito " + perDir + "%\n" + letVot + " Letras "+ perLet + "%");
			
		
			
		}else if (perComp > perDir && perComp > perLet && perLet > perDir){
			
			//Comp Let Dir
			System.out.println(compVot + " Ciências da Computação " + perComp + "% \n " + letVot + 
			" Letras "+ perLet + "%\n" + dirVot +  " Direito " + perDir + "%" );
			
		
			
		}else if (perDir > perLet && perDir > perComp && perLet > perComp){
			
			//Dir Let Comp
			System.out.println(dirVot +  " Direito " + perDir + "%\n" + letVot + " Letras "+ perLet + "%\n" + compVot +
			" Ciências da Computação " + perComp);
		
			
		}else if (perDir > perLet && perDir > perComp && perComp > perLet){
			
			//Dir Comp Let
			System.out.println(dirVot +  " Direito " + perDir + "%\n" + compVot +
			" Ciências da Computação " + perComp + letVot + " Letras "+ perLet + "%");
			
			
		} else if(perLet > perDir && perLet > perComp && perComp > perDir) {
			
			//Let Comp Dir
			System.out.println(letVot + " Letras "+ perLet + "%\n" + compVot +
			" Ciências da Computação " + perComp + "%\n" + dirVot +  " Direito " + perDir + "%");
			
		}else if(perLet > perDir && perLet > perComp && perDir > perComp) {
			
			//Let Dir Comp
			System.out.println(letVot + " Letras "+ perLet + "%\n" + dirVot + 
			" Direito " + perDir + "%\n" + compVot + " Ciências da Computação " + perComp + "%");
			
			
		}else if (perComp == perDir || perComp == perLet || perDir == perLet) {
			
			
			System.out.println("EMPATE");
			
		}else {
			
			System.out.println("ERROR, TRY AGAIN \n ERRO, TENTE NOVAMENTE");
		}
		
		
		}
			

	}

}
