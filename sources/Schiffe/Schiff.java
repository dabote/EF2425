
/**
 * Write a description of class Schiff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Schiff
{
    // instance variables - replace the example below with your own
    private String hersteller;
    private int geschwindigkeit;
    private int gewicht;

    /**
     * Constructor for objects of class Schiff
     */
    public Schiff( String pHersteller, int pGeschwindigkeit, int pGewicht)
    {
        // initialise instance variables
        hersteller = pHersteller;
        geschwindigkeit = pGeschwindigkeit;
        gewicht = pGewicht;
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
