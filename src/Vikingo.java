public class Vikingo extends Humano{
    // ################### PROPERTIES ############################

    private int bebedorProfesional;

    // ###################### CONSTUCTOR #########################

    public Vikingo(String nombre, int edad, float peso, int bebedorProfesional) {
        super(nombre, edad, peso);
        setBebedorProfesional(bebedorProfesional);
    }

    public Vikingo() {
    }

    // #################### GETS AND SETS ########################

    public int getBebedorProfesional() {
        return bebedorProfesional;
    }

    public void setBebedorProfesional(int bebedorProfesional) {
        this.bebedorProfesional = bebedorProfesional;
    }

    // ###################### METHODS ############################
    // ##################### OVERIDES ############################

    @Override
    public String toString() {
        return "Vikingo{" +
                "bebedorProfesional=" + getBebedorProfesional() +
                '}'+super.toString();
    }

    @Override
    public int compareTo(Object o) {
        Vikingo v = (Vikingo)o;
        if (getPeso() < v.getPeso()) {
            return -1;
        }
        if (getPeso() > v.getPeso()) {
            return 1;
        }
        return 0;
    }
}
