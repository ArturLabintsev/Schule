package Pizza;

public class Pizza {

    private String name;
    private double preis;       
    private Grosse grosse;
    private Extras extra;

 
    public Pizza(String name, double preis, Grosse grosse, Extras extra) {
        this.name = name;
        this.preis = preis;
        this.grosse = grosse;
        this.extra = extra;
    }

    // --- Getter & Setter ---
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public Grosse getGrosse() {
        return grosse;
    }

    public void setGrosse(Grosse grosse) {
        this.grosse = grosse;
    }

    public Extras getExtra() {
        return extra;
    }

    public void setExtra(Extras extra) {
        this.extra = extra;
    }

   

    @Override
    public String toString() {
        return name + " (" + preis + " €)";
    }
}

