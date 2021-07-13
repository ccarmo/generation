package model;

public abstract class Animal {
	
	
	private String  nome;
	private int     idade;
	private float   comprimento;
	private float   peso;
	private boolean xixi;
	
	
	public Animal (String nome, int idade, float comprimento, float peso){
          super();
          this.nome = nome;
          this.idade = idade;
          this.comprimento = comprimento;
          this.peso = peso;	
          	  
	}
	
	public void fazerXixi(boolean xixi){
		if(xixi == true)
		{
          System.out.println(" fez xixi");
        } 
		else
		{
          System.out.println(" não fez xixi");
        }			
	}
	
	abstract public void emitirSom();
	
	public int getIdade(){
		return idade;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public float getComprimento(){
		return comprimento;
	}
	
	public void setComprimento(float comprimento){
	    this.comprimento = comprimento;	
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
}