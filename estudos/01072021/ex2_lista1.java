package Teste;

import java.util.Scanner;

public class contaDias {

  public static void main(String[] args) {

    int ano, meses, dias;
    Scanner leia = new Scanner(System.in);

    System.out.println("\nQuantos anos você viveu até aqui: ");  
    ano = leia.nextInt();
 
    //calculos do total de dias a partir da quantidade de anos vividos
    meses = ano * 12;
    dias = meses * 30;

    System.out.println("\nA quantidade de dias, aproximado, é: "+dias);

   }

}
