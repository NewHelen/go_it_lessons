package module5.dz25;

public class PlanetTester {

    public String test(SpaceObject object){

        if (object instanceof Planet){
            return "planet";
        }
        else {
            return "not planet";
        }
    }
}
