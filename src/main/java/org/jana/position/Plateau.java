package org.jana.position;

/**
 * Used to represent Mars ground
 * both lower left x and y coordinates have the default value 0
 */
public class Plateau {

    private int upperRightXCoordinate;
    private int upperRightYCoordinate;
    private int lowerLeftXCoordinate;
    private int lowerLeftYCoordinate;

    public Plateau(int upperRightXCoordinate, int upperRightYCoordinate) {
        this(upperRightXCoordinate, upperRightYCoordinate, 0, 0);
    }

    public Plateau(int upperRightXCoordinate, int upperRightYCoordinate, int lowerLeftXCoordinate, int lowerLeftYCoordinate) {
        this.upperRightXCoordinate = upperRightXCoordinate;
        this.upperRightYCoordinate = upperRightYCoordinate;
        this.lowerLeftXCoordinate = lowerLeftXCoordinate;
        this.lowerLeftYCoordinate = lowerLeftYCoordinate;
    }

    public int getUpperRightXCoordinate() {
        return upperRightXCoordinate;
    }

    public int getUpperRightYCoordinate() {
        return upperRightYCoordinate;
    }

    public int getLowerLeftXCoordinate() {
        return lowerLeftXCoordinate;
    }

    public int getLowerLeftYCoordinate() {
        return lowerLeftYCoordinate;
    }

    @Override
    public String toString() {
        return "Plateau{" +
                "upperRightXCoordinate=" + upperRightXCoordinate +
                ", upperRightYCoordinate=" + upperRightYCoordinate +
                ", lowerLeftXCoordinate=" + lowerLeftXCoordinate +
                ", lowerLeftYCoordinate=" + lowerLeftYCoordinate +
                '}';
    }

}
