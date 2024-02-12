package classes;

import java.util.Scanner;

public class Raiz extends Operacion {

	Scanner lapiz = new Scanner (System.in);	
	
	 public Raiz() {       
	 super();
	 }

	 public void Raiz_() {
	 
	 System.out.println("---Suma de 2 Numeros---");
	 System.out.println("Ingrese un numero A: ");
	 this.numA = lapiz.nextInt();
	 System.out.println("Ingrese un numero B: ");
	 this.numB = lapiz.nextInt();
	 this.setResultado(this.getNumA() + this.getNumB());
	 System.out.println("El resultado es igual a: " + this.getResultado());
		 
	 }
	
}
