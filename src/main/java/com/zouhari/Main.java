package com.zouhari;


import com.zouhari.composant.Boisson;
import com.zouhari.composant.Espresso;
import com.zouhari.composant.Sumatra;

/**
 * @author ZOUHARI Dyae errahmane
 * @Pseudo dezy
 **/
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Boisson boisson1 = new Sumatra();
        System.out.println(boisson1.getDescription());
        System.out.println(boisson1.cout());

        Boisson boisson2 = new Espresso();
        System.out.println(boisson2.getDescription());
        System.out.println(boisson2.cout());

        }
    }
