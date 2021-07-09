package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cavalo extends Animal {
	
	private String raca;
	private boolean manchasPretas;
	
	
	public Cavalo(String nome, int idade, float comprimento, float peso, String raca, boolean manchaPretas) {
		super(nome,idade,comprimento,peso);
		this.raca = raca;
		this.manchasPretas = manchasPretas;
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
		System.out.println(getNome()+" relinchou");
	}
	
	
   
}
