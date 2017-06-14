package org.jana.input;

import org.jana.Rover;
import org.jana.instruction.Instruction;

import java.util.List;

/**
 * Used to keep Rover and its series of instructions together
 */
public class RoverWithInstructions {

    private Rover rover;
    private List<Instruction> instructions;

    public RoverWithInstructions() {
    }

    public RoverWithInstructions(Rover rover, List<Instruction> instructions) {
        this.rover = rover;
        this.instructions = instructions;
    }

    public Rover getRover() {
        return rover;
    }

    public void setRover(Rover rover) {
        this.rover = rover;
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<Instruction> instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "RoverWithInstructions{" +
                "rover=" + rover +
                ", instructions=" + instructions +
                '}';
    }

}
