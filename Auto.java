
package oop_arrays;

/**
 *
 * @author c0dehard
 */
public class Auto {

    //Attribute
    private String hersteller;
    private String modell;
    private boolean vermietet;

    //Konstruktor
    public Auto(String hersteller, String modell, boolean vermietet) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.vermietet = vermietet;
    }
    
        public Auto() {
       //fix für auto nr 0
    }
    

    //Methoden
    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public boolean isVermietet() {
        return vermietet;
    }

    public void setVermietet(boolean vermietet) {
        this.vermietet = vermietet;
    }

}
