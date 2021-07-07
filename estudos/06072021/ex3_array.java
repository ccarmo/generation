package Teste;

import java.util.Scanner;

public class imprimeMatriz {
	
	public static void main(String[] args) 
	{
	  int[][] matriz = new int[3][3];
	  Scanner leia = new Scanner(System.in);
	  int conta=0;
	  
	  for (int linha=0;linha<3;linha++)
	  {
		for(int coluna=0;coluna<3;coluna++){
		  System.out.println("Digite um número: ");
		  matriz[linha][coluna] = leia.nextInt();
		  if (matriz[linha][coluna] > 10){
			 conta++; //realiza a contagem de quantos numeros sao maiores que 10
			  
		  }
		}
	  }
	  
      System.out.println("A quantidade de números maiores que 10 é: "+conta);	  
	}
}