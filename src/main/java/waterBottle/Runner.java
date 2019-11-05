package waterBottle;

public class Runner {
    public static void main(String[] args) {
        WaterBottle bottle = new WaterBottle(100);
        System.out.println("initial bottle volume "+bottle.getVolume());

        bottle.drink();
        System.out.println("after drink bottle volume "+bottle.getVolume());

        bottle.empty();
        System.out.println("after empty "+bottle.getVolume());

        bottle.fillUp();
        System.out.println("if empty :"+bottle.getVolume());
    }
}
