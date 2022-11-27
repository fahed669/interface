/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prositinterface;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maato
 */
public class Prositinterface {
    public static void main(String[] args) {
        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant(1258, 33, "fasko"));
        etudiants.add(new Etudiant(1158, 23, "majd"));
        etudiants.add(new Etudiant(1058, 13, "Yacine"));
        etudiants.add(new Etudiant(1005, 11, "wahchi"));

        ListEtudiant listEtudiant = new ListEtudiant();

        listEtudiant.afficherEtudiants(etudiants, t -> System.out.println(t));

        System.out.println(" \n**");
        listEtudiant.afficherEtudiantsSelonFiltre(etudiants, x -> x.getAge() >= 20 && x.getAge() <= 40, t -> System.out.println(t));

        System.out.println(" \n**");
        System.out.println(listEtudiant.afficherNomEtudiant(etudiants, (t) -> t.getNom()));

        Etudiant createdEtudiant = listEtudiant.creeEtudiant(()-> new Etudiant());
    }
    
}
