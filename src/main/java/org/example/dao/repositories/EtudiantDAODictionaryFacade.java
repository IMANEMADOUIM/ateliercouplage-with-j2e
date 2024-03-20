package org.example.dao.repositories;
import org.example.dao.entities.Etudiant;


import java.util.*;

/*  Pour une solution solide je propose:
 Pour assurer l'inversion le controle et rendre l'application
extensiable sans modifier le corps des classes d'utiliser une interface "EtudiantDAODictionaryFacade"
et appliquer les normes de bonne pratique(SOLID)
*/
public interface EtudiantDAODictionaryFacade {
    public Etudiant addEtudiant( Long id,Etudiant etudiant);
    public Map<Long,Etudiant>   getAllEtudiants();
    public Etudiant updateEtudiantById(Long id,Etudiant etudiant);


}
