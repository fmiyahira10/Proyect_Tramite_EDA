
package Modelo;

import java.util.Scanner;

public class Persona {
    
    protected int dni;
    protected String nombre;
    
    // Constructor
    public Persona() {
        this.dni = 0;
        this.nombre = "";
    }

    public Persona(int dni, String nombres) {
        this.dni = dni;
        this.nombre = nombres;
    }
    // Getter and setter

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombre;
    }

    public void setNombres(String nombres) {
        this.nombre = nombres;
    }
    // Otros metodos
    public void leer(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la informacion de la Persona: ");
        System.out.print("Ingrese el DNI: ");
        this.dni = lector.nextInt();
        System.out.println("Ingrese los nombres: ");
        lector.nextLine();
        this.nombre = lector.nextLine();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
