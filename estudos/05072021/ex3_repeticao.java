package Teste;

import java.util.Scanner;

public class imprimeIdade {
    
  public static void main(String[] args) {
	  
      Scanner leia = new Scanner(System.in);
      int idade=0,contador21=0,contador50=0;
	  
      while (idade != -99) 
      {
    	 System.out.println("Digite uma idade (para sair digite -99): ");
    	 idade = leia.nextInt();
    	 if (idade < 21 && idade < 1 && idade != -99 ) //não pode ser inseridos idades negativas
    	 {
    	   contador21++;
    	 }
    	 if (idade > 50 && idade < 130) //aqui criei um limite nao proposto no exercicios apenas para evitar numeros exagerados (ex: 1000,2000..) 
    	 {
    	   contador50++;
    	 }
       }
      
       System.out.println("Quantas pessoas tem menos de 21 anos?"+ contador21);
       System.out.println("Quantas pessoas tem mais de 50 anos?"+ contador50);
       		  	  
  }
}
