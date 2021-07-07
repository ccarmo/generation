package Teste;
public class armazenaVetor{
	
	
	public static void main(String[] args)
	{
	   	//int A[] = {1,0,5,-2,-5,7}
		
		//(a) Atribuir os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
	   	int A[] = new int[]{1,0,5,-2,-5,7};
		int soma;
	    
		/*(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições
		A[0], A[1] e A[5] do vetor e mostre na tela esta soma.*/
		soma = A[0] + A[1] + A[5];
		
		//(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
		A[4] = 100;
		
		//(d) Mostre na tela cada valor do vetor A, um em cada linha.
		for(int endereco=0;endereco<6;endereco++)
		{
		   System.out.println("O valor na posição "+endereco+" do vetor A é: "+A[endereco]);	
		}
		
		
	}
}