package ComputerExercise;

import java.util.Scanner;

public class Keyboard extends ComputerPeripheral{
//@TODO: Implememnt me

    public Keyboard(Computer computer) {
        super(computer);
    }
    //@TODO: Implememnt me
    //  It adds " with monitor" to the original description.
    @Override
    public String getDescription() {
        return computer.getDescription() + " with keyboard";
    }

    @Override
    public String run() {
        String runStr = null;

        Scanner scanner = new Scanner(System.in);
        String readString = scanner.nextLine();
        // System.out.println(readString);
        if (readString.equals("")) {
            runStr = computer.run();
        }

        return runStr;
    }
}
