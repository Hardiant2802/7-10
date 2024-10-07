import java.util.List;

public class Animals {
    String name;
    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean canWalk(){
        return false;
    };
    public boolean canSwim() {
        return false;
    };



    public void print(List<Animals> animalsList) {
        System.out.println("Animals that can swim");
        for (Animals animal : animalsList) {
            if (animal.canSwim()) {
                System.out.println(animal.getName());
            }
        }
        System.out.println("Animals that can Walk");
        for (Animals animal : animalsList) {
            if (animal.canWalk()) {
                System.out.println(animal.getName());
            }
        }
    }

}
