package sb1.kodekata;

class Frame {

    // Possible throws in a frame
    final int first;
    final int second;
    final int bonus;

    Frame(String frame) {

        if (frame.length() == 1 && frame.equalsIgnoreCase("X")) {
            this.first = 10;
            this.second = 0;
            this.bonus = 0;
        }
        else if (frame.length() == 3 && frame.substring(0,1).equalsIgnoreCase("X")) { //Handle bonus
            this.first = 10;
            this.second = Integer.valueOf(frame.substring(1,2));;
            this.bonus = Integer.valueOf(frame.substring(2,3));
        }
        else if (frame.length() == 2 && frame.substring(1,2).equalsIgnoreCase("/")) {
            this.first = Integer.valueOf(frame.substring(0,1));;
            this.second = 10;
            this.bonus = 0;
        }
        else if (frame.length() == 3 && frame.substring(1,2).equalsIgnoreCase("/")) { // Handle bonus
            this.first = 0;
            this.second = 10;
            this.bonus = Integer.valueOf(frame.substring(2,3));
        }
        else {
            this.first = Integer.valueOf(frame.substring(0,1));
            this.second = Integer.valueOf(frame.substring(1,2));
            this.bonus = 0;
        }
    }


    boolean isStrike() {
        return first == 10;
    }

    boolean isSpare() {
        return second == 10;
    }
}

