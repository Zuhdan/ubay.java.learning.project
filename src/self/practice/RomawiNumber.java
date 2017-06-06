package self.practice;

/**
 * Hi!
 * Created by captain_n3mo on 05/06/2017.
 */
class RomawiNumber {
    private int I = 1;
    int V = 5;
    int X = 10;

    int convert(String input) {
        char[] input_arr = input.toCharArray();
        int[] res = new int[input_arr.length];
        for (int i = 0; i < input_arr.length; i++) {
            res[i] += input_arr[i];
        }
        return I;
    }
}
