package sb1.kodekata;

import java.util.List;

class FrameWindow {

    private Frame current;
    private Frame next;
    private Frame next2;

    FrameWindow(List<String> frames) {
        current = new Frame(frames.get(0));
        if (frames.size() == 2) {
            next = new Frame(frames.get(1));
        } else if (frames.size() == 3) {
            next = new Frame(frames.get(1));
            next2 = new Frame(frames.get(2));
        }
    }

    int score() {
        if (current.isSpare()) {
            if (lastFrame()) {
                return current.second + current.bonus;
            }
            return current.second + next.first;
        }

        if (current.isStrike()) {
            if (lastFrame()) {
                return current.first + current.second + current.bonus;
            } else {
                if (next.isStrike()) {
                    return current.first + next.first + next2.first;
                } else {
                    return current.first + next.first + next.second;
                }
            }
        }

        return current.first + current.second;
    }

    private boolean lastFrame() {
        return next == null && next2 == null;
    }

}

