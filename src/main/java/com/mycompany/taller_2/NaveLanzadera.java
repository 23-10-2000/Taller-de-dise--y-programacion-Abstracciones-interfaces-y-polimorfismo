package com.mycompany.taller_2;

public abstract class NaveLanzadera extends NavesEspaciales  {
//paisCreador, destino0

    /**
     * creamos los datos abstractos que haran la diferencia de esta nave a las
     * otras
     */
    protected String paisCreador;
    protected String destino0;

    /**
     * inicializarimos las variables creando su respectivo constructor
     *
     * @param paisCreador
     * @param destino0
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
    public NaveLanzadera(String paisCreador, String destino0, String nombre, int fuerzaImpulso, int velocidad,
            int empuje, float propulsion, int peso, int capacidDeCarga, float altura, String combustible) {
        super(nombre, fuerzaImpulso, velocidad, empuje, propulsion, peso, capacidDeCarga, altura, combustible);
        this.paisCreador = paisCreador;
        this.destino0 = destino0;
    }

    public String getPaisCreador() {
        return paisCreador;
    }

    public String getDestino0() {
        return destino0;
    }

    /**
     * aca veremos los datos que se mostraran con un anunciado de que es la
     * variable que se mostrara mas los atributos abstractos de la nave
     *
     * @return
     */
    @Override
    public String verDatos() {
        return "El nombre de la nave es: " + nombre + "\nfuerza de impulso: " + fuerzaImpulso + "\nvelocidad: " + velocidad
                + "\nempuje: " + empuje + "\npropulsion: " + propulsion + "\npeso: " + peso + "\ncapacidad de carga: "
                + capacidDeCarga + "\naltura: " + altura + "\ncombustible: " + combustible + "\nEl nombre del pais creador de la nave es: "
                + paisCreador + "\nEl destino al que se dirigio fue: " + destino0;
    }

}
