public class Main {
    public static void main(String[] args) {

        Torneo torneo = new Torneo();

        torneo.agregarVikingo(new Vikingo("NICOLAS",22,85.75f,150));
        torneo.agregarVikingo(new Vikingo("AGUSTIN",28,83.20f,144));
        torneo.agregarVikingo(new Vikingo("LEONARDO",40,86.60f,148));

        torneo.agregarEspartano(new Espartano("RODRIGO",24,90.20f,160));
        torneo.agregarEspartano(new Espartano("EZEQUIEL",42,79.70f,155));
        torneo.agregarEspartano(new Espartano("LEONARDO",33,86.60f,144));

        System.out.println(torneo);
        torneo.ordenarVikingos();
        torneo.ordenarEspartanos();
        System.out.println(torneo);
    }
}
// ################### PROPERTIES ############################
// ###################### CONSTUCTOR #########################
// #################### GETS AND SETS ########################
// ###################### METHODS ############################
// ##################### OVERIDES ############################