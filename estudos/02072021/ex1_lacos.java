package Teste;

import java.util.Scanner;


public class maiorNumero {


	public static void main(String[] args) {

    int numero, maior=0;

	  Scanner leia = new Scanner(System.in);

	  for(int contador=1;contador<=3;contador++) {
		  System.out.println("Insira um número: ");
		  numero = leia.nextInt();
		  if(numero > maior) {
			  maior = numero;
		  }
	  }

	  System.out.println("O maior número é: "+maior);

	}

}
