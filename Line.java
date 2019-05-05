
package sb1.kodekata;

import java.util.Arrays;
import java.util.List;

public class Line {

    /**
     *
     * @param result - 10 frames separated with space. E.g "34 4/ X 62 71 8/ X X 71 34"
     * @return total score
     */
    static int calculateScore(String result) {
        String[] frames = result.split(" ");

        int totalScore = 0;

        for (int i = 0; i < frames.length; i++) {
            List<String> slice = Arrays.asList(frames).subList(i, i+3 < frames.length ? i+3 : frames.length);

            FrameWindow frameWindow = new FrameWindow(slice);
            totalScore += frameWindow.score();
        }
        return totalScore;

    }

}
