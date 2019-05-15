package types;
import main.Animal;
import animal_qualities.Swimming;

public class Reptile extends Animal implements Swimming {
    public Reptile(){
        super("types.Reptile", "The walk around the earth and can also swim");
    }
    public Reptile(String name, String desc){
        super(name, desc);
    }
    public String makeNoise()
    {
        return "";
    }
    public String eat()
    {
        return "Other small animals";
    }
    public String swim() {
        return "Swims around minding it's own business";
    }
}

