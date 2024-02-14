package classes;

import java.util.Scanner;

public class Operacion {
    private int numA;
    private int numB;
    private double resultado;

    Scanner lapiz = new Scanner(System.in);

    public Operacion() {
        super();
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void Suma() {
        System.out.println("---Suma---");
        if(this.getResultado()==0) {
        System.out.println("Ingrese un numero A: ");
        this.numA = lapiz.nextInt();
        System.out.println("Ingrese un numero B: ");
        this.numB = lapiz.nextInt();
        this.setResultado(this.getNumA() + this.getNumB());
        System.out.println("Resultado: " + this.getResultado());
        }else {
            System.out.println("Ingrese un numero B: ");
            this.numB = lapiz.nextInt();
        	this.setResultado(this.getResultado() + this.getNumB());
            System.out.println("Resultado: " + this.getResultado());
        }
        
    }

    public void Resta() {
    	System.out.println("---Resta---");
        if(this.getResultado()==0) {
        System.out.println("Ingrese un numero A: ");
        this.numA = lapiz.nextInt();
        System.out.println("Ingrese un numero B: ");
        this.numB = lapiz.nextInt();
        this.setResultado(this.getNumA() - this.getNumB());
        System.out.println("Resultado: " + this.getResultado());
        }else {
            System.out.println("Ingrese un numero B: ");
            this.numB = lapiz.nextInt();
        	this.setResultado(this.getResultado() - this.getNumB());
            System.out.println("Resultado: " + this.getResultado());
        }
    }

    public void Multiplicacion() {
    	System.out.println("---Multiplicacion---");
        if(this.getResultado()==0) {
        System.out.println("Ingrese un numero A: ");
        this.numA = lapiz.nextInt();
        System.out.println("Ingrese un numero B: ");
        this.numB = lapiz.nextInt();
        this.setResultado(this.getNumA() * this.getNumB());
        System.out.println("Resultado: " + this.getResultado());
        }else {
            System.out.println("Ingrese un numero B: ");
            this.numB = lapiz.nextInt();
        	this.setResultado(this.getResultado() * this.getNumB());
            System.out.println("Resultado: " + this.getResultado());
        }
    }

    public void Division_() {
    	System.out.println("---Division---");
        if(this.getResultado()==0) {
        System.out.println("Ingrese un numero A: ");
        this.numA = lapiz.nextInt();
        System.out.println("Ingrese un numero B: ");
        this.numB = lapiz.nextInt();
        	if(this.getNumB()==0) {
        		System.out.println("Error al dividir por 0.");}
        	    else {
        	    this.setResultado(this.getNumA() / this.getNumB());
        	    System.out.println("Resultado: " + this.getResultado());
        }
        }else {
            System.out.println("Ingrese un numero B: ");
            this.numB = lapiz.nextInt();
            if(this.getNumB()==0) {
        		System.out.println("Error al dividir por 0.");}
        	    else {
        	    this.setResultado(this.getResultado() * this.getNumB());
                System.out.println("Resultado: " + this.getResultado());
        	
        	    }
            }
    }

    public void Porcentaje_() {
    	System.out.println("---Porcentaje---");
        if(this.getResultado()==0) {
        System.out.println("Ingrese el numero a obtener el porcentaje: ");
        this.numA = lapiz.nextInt();
        System.out.println("Ingrese el numero del porcentaje a obtener: ");
        this.numB = lapiz.nextInt();
        this.setResultado((this.getNumA() * this.getNumB()) / 100);
        System.out.println("Resultado: " + this.getResultado());
        }else {
        	System.out.println("Ingrese el numero del porcentaje a obtener: ");
            this.numB = lapiz.nextInt();
            this.setResultado((this.getResultado() * this.getNumB()) / 100);
            System.out.println("Resultado: " + this.getResultado());
        }
    }

    public void Raiz_() {
    	System.out.println("---Raiz Cuadrada---");
        if(this.getResultado()==0) {
        System.out.println("Ingrese el numero: ");
        this.numA = lapiz.nextInt();
        this.setResultado(Math.sqrt(this.getNumA()));
        System.out.println("Resultado: " + this.getResultado());
        }else {
        	this.setResultado(Math.sqrt(this.getResultado()));
            System.out.println("Resultado: " + this.getResultado());
        }
        }
    
    public void COS() {
    	System.out.println("---Coseno---");
        if(this.getResultado()==0) {
        	System.out.println("Ingrese el numero: ");
        	this.numA = lapiz.nextInt();
        	this.setResultado(Math.cos(this.getNumA()));
            System.out.println("Resultado: " + this.getResultado());
        }else {
        	this.setResultado(Math.cos(this.getResultado()));
            System.out.println("Resultado: " + this.getResultado());
        }
    }
    
    public void SIN() {
    	System.out.println("---Seno---");
        if(this.getResultado()==0) {
        	System.out.println("Ingrese el numero: ");
        	this.numA = lapiz.nextInt();
        	this.setResultado(Math.sin(this.getNumA()));
            System.out.println("Resultado: " + this.getResultado());
        }else {
        	this.setResultado(Math.sin(this.getResultado()));
            System.out.println("Resultado: " + this.getResultado());
        }
    }
    
    public void TAN() {
    	System.out.println("---Tangente---");
        if(this.getResultado()==0) {
        	System.out.println("Ingrese el numero: ");
        	this.numA = lapiz.nextInt();
        	this.setResultado(Math.tan(this.getNumA()));
            System.out.println("Resultado: " + this.getResultado());
        }else {
        	this.setResultado(Math.tan(this.getResultado()));
            System.out.println("Resultado: " + this.getResultado());
        }
        
    
    }
    
    public void COTAN() {
    	System.out.println("---Cotangente---");
        if(this.getResultado()==0) {
        	System.out.println("Ingrese el numero: ");
        	this.numA = lapiz.nextInt();
        	this.setResultado(Math.atan(this.getNumA()));
            System.out.println("Resultado: " + this.getResultado());
        }else {
        	this.setResultado(Math.atan(this.getResultado()));
            System.out.println("Resultado: " + this.getResultado());
        }
    }
    
    public void PI() {
    	System.out.println("---PI---");
        if(this.getResultado()==0) {
        	System.out.println("Ingrese el numero: ");
        	this.numA = lapiz.nextInt();
        	this.setResultado(Math.PI*(this.getNumA()));
            System.out.println("Resultado: " + this.getResultado());
        }else {
        	this.setResultado(Math.PI*(this.getResultado()));
            System.out.println("Resultado: " + this.getResultado());
        }
    }
    
    public void Potencia() {
    	System.out.println("---Potencia---");
        if(this.getResultado()==0) {
        	System.out.println("Ingrese el numero base: ");
        	this.numA = lapiz.nextInt();
        	System.out.println("Ingrese el numero exponente: ");
        	this.numB = lapiz.nextInt();
        	this.setResultado(Math.pow(this.getNumA(), this.getNumB()));
            System.out.println("Resultado: " + this.getResultado());
        }else {
        	System.out.println("Ingrese el numero exponente: ");
        	this.numB = lapiz.nextInt();
        	this.setResultado(Math.pow(this.getResultado(), this.getNumB()));
            System.out.println("Resultado: " + this.getResultado());
        }
    }
    
    
    
    
    
     
    
    
}