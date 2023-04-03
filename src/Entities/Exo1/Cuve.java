package Entities.Exo1;

public class Cuve extends Captage implements IVolume
{

    private int largeur;
    private int longueur;

    public Cuve(int idCaptage, String nom, int hauteur, int debit_max, int largeur, int longueur) {
        super(idCaptage, nom, hauteur, debit_max);
        this.largeur = largeur;
        this.longueur = longueur;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " - longueur " + this.longueur + " - largeur " + this.largeur;
    }

    @Override
    public double GetVolume() {
        return this.longueur * this.largeur;
    }
}
