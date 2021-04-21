package interfacedemo;

/**
 *
 @author Quang LY
 */
public interface Bicycle {
    //  wheel revolutions per minute
    void changePedalRate(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}


