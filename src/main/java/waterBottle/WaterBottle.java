package waterBottle;

public class WaterBottle {
    private int volume ;
//    private boolean bottleIsEmpty=false;
    public WaterBottle(int volume){
        this.volume=volume;
    }
    public int getVolume(){

        return volume;
    }

    public void drink(){

        this.volume -= 10;
    }
    public void empty(){
        this.volume=0;
//        this.bottleIsEmpty=true;
    }
    public void fillUp(){
        if (this.volume == 0){
            this.volume = 100;
        }
    }

}



//    Create a water bottle class with a volume property.
//        The volume should start at 100.
//        Add a drink function that takes 10 from the volume each time it is called.
//        Create an empty function that brings the volume down to 0.
//        Create a fill function that fills the volume back to 100.
