package ComputerExercise;

public class Monitor extends ComputerPeripheral{
    public Monitor(Computer computer) {
        super(computer);
    }
    //@TODO: Implememnt me
    //@Override
    public String run(){
    return decorateWithMonitor1()+super.run()+ decorateWithMonitor2();
    }

    private String decorateWithMonitor1(){
        return "Monitor turned on\n";
    }

    private String decorateWithMonitor2(){
        return "Display colorful interface\n";
    }

    //@Override
    public String getDescription(){

        return super.getDescription() + descriptionWithMonitor();
    }

    private String descriptionWithMonitor(){
        return " with monitor";
    }
}
