package org.jana.instruction;

import org.jana.Rover;

/**
 * Using command pattern to solve mars rovers problem
 * this interface is analogous to Command interface
 */
public interface Instruction {

    void execute(Rover rover);

}
