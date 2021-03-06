package grid;

import element.FixedElement;

import java.util.ArrayList;
import java.util.List;

public class GridFixedElementBuilder implements GridBuilder {

    private List<List<FixedElement>> fixedElements;

    private int indexCurrentRow = 0;

    private int indexCurrentCol = 0;

    public GridFixedElementBuilder() {
        fixedElements = new ArrayList<>();
        fixedElements.add(new ArrayList<>());
    }

    /**
     * Adds the given fixedElement in the List fixedElement.
     * Increments indexCurrentCow.
     *
     * @param fixedElement The element to add.
     */
    public void add(FixedElement fixedElement){
        fixedElements.get(indexCurrentRow).add(indexCurrentCol++, fixedElement);
    }

    /**
     * Increments indexCurrentRow then adds a new line in the List fixedElements.
     */
    public void newLine(){
        fixedElements.add(++indexCurrentRow, new ArrayList<>());
        indexCurrentCol = 0;
    }

    @Override
    public GridFixedElement build(){
        return new GridFixedElement(fixedElements);
    }
}
