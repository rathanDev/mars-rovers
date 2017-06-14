package org.jana;

import org.jana.input.InputInfo;
import org.jana.input.RoverWithInstructions;
import org.jana.instruction.Instruction;
import org.jana.util.InputReader;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * Used to test the whole app (integrated)
 */
public class AppTest {

    @Test
    public void test() {

        System.out.println("\n\n\n\n");

        String file = "/home/jana/projects/mars-rovers/etc/InputData.txt";
        System.out.println("Absolute path of input data file = " + file + "\n");

        InputInfo inputInfo = null;
        try {
            inputInfo = InputReader.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<RoverWithInstructions> roverWithInstructionsList = inputInfo.getRoverWithInstructionsList();

        System.out.println("Test Input:");

        //plateau
        System.out.println(inputInfo.getPlateau().getUpperRightXCoordinate() + " " + inputInfo.getPlateau().getUpperRightYCoordinate());

        for (RoverWithInstructions ri : roverWithInstructionsList) {
            Rover rover = ri.getRover();

            //Initially - Rover's location and direction
            System.out.println(rover.getLocation().getXCoordinate() + " " + rover.getLocation().getYCoordinate() + " " + rover.getDirection().letter());

            List<Instruction> instructions = ri.getInstructions();
            for (Instruction instruction : instructions) {
                System.out.print(instruction);
            }
            System.out.println();

            //execute the instructions
            rover.navigate(instructions);
        }


        System.out.println("\nOutput: ");
        for (RoverWithInstructions ri : roverWithInstructionsList) {
            Rover rover = ri.getRover();

            //Finally - rover's location and direction
            System.out.println(rover.getLocation().getXCoordinate() + " " + rover.getLocation().getYCoordinate() + " " + rover.getDirection().letter());
        }

        System.out.println("\n\n\n\n");

    }
}
