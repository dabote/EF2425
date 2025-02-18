
/**
 * Beschreiben Sie hier die Klasse Schiuf.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Schiff
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String hersteller;
    private int geschwindigkeit;
    private int gewicht;
    
    protected int anzPassagiere;
    
    /**
     * Konstruktor für Objekte der Klasse Schiff
     */
    public Schiff(String pHersteller, int pGeschwindigkeit, int pGewicht)
    {
        hersteller = pHersteller;
        geschwindigkeit = pGeschwindigkeit;
        gewicht = pGewicht;
        
        System.out.println("Objekt der Klasse Schiff wurde erzeugt: hersteller=" + hersteller + ", geschwindigkeit= " + geschwindigkeit + ", gewicht=" + gewicht );
        
    }

    public void setHersteller( String pHersteller )
    {
        hersteller = pHersteller;
    }
    
    public String getHersteller()
    {
        return hersteller;
    }
}
