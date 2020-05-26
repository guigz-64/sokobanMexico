import level.Level;
import util.LevelReader;

import java.io.IOException;

public class SokobanApplication {
    public static void main(String[] args) throws IOException {
        LevelReader levelReader = new LevelReader();
        Level level = levelReader.read(1);

        log(level.toString());

        log("-- move left --");
        level.moveLeft();
        log(level.toString());

        log("-- move right --");
        level.moveRight();
        log(level.toString());

        log("-- move right --");
        level.moveRight();
        log(level.toString());

        log("-- move right --");
        level.moveRight();
        log(level.toString());

        log("-- move down --");
        level.moveDown();
        log(level.toString());

        log("-- move down --");
        level.moveDown();
        log(level.toString());

        log("-- move down --");
        level.moveDown();
        log(level.toString());

        log("-- move up --");
        level.moveUp();
        log(level.toString());

    }

    private static void log(String s){
        System.out.println(s);
    }
}
