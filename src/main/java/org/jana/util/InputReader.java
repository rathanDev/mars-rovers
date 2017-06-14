package org.jana.util;

import org.jana.Rover;
import org.jana.input.InputInfo;
import org.jana.input.RoverWithInstructions;
import org.jana.instruction.Instruction;
import org.jana.instruction.Move;
import org.jana.instruction.TurnLeft;
import org.jana.instruction.TurnRight;
import org.jana.position.Direction;
import org.jana.position.Location;
import org.jana.position.Plateau;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Reads the InputData.txt file and create InputInfo object from it
 */
public class InputReader {

    public static InputInfo read(String file) throws IOException {

        String plateauLine;
        List<String> roverLines = new ArrayList<>();
        List<String> instructionLines = new ArrayList<>();

        //read file
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            plateauLine = reader.readLine();

            String line;
            int lineNo = 2;
            while ((line = reader.readLine()) != null) {

                if ((lineNo % 2) == 0) {
                    roverLines.add(line);
                } else {
                    instructionLines.add(line);
                }
                lineNo ++;
            }

        } catch (IOException e) {
            throw e;
        }

        if (roverLines.size() != instructionLines.size()) {
            throw new UnsupportedEncodingException("Number of rovers and no of instruction series are not matching");
        }

        //create plateau
        Plateau plateau = new Plateau(Character.getNumericValue(plateauLine.charAt(0)), Character.getNumericValue(plateauLine.charAt(2)));

        List<RoverWithInstructions> roverWithInstructionsList = new ArrayList<>();

        //create rovers and instructions
        for (int i = 0; i < roverLines.size(); i++) {

            //create rovers
            String roverLine = roverLines.get(i);
            Direction direction = Direction.of(roverLine.charAt(4));
            Location location = new Location(Character.getNumericValue(roverLine.charAt(0)), Character.getNumericValue(roverLine.charAt(2)));
            Rover rover = new Rover(direction, location, plateau);

            //create instructions
            String instructionLine = instructionLines.get(i);
            List<Instruction> instructions = new ArrayList<>();
            for (char ch : instructionLine.toCharArray()) {
                if (ch == 'L') {
                    instructions.add(new TurnLeft());
                } else if (ch == 'R') {
                    instructions.add(new TurnRight());
                } else if (ch == 'M') {
                    instructions.add(new Move());
                } else {
                    throw new UnsupportedOperationException("Unsupported instruction");
                }
            }

            roverWithInstructionsList.add(new RoverWithInstructions(rover, instructions));
        }

        return new InputInfo(plateau, roverWithInstructionsList);
    }

}
