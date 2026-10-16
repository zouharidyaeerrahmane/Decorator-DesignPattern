package com.zouhari.decorateur;


import com.zouhari.composant.Boisson;

/**
 * @author ZOUHARI Dyae errahmane
 * @Pseudo dezy
 **/
public class Chocolat extends Decorator {

    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override public double cout() {
        return 1.2 + boisson.cout();
    }
    @Override public String getDescription() {
        return boisson.getDescription() + " au chocolat";
    }

}
