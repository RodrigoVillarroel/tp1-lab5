import java.util.Objects;

public abstract class Humano {

    // ################### PROPERTIES ############################

    private String nombre;
    private int edad;
    private float peso;

    // ###################### CONSTUCTOR #########################

    public Humano(String nombre, int edad, float peso) {
        setNombre(nombre);
        setEdad(edad);
        setPeso(peso);
    }

    public Humano() {
    }

    // #################### GETS AND SETS ########################

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    // ###################### METHODS ############################
    // ##################### OVERIDES ############################


    @Override
    public String toString() {
        return "Humano{" +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", peso=" + getPeso() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Humano humano = (Humano) o;
        return edad == humano.edad && Float.compare(humano.peso, peso) == 0 && Objects.equals(nombre, humano.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, peso);
    }

    public abstract int compareTo(Object o);

}
