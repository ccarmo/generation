package Teste;

import java.util.Scanner;


public class ordemCrescente {
    

	public static void main(String[] args) {
	  
      int auxiliar;
	  Scanner leia = new Scanner(System.in);
	  
	  //quantifica o tamanho do meu vetor
	  System.out.println("Quantos números você gostaria de inserir?");
	  int numero[] = new int[leia.nextInt()];
	  
	  //inserir os dados dentro do vetor
	  for(int contador=0;contador<numero.length;contador++) {
		  System.out.println("Insira um número: ");  
		  numero[contador] = leia.nextInt();
		  }
	  
	
	  //lógica para organizar os números em ordem crescente
	  for(int fixo=0;fixo<numero.length;fixo++) {
		  for(int comparador=0;comparador<numero.length;comparador++) {
			  if(numero[fixo] < numero[comparador]) {
				  auxiliar = numero[comparador];
				  numero[comparador] = numero[fixo];
				  numero[fixo] = auxiliar; 
			  }
		  }
	   }
	  
	  //exibe os números em ordem crescente
	  System.out.println("\nOs número digitados em ordem crescente são: \n");
	  for(int contador=0;contador<numero.length;contador++) {
		  System.out.println("\t "+numero[contador]);
	  }
	  

	  
			  	  
  }

}
