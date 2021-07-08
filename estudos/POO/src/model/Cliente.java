package model;

public class Cliente {
     

	private String nome;
	private String endereco;
	private String cep;
	private String codigo;
	
	
	public Cliente(String nome, String endereco, String cep, String codigo) {
		this.nome = nome;
		this.endereco = endereco;
		this.cep = cep;
		this.codigo = codigo;
	}
	
	public void imprimeCliente() {
		System.out.println("O cliente "+nome+"(código "+codigo+") posssui as seguintes informações de cadastro: ");
		System.out.print("Endereço: "+endereco);
		System.out.println("");
		System.out.print("CEP: "+cep);
		System.out.println("");
		System.out.print("Codigo Cliente: "+codigo);
		System.out.println("");
		
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
}
