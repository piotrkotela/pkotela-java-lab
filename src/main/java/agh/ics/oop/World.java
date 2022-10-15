package agh.ics.oop;

// " " - do stringów
// ' ' - do charów
public class World {
    public static Direction[] modify(String[] stringDirections) {
        Direction[] array = new Direction[stringDirections.length];
        for(int i = 0; i < stringDirections.length; i++){
            switch (stringDirections[i]) {
                case "f" -> array[i] = Direction.FORWARD;
                case "b" -> array[i] = Direction.BACKWARD;
                case "r" -> array[i] = Direction.RIGHT;
                case "l" -> array[i] = Direction.LEFT;
                default -> array[i] = Direction.NULL;
            }
        }
        return array;
    }
    public static void run(Direction[] directions) {
        for(Direction direction : directions){
            switch (direction) {
                case FORWARD -> System.out.println("zwierzak idzie do przodu");
                case BACKWARD -> System.out.println("zwierzak idzie do tyłu");
                case RIGHT -> System.out.println("zwierzak skręca w prawo");
                case LEFT -> System.out.println("zwierzak skręca w lewo");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("start");
        Direction[] directions = modify(args);
        run(directions);
        System.out.println("stop");
    }
}