package ComputerExercise;

public class Monitor extends ComputerPeripheral{
    public Monitor(Computer computer) {
        super(computer);
    }
//@TODO: Implememnt me
    //  It adds " with monitor" to the original description.
    @Override
    public String getDescription() {
        return computer.getDescription() + " with monitor";
    }

    @Override
    public String run() {
        String runStr = "Monitor turned on\n" + computer.run() + "Display colorful interface\n";
        return runStr;
    }
}
