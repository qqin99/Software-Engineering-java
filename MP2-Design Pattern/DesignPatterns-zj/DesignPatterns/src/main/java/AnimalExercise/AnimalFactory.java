package AnimalExercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AnimalFactory {

    public static Animal create(AnimalType type){
        //@TODO: implement me
        Animal animal = null;

        switch (type) {
            case Cat:
                animal = new Cat("Salmon");
                //System.out.println("cat");
                break;
            case Cow:
                animal = new Cow("Grass");
                //System.out.println("cow");
                break;
            case Dog:
                animal = new Dog("Bone");
                break;
            case Duck:
                animal = new Duck("Rice");
                break;
        }
        int age = Integer.parseInt((new SimpleDateFormat("dd")).format(new Date()));
        if (animal != null) {
            animal.setAge(age);
            // System.out.println("\n" + animal.speak() + " created with age: " + age +"\n");
        }
        return animal;
    }
}
