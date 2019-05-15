package animals;

import types.Equine;

/**
 * Write a description of class animals.Orangutan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zebra extends Equine
{
    // instance variables - replace the example below with your own
    private String age;

    /**
     * Constructor for objects of class animals.Orangutan
     */
    public Zebra()
    {
        super("Jack", "White with black Strips");
        this.age = "getting old with time";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     *
     */

    @Override
    public String makeNoise()
    {
        // put your code here
        return "Haaaaayyy";
    }
    public String eat() {
        return "Zebras eat the grass around them";
    }

}
