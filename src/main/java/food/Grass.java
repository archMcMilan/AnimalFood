package food;

import types.Type;

public class Grass implements Food{

    public int getFoodTypeFor() {
        return Type.HERBIVOROUS;
    }
}
