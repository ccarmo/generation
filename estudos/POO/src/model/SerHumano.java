package model;

import java.util.Scanner;
 
public class SerHumano {
	
	
	public static void main(String[] args){
		
      boolean interacao;
	  Scanner leia = new Scanner(System.in);
	  int escolha;
	  do{
		
	    System.out.println("Você está num sítio e cuida de três lindos bichinhos: ");
		System.out.println("Mas você está em dúvida se quer interagir com eles ou ir fazer o almoço. O que você quer fazer?");
		System.out.println("1 - Ir fazer o almoço");
		System.out.println("2 - Interagir com eles");
		escolha = leia.nextInt();
		    if(escolha == 1) 
			{
				interacao = false;
				System.out.println("Você não tem coração!");
				System.out.println("");
			}
			else
			{
				interacao = true;
				
				System.out.println("Com qual animal você quer interagir?");
				System.out.println("1 - Um labrador caramelo");
				System.out.println("2 - Um cavalo branco");
			    System.out.println("3 - Uma preguiça que fica numa Árvore");
				escolha = leia.nextInt();
				switch(escolha){
					case 1:
					  Cachorro labrador = new Cachorro("Paçoca",2,1.2f,40.0f,"Labrador");
					  labrador.correr();
					  labrador.emitirSom();
					  labrador.brincar();
				    break;
				}	
		    }
	   } while (interacao == false);
	}
}