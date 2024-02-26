package com.mygdx.game;

import java.util.ArrayList;
import java.util.Random;

public class Trap {

    private ArrayList<int[]> objects;
    private int[] trapXY;
    private int x;
    private int y;
    Random rand=new Random();
    public Trap(){
        objects = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            x = 25 * rand.nextInt(20);
            y = 25 * rand.nextInt(20);
            trapXY = new int[]{x, y};
            objects.add(trapXY);
        }
    }
    public int[] getObjects(int index) {
        return objects.get(index);
    }
}
