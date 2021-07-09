package model;

public class Cachorro extends Animal {

     private String raca;
	 
	 
	 public Cachorro (String nome, int idade, double tamanho, double peso, String raca){
		 super(nome,idade,tamanho,peso,taca);
		 this.raca = raca;
	 }
	 
	 public String interagir(String nome, int escolha){
		
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