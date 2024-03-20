package org.example.presentation;
import org.example.dao.entities.Etudiant;
import  org.example.dao.repositories.EtudiantDao;
import  org.example.metier.EtudiantManager;
import java.util.List;

public class Presentation {


    public static void main(String[] args){
        EtudiantDao etudiantDao = new EtudiantDao();
        EtudiantManager etudiantManager = new EtudiantManager(etudiantDao);
        Etudiant etudiant1 = new Etudiant(1,"nom1","prenom1","nom1.prenom1@gmail.com" );
        Etudiant etudiant2 = new Etudiant(2,"nom2","prenom2","nom2.prenom2@gmail.com" );
        Etudiant etudiant3 = new Etudiant(3,"nom3","prenom3","nom3.prenom3@gmail.com" );
        Etudiant etudiant4 = new Etudiant(4,"nom4","prenom4","nom4.prenom4@gmail.com" );

        etudiantManager.addEtudiant(etudiant1);
        etudiantManager.addEtudiant(etudiant2);
        etudiantManager.addEtudiant(etudiant3);
        etudiantManager.addEtudiant(etudiant4);
        List<Etudiant> allEtudiants= etudiantManager.getAllEtudiants();
            for (Etudiant etudiant:allEtudiants){
                System.out.println(etudiant.toString());
            }
    }
}
