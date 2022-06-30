package com.mycompany.taller_2;

public abstract class NaveEspacialTripulada extends NavesEspaciales {

    //nombre, destino, 
    /**
     * creamos los datos abstractos que haran la diferencia de esta nave a las
     * otras
     */
    protected String nombreNaveTripulada;
    protected String destino;

    /**
     * inicializarimos las variables creando su respectivo constructor
     *
     * @param nombreNaveTripulada
     * @param destino
     * @param fuerzaImpulso
     * @param velocidad
     * @param empuje
     * @param propulsion
     * @param peso
     * @param capacidDeCarga
     * @param altura
     * @param combustible
     * @param nombre
     */
    public NaveEspacialTripulada(String nombreNaveTripulada, String destino, String nombre, int fuerzaImpulso, int velocidad, int empuje,
            float propulsion, int peso, int capacidDeCarga, float altura, String combustible) {
        super(nombre, fuerzaImpulso, velocidad, empuje, propulsion, peso, capacidDeCarga, altura, combustible);
        this.nombreNaveTripulada = nombreNaveTripulada;
        this.destino = destino;
    }

    public String getNombreNaveTripulada() {
        return nombreNaveTripulada;
    }

    public String getDestino() {
        return destino;
    }

    /**
     * aca veremos los datos que se mostraran con un anunciado de que es la
     * variable que se mostrara mas los atributos abstractos de la nave
     *
     * @return
     */
    @Override
    public String verDatos() {
        return "\nfuerza de impulso: " + fuerzaImpulso + "\nvelocidad: " + velocidad + "\nempuje: " + empuje + "\npropulsion: "
                + propulsion + "\npeso: " + peso + "\ncapacidad de carga: " + capacidDeCarga + "\naltura: " + altura
                + "\ncombustible: " + combustible + "\nEl nombre de la nave tripulada es: " + nombreNaveTripulada
                + "\nEl destino al que se dirigio fue: " + destino;

    }

}
