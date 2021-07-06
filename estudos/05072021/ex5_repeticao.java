package Teste;

import java.util.Scanner;

public class imprimeSoma {
    

   public static void main(String[] args) {
	  
      Scanner leia = new Scanner(System.in);
      float numero=1, somador=0;
	  
      do 
      {
    	System.out.print("Digite um número (para sair digite 0): ");
    	numero = leia.nextFloat();
    	System.out.println("");
    	somador = somador + numero;
      } while(numero != 0);
      
      System.out.println("\nA soma dos números digitados é "+somador);
  }
}
