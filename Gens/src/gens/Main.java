/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gens;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author midia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Collection<Etudiant> etudiants;
        
        etudiants = new ArrayList<>();
        
        for (int i = 0; i < 100; i++) {
            etudiants.add(new Etudiant("Nom"+i, "Prenom"+i, Math.random() * 20));
        }
        
        System.out.println("----TRI-----");
        
        Collections.sort((List<Etudiant>) etudiants, new ComparatorEtudiant());
        
        for (Etudiant e : etudiants) {
            System.out.println(e.getNom() + ' ' + e.getNote());
        }
    }
    
    public static void main4(String[] args) {
        Collection<Personne> personnes;
        personnes = new ArrayList<>();
        
        for (int i = 0; i < 100; i++) {
            personnes.add(new Personne("Nom"+i, "Prenom"+i));
        }
        Collections.reverse((List<Personne>) personnes);
        Collections.sort((List<Personne>) personnes, new ComparatorPersonne());
        
        System.out.println("--- Personnes ---");
        
        for (Personne p : personnes) {
            System.out.println(p.getNom());
        }
    }
    
    public static void main3(String[] args) {
        Collection<String> cols;
        cols = new ArrayList<>();
        for (int i = 50; i < 80; i++) {
            cols.add("String" + i);
        }
        
        Collections.sort((List<String>) cols);
        
        Collections.reverse((List<String>) cols);
        
        System.out.println("---Element 3---");
        
        System.out.println(((List) cols).get(3));
        
        Set<String> colsSansDoublon = new TreeSet<String>((List) cols);
        
        System.out.println("---Hash set---");
        
        for (String s : colsSansDoublon) {
            System.out.println(s);
        }
        
    }
    
}
