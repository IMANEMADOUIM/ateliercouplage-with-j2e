package org.example.metier;
import  org.example.dao.entities.Etudiant;

import java.util.List;
public interface EtudiantManagerFacade {
    public Etudiant addEtudiant (Etudiant etudiant);
    public List<Etudiant> getAllEtudiants();
}
