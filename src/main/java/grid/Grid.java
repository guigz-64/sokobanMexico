//  Grid.java       Author: Puy Guillaume
//
//  Represents a interface.
//  It is used to have the coordinates of a token.
//

package grid;

import element.Element;
import util.Coordinate;

public interface Grid {
    Element get(int x, int y);

    Element get(Coordinate coord);
}
