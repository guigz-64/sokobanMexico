package grid;

import element.Element;
import util.Coordinate;

public interface Grid {
    Element get(int x, int y);

    Element get(Coordinate coord);
}
