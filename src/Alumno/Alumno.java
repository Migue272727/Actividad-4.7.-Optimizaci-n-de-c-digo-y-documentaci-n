package Alumno;

/**
 * Alumno.java
 * Definición de la clase Alumno
 * @author Miguel Angek Acedo Ariza
 
 Usando Encapsulate field, creamos los getter and setter
 de los atributos ademas de ponerlos como privados
 
 Debido a que todos los atributos son privados y la forma
 de ver o añadir informacion a dichos atributos son los
 getter and setters.
 
 Ademas usando rename cambiamos el nombre de nota por nota ya que
 realmente es la nota del alumno
 *  
 */


public class Alumno {

    
    
    private String nombre;
    private double nota;

    public Alumno(String nombre, double notaMedia) {
        this.nombre = nombre;
        this.nota = notaMedia;
    }

    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nota
     */
    public double getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(double nota) {
        this.nota = nota;
    }  
}
