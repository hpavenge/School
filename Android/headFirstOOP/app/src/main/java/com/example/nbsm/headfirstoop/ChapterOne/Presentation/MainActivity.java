package com.example.nbsm.headfirstoop.ChapterOne.Presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.nbsm.headfirstoop.ChapterOne.Domain.Enum.Type;
import com.example.nbsm.headfirstoop.ChapterOne.Domain.Enum.Weight;
import com.example.nbsm.headfirstoop.ChapterOne.Domain.Model.Inventory;
import com.example.nbsm.headfirstoop.ChapterOne.Domain.Model.ItemSpec;
import com.example.nbsm.headfirstoop.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Inventory inventory = new Inventory();
        // test items
        inventory.addItem(1,"Tabisla", Type.HASH,13,10, Weight.HEAVY);
        inventory.addItem(2,"Hiya", Type.HASH,13,8, Weight.HEAVY);
        inventory.addItem(3,"Maroc", Type.HASH,5,6, Weight.HEAVY);
        inventory.addItem(4,"Tabisla", Type.HASH,20,10, Weight.HEAVY);

        ItemSpec searchSpec = new ItemSpec("Tabisla", Type.HASH, Weight.HEAVY);
        List matchingItems = inventory.search(searchSpec);
        if (matchingItems == null){
            System.out.println("niks gevonden");
        }
        else{
            System.out.println(matchingItems.size()+"items gevonden");
        }
    }
}
