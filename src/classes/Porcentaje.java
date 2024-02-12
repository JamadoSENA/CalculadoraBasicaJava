package classes;

import java.util.Scanner;

public class Porcentaje extends Operacion {
	
	Scanner lapiz = new Scanner (System.in);	
	
	 public Porcentaje() {       
	 super();
	 }

	 public void Porcentaje_() {
	 
	 System.out.println("---Porcentaje---");
	 System.out.println("Ingrese el numero total: ");
	 this.numA = lapiz.nextInt();
	 System.out.println("Ingrese el numero del porcentaje a obtener: ");
	 this.numB = lapiz.nextInt();
	 this.setResultado((this.getNumB()*100)/this.getNumA());
	 System.out.println("El resultado es igual a: " + this.getResultado());
		 
	 }
	
}
