package main;
import java.util.Scanner;
import classes.Operacion;

public class Calculadora {

	    public static void main(String[] args) {
	        Scanner lapiz = new Scanner(System.in);
	        Operacion objOperacion = new Operacion();

	        int opcion;
	        do {
	            mostrarMenu();
	            opcion = lapiz.nextInt();

	            switch (opcion) {
	                case 1:
	                    objOperacion.Suma();
	                    break;

	                case 2:
	                    objOperacion.Resta();
	                    break;

	                case 3:
	                    objOperacion.Multiplicacion();
	                    break;

	                case 4:
	                    objOperacion.Division_();
	                    break;

	                case 5:
	                    objOperacion.Raiz_();
	                    break;

	                case 6:
	                    objOperacion.Porcentaje_();
	                    break;
	            }

	            System.out.println("¿Desea realizar otra operación con el resultado anterior? (1 = Sí, 0 = No)");
	            opcion = lapiz.nextInt();
	        } while (opcion == 1);
	    }
	    private static void mostrarMenu() {
	        System.out.println("---CALCULADORA BASICA---");
	        System.out.println("Ingrese que operación desea usar: ");
	        System.out.println("1. Sumar.");
	        System.out.println("2. Resta.");
	        System.out.println("3. Multiplicación.");
	        System.out.println("4. División.");
	        System.out.println("5. Raíz Cuadrada.");
	        System.out.println("6. Porcentaje.");
	        System.out.println("0. Salir.");
	    }
	    

}
