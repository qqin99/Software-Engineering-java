package AnimalExercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AnimalFactory {
//by static factory, you don’t need to instantiate an object to make use of the create method.
    public static Animal create(AnimalType type){
        //@TODO: implement me
        //Animal animal=null;
        if(type.equals(AnimalType.Cat)){
            Animal animal = new Cat("Salmon");
            animal.setAge(Integer.parseInt(new
                    SimpleDateFormat("dd").format(new Date())));
            return animal;
        }
        else if(type.equals(AnimalType.Cow)){
            Animal animal = new Cow("Grass");
            animal.setAge(Integer.parseInt(new
                    SimpleDateFormat("dd").format(new Date())));
            return animal;
        }
        else if(type.equals(AnimalType.Dog)){
            Animal animal = new Dog("Bone");
            animal.setAge(Integer.parseInt(new
                    SimpleDateFormat("dd").format(new Date())));
            return animal;
        }
        else if(type.equals(AnimalType.Duck)){
            Animal animal = new Duck("Rice");
            animal.setAge(Integer.parseInt(new
                    SimpleDateFormat("dd").format(new Date())));
            return animal;
        }

        return null;
    }
}
