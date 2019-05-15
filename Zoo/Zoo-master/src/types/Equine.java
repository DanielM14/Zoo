package types;
import animal_qualities.Running;
import main.Animal;

public class Equine extends Animal implements Running {
    public Equine(String name, String desc){
        super(name, desc);
    }

    public Equine() {
        super("Equine", "They run around in the fields");
    }

    public String makeNoise()
    {
        return "Chirps";
    }
    public String eat()
    {
        return "Worms and Seeds";
    }
    public String run() {
        return "Just eat grass and run around";
    }
}