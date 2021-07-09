package model;

import java.util.List;
import java.util.Collections;
import java.util.Arrays;

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




	public void brincar(String nome, int escolha){
		switch(escolha){
		    case 1:
              System.out.println(getNome()+"está balançando o rabo...");
			break;

            case 2:
              System.out.println(getNome()+"está com medo e vai fazer xixi...");			
		      fazerXixi(true);
			break;
			
			case 3:
			   System.out.println(getNome()+"está se sentindo seguro");
			   fazerXixi(false);
			break;
		}
		
	}
	
	public void emitirLatido(){
	       System.out.println("Au Au!");	
	}
	
	public void emitirGrunido(){
		   System.out.println("Grrrrr!!");
	}
	 
	 
	public String getRaca(){
		  return raca; 
	}
	 
	public void setRaca(String raca){
		  this.raca = raca; 
	}
  
}