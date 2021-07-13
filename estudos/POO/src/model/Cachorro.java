package model;

import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;

public class Cachorro extends Animal {

   private String raca;
	 
	 
   public Cachorro (String nome, int idade, float comprimento, float peso, String raca){
		 super(nome,idade,comprimento,peso);
		 this.raca = raca;
   }
	 
   public void correr() {
	   List<String> cachorroCorrendo = Arrays.asList("correndo","cansado","correndo","correndo de novo");
	   Collections.shuffle(cachorroCorrendo);
	   for(String imprime : cachorroCorrendo) {
		   System.out.println(imprime);
	   }
   }


    @Override
    public void emitirSom() {
    	System.out.println("Au au au");
    }

	public void brincar(){
		System.out.println("1 - Você deu um biscoitinho");
		System.out.println("2 - Você deixou sozinho no escuro");
		System.out.println("3 - Você colocou uma coberta nele");
		System.out.println("Digite: ");
		Scanner leia = new Scanner(System.in);
		switch(leia.nextInt()){
		    case 1:
              System.out.println(getNome()+" está balaçando o rabo...");
              fazerXixi(false);
			break;

            case 2:
              System.out.println(getNome()+" está com medo e vai fazer xixi...");			
		      fazerXixi(true);
			break;
			
			case 3:
			   System.out.println(getNome()+" está se sentindo seguro");
			   fazerXixi(false);
			break;
		}
		
	}
	 
	 
	public String getRaca(){
		  return raca; 
	}
	 
	public void setRaca(String raca){
		  this.raca = raca; 
	}
  
}