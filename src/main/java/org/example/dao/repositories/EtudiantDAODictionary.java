package org.example.dao.repositories;
import org.example.dao.entities.Etudiant;




import java.util.*;


public class EtudiantDAODictionary implements EtudiantDAODictionaryFacade {
    private Map<Long, Etudiant> etudiantsMap = new HashMap<>();

    public EtudiantDAODictionary(Map<Long, Etudiant> etudiantsMap) {
        this.etudiantsMap = etudiantsMap;
    }


    public Etudiant addEtudiant(Long id, Etudiant etudiant) {
        return etudiantsMap.put(id, etudiant);

    }


    public Map<Long, Etudiant> getAllEtudiants() {
        return etudiantsMap;
    }

    /* Les changements effectuées sont : changer la structure de données Liste par un dictionnaire
    [Map<String,Etudiant>etudiantMap]
    ce qui a entrainer le changement du corps des deux méthodes addEtudiant(), geaAllEtudiants();
    et le usage de l'interface EtudiantFacade

     */
    public Etudiant updateEtudiantById(Long id, Etudiant etudiant) {
        if (etudiantsMap.containsKey(id)) {

            etudiantsMap.put(id, etudiant);
            System.out.println("Informations de l'étudiant mises à jour avec succès.");

        } else {

            System.out.println("Aucun étudiant trouvé avec cet ID.");
        }


        return etudiant;
    }
}