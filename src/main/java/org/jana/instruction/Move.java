package org.jana.instruction;

import org.jana.position.Location;
import org.jana.position.Plateau;
import org.jana.Rover;

/**
 * Using command pattern
 * Move is a concrete Command which implements Command Interface
 */
public class Move implements Instruction {

    public void execute(Rover rover) {

        Location location = rover.getLocation();
        Plateau plateau = rover.getPlateau();

        int expectedXCordinate;
        int expectedYCordinate;

        switch (rover.getDirection()) {
            case NORTH:
                expectedYCordinate = location.getYCoordinate() + 1;
                if (expectedYCordinate > plateau.getUpperRightYCoordinate()) {
                    System.out.println("Cannot move towards " + rover.getDirection() + "from " + location);
                    return;
                }
                location.setYCoordinate(expectedYCordinate);
                break;
            case EAST:
                expectedXCordinate = location.getXCoordinate() + 1;
                if (expectedXCordinate > plateau.getUpperRightXCoordinate()) {
                    System.out.println("Cannot move towards " + rover.getDirection() + "from " + location);
                    return;
                }
                location.setXCoordinate(expectedXCordinate);
                break;
            case SOUTH:
                expectedYCordinate = location.getYCoordinate() - 1;
                if (expectedYCordinate < plateau.getLowerLeftYCoordinate()) {
                    System.out.println("Cannot move towards " + rover.getDirection() + "from " + location);
                    return;
                }
                location.setYCoordinate(expectedYCordinate);
                break;
            case WEST:
                expectedXCordinate = location.getXCoordinate() - 1;
                if (expectedXCordinate < plateau.getLowerLeftXCoordinate()) {
                    System.out.println("Cannot move towards " + rover.getDirection() + "from " + location);
                    return;
                }
                location.setXCoordinate(expectedXCordinate);
                break;
            default:
                throw new UnsupportedOperationException("Moving not supported");
        }

        rover.setLocation(location);
    }

    @Override
    public String toString() {
        return "M";
    }

}
