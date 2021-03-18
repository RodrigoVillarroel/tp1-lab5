import java.util.*;

public class Torneo {
    // ################### PROPERTIES ############################

    private List<Vikingo> vikingos;
    private List<Espartano> espartanos;

    // ###################### CONSTUCTOR #########################

    public Torneo() {
        setVikingos();
        setEspartanos();
    }

    // #################### GETS AND SETS ########################

    public List<Vikingo> getVikingos() {
        return vikingos;
    }

    public void setVikingos() {
        this.vikingos = new ArrayList<Vikingo>();
    }

    public List<Espartano> getEspartanos() {
        return espartanos;
    }

    public void setEspartanos() {
        this.espartanos = new ArrayList<Espartano>();
    }

    // ###################### METHODS ############################

    public boolean agregarVikingo(Vikingo v){
        if(getVikingos()!=null){
            getVikingos().add(v);
            return true;
        }else
            return false;
    }

    public boolean agregarEspartano(Espartano e){
        if(getEspartanos()!=null){
            getEspartanos().add(e);
            return true;
        }else
            return false;
    }

    public void ordenarVikingos(){
        if(getVikingos()!=null){
            getVikingos().sort(Vikingo::compareTo);
        }
    }

    public void ordenarEspartanos(){
        if(getEspartanos()!=null){
            getEspartanos().sort(Espartano::compareTo);
        }
    }

    // ##################### OVERIDES ############################


    @Override
    public String toString() {
        return "Torneo{" +
                "vikingos=" + getVikingos() +
                ", espartanos=" + getEspartanos() +
                '}';
    }
}
