package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    // Monster do not have weapons but only just their natural claws and fangs as we are gonna do here
    // So the point is by creating this other class, you can still use the other methods and create some pretty cool code
    // that actually saves the state of the monsters.
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);

        return values;
    }

    @Override
    public void read(List<String> strings) {
        if (strings != null && strings.size() > 0) {
            this.name = strings.get(0);
            this.hitPoints = Integer.parseInt(strings.get(1));
            this.strength = Integer.parseInt(strings.get(2));
        }
    }


    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
