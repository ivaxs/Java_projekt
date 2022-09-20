public class StiropornaPloca extends Proizvod implements Buyable {

    String naziv;
    int sifra;
    double cijena;
    int kvadraturaPaketa;

    boolean stanje;

    StiropornaPloca(String naziv, int sifra, double cijena, int kvadraturaPaketa, boolean stanje) {
        setNaziv(naziv);
        setSifra(sifra);
        setCijena(cijena);
        setKvadraturaPaketa(kvadraturaPaketa);
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

    public void setKvadraturaPaketa(int kvadraturaPaketa) {
        if (kvadraturaPaketa == 2) {
            this.kvadraturaPaketa = kvadraturaPaketa;
        } else if (kvadraturaPaketa == 4) {
            this.kvadraturaPaketa = kvadraturaPaketa;
        } else if(kvadraturaPaketa == 6) {
            this.kvadraturaPaketa = kvadraturaPaketa;
        } else {
            throw new IllegalArgumentException("Nepostojeca kvadratura paketa!");
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

    public int getKvadraturaPaketa() {
        return kvadraturaPaketa;
    }

    public boolean isStanje() {
        return stanje;
    }

    public void prikazi() {
        System.out.println("Stiroporna ploča " + naziv + " košta " + cijena + " kn.");
    }

    public double sPopustom() {
        if(kvadraturaPaketa == 2) {
            return cijena*0.5;
        } else if(kvadraturaPaketa == 4) {
            return cijena*0.75;
        } else {
            return cijena*0.80;
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
