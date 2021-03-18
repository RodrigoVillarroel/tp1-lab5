
public class Espartano extends Humano{
    // ################### PROPERTIES ############################

    private int toleranciaExtra;

    // ###################### CONSTUCTOR #########################

    public Espartano(String nombre, int edad, float peso, int toleranciaExtra) {
        super(nombre, edad, peso);
        setToleranciaExtra(toleranciaExtra);
    }

    public Espartano() {
    }

    // #################### GETS AND SETS ########################

    public int getToleranciaExtra() {
        return toleranciaExtra;
    }

    public void setToleranciaExtra(int toleranciaExtra) {
        this.toleranciaExtra = toleranciaExtra;
    }

    // ###################### METHODS ############################
    // ##################### OVERIDES ############################

    @Override
    public String toString() {
        return "Espartano{" +
                "toleranciaExtra=" + getToleranciaExtra() +
                '}'+super.toString();
    }

    @Override
    public int compareTo(Object o) {
        Espartano e = (Espartano) o;
        if (getPeso() < e.getPeso()) {
            return -1;
        }
        if (getPeso() > e.getPeso()) {
            return 1;
        }
        return 0;
    }
}
