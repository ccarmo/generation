package model;

import java.util.Scanner;
 
public class SerHumano {
	
	
	public static void main(String[] args){
		
      boolean interacao;
	  Scanner leia = new Scanner(System.in);
	  int escolha;
	  do{
		
	    System.out.println("Voc� est� num s�tio e cuida de tr�s lindos bichinhos: ");
		System.out.println("Mas voc� est� em d�vida se quer interagir com eles ou ir fazer o almo�o. O que voc� quer fazer?");
		System.out.println("1 - Ir fazer o almo�o");
		System.out.println("2 - Interagir com eles");
		escolha = leia.nextInt();
		    if(escolha == 1) 
			{
				interacao = false;
				System.out.println("Voc� n�o tem cora��o!");
				System.out.println("");
			}
			else
			{
				interacao = true;
				
				System.out.println("Com qual animal voc� quer interagir?");
				System.out.println("1 - Um labrador caramelo");
				System.out.println("2 - Um cavalo branco");
			    System.out.println("3 - Uma pregui�a que fica numa �rvore");
				escolha = leia.nextInt();
				switch(escolha){
					case 1:
					  Cachorro labrador = new Cachorro("Pa�oca",2,1.2f,40.0f,"Labrador");
					  labrador.correr();
					  labrador.emitirSom();
					  labrador.brincar();
				    break;
				}	
		    }
	   } while (interacao == false);
	}
}