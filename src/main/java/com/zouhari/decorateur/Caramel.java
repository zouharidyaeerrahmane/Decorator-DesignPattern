package com.zouhari.decorateur;


import com.zouhari.composant.Boisson;

/**
 * @author ZOUHARI Dyae errahmane
 * @Pseudo dezy
 **/
public class Caramel extends Decorator {

    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override public double cout() {
        return 0.8 + boisson.cout();
    }
    @Override public String getDescription() {
        return boisson.getDescription() + " au caramel";
    }

}
