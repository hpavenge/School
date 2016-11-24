package com.example.nbsm.headfirstbook.chapter_one.DesignPuzzle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nbsm.headfirstbook.R;
import com.example.nbsm.headfirstbook.chapter_one.DesignPuzzle.Characters.Character;
import com.example.nbsm.headfirstbook.chapter_one.DesignPuzzle.Characters.King;
import com.example.nbsm.headfirstbook.chapter_one.DesignPuzzle.WeaponBehaviors.AxeBehavior;
import com.example.nbsm.headfirstbook.chapter_one.DesignPuzzle.WeaponBehaviors.WeaponBehavior;

public class DesignPuzzle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_puzzle);
        Character King = new King();
        King.Fight();
        WeaponBehavior specialWeapon = new AxeBehavior();
        King.setWeapon(specialWeapon);
        King.Fight();
    }
}
