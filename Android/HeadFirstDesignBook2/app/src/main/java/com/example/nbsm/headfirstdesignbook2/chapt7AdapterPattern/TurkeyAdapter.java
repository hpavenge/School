package com.example.nbsm.headfirstdesignbook2.chapt7AdapterPattern;

/**
 * Created by nbsm on 21-12-2016.
 * Now, let’s say you’re short on Duck objects and you’d like to
 use some Turkey objects in their place. Obviously we can’t
 use the turkeys outright because they have a different interface.
 So, let’s write an Adapter:
 */

// Converts a Turkey to a duck as a bridge between them
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        /**
         * Even though both interfaces have a fly()
         method, Turkeys fly in short spurts - they
         can’t do long-distance flying like ducks. To
         map between a Duck’s fly() method and a
         Turkey’s, we need to call the Turkey’s fly()
         method five times to make up for it.
         */

        for(int i=0; i < 5; i++) {
            turkey.fly();
        }
    }
}
