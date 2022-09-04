package exercises.technology;

public class Laptop extends Computer {
    //child class
    private double weight; //in pounds
    private int screenSize; //in inches

    public Laptop(int storage, int ram, boolean hasKeyboard, double weight, int screenSize)  {
        super(storage, ram, hasKeyboard);
        this.weight = weight;
        this.screenSize = screenSize;
    }

    public boolean isClunky()   {
        if (weight > 5.0)   {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean goodForGaming()  {
        if (screenSize >= 20)   {
            return true;
        }
        else {
            return false;
        }
    }
}
