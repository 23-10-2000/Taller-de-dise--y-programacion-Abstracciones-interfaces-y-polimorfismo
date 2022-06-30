package com.mycompany.taller_2;

public abstract class NaveEspecialNoTripulada extends NavesEspaciales {
//nombre, destino,

    /**
     * creamos los datos abstractos que haran la diferencia de esta nave a las
     * otras
     */
    protected String nombreNaveNoTripulada;
    protected String destino1;

    /**
     * inicializarimos las variables creando su respectivo constructor
     *
     * @param nombreNaveNoTripulada
     * @param destino1
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
    public NaveEspecialNoTripulada(String nombreNaveNoTripulada, String destino1, String nombre, int fuerzaImpulso,
            int velocidad, int empuje, float propulsion, int peso, int capacidDeCarga, float altura, String combustible) {

        super(nombre, fuerzaImpulso, velocidad, empuje, propulsion, peso, capacidDeCarga, altura, combustible);

        this.nombreNaveNoTripulada = nombreNaveNoTripulada;
        this.destino1 = destino1;
    }

    @Override
    public String getNombre() {
        return nombreNaveNoTripulada;
    }

    public String getDestino() {
        return destino1;
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
                + "\ncombustible: " + combustible + "\nEl nombre de la nave no tripulada es: " + nombreNaveNoTripulada
                + "\nEl destino al que se dirigio fue: " + destino1;
    }
}
