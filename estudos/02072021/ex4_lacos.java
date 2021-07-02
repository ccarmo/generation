package Teste;

import java.util.Scanner;
import java.lang.Math;


public class verificaNumero {
    

	public static void main(String[] args) {
	  
      float numero;
	  Scanner leia = new Scanner(System.in);
	  
	  System.out.println("Insira um numero: ");
	  numero = leia.nextInt();
	  
	  if(numero%2 == 0) {
		  System.out.printf("%.2f é um número par e sua raiz quadrado tem o valo de %.2f",numero,Math.sqrt(numero));
	  } else {
		  System.out.printf("%.2f é um número impar e seu valor elevado ao quadrado é de %.2f",numero,Math.pow(numero,2));
	  }		  	  
  }

}