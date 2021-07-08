package model;

public class Aviao {
	
	private double tamanho;
	private int capacidade;
	private double potencia;
	private String modelo;
	private String fabricante;
	
	public Aviao(String modelo, double potencia, int capacidade, double tamanho, String fabricante) {
		this.modelo = modelo;
		this.potencia = potencia;
		this.capacidade = capacidade;
		this.tamanho = tamanho;
		this.fabricante = fabricante;
	}
	
	public void construirAviao() {
		System.out.println("O avi�o est� sendo constru�do...Aguarde!");
		System.out.println("O foi constru�do com as seguintes caracter�sticas: ");
		System.out.print("Modelo: "+modelo);
		System.out.println("");
		System.out.print("Fabricante: "+fabricante);
		System.out.println("");
		System.out.print("Capacidade: "+capacidade);
		System.out.println("");
		System.out.print("Tamanho: "+tamanho+" metros");
		System.out.println("");
		System.out.print("Potencia: "+potencia+" kN");
		System.out.println("");
		
	}


}
