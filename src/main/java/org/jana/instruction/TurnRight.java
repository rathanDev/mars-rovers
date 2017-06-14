package org.jana.instruction;

import org.jana.Rover;

/**
 * Using command pattern
 * TurnRight is a concrete Command which implements Command Interface
 */
public class TurnRight implements Instruction {

    public void execute(Rover rover) {
        rover.setDirection(rover.getDirection().rightDirection());
    }

    @Override
    public String toString() {
        return "R";
    }

}
