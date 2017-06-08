package self.practice;

/**
 * Hi!
 * Created by captain_n3mo on 05/06/2017.
 */
class RomawiNumber {
    int convert(String input) {
        int res = 0;
        char[] input_arr = input.toCharArray();
        for (int i = 0; i < input_arr.length; i++) {
            switch (input_arr[i]) {
                case 'X':
                    if (i > 0 && input_arr[i-1] == 'I') {
                        res += 9;
                    } else {
                        res += 10;
                    }
                    break;
                case 'V':
                    if (i > 0 && input_arr[i-1] == 'I') {
                        res += 4;
                    } else {
                        res += 5;
                    }
                    break;
                case 'I':
                    if ( input_arr[+1] == 'V' || input_arr[+1] == 'X' ) {
                        res += 0;
                    } else {
                        res += 1;
                    }
                    break;
            }
        }
        return res;
    }
}
