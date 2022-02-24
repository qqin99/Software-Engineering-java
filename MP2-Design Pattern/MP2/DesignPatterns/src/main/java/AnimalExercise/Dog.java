package AnimalExercise;

public class Dog extends Animal{
    //@TODO: implement me
    public Dog(String backpack) {
        super(backpack);
    }

    @Override
    public String speak(){
        return "Woof";
    }
}

