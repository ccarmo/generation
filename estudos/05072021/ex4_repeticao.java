package Teste;

import java.util.Scanner;

public class realizaPesquisa {
    

	public static void main(String[] args) {
	  
	  Scanner leia = new Scanner(System.in);
	  int qtd_pessoas=1,idade=0, escolha_sexo=0,escolha_perso,contador_calma=0,contador_femnervosa=0,contador_homagressivo=0,contador_outcalmo=0,contador40=0,contador18=0;
	  
      while (qtd_pessoas >= 1 && qtd_pessoas <= 150) {
    	  
    	  //parte de inserção dos dados pelo usuário
    	  do 
    	  {
    	   System.out.print("Qual a sua idade (não é possivel colocar idade negativa): ");
    	   idade = leia.nextInt();
    	   System.out.println("");
    	  } while (idade < 1 || idade > 130); //utilizei esse do..while para evitar que usuário coloque idade negativa
    	  
    	  do 
    	  {
    	   System.out.println("Qual sua identidade de genero (apenas digite 1, 2 ou 3): ");
    	   System.out.println("1 - Feminino");
    	   System.out.println("2 - Masculino");
    	   System.out.println("3 - Outros");
    	   System.out.print("Digite o número: ");
    	   System.out.println("");
    	   escolha_sexo = leia.nextInt();
    	  } while (escolha_sexo != 1 && escolha_sexo != 2 && escolha_sexo != 3); //utilizei esse do..while para evitar que usuario coloque alguma opção fora do pedido
    	  
    	  do
    	  {
    	   System.out.println("Qual é seu temperamento (apenas digite 1, 2 ou 3): ");
    	   System.out.println("1 - Calma");
    	   System.out.println("2 - Nervosa");
    	   System.out.println("3 - Agressiva");
    	   System.out.print("Digite o número: ");
    	   escolha_perso = leia.nextInt();
    	   System.out.println("");
    	  } while (escolha_perso != 1 && escolha_perso != 2 && escolha_perso != 3); //utilizei esse do..while para evitar que usuario coloque alguma opção fora do pedido
    	 	  
    	  //parte do codigo que irá verificar as condições pedidas dos grupos de pessoas
    	  if (escolha_perso == 1)
    	  {
    		contador_calma++;
    	  }
    	  
    	  if(escolha_sexo == 1 && escolha_perso == 2)
    	  {
    	    contador_femnervosa++	;  
    	  }
    	  
    	  if(escolha_sexo == 2 && escolha_perso == 3)
    	  {
    		contador_homagressivo++;
    	  }
    	  
    	  if(escolha_sexo == 3 && escolha_perso ==1) 
    	  {
    		contador_outcalmo++;
    	  }
    	  
    	  if(idade > 40 && escolha_perso == 2) 
    	  {
    		contador40++;
    	  }
    	  
    	  if(idade < 18 && escolha_perso == 1)
    	  {
    		contador18++;
    	  }
    	  
    	  qtd_pessoas++;
      }
      
      System.out.println("");
      System.out.println("###### Resultados Finais ######");
      System.out.println("Número de pessoas calmas: "+contador_calma);
      System.out.println("Número de mulheres nervosas: "+contador_femnervosa);
      System.out.println("Número de homens agressivos: "+contador_homagressivo++);
      System.out.println("Número outros calmos: "+contador_outcalmo++);
      System.out.println("Número de pessoas acima dos 40 anos e nervosas: "+contador40++);
      System.out.println("Número de pessoas calmas com menos de 18 anos: "+contador18++);
      
  }
}
