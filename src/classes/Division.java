package classes;
import java.util.Scanner;

public class Division extends Operacion{
	
	 Scanner lapiz = new Scanner (System.in);	
	
	 public Division() {       
	 super();
	 }

	 public void Division_() {
	 
	 System.out.println("---Division de 2 Numeros---");
	 System.out.println("Ingrese un numero A: ");
	 this.numA = lapiz.nextInt();
	 System.out.println("Ingrese un numero B: ");
	 this.numB = lapiz.nextInt();
	 if(this.getNumB() == 0) {
		 System.out.println("Error, no se puede dividir por cero");
	 }else if(this.getNumB() > 0){
		 this.setResultado(this.getNumA() / this.getNumB());
		 System.out.println("El resultado es igual a: " + this.getResultado());
	 }
	 
		 
	 }
	
}
