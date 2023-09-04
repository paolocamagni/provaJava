/**
 * La mucca e' un simpatico animale che produce il latte
 * 
 * @author Paolo 
 * @version 2.1 del 11/10/2023
 */
public class Mucca 
{
    // instance variables - replace the example below with your own
    private int eta;
    private int produzione;
    private String nome;
    private String razza;
    /**
     * Costruttore della Mucca
     */
    public Mucca()
    {
        // initialise instance variables
        eta = 0;
    }

    public Mucca(String nome)
    {
        // initialise instance variables
        eta = 0;
        nome = nome;
    }

    /**
     * metodo per effettare la mungitura
     * 
     * @param  litri_latte : litri di latte richiesti
     * @return produzione  : litri di latte effettivamente munti
     */
    public int mungi(int litri_latte)
    {
        // put your code here
        return produzione;
    }
    /**
     * metodo per alimentare la mucca
     * 
     * @param  kg_fieno : quantita' di fieno dato in pasto
     * @return ok       : conferma 
     */
    public boolean mangia (int kg_fieno)
    {
        boolean ok;
        ok=true;
        return ok;
    }
}