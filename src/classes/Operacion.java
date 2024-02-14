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
        System.out.println("Ingrese un numero A: ");
        this.numA = lapiz.nextInt();
        System.out.println("Ingrese un numero B: ");
        this.numB = lapiz.nextInt();
        this.setResultado(this.getResultado() + (double) this.getNumA() + this.getNumB());
        System.out.println("Resultado: " + this.getResultado());
    }

    public void Resta() {
        System.out.println("---Resta---");
        System.out.println("Ingrese un numero B: ");
        this.numB = lapiz.nextInt();
        this.setResultado(this.getResultado() - this.getNumB());
        System.out.println("Resultado: " + this.getResultado());
    }

    public void Multiplicacion() {
        System.out.println("---Multiplicacion---");
        System.out.println("Ingrese un numero B: ");
        this.numB = lapiz.nextInt();
        this.setResultado(this.getResultado() * this.getNumB());
        System.out.println("Resultado: " + this.getResultado());
    }

    public void Division_() {
        System.out.println("---Division---");
        System.out.println("Ingrese un numero B: ");
        this.numB = lapiz.nextInt();
        if (this.getNumB() == 0) {
            System.out.println("Error, no se puede dividir por cero");
        } else {
            this.setResultado(this.getResultado() / this.getNumB());
            System.out.println("Resultado: " + this.getResultado());
        }
    }

    public void Porcentaje_() {
        System.out.println("---Porcentaje---");
        System.out.println("Ingrese el numero del porcentaje a obtener: ");
        this.numB = lapiz.nextInt();
        this.setResultado((this.getNumB() * this.getResultado()) / 100);
        System.out.println("Resultado: " + this.getResultado());
    }

    public void Raiz_() {
        System.out.println("---Raiz---");
        this.setResultado(Math.sqrt(getResultado()));
        System.out.println("Resultado: " + this.getResultado());
    }
}