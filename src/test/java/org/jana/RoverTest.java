package org.jana;

import org.jana.instruction.Instruction;
import org.jana.instruction.Move;
import org.jana.instruction.TurnLeft;
import org.jana.instruction.TurnRight;
import org.jana.position.Direction;
import org.jana.position.Location;
import org.jana.position.Plateau;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Used to test the navigation of Rover
 */
public class RoverTest {

    @Test
    public void test() {

        Plateau plateau = new Plateau(5, 5);

        {
            List<Instruction> instructions1 = new ArrayList<>();
            instructions1.add(new TurnLeft());
            instructions1.add(new Move());
            instructions1.add(new TurnLeft());
            instructions1.add(new Move());
            instructions1.add(new TurnLeft());
            instructions1.add(new Move());
            instructions1.add(new TurnLeft());
            instructions1.add(new Move());
            instructions1.add(new Move());

            Rover rover1 = new Rover(Direction.NORTH, new Location(1, 2), plateau);

            System.out.println("Initial position of rover1 = " +
                    rover1.getLocation().getXCoordinate() + " " +
                    rover1.getLocation().getYCoordinate() + " " +
                    rover1.getDirection().letter());

            rover1.navigate(instructions1);

            System.out.println("Final position of rover1 = " +
                    rover1.getLocation().getXCoordinate() + " " +
                    rover1.getLocation().getYCoordinate() + " " +
                    rover1.getDirection().letter());

            if (!(rover1.getLocation().getXCoordinate() == 1 &&
                    rover1.getLocation().getYCoordinate() == 3 &&
                    rover1.getDirection() == Direction.NORTH)) {
                Assert.fail();
            }
        }

        {
            List<Instruction> instructions2 = new ArrayList<>();
            instructions2.add(new Move());
            instructions2.add(new Move());
            instructions2.add(new TurnRight());
            instructions2.add(new Move());
            instructions2.add(new Move());
            instructions2.add(new TurnRight());
            instructions2.add(new Move());
            instructions2.add(new TurnRight());
            instructions2.add(new TurnRight());
            instructions2.add(new Move());

            Rover rover2 = new Rover(Direction.EAST, new Location(3, 3), plateau);

            System.out.println("Initial position of rover2 = " +
                    rover2.getLocation().getXCoordinate() + " " +
                    rover2.getLocation().getYCoordinate() + " " +
                    rover2.getDirection().letter());

            rover2.navigate(instructions2);

            System.out.println("Final position of rover2 = " +
                    rover2.getLocation().getXCoordinate() + " " +
                    rover2.getLocation().getYCoordinate() + " " +
                    rover2.getDirection().letter());

            if (!(rover2.getLocation().getXCoordinate() == 5 &&
                    rover2.getLocation().getYCoordinate() == 1 &&
                    rover2.getDirection() == Direction.EAST)) {
                Assert.fail();
            }
        }

    }

}