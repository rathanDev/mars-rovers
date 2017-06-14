package org.jana.position;

/**
 * Contains both x and y coordinates
 * Used to identify where the Rover is located
 */
public class Location {

    private int xCoordinate;
    private int yCoordinate;

    public Location(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCordinate) {
        this.xCoordinate = xCordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCordinate) {
        this.yCoordinate = yCordinate;
    }

    @Override
    public String toString() {
        return "Location{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                '}';
    }

}
