package org.example.dao.repositories;

import org.example.dao.entities.Etudiant;

import org.example.dao.repositories.EtudiantFacade;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDao implements EtudiantFacade {
    private List<Etudiant> etudiants = new ArrayList<>();

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return null;
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return null;
    }



}
