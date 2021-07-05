package Teste;

import java.util.Scanner;

public class imprimeParImpar {
    

	public static void main(String[] args) {
	  
	  Scanner leia = new Scanner(System.in);
	  float numero;
	  
      for(int contador = 1;contador<=10;contador++) {
    	  System.out.println("\nDigite um número:");
    	  numero = leia.nextFloat();  
    	  if(numero%2 == 0) {
    		System.out.println("O "+numero+" é par");
    	  } else {
    		System.out.println("O "+numero+" é impar");
    	  }
     }  		  	  
  }
}