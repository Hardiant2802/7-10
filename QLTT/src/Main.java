import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Animals> animalsList = new ArrayList<>();
        Duck duck = new Duck("Duck");
        Fish fish = new Fish("Fish");
        Pig pig = new Pig("Pig");
        animalsList.add(duck);
        animalsList.add(fish);
        animalsList.add(pig);
        Animals animals = new Animals("");
        animals.print(animalsList);
    }
}
