package dam.primero;

/**
 * Esta clase está representando una biblioteca con una capacidad máxima de libros.
 * Nos permite añadir y retirar libros, así como consultar su estado.
 *
 * @author Ezequiel
 * @version 1.0
 * @since 2026
 */
public class Biblioteca {

    /** Nombre de la biblioteca */
    private String nombre;

    /** Ciudad donde se encuentra la biblioteca */
    private String ciudad;

    /** Capacidad máxima de libros */
    private int capacidad;

    /** Número actual de libros en la biblioteca */
    private int librosActuales;

    /**
     * Este es el constructor de la clase Biblioteca.
     *
     * @param nombre Nombre de la biblioteca
     * @param ciudad Ciudad donde está ubicada
     * @param capacidad Número máximo de libros
     */
    public Biblioteca(String nombre, String ciudad, int capacidad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
        this.librosActuales = 0;
    }

    /**
     * Con esto podemos añadir una cantidad de libros a la biblioteca.
     *
     * @param cantidad Número de libros para añadir
     * @return true si se añaden correctamente, false si no
     */
    public boolean agregarLibro(int cantidad) {
        if (cantidad <= 0) {
            return false;
        }
        if (librosActuales + cantidad > capacidad) {
            return false;
        }
        librosActuales += cantidad;
        return true;
    }

    /**
     * Este sirve para retira una cantidad de libros de la biblioteca.
     *
     * @param cantidad Número de libros para retirar
     * @return true si se retiran correctamente, false si no
     */
    public boolean retirarLibro(int cantidad) {
        if (cantidad <= 0 || cantidad > librosActuales) {
            return false;
        }
        librosActuales -= cantidad;
        return true;
    }

    /**
     * Este es un get para devolver el espacio disponible en la biblioteca.
     *
     * @return Número de huecos libres
     */
    public int getEspacioDisponible() {
        return capacidad - librosActuales;
    }

    /**
     * Este get es para calcular el porcentaje de ocupación de la biblioteca.
     *
     * @return Porcentaje de ocupación
     */
    public double getPorcentajeOcupacion() {
        if (capacidad == 0) return 0.0;
        return (librosActuales * 100.0) / capacidad;
    }

    /**
     * Con esto sabemos si la biblioteca está llena.
     *
     * @return true si está llena, false si no
     */
    public boolean estaLlena() {
        return librosActuales >= capacidad;
    }

    /**
     * Esto es un get para el nombre
     *
     * @return Nombre de la biblioteca
     */
    public String getNombre() { return nombre; }

    /**
     * Esto es un get para la ciudad
     *
     * @return Ciudad de la biblioteca
     */
    public String getCiudad() { return ciudad; }

    /**
     * Esto es un get para la capacidad
     *
     * @return Capacidad máxima de la biblioteca
     */
    public int getCapacidad() { return capacidad; }

    /**
     * Este es un get para los libros actuales
     *
     * @return Número actual de libros
     */
    public int getLibrosActuales() { return librosActuales; }

    /**
     * Por último hacemos un toString que nos devuelve la información de la biblioteca.
     *
     * @return Cadena con los datos de la biblioteca
     */
    @Override
    public String toString() {
        return nombre + " (" + ciudad + ") - " + librosActuales + "/" + capacidad + " libros";
    }
}