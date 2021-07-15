package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Concessionaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> concessionaria = new ArrayList();
		
		do {
			System.out.println("\n(1)Deseja adicionar carros a concessionária\n"
					+ "(2)Deseja remover um carro? \n(3)Atualizar\n(4)Mostrar todos os carros da concessionária"
					+ "\n(0) Encerrar o programa");
			System.out.println("\n-----------------------------------------");
			System.out.println("\n\t\tDigite sua opção: ");
			System.out.println("\n-----------------------------------------");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o carro para adicionar a concessionária: ");
				String carro = leia.nextLine();//ler uma variável do tipo String
				concessionaria.add(carro);//adicionar um carro no meu ArrayList
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o carro para remover da concessionária: ");
				String carro1 = leia.nextLine();
				if(concessionaria.contains(carro1))
				{
					concessionaria.remove(carro1);
				}
				else
				{
					System.out.println("\nCarro não existe na concessionária...");
				}
				System.out.println(concessionaria);
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o carro que quer atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do carro que entrará no lugar de "+verifica+" : ");
				String novo = leia.nextLine();
				
				if(concessionaria.contains(verifica))
				{
					concessionaria.remove(verifica);
					concessionaria.add(novo);
				}
				else
				{
					System.out.println("\nCarro não existente...");
				}
				System.out.println(concessionaria);
				break;
			case 4:
				System.out.println("\nOs carros do concessionaria são: ");
				System.out.println(concessionaria);
				break;
				default:
					System.out.println("\nFinalizou o programa... Volte sempre...");
				
			}
			
		}
		while(op!=0);
	}

}
