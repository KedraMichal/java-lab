package main;


import main.Maps.Jungle;
import main.Maps.MapSimulation;

public class World {

    public static void main(String[] args){
        MapSimulation mapS = new MapSimulation(new Jungle(), 10);
        mapS.runGame();





//        try {
//            String[] arg = new String[]{"f", "b", "r", "l", "f"};
//            MoveDirection[] directions = new OptionsParser().parser(arg);
//            IWorldMap map = new GrassField(10);
//            Vector2d[] positions = {new Vector2d(2, 2), new Vector2d(3, 4)};
//            // 2,3 3,3  - 2,3E 3,3W  2,3E
//            IEngine engine = new SimulationEngine(directions, map, positions);
//            engine.run();
//
//            System.out.println(map);
//            for (Animal an : map.getAnimals().values()) {
//                System.out.println(an.getPosition());
//            }
//        }
//        catch (IllegalArgumentException exception){
//            System.out.println(exception);
//        }

}
}


