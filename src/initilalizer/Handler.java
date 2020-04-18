package initilalizer;

import gameObject.GameObject;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Handler {
    //LinkedList<GameObject> listOfObjects=new LinkedList<GameObject>();
    List<GameObject> listOfObjects;

    public Handler() {
        this.listOfObjects = new ArrayList<>();
    }

    public void tick() {
    	/**m7dsh yghayr el loop dy lel tanya,CM exception**/
        for (int i = 0; i < listOfObjects.size(); i++) {
            GameObject object = listOfObjects.get(i);
            object.tick();
        }
    }

    public void render(Graphics graphics) {
		/**m7dsh yghayr el loop dy lel tanya,CM exception**/
		for (int i = 0; i < listOfObjects.size(); i++) {
            GameObject object = listOfObjects.get(i);
            object.render(graphics);
        }

    }

    public void addObject(GameObject object) {
        this.listOfObjects.add(object);
    }

  /*  public void removeObject(GameObject object) {
        this.listOfObjects.remove(object);
    }*/
}