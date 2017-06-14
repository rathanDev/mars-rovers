package org.jana.input;

import org.jana.position.Plateau;

import java.util.List;

/**
 * Used to contain the input data ( plateau, rovers and instructions )
 * InputReader reads the inputData.txt file and converts it into InputInfo object
 */
public class InputInfo {

    private Plateau plateau;
    private List<RoverWithInstructions> roverWithInstructionsList;

    public InputInfo() {
    }

    public InputInfo(Plateau plateau, List<RoverWithInstructions> roverWithInstructionsList) {
        this.plateau = plateau;
        this.roverWithInstructionsList = roverWithInstructionsList;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    public List<RoverWithInstructions> getRoverWithInstructionsList() {
        return roverWithInstructionsList;
    }

    public void setRoverWithInstructionsList(List<RoverWithInstructions> roverWithInstructionsList) {
        this.roverWithInstructionsList = roverWithInstructionsList;
    }

    @Override
    public String toString() {
        return "InputInfo{" +
                "plateau=" + plateau +
                ", roverWithInstructionsList=" + roverWithInstructionsList +
                '}';
    }
}
