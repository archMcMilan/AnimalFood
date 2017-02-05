package animals;

import food.Food;
import lombok.Data;

@Data
public abstract class Animal {
    public boolean eat(Food food){
        return this.getAnimalType()==food.getFoodTypeFor();
    }
    public abstract int getAnimalType();
}
