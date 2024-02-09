package module5.dz18;

public class SpaceUtils {
    public static final int PLANET_COUNT = 8;
    public static final String HOME_PLANET_NAME = "Earth";
    public static final String HOME_STAR_NAME = "Sun";

    public static String pluralPlanets(int planetCount){
        if (planetCount > 1){
            return planetCount + " planets";
        }else {
            return "1 planet";
        }
    }
}
