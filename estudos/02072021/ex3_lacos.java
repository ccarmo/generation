package Teste;

import java.util.Scanner;
import java.lang.Math;


public class verificaIdade {
    

	public static void main(String[] args) {
	  
      int idade;
	  Scanner leia = new Scanner(System.in);
	  
	  System.out.println("Insira uma idade entre 10 e 25 anos: ");
	  idade = leia.nextInt();
	  
	  //caso usuário insira uma idade fora do intervalo pedido, o sistema será finalizado.
	  if (idade < 10 || idade > 25) {
		  System.out.println("Idade fora do intervalo pedido, o sistema será finalizado");
		  System.exit(0);
	  }
	  
	  if (idade >= 10 && idade <= 14) {
		  System.out.println("Sua categoria é: infantil");
	  } else if (idade >= 15 && idade <= 17) {
		  System.out.println("Sua categoria é: juvenil");
	  } else {
		  System.out.println("Sua categoria é: adulto");
	  }
	  		  	  
  }

}
