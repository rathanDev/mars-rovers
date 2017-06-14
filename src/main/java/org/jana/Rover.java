package org.jana;

import org.jana.instruction.Instruction;
import org.jana.position.Direction;
import org.jana.position.Location;
import org.jana.position.Plateau;

import java.util.List;

/**
 * Used to represent Mars Rovers
 * Each rover has a direction which it is facing, location (x and y cordinates) in plateau, and the plateau
 */
public class Rover {

    private Direction direction;
    private Location location;
    private Plateau plateau;

    public Rover(Direction direction, Location location, Plateau plateau) {
        this.direction = direction;
        this.location = location;
        this.plateau = plateau;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    public void navigate(List<Instruction> instructions) {
        for (Instruction instruction : instructions) {
            instruction.execute(this);
        }
    }

    @Override
    public String toString() {
        return "Rover{" +
                "direction=" + direction +
                ", location=" + location +
                ", plateau=" + plateau +
                '}';
    }

}
