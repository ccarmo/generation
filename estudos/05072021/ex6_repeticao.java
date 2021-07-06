package Teste;

import java.util.Scanner;

public class imprimeMedia {
    

   public static void main(String[] args) {
	  
      Scanner leia = new Scanner(System.in);
      int numero=1, somador=0,contador=0;
	  
      do 
      {
    	System.out.print("Digite um número (para sair digite 0): ");
    	numero = leia.nextInt();
    	System.out.println("");
    	if(numero%3 == 0) //verifica os números que são multiplos de 3 e já soma o numero digitado além de contar quantas vezes vai aparecer esses multiplos.
    	{
    	 somador = somador + numero;
    	 contador++;
    	}
      } while(numero != 0);
      
      System.out.println("\nA média da soma dos números digitados que são múltiplos de 3 é "+(somador/contador));
  }
}
