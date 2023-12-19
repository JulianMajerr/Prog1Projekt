import java.util.*;

public class Lager
{
    private String lagerName;
    private ArrayList<Regal> lagerInhalt;
    private int lagerKapazitaet;
    
    public Lager(String lagerName){ 
        this.lagerName = lagerName;        
    }
    
    public ArrayList gibLagerInhalt(){
        return lagerInhalt;
    }
    
    public String gibLagerName(){
        return lagerName;
    }
}
