package com.example.nbsm.headfirstbook.chapter_one.DesignPuzzle.Characters;

import com.example.nbsm.headfirstbook.chapter_one.DesignPuzzle.WeaponBehaviors.SwordBehavior;
import com.example.nbsm.headfirstbook.chapter_one.DesignPuzzle.WeaponBehaviors.WeaponBehavior;

/**
 * Created by nbsm on 10-11-2016.
 */

public class King extends Character {

    public King(){
        weapon = new SwordBehavior();
    }
}
