package Entities.Exo2;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Formation
{
    private int idFormation;
    private String nomFormation;
    private int prixFormation;

    private ArrayList<Participant> lesParticipants;

    public Formation(int idFormation, String nomFormation, int prixFormation) {
        this.idFormation = idFormation;
        this.nomFormation = nomFormation;
        this.prixFormation = prixFormation;
        this.lesParticipants = new ArrayList<>();
    }

    public void AjouterParticipant(Participant unParticipant)
    {
        lesParticipants.add(unParticipant);
    }

    // Cette méthode permet de compter le nombre de participants
    // réellement présents à la formation.
    public int GetNombreDePresents()
    {
        int nombre_presents = 0;
        for(Participant participant : this.lesParticipants){
            if(participant.isEstPresent()){
                nombre_presents++;
            }
        }

        return nombre_presents;
    }

    // Cette méthode permet de calculer le montant total
    // des frais kilométriques versés pour une formation
    // en ne prenant en compte que les participants présents.
    // On rembourse 1.89 du KM
    public double CalculerFraisRemboursementKilometriques()
    {
        double frais = 0;
        for(Participant participant : this.lesParticipants){
            if(participant.isEstPresent()){
                frais += participant.getNbKm() * 1.89;
            }
        }

        return frais;
    }

    // Cette méthode permet de calculer le taux de présence
    // par rapport au nombre d'inscrits
    public double TauxDePresence()
    {
        System.out.println(lesParticipants.size());
        System.out.println(this.GetNombreDePresents());
        double tx = (float) this.GetNombreDePresents() / lesParticipants.size()  * 100;
        return tx;
    }

    // Cette méthode permet de calculer le bénéfice de la formation.
    // Ce dernier se détermine en multipliant le nombre de présents par le prix de la formation moins
    // les frais kilométriques versés
    public double BeneficeFormation()
    {
        System.out.println(this.GetNombreDePresents() * this.prixFormation);

        return  this.lesParticipants.size() * this.prixFormation - this.CalculerFraisRemboursementKilometriques();
    }
}
