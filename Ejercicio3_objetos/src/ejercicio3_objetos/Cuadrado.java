
package ejercicio3_objetos;

import java.util.Scanner;


public class Cuadrado {
    
    private float lado;
    
    public Cuadrado ( float lado){
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }
    
    public void calcularArea(){

        float area;
        int opcion;
        area = lado * lado;
        System.out.println("El area del cuadrado es: " + area);
    }
    
    public void calcularPerimetro(){
        float perimetro;
        perimetro = lado*4;
        System.out.println("El perimetro del cuadrado es: " + perimetro);
    }
    
}
