package hackerRank;
import java.util.*;

/**
 * Created by 10991120 on 5/30/2017.
 */
public class BigSum {

    public static void main (String []args){
        long sum = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            sum = sum + arr[arr_i];
        }
        System.out.println(sum);
    }
}
