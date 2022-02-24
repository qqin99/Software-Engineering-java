package ComputerExercise;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class Keyboard extends ComputerPeripheral{
//@TODO: Implememnt me

    public Keyboard(Computer computer) {
        super(computer);
    }

    public String run(){
        return super.run();
    }

    //Scanner scanner = new Scanner(System.in);
    //ByteArrayInputStream in = new ByteArrayInputStream("\n".getBytes());
    //System.setIn(in);
    //ByteArrayInputStream in = new ByteArrayInputStream(System.in);
    //FileInputStream in = new FileInputStream();
    public String getDescription(){
        //String readString = scanner.next(); //wait for user to press enter but user might not, it will wait till time out
        //nextln, keep checking the next character instead of line

        //if (readString=="\n") {
            return super.getDescription() + descriptionWithKeyboard();
        //}
        //return super.getDescription();
    }

    private String descriptionWithKeyboard(){
        return " with keyboard";
    }
}
