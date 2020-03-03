package oop_arrays;

public class Auto {

    private String _hersteller, _modell;
    private boolean _vermietet;

    public Auto(String hersteller, String modell, boolean vermietet) {
        _hersteller = hersteller;
        _modell = modell;
        _vermietet = vermietet;
    }
    
    public Auto() {
        
    }
    
    public String getHersteller() {
        return _hersteller;
    }

    public void setHersteller(String hersteller) {
        _hersteller = hersteller;
    }

    public String getModell() {
        return _modell;
    }

    public void setModell(String modell) {
        _modell = modell;
    }

    public boolean isVermietet() {
        return _vermietet;
    }

    public void setVermietet(boolean vermietet) {
        _vermietet = vermietet;
    }

}
