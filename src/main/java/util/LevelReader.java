//  LevelReader.java       Author: Puy Guillaume
//
//  Represents a class which save a party in a file.
//

package util;

import element.FixedElement;
import element.MovableElement;
import grid.*;
import level.Field;
import level.Level;

import java.io.*;
import java.util.Scanner;

public class LevelReader {

    private FileReader fileReader;

    private Scanner scanner;

    public LevelReader() {
    }

    public Level read(int numLevel) throws IOException {
        initReaders(numLevel);

        Coordinate characterCoord = readCharacterCoord();

        GridFixedElementBuilder gridFixedElementBuilder = new GridFixedElementBuilder();
        GridMovableElementBuilder gridMovableElementBuilder = new GridMovableElementBuilder();

        int c;
        int i = 0;
        int j = 0;
        while((c = fileReader.read()) != -1){
            switch (c){
                case 'W':
                    gridFixedElementBuilder.add(FixedElement.WALL);
                    break;
                case 'F':
                    gridFixedElementBuilder.add(FixedElement.FLOOR);
                    break;
                case 'G':
                    gridFixedElementBuilder.add(FixedElement.GOAL);
                    break;
                case 'N':
                    gridFixedElementBuilder.add(FixedElement.NONE);
                    break;
                case 'B':
                    gridMovableElementBuilder.add(i, j, MovableElement.BOX);
                    gridFixedElementBuilder.add(FixedElement.FLOOR);
                    break;
                case 'P':
                    gridMovableElementBuilder.add(i, j, MovableElement.PLACED_BOX);
                    gridFixedElementBuilder.add(FixedElement.GOAL);
                    break;
                case'\n':
                    i++;
                    j = 0;
                    gridFixedElementBuilder.newLine();
                    break;
                default:
                    throw new IOException("Wrong character"); //TODO Create exception
            }
            if(c != '\n') j++;
        }

        Field field = new Field(characterCoord, gridFixedElementBuilder.build(), gridMovableElementBuilder.build());
        return new Level(field);
    }

    private void initReaders(int numLevel) {
        try {
            String path = "levels/";
            this.fileReader = new FileReader(path + numLevel + ".txt");
            int c = fileReader.read();
            while(c != '\n') c = fileReader.read();
            this.scanner = new Scanner(new FileInputStream(path + numLevel + ".txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Coordinate readCharacterCoord() throws IOException {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();
        return new Coordinate(x,y);
    }
}
