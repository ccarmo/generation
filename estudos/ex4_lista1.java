package Teste;

import java.util.Scanner;
import java.lang.Math;

public class PrimeiroPrograma {
	public static void main(String[] args) {

	  double n1,n2,n3;
	  double res1,res2,resfinal;
	  Scanner leia = new Scanner(System.in);

	  System.out.println("\nColoque o primeiro número: ");
	  n1 = leia.nextFloat();

	  System.out.println("\nColoque o segundo número: ");
	  n2 = leia.nextFloat();

	  System.out.println("\nColoque o terceiro número: ");
	  n3 = leia.nextFloat();

	  //calculo de R
	  res1 = Math.pow((n1+n2),2);

	  //calculo de S
	  res2 = Math.pow((n2 + n3),2);

	  //calculo de D
	  resfinal = (res1 + res2)/2;

	  System.out.printf("\nO resultado do cálculo é: %.2f",resfinal);
	
	}

}
