package org.jana.position;

/**
 * Used to indicate direction of the Rover
 */
public enum Direction {

    NORTH('N'),
    EAST('E'),
    SOUTH('S'),
    WEST('W');

    private final char letter;

    Direction(char letter) {
        this.letter = letter;
    }

    public char letter() {
        return this.letter;
    }

    public static Direction of(char letter) {
        switch (letter) {
            case 'N':
                return Direction.NORTH;
            case 'E':
                return Direction.EAST;
            case 'S':
                return Direction.SOUTH;
            case 'W':
                return Direction.WEST;
        }
        throw new UnsupportedOperationException("Unsupported char to get direction");
    }

    public Direction leftDirection() {
        switch (this) {
            case NORTH:
                return Direction.WEST;
            case WEST:
                return Direction.SOUTH;
            case SOUTH:
                return Direction.EAST;
            case EAST:
                return Direction.NORTH;
        }
        throw new UnsupportedOperationException("Cannot find left direction");
    }

    public Direction rightDirection() {
        switch (this) {
            case NORTH:
                return Direction.EAST;
            case EAST:
                return Direction.SOUTH;
            case SOUTH:
                return Direction.WEST;
            case WEST:
                return Direction.NORTH;
        }
        throw new UnsupportedOperationException("Cannot find right direction");
    }

}
