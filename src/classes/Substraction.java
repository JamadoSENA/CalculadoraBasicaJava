package classes;
import java.util.Scanner;

public class Substraction extends Operacion{
	
	 Scanner lapiz = new Scanner (System.in);	
	
	 public Substraction() {       
	 super();
	 }

	 public void Resta() {
	 
	 System.out.println("---Resta de 2 Numeros---");
	 System.out.println("Ingrese un numero A: ");
	 this.numA = lapiz.nextInt();
	 System.out.println("Ingrese un numero B: ");
	 this.numB = lapiz.nextInt();
	 this.setResultado(this.getNumA() - this.getNumB());
	 System.out.println("El resultado es igual a: " + this.getResultado());
		 
	 }
	
}
