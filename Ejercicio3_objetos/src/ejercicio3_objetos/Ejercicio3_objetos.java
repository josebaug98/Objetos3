
package ejercicio3_objetos;

import java.util.Scanner;

public class Ejercicio3_objetos {

    public static void main(String[] args) {
        
        int opcion;
        float medida;
        float medida2;
        int opcion1;
        int opcion2;
        
        
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Ingrese la medida de un lado: ");
        medida = entrada1.nextFloat();
        
        do{
          
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seleccione una Opción. ");
        System.out.println("1)Calcular Perimetro Cuadrado.");
        System.out.println("2)Calcular Area Cuadrado.");
        System.out.println("3)Calcular Volumen Cubo.");
        System.out.println("4)Calcular Area Cubo.");
        System.out.println("5)Cambiar Valor de Lado.");
        System.out.println("0)Salir.");
        System.out.println("Ingrese Una Opción: "); 
        
        opcion = entrada.nextInt();
        
        switch(opcion){
            
            case 1: Cubo myObject1 = new Cubo ( medida);
                    myObject1.calcularPerimetro(); break;
            
            case 2: Cubo myObject2 = new Cubo ( medida);
                    myObject2.calcularArea(); break;
             
            case 3: Cubo myObject3 = new Cubo ( medida);
                    myObject3.calcularVolumen(); break;
             
            case 4: Cubo myObject4 = new Cubo ( medida);
                    myObject4.calcularPerimetro1(); break;
             
            case 5: Scanner entrada2 = new Scanner(System.in);
                    System.out.println("Ingrese Medida de Lado: ");
                    medida2 = entrada2.nextFloat();
                    medida = medida2;
             
            
             
                }
        
                if(opcion != 0){
                    
                Scanner entrada4 = new Scanner(System.in);
                System.out.println("¿Continuar? 1)Si 0)No");
                opcion = entrada4.nextInt();
                
                    
                    if(opcion == 1){
                    Scanner entrada5 = new Scanner(System.in);
                    System.out.println("¿Cambiar medida de lado? 1)Si 0)No");
                    opcion2 = entrada5.nextInt();
                    
                    if(opcion2 == 1){
                    Scanner entrada6 = new Scanner(System.in);
                    System.out.println("Ingrese Nueva medida: ");
                    medida= entrada6.nextInt();
                    }                                
                    }
                }                        
                System.out.println("\n***El Lado Ahora mide: " + medida+"***");
        } while(opcion != 0);

    }
    
}
