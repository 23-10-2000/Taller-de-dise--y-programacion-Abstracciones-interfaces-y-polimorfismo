/**
 * esta seria la superclase a la cual les dara atributos a las subclases
 */
package com.mycompany.taller_2;

public class NavesEspaciales implements cohete{

    /**
     * en este apartado asignaremos los atributos y que tipo de dato tendran
     */
    public String nombre;
    public int fuerzaImpulso;
    public int velocidad;
    public int empuje;
    public float propulsion;
    public int peso;
    public int capacidDeCarga;
    public float altura;
    public String combustible;

    /**
     *
     * @param nombre
     * @param fuerzaImpulso
     * @param velocidad
     * @param empuje
     * @param propulsion
     * @param peso
     * @param capacidDeCarga
     * @param altura
     * @param combustible
     */
    public NavesEspaciales(String nombre, int fuerzaImpulso, int velocidad, int empuje, float propulsion, int peso, int capacidDeCarga,
            float altura, String combustible) {
        this.fuerzaImpulso = fuerzaImpulso;
        this.velocidad = velocidad;
        this.empuje = empuje;
        this.propulsion = propulsion;
        this.peso = peso;
        this.capacidDeCarga = capacidDeCarga;
        this.altura = altura;
        this.combustible = combustible;
        this.nombre = nombre;
    }

    /**
     * aca observamos los return que tendran nuestros "get", donde se hara la
     * sobre-escritura
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public int getFuerzaImpulso() {
        return fuerzaImpulso;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getEmpuje() {
        return empuje;
    }

    public float getPropulsion() {
        return propulsion;
    }

    public int getPeso() {
        return peso;
    }

    public int getCapacidDeCarga() {
        return capacidDeCarga;
    }

    public float getAltura() {
        return altura;
    }

    public String getCombustible() {
        return combustible;
    }

    /**
     * aca veremos los datos que se mostraran con un anunciado de que es la
     * variable que se mostrara
     *
     * @return
     */
    public String verDatos() {
        return "El nombre de la nave es: " + nombre + "\nfuerza de impulso: " + fuerzaImpulso + "\nvelocidad: " + velocidad
                + "\nempuje: " + empuje + "\npropulsion: " + propulsion + "\npeso: " + peso + "\ncapacidad de carga: "
                + capacidDeCarga + "\naltura: " + altura + "\ncombustible: " + combustible;
    }
/**
 * estas son nuestras interfaces del objeto naves
 */
    @Override
    public void volar() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void aterrizar() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
