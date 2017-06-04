package ocw.mit.edu;

import static java.lang.Math.abs;

/**
 * Hi!
 * Created by captain_n3mo on 04/06/2017.
 */
class CubeRoot {
    String cubeRoot(int input) {
        String res;
        int tempRes = 0;
        for (int i = 0; (i*i*i) <= abs(input) ; i++) {
            tempRes = i;
        }
        if (input < 0) {
            tempRes = -tempRes;
        }
        if ((tempRes*tempRes*tempRes) != input) {
            res = "No cubeRoot Exactly same";
        } else {
            res = "The Cube Root of " + input + " is = " + tempRes;
        }
        return res;
    }
}
