package Fruits;

public class Mango extends Fruit {


    public Mango() {
        fruitLife = 1;
        sliced = false;
        this.length = 2; //to be determined//
        this.width = 1; //to be determined//
        points = fruitLife * 10;

    }

    @Override
    public String FruitType() {
        return "Mango";
    }
}