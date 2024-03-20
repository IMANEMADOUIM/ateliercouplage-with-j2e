package org.example.dao.repositories;

import org.example.dao.entities.Etudiant;

import java.util.List;

public interface EtudiantFacade {
    public Etudiant addEtudiant(Etudiant etudiant);
    public List<Etudiant> getAllEtudiants();



}
