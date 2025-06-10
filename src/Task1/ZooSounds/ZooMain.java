package Task1.ZooSounds;

public class ZooMain {
    public static void main(String[] args) {
        Animal[] animals = {new Cow(), new Cat()};

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

}
