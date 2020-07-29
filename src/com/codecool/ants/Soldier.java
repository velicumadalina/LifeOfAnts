package com.codecool.ants;

import java.util.Random;

public class Soldier extends Ant {
    int movementCount = 0;
    Random random = new Random();

    public Soldier(){
        this.typeOfAnt = "Soldier";
        this.positionX = random.nextInt(100);
        this.positionY = random.nextInt(100);
        this.stepX = 1;
        this.stepY = 1;
    }

    @Override
    public void makeStep(int stepNum) {
        if(movementCount == 0 && positionY < 100 && positionY > 0){
            positionY+= stepY;
            movementCount++;
            System.out.println(typeOfAnt + " moved 1 step to the north");
        }
        else if(movementCount ==1 && positionX < 100 && positionX > 0){
            positionX += stepX;
            movementCount++;
            System.out.println(typeOfAnt + " moved 1 step to the right");
        }
        else if(movementCount ==2 && positionY < 100 && positionY > 0){
            positionY -= stepY;
            movementCount++;
            System.out.println(typeOfAnt + " moved 1 step to the south");
        }
        else if(movementCount ==3 && positionX < 100 && positionX > 0){
            positionX -= stepX;
            movementCount =0;
            System.out.println(typeOfAnt + " moved 1 step to the left");
        }
    }

    @Override
    public int getDistanceToQueenX() {
        return 0;
    }

    @Override
    public int getDistanceToQueenY() {
        return 0;
    }


    @Override
    public String getTypeOfAnt() {
        return typeOfAnt;
    }
}
