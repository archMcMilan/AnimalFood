import animals.Animal;
import animals.Goat;
import animals.Lion;
import food.Cow;
import food.Grass;

public class Main {
    public static void main(String[] args) {
        Animal predator=new Lion();
        System.out.println(predator.eat(new Grass()));
        System.out.println(predator.eat(new Cow()));

        Animal herbivorous=new Goat();
        System.out.println(herbivorous.eat(new Grass()));
        System.out.println(herbivorous.eat(new Cow()));

        Animal cow=new Cow();
        System.out.println(cow.eat(new Grass()));
        System.out.println(cow.eat(new Cow()));
    }
}
