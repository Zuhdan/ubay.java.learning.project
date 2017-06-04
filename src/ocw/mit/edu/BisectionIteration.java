package ocw.mit.edu;

import static java.lang.Math.abs;

/**
 * Hi!
 * Created by captain_n3mo on 04/06/2017.
 */
class BisectionIteration {

    String cubeRoot(int input) {
        long high = abs(input);
        long low = 0;
        long tempRes = (high + low)/2;
        int iteration = 0;
        while (true) {
            if ((tempRes * tempRes * tempRes) == abs(input)) {
                break;
            }
            if ((tempRes * tempRes * tempRes) < abs(input)) {
                low = tempRes;
            } else {
                high = tempRes;
            }
            tempRes = (high + low)/2;
            iteration += 1;
        }
        if (input < 0) {
            tempRes = -tempRes;
        }
        return "the Result is = " + tempRes + " with Iteration = " + iteration;
    }

}
