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
	                	System.out.println("¿Desea realizar otra operación con el resultado anterior? (2 = No, 1 = Sí, 0 = No)");
	    	            opcion = lapiz.nextInt(); 
	    	            if(opcion==2) {
	    	            	objOperacion.setResultado(0);
	    	            	objOperacion.Suma();
	    	            }else if(opcion==1) {
	    	            	objOperacion.Suma();
	    	            }
	                    break;

	                case 2:
	                	System.out.println("¿Desea realizar otra operación con el resultado anterior? (2 = No, 1 = Sí, 0 = No)");
	    	            opcion = lapiz.nextInt(); 
	    	            if(opcion==2) {
	    	            	objOperacion.setResultado(0);
	    	            	objOperacion.Resta();
	    	            }else if(opcion==1) {
	    	            	objOperacion.Resta();
	    	            }
	                    break;

	                case 3:
	                	System.out.println("¿Desea realizar otra operación con el resultado anterior? (2 = No, 1 = Sí, 0 = No)");
	    	            opcion = lapiz.nextInt(); 
	    	            if(opcion==2) {
	    	            	objOperacion.setResultado(0);
	    	            	objOperacion.Multiplicacion();
	    	            }else if(opcion==1) {
	    	            	objOperacion.Multiplicacion();
	    	            }
	                    break;

	                case 4:
	                	System.out.println("¿Desea realizar otra operación con el resultado anterior? (2 = No, 1 = Sí, 0 = No)");
	    	            opcion = lapiz.nextInt(); 
	    	            if(opcion==2) {
	    	            	objOperacion.setResultado(0);
	    	            	objOperacion.Division_();
	    	            }else if(opcion==1) {
	    	            	objOperacion.Division_();
	    	            }
	                    break;

	                case 5:
	                	System.out.println("¿Desea realizar otra operación con el resultado anterior? (2 = No, 1 = Sí, 0 = No)");
	    	            opcion = lapiz.nextInt(); 
	    	            if(opcion==2) {
	    	            	objOperacion.setResultado(0);
	    	            	objOperacion.Raiz_();
	    	            }else if(opcion==1) {
	    	            	objOperacion.Raiz_();
	    	            }
	                    break;

	                case 6:
	                	System.out.println("¿Desea realizar otra operación con el resultado anterior? (2 = No, 1 = Sí, 0 = No)");
	    	            opcion = lapiz.nextInt(); 
	    	            if(opcion==2) {
	    	            	objOperacion.setResultado(0);
	    	            	objOperacion.Porcentaje_();
	    	            }else if(opcion==1) {
	    	            	objOperacion.Porcentaje_();
	    	            }
	                    break;
	                    
	                case 7:
	                	System.out.println("¿Desea realizar otra operación con el resultado anterior? (2 = No, 1 = Sí, 0 = No)");
	    	            opcion = lapiz.nextInt(); 
	    	            if(opcion==2) {
	    	            	objOperacion.setResultado(0);
	    	            	objOperacion.COS();
	    	            }else if(opcion==1) {
	    	            	objOperacion.COS();
	    	            }
	    	            
	                	break;
	                	
	                case 8:
	                	
	                	System.out.println("¿Desea realizar otra operación con el resultado anterior? (2 = No, 1 = Sí, 0 = No)");
	    	            opcion = lapiz.nextInt(); 
	    	            if(opcion==2) {
	    	            	objOperacion.setResultado(0);
	    	            	objOperacion.SIN();
	    	            }else if(opcion==1) {
	    	            	objOperacion.SIN();
	    	            }
	    	            
	                	break;
	                	
	                case 9:
	                	System.out.println("¿Desea realizar otra operación con el resultado anterior? (2 = No, 1 = Sí, 0 = No)");
	    	            opcion = lapiz.nextInt(); 
	    	            if(opcion==2) {
	    	            	objOperacion.setResultado(0);
	    	            	objOperacion.TAN();
	    	            }else if(opcion==1) {
	    	            	objOperacion.TAN();
	    	            }
	    	            
	                	break;
	                	
	                case 10:
	                	System.out.println("¿Desea realizar otra operación con el resultado anterior? (2 = No, 1 = Sí, 0 = No)");
	    	            opcion = lapiz.nextInt(); 
	    	            if(opcion==2) {
	    	            	objOperacion.setResultado(0);
	    	            	objOperacion.COTAN();
	    	            }else if(opcion==1) {
	    	            	objOperacion.COTAN();
	    	            }
	    	            
	                	break;
	                	
	                case 11:
	                	System.out.println("¿Desea realizar otra operación con el resultado anterior? (2 = No, 1 = Sí, 0 = No)");
	    	            opcion = lapiz.nextInt(); 
	    	            if(opcion==2) {
	    	            	objOperacion.setResultado(0);
	    	            	objOperacion.PI();
	    	            }else if(opcion==1) {
	    	            	objOperacion.PI();
	    	            }
	    	            
	                	break;
	                	
	                case 12:
	                	System.out.println("¿Desea realizar otra operación con el resultado anterior? (2 = No, 1 = Sí, 0 = No)");
	    	            opcion = lapiz.nextInt(); 
	    	            if(opcion==2) {
	    	            	objOperacion.setResultado(0);
	    	            	objOperacion.Potencia();
	    	            }else if(opcion==1) {
	    	            	objOperacion.Potencia();
	    	            }
	    	            
	                	break;
	                	
	                default:
	                	System.out.println("No es una opcion, digite otra.");
	                	
	            }

	        } while (opcion != 0);
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
	        System.out.println("7. Coseno.");
	        System.out.println("8. Seno.");
	        System.out.println("9. Tangente.");
	        System.out.println("10. Cotangente.");
	        System.out.println("11. π.");
	        System.out.println("12. Potencia.");
	        System.out.println("0. Salir.");
	    }
	    

}
