package gameObject.fruits;

import gameObject.GameObject;
import initilalizer.GameLoop;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public abstract class Fruit extends GameObject {

    protected ObjectType objectType = ObjectType.fruit;
    private boolean flag = false;

    @Override
    public ObjectType getObjectType() {
        return objectType;
    }


    public Fruit() {
    }

    ;

    public Fruit(int x, int y) {
        super(x, y);
        Random randomDirection=new Random();
     if(xCoordinate<200)
     velocityX=1.5;
     else if(xCoordinate>300)
         velocityX=-1.5;
     else
     {velocityX = -2+randomDirection.nextInt(5);}
        velocityY =8;
    }

    public void tick() {
        xCoordinate+=velocityX;
        yCoordinate -= velocityY;
        Random maxHeight=new Random();
        if (flag&& yCoordinate == GameLoop.HEIGHT - 32) yCoordinate = GameLoop.HEIGHT;
      if (yCoordinate <= maxHeight.nextInt(300) || (yCoordinate >= GameLoop.HEIGHT - 32 && !flag)) {
            velocityY-=0.35;
            flag = true;
        }
    }

    public void render(Graphics graphics) {
        //graphics.setColor(Color.white);
        //graphics.fillRect(xCoordinate, yCoordinate, 32, 32);
        //graphics.fillRoundRect(xCoordinate, yCoordinate, 32, 32, 32, 32);
    }

}
