/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gens;

import java.util.ArrayList;

/**
 *
 * @author Pierre
 */
public class Etudiant extends Personne {
    private double note;
    
    public Etudiant(String nom, String prenom, double note){
        super(nom, prenom);
        this.note = note;
    }    

    public double getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }
    
}
