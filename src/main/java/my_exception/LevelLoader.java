package my_exception;

public class LevelLoader {
    public void load(Level level) throws LevelTooBigException {

        if ( level.getWidth()* level.getHeight() < 100000) {
            System.out.println("Level loaded");
        }else {
            // my exception
            throw new LevelTooBigException();
        }
    }
}
