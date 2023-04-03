package Entities.Exo1;

public class Captage implements Comparable<Captage>
{
    private int idCaptage;
    private String nom;
    protected int hauteur;
    public int debit_max;

    public Captage(int idCaptage, String nom, int hauteur, int debit_max) {
        this.idCaptage = idCaptage;
        this.nom = nom;
        this.hauteur = hauteur;
        this.debit_max = debit_max;
    }


    public String getDescription() {
        return nom + " - " + hauteur + " mètres - " + debit_max + " litres";
    }


    public int getIdCaptage() {
        return idCaptage;
    }

    @Override
    public int compareTo(Captage c) {
        return this.debit_max - c.debit_max;
    }
}
