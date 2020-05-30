//  Level.java       Author: Puy Guillaume
//
//  Represents a class which creats a field.
//

package level;

public class Level {

    private Field field;

    public Level(Field field) {
        this.field = field;
    }

    public void moveRight(){
        field.moveRight();
    }

    public void moveLeft(){
        field.moveLeft();
    }

    public void moveUp(){
        field.moveUp();
    }

    public void moveDown(){
        field.moveDown();
    }

    public boolean gameOver(){
        return field.getNumPlacedBoxes() == field.getNumGoals();
    }

    @Override
    public String toString() {
        return field.toString();
    }
}
