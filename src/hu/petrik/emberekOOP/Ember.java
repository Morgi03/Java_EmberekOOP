package hu.petrik.emberekOOP;

import java.time.LocalDate;

public class Ember {
    private String nev;
    private String szulDatum;
    private String szulhely;

    public Ember(String nev, String szulDatum, String szulhely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulhely = szulhely;
    }

    public int getSzuletesiEv() {
        return Integer.parseInt(szulDatum.substring(0, 4));
    }
    public int getSzuletesiHonap(){
        return Integer.parseInt(szulDatum.split("-")[1]);
    }
    public int getSzuletesiNap(){
        return Integer.parseInt(szulDatum.split("-")[2]);
    }

    public int getEletkor(){
        LocalDate maiDatum = LocalDate.now();
                return maiDatum.getYear() - this.getSzuletesiEv();
    }

    @Override
    public String toString() {
        return String.format("%-30s %10s %20s", this.nev, this.szulDatum, this.szulhely, this.getEletkor(), getSzuletesiEv());
    }
}
