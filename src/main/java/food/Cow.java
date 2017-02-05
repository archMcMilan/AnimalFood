package food;


import animals.Animal;
import types.Type;

public class Cow extends Animal implements Food {

    public int getFoodTypeFor() {
        return Type.PREDATOR;
    }

    public int getAnimalType() {
        return Type.HERBIVOROUS;
    }
}
