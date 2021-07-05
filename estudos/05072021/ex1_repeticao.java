package Teste;

public class imprimeNumeros {
    
  public static void main(String[] args) {
	 
      for(int numero = 1000;numero<=1999;numero++) 
      {
    	  if(numero%11 == 5) 
	  {
    		  System.out.println("O "+numero+" é o número pedido pela questão");
    	  }
      }  		  	  
   }
}
