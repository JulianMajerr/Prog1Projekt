import java.util.*;
public class Regal
{
    private String regalNummer;
    private ArrayList<Artikel> regalInhalt;
    private int regalfachkapazitaet;
    
    public Regal(String regalNummer)
    {
        this.regalNummer = regalNummer;
    }
    
    public ArrayList gibInhalt(){
        return regalInhalt;
    }
    
    public String gibNummer(){
        return regalNummer;
    }   


}
