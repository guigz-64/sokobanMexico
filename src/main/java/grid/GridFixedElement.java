// GridFixedElement.java       Author: De Campou Mathieu
//
//  Represents a method whiwh create a grid with fixed element.
// 
//

package grid;

import element.FixedElement;
import util.Coordinate;

import java.util.List;

public class GridFixedElement implements Grid{

    List<List<FixedElement>> elements;//declaration of a 2 dimension array which will contain FixedElement

    public GridFixedElement(List<List<FixedElement>> elements) {
        this.elements = elements;
    }

    /**
     *
     * @param x
     * @param y
     * @return the element with coord (x,y) or null
     */
    @Override
    public FixedElement get(int x, int y){
        if(x < 0 || x > height() || y < 0 || y > length()) return null;
        return elements.get(x).get(y);
    }

    @Override
    public FixedElement get(Coordinate coord){
        return get(coord.getX(), coord.getY());
    }
    
     /**
     *
     * @return the counter of the number of goals in the grid
     */

    public int getNumGoals() {
        int res = 0;
        for (List<FixedElement> row : elements){
            res += row.stream().filter(element -> element == FixedElement.GOAL).count();//if the element of the Fixed Grid is a GOAL, res take +1
        }
        return res;
    }

    public int height() {
        return elements.size();
    }

    public int length() {
        return elements.get(0).size();
    }
}
