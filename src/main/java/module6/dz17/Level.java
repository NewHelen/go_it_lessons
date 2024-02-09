package module6.dz17;

public class Level {

    public static class Point{
        private int x, y;


        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static class LevelInfo{
        private String name;
        private String difficulty;

        public String getName() {
            return name;
        }

        public String getDifficulty() {
            return difficulty;
        }

        public LevelInfo(String name, String difficulty){
            this.name = name;
            this.difficulty = difficulty;
        }
    }


    private Point[] points;
    //private String levelName;

    LevelInfo levelInfo;

    public Level(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }

    public int calculateLevelHash(){
        int hash = 0;

        for (Point point : points) {
            hash += point.getX() * point.getY();
        }

        return hash;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + levelInfo.getName() + ", difficulty is " +  levelInfo.difficulty + ", point count is " + points.length;
    }
}
