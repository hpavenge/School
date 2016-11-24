package com.example.nbsm.headfirstbook.chapter_one.DesignPuzzle.Characters;

import com.example.nbsm.headfirstbook.chapter_one.DesignPuzzle.WeaponBehaviors.WeaponBehavior;

/**
 * Created by nbsm on 10-11-2016.
 */

public class Character {
    WeaponBehavior weapon;

    public void Fight(){
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior wp){
        weapon = wp;
    }
}
