package Teste;

import java.util.ArrayList;
import java.util.Scanner;

public class trabalhaVetor {
	

	public static void main(String[] args) {
		
		
		/*criação das variáveis, vetores e ArrayList. O exercicio não informa como deve ser mostrados os números pares e impares digitados, 
		entao considerei que não teria problema em utilizar ArrayList*/
		ArrayList<Integer> numerospares = new ArrayList<>(6);
		ArrayList<Integer> numerosimpares = new ArrayList<>(6);
		int[] vetor = new int[6];
		int somapar=0, contaimpar=0;
		Scanner leia = new Scanner(System.in);
		
		//parte do programa que realiza a lógica para calcular os quatro requisitos pedidos
		for (int endereco=0;endereco<6;endereco++) 
		{
		   System.out.println("Digite um número: ");
		   vetor[endereco] = leia.nextInt();
				
		   if(vetor[endereco]%2 == 0)
		   {
		     numerospares.add(vetor[endereco]); 
		     somapar = somapar + vetor[endereco];
		   } 
		   else 
		   {
			 numerosimpares.add(vetor[endereco]);
			 contaimpar++;
		   }
	    }
		
		
		System.out.println("");
		System.out.print("Numeros pares digitados: ");
		for (Integer numeropar : numerospares) 
		{
			System.out.print(numeropar+" ");
		}
		
		System.out.println("");
		System.out.println("A soma dos números pares é: "+somapar);
		
		System.out.print("Numeros ímpares digitados: ");
		for (Integer numeroimpar : numerosimpares) 
		{
			System.out.print(numeroimpar+" ");
		}
		System.out.println("");
		System.out.println("A quantidade de números ímpares digitas é: "+contaimpar);
	}
}