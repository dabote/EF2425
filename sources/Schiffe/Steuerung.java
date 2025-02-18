
/**
 * Beschreiben Sie hier die Klasse Steuerung.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Steuerung
{
  
    public Steuerung()
    {
        
    }
    
    public void testeSchiffeErzeugen()
    {
        Schiff dasErsteSchiff;
        Segelschiff dasZweiteSchiff;
        
        dasErsteSchiff = new Schiff( "OceanDrive", 15, 30 );
        dasZweiteSchiff = new Segelschiff();
        
        dasErsteSchiff.setHersteller( "NewOceanDrive" );
        System.out.println( dasErsteSchiff.getHersteller() );
    }
}
