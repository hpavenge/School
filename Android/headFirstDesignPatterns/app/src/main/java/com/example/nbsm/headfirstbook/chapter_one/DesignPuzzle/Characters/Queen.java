package com.example.nbsm.headfirstbook.chapter_one.DesignPuzzle.Characters;

import com.example.nbsm.headfirstbook.chapter_one.DesignPuzzle.WeaponBehaviors.BowAndArrowBehavior;
import com.example.nbsm.headfirstbook.chapter_one.DesignPuzzle.WeaponBehaviors.WeaponBehavior;

/**
 * Created by nbsm on 10-11-2016.
 */

public class Queen extends Character{
    public Queen(){
         weapon = new BowAndArrowBehavior();
    }
}
