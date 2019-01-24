
package ejercicio3_objetos;

public class Cubo extends Cuadrado{
    
    public Cubo(float lado){
    
        super(lado);
    }
    
    public void calcularVolumen(){
        float volumen;
        volumen = getLado()* getLado() * getLado();
        System.out.println("El volumen es: " + volumen);
    }
    
    
    public void calcularPerimetro1(){
        float perimetro;    
        perimetro = getLado()*12;
        System.out.println("El perimetro del cubo es: " + perimetro);
    }
}
