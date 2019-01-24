
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
        /*System.out.println("¿Conservar datos? 1) Si 2) No");
        Scanner entrada = new Scanner(System.in);
        opcion = entrada.nextInt();
        if(opcion == 1){area = lado;}
        else{area = 0;}*/
        
    }
    
    public void calcularPerimetro(){
        float perimetro;
        perimetro = lado*4;
        System.out.println("El perimetro del cuadrado es: " + perimetro);
    }
    
}
