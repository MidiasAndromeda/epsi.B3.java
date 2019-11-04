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
public class ComparatorPersonne implements Comparator<Personne> {

    @Override
    public int compare(Personne o1, Personne o2) {
        return o1.getPrenom().compareTo(o2.getPrenom());
    }
    
}
