//  GridMovableElementBuilder.java       Author: De Campou Mathieu
//
//  Represents a class which implements GridBuilder.
//  Creation of a grid of Movable elements
//

package grid;

import element.MovableElement;
import util.Coordinate;

import java.util.HashMap;

public class GridMovableElementBuilder implements GridBuilder {

    public HashMap<Coordinate, MovableElement> movableElements;

    public GridMovableElementBuilder() {
        movableElements = new HashMap<>();
    }

    public void add(int x, int y, MovableElement element){
        movableElements.put(new Coordinate(x,y), element);
    }

    @Override
    public GridMovableElement build() {
        return new GridMovableElement(movableElements);
    }
}
