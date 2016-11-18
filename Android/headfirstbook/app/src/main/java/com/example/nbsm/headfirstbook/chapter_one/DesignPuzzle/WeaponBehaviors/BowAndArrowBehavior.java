package com.example.nbsm.headfirstbook.chapter_one.DesignPuzzle.WeaponBehaviors;

/**
 * Created by nbsm on 10-11-2016.
 */

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Bow and Arrow Shooting");
    }
}
