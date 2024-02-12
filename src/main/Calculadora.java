package main;
import java.util.Scanner;
import classes.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=0;
		Scanner lapiz = new Scanner (System.in);
		Addition objSuma = new Addition();
        Substraction objResta = new Substraction();
        Multiplication objMultiplicacion = new Multiplication();
        Division objDivision = new Division();
        Porcentaje objPorcentaje = new Porcentaje();
		
		do {
			
			System.out.println("---CALCULADORA BASICA---");
			System.out.println("Ingrese que operacion desea usar: ");
			System.out.println("1. Sumar.");
			System.out.println("2. Resta.");
			System.out.println("3. Multiplicacion.");
			System.out.println("4. Division.");
			System.out.println("5. Raiz Cuadrada.");
			System.out.println("6. Porcentaje. ");
			System.out.println("0. Salir.");
			opcion = lapiz.nextInt();
			
			switch(opcion) {
			
			case 1:
				
			objSuma.Suma();
			
			break;
			
			case 2:
				
		    objResta.Resta();
		    
		    break;
		    
			case 3:
				
			objMultiplicacion.Multiplicacion();
			
			break;
			
			case 4:
				
			objDivision.Division_();
			
			break;
			
			case 6:
				
			objPorcentaje.Porcentaje_();			
			
			
			
			}
			
			
		}while(opcion!=0);
	}

}
