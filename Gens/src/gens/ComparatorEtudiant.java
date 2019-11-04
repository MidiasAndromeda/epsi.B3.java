/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gens;

import java.util.Comparator;

/**
 *
 * @author Pierre
 */
public class ComparatorEtudiant implements Comparator<Etudiant> {

    @Override
    public int compare(Etudiant a, Etudiant b) {
        if(a.getNote() == b.getNote()){
            return 0;
        }else if(a.getNote() > b.getNote()){
            return 1;
        }else{
            return -1;
        }
    }
    
}
