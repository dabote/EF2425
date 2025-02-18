
/**
 * Beschreiben Sie hier die Klasse Segelschiff.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Segelschiff extends Schiff
{
    private int segelflaeche;
    
    /**
     * Konstruktor für Objekte der Klasse Segelschiff
     */
    public Segelschiff()
    {
        super( "SailDrive", 20, 8 );
        System.out.println("Konstruktor Segelschiff nach dem Aufruf Konstruktor Schiff");
    }

}
