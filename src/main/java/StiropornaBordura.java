import java.util.Scanner;

public class StiropornaBordura extends Proizvod implements Buyable {

    String naziv;
    int sifra;
    double cijena;
    int duljina;

    boolean stanje;

    StiropornaBordura(String naziv, int sifra, double cijena, int duljina, boolean stanje) {
        setNaziv(naziv);
        setSifra(sifra);
        setCijena(cijena);
        setDuljina(duljina);
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

    public void setDuljina(int duljina) {
        if (duljina == 2) {
            this.duljina = duljina;
        } else if (duljina == 4) {
            this.duljina = duljina;
        } else {
            throw new IllegalArgumentException("Nepostojeca duljina");
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

    public int getDuljina() {
        return duljina;
    }

    public boolean isStanje() {
        return stanje;
    }

    public void prikazi() {
        System.out.println("Artikl " + naziv + ", " + cijena);
    }

    public double sPopustom() {
        if (duljina == 2) {
            return cijena * 0.7;
        } else {
            return cijena * 0.5;
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
