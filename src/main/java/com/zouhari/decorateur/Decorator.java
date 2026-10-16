package com.zouhari.decorateur;


import com.zouhari.composant.Boisson;

/**
 * @author ZOUHARI Dyae errahmane
 * @Pseudo dezy
 **/
public abstract class Decorator extends Boisson {
    protected Boisson boisson;

    public Decorator(Boisson boisson) {
        this.boisson = boisson;
    }
}
