package Alumno;

/**
 * Alumno.java
 * Definición de la clase Alumno
 * @author Miguel Angek Acedo Ariza
 * 
 * Usando Encapsulate field, creamos los getter and setter
 * de los atributos ademas de ponerlos como privados
 * 
 * Debido a que todos los atributos son privados y la forma
 * de ver o añadir informacion a dichos atributos son los
 * getter and setters
 *  
 */


public class Alumno {

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
     * @return the notaMedia
     */
    public double getNotaMedia() {
        return notaMedia;
    }

    /**
     * @param notaMedia the notaMedia to set
     */
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

  private String nombre;
  private double notaMedia = 0.0;
  
}
