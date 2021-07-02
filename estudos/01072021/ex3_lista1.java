package Teste;

import java.util.Scanner;

public class mostrarHorarios {

	public static void main(String[] args) {

    float segundos;
	  double minutos,horas;

	  Scanner leia = new Scanner(System.in);

	  System.out.println("\nInsira o tempo do evento (em segundos): ");
	  segundos = leia.nextFloat();

	  //calculos do tempo inserido (segundos) em horas e minutos

    //conversão para horas
    horas = segundos*(0.000277778);

    //conversão para minutos
    minutos = segundos*0.0166667;


	  System.out.printf("O tempo do evento em horas, minutos e segundos é: %.2f horas : %.2f minutos : %.2f segundos",horas,minutos,segundos);

	}

}
