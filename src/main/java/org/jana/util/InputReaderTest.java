package org.jana.util;

import org.jana.input.InputInfo;
import org.jana.input.RoverWithInstructions;
import org.jana.position.Plateau;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Used to Test InputReader class
 * To test whether InputReader properly reads the text file and converts it into InputInfo
 */
public class InputReaderTest {

    @Test
    public void testRead() {

        try {

            String file = "/home/jana/projects/mars-rovers/etc/InputData.txt";
            InputInfo inputInfo = InputReader.read(file);

            Plateau plateau = inputInfo.getPlateau();
            if (plateau == null) {
                Assert.fail();
            }

            RoverWithInstructions roverWithInstructions1 = inputInfo.getRoverWithInstructionsList().get(0);
            if (roverWithInstructions1.getInstructions().size() != 9) {
                Assert.fail();
            }

            RoverWithInstructions roverWithInstructions2 = inputInfo.getRoverWithInstructionsList().get(1);
            if (roverWithInstructions2.getInstructions().size() != 10) {
                Assert.fail();
            }

        } catch (IOException e) {
            Assert.fail();
        }

    }

}
