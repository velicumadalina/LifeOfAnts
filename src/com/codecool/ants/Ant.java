package com.codecool.ants;

public abstract class Ant implements AntInterface{
    int positionX;
    int positionY;
    int stepX;
    int stepY;
    String typeOfAnt;
    public Ant(){
    }

    public abstract void makeStep(int stepNum);
    public abstract int getDistanceToQueenX();
    public abstract int getDistanceToQueenY();

}
