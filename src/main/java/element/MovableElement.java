//  MovableElement.java       Author: De Campou Mathieu 
//
//  Represents an enum which implements Element.
//  Declaration of the different MovableElement
//

package element;

public enum MovableElement implements Element {
    BOX("B"),
    PLACED_BOX("P"),
    CHARACTER("C");

    private String value;

    MovableElement(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return value;
    }
}
