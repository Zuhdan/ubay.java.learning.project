package ocw.mit.edu;

/**
 * Hi!
 * Created by captain_n3mo on 04/06/2017.
 */
public class RunnerOcwMitEdu {
    public static void main(String[] args) {
        int variable = 216000;
        CubeRoot cubeRoot = new CubeRoot();
        System.out.println(cubeRoot.cubeRoot(variable));
        BisectionIteration bisectionIteration = new BisectionIteration();
        System.out.println(bisectionIteration.cubeRoot(variable));
    }
}
