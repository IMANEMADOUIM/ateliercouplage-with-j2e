package org.example.metier;
import  org.example.dao.repositories.EtudiantDao;
import  org.example.dao.entities.Etudiant;

import java.util.List;


public class EtudiantManager implements EtudiantManagerFacade{
    public EtudiantDao etudiantDao;

    public EtudiantManager(EtudiantDao etudiantDao) {
        this.etudiantDao = etudiantDao;
    }

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
       return etudiantDao.addEtudiant(etudiant);
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantDao.getAllEtudiants();
    }
}
