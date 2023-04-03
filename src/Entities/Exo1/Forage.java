package Entities.Exo1;

public class Forage extends Captage implements IVolume
{
    private int diametre;

    public Forage(int idCaptage, String nom, int hauteur, int debit_max, int diametre) {
        super(idCaptage, nom, hauteur, debit_max);
        this.diametre = diametre;
    }


    @Override
    public String getDescription() {
        return super.getDescription() + " - diametre " + this.diametre;
    }

    @Override
    public double GetVolume() {
        return Math.PI * this.diametre * super.hauteur;
    }
}
