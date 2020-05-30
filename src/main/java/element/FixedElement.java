//  FixedElement.java       Author: De Campou Mathieu
//
//  Represents enum which implemeents Element.
//  Declarration of the different FixedElement.
//

package element;

public enum FixedElement implements Element {
    WALL("W"),
    FLOOR("F"),
    GOAL("G"),
    NONE("N");

    private String value;

    private FixedElement(String value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return value;
    }
}
