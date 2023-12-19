
public class Artikel
{
    private String artikelName;
    private String artikelNummer;
    private int    artikelWert;
    private int    bestand;
    private int    groesse;
    
    public Artikel(String artikelName, String artikelNummer, int artikelWert, int groesse){
        this.artikelName = artikelName;
        this.artikelNummer = artikelNummer;
        this.artikelWert = artikelWert;
        this.groesse = groesse;
     }
    
    
    public String gibName(){
        return artikelName;        
    }
    
    public String gibNummer(){
        return artikelNummer;
    }
    
    public int gib(){
        return artikelWert;        
    }
    
    public void bestandAendern(int bestand){
        this.bestand = bestand;
    }
}
