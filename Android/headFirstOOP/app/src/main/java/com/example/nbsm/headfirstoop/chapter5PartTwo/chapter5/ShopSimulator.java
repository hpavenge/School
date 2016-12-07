package com.example.nbsm.headfirstoop.chapter5PartTwo.chapter5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.nbsm.headfirstoop.R;
import com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.Enums.Type;
import com.example.nbsm.headfirstoop.chapter5PartTwo.chapter5.Domain.Instruments.Enums.InstrumentType;
import com.example.nbsm.headfirstoop.chapter5PartTwo.chapter5.Domain.Instruments.Instrument;
import com.example.nbsm.headfirstoop.chapter5PartTwo.chapter5.Domain.Instruments.InstrumentSpec;
import com.example.nbsm.headfirstoop.chapter5PartTwo.chapter5.Data.Inventory;
import com.example.nbsm.headfirstoop.chapter5PartTwo.chapter5.Domain.Instruments.Enums.Builder;
import com.example.nbsm.headfirstoop.chapter5PartTwo.chapter5.Domain.Instruments.Enums.Wood;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ShopSimulator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_simulator);
        Inventory inventory = new Inventory();
        fillInventory(inventory);

        Map properties  = new HashMap();
        properties.put("builder", Builder.GIBSON);
        properties.put("backwood", Wood.MAPLE);
        InstrumentSpec clientSpec = new InstrumentSpec(properties);
        List<Instrument> matchingInstruments = inventory.search(clientSpec);

        if (!matchingInstruments.isEmpty()){
            for (Instrument instrument : matchingInstruments){
                InstrumentSpec spec = instrument.getSpec();
                System.out.println("Yo son we got"+spec.getProperty("instrumentType")+"with the following properties");
                // oldschool for
                for (Iterator i  = spec.getProperties().keySet().iterator(); i.hasNext();){
                    String propertyName = (String) i.next();
                    if (propertyName.equals("instrumentType")){
                        System.out.println(""+propertyName+": "+spec.getProperty(propertyName));
                    }
                }
                System.out.println("You can have this " + spec.getProperty("instrumentType") + "for $" + instrument.getPrice()+ "\n----");
            }
        }
        else{
            System.out.println("Sorry, we got jack shit for u");
        }
    }

    public void fillInventory(Inventory inventory){
        Map properties = new HashMap();
        InstrumentSpec newSpec;
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder",Builder.COLLINGS);
        properties.put("model","CJ");
        properties.put("type", Type.ACOUSTIC);
        properties.put("numStrings",6);
        properties.put("topWood", Wood.INDIAN_ROSEWOOD);
        properties.put("backWood",Wood.SITKA);
        newSpec = new InstrumentSpec(properties);
        inventory.addInstrument("11277",3999.95,newSpec);

        // shortcut not reusing last properties
        properties.put("builder",Builder.MARTIN);
        properties.put("model","D-18");
        properties.put("topWood", Wood.MAHOGANY);
        properties.put("backWood",Wood.ADIRONDACK);
        newSpec = new InstrumentSpec(properties);
        inventory.addInstrument("122784",5495.95,newSpec);

        // same story use the same map properties if stay the same
        properties.put("builder",Builder.FENDER);
        properties.put("model","Stratocastor");
        properties.put("type", Type.ELECTRIC);
        properties.put("topWood", Wood.ALDER);
        properties.put("backWood",Wood.ALDER);
        newSpec = new InstrumentSpec(properties);
        inventory.addInstrument("V95693",1499.95,newSpec);
        // just diff serialnumber and price
        inventory.addInstrument("V9512",1549.95,newSpec);

        properties.put("builder",Builder.GIBSON);
        properties.put("model","Les Paul");
        properties.put("topWood", Wood.MAPLE);
        properties.put("backWood",Wood.MAPLE);
        newSpec = new InstrumentSpec(properties);
        inventory.addInstrument("70108276",2295.95,newSpec);

        properties.put("model","SG `61 Reissue");
        properties.put("topWood", Wood.MAHOGANY);
        properties.put("backWood",Wood.MAHOGANY);
        newSpec = new InstrumentSpec(properties);
        inventory.addInstrument("82765501",1890.95,newSpec);

        properties.put("instrumentType",InstrumentType.MANDOLIN);
        properties.put("type", Type.ACOUSTIC);
        properties.put("model","Les Paul");
        properties.put("topWood", Wood.MAPLE);
        properties.put("backWood",Wood.MAPLE);
        properties.remove("numStrings");
        newSpec = new InstrumentSpec(properties);
        inventory.addInstrument("9019920",5495.99,newSpec);

        properties.put("instrumentType",InstrumentType.BANJO);
        properties.put("model","RB-3 Wreath");
        properties.remove("topWood");
        properties.put("numStrings", 5);
        newSpec = new InstrumentSpec(properties);
        inventory.addInstrument("8900231",2945.95,newSpec);
    }
}
