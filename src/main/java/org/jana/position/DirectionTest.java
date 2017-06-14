/**
 * Challenge urself
 */
package org.jana.position;

import org.junit.Assert;
import org.junit.Test;

/**
 * Used to test Direction class
 */
public class DirectionTest {

    @Test
    public void testOf() {
        {
            Direction n = Direction.of('N');
            if (!n.equals(Direction.NORTH)) {
                Assert.fail();
            }
        }
        {
            Direction w = Direction.of('W');
            if (!w.equals(Direction.WEST)) {
                Assert.fail();
            }
        }
    }

    @Test
    public void testLeftDirection() {
        {
            Direction leftDirection = Direction.NORTH.leftDirection();
            if (!leftDirection.equals(Direction.WEST)) {
                Assert.fail();
            }
        }
        {
            Direction leftDirection = Direction.EAST.leftDirection();
            if (!leftDirection.equals(Direction.NORTH)) {
                Assert.fail();
            }
        }
    }

    @Test
    public void testRightDirection() {
        {
            Direction rightDirection = Direction.NORTH.rightDirection();
            if (!rightDirection.equals(Direction.EAST)) {
                Assert.fail();
            }
        }
        {
            Direction rightDirection = Direction.EAST.rightDirection();
            if (!rightDirection.equals(Direction.SOUTH)) {
                Assert.fail();
            }
        }
    }

}
