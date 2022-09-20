public class Ljepilo extends Proizvod implements Buyable{

    String naziv;
    int sifra;
    double cijena;
    double kilaza;

    boolean stanje;

    Ljepilo(String naziv, int sifra, double cijena, double kilaza, boolean stanje) {
        setNaziv(naziv);
        setSifra(sifra);
        setCijena(cijena);
        setKilaza(kilaza);
        setStanje(stanje);
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public void setKilaza(double kilaza) {
        if(kilaza == 1.5) {
            this.kilaza = kilaza;
        } else if(kilaza == 4) {
            this.kilaza = kilaza;
        } else {
            throw new IllegalArgumentException("Nepostojeca kilaza!");
        }
    }

    public void setStanje(boolean stanje) {
        this.stanje = stanje;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getSifra() {
        return sifra;
    }

    public double getCijena() {
        return cijena;
    }

    public double getKilaza() {
        return kilaza;
    }

    public boolean isStanje() {
        return stanje;
    }

    public void prikazi() {
        System.out.println("Ljepilo je " + naziv + " i cijena bez popusta je " + cijena);
    }

    public double sPopustom() {
        if(kilaza == 1.5) {
            return cijena*0.5;
        } else {
            return cijena *0.20;
        }
    }

    public boolean canBuy() {
        if (stanje) {
            return true;
        } else {
            return false;
        }
    }

}
