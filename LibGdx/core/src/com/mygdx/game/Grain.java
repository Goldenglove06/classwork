package com.mygdx.game;

import java.util.ArrayList;

public class Grain {
  private float[] objectValues;
  private ArrayList<float[]> objects;
public Grain(){
    objects=new ArrayList<>();
}
    public void addGrain(int x, int y,float velX,float accX,float velY,float accY,boolean moving){
      float [] objectValues={x,y,velX,accX,velY,accY};
      objects.add(objectValues);
    }
   public float[] getGrain(int index){
       return objects.get(index);
   }
   public void setGrain(int index,int x, int y,float velX,float accX,float velY,float accY,boolean moving){
       float [] objectValues={x,y,velX,accX,velY,accY};
       objects.set(index,objectValues);
   }
public int countGrain(){
    return objects.size();
}
}

