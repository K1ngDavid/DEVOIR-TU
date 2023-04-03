package Vues;

import Entities.Exo1.Captage;
import Entities.Exo1.Cuve;
import Entities.Exo1.Forage;
import Tools.ModelJTable;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrmMenu extends JFrame{
    private JPanel pnlRoot;
    private JTable tblCaptages;
    ArrayList<Captage> mesCaptages;
    ModelJTable mdl;

    public FrmMenu()
    {
        this.setTitle("Devoir - Concepts POO");
        this.setContentPane(pnlRoot);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);

        mdl = new ModelJTable();
        mesCaptages = new ArrayList<>();
        LoadDatas();



        // A compléter ici
    }

    public void LoadDatas()
    {
        Captage cap1 = new Captage(3,"Captage du bois du pin", 23, 500);
        Captage cap2 = new Captage(5,"Captage du lac", 37, 780);
        Forage for1 = new Forage(1,"Forage de l'enfer", 17, 56, 6);
        Forage for2 = new Forage(6,"Forage des 4 chemins", 32, 72, 9);
        Cuve cuve1 = new Cuve(2,"Cuve du centre", 3, 14, 12, 2);
        Cuve cuve2 = new Cuve(4,"Cuve de l'avenir", 6, 15, 8, 4);
        mesCaptages.add(cap1);mesCaptages.add(cap2);
        mesCaptages.add(for1);mesCaptages.add(for2);
        mesCaptages.add(cuve1);mesCaptages.add(cuve2);
        Collections.sort(mesCaptages);
        mdl.loadDatasCaptage(mesCaptages);
        tblCaptages.setModel(mdl);

//        List<Captage> list = new ArrayList<Captage>();
//        list = mesCaptages;
//        System.out.println(Collections.sort(list));
    }
}
