package org.jana.instruction;

import org.jana.Rover;

/**
 * Using command pattern
 * TurnLeft is a concrete Command which implements Command Interface
 */
public class TurnLeft implements Instruction {

    public void execute(Rover rover) {
        rover.setDirection(rover.getDirection().leftDirection());
    }

    @Override
    public String toString() {
        return "L";
    }

}
