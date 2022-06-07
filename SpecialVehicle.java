package BatchMarch;

public interface SpecialVehicle {

    int a=5;
    default void drive(){
        System.out.println("drive me");
    }
    void speialBrake();
}
