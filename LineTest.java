package sb1.kodekata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineTest {

    @Test
    public void testNoBonus() {

        verifyResult(20, "11 11 11 11 11 11 11 11 11 11");
        verifyResult(81, "34 54 62 71 54 36 53 33 45 62");

    }

    @Test
    public void testStrike() {

        verifyResult(30, "X 11 11 11 11 11 11 11 11 11");
        verifyResult(77, "X X X 11 11 11 11 11 11 11");

    }

    @Test
    public void testSpare() {

        verifyResult(29, "11 9/ 11 11 11 11 11 11 11 11");
        verifyResult(46, "11 11 9/ 9/ 11 11 11 11 11 11");

    }

    @Test
    public void testFrame10() {

        verifyResult(29, "11 11 11 11 11 11 11 11 11 9/1");
        verifyResult(30, "11 11 11 11 11 11 11 11 11 X11");

    }

    private void verifyResult(int expected, String result) {

        int score = Line.calculateScore(result);

        assertEquals(expected, score);
    }

}
