import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by eugenevendensky on 2/21/17.
 */
public class Engine {


    public int returnNumberForLoop(int[] pirateArray) {
        ArrayList<Integer> uniques = new ArrayList<Integer>();
        int current = 0;
        int next;

        boolean looping = true;
        while (looping) {

            next = pirateArray[current];
            if (!uniques.contains(next)) {
                uniques.add(next);

            } else if (uniques.contains(next)) {

                if (uniques.contains(0)) {

                    return uniques.size() - 1;
                }

                return uniques.size();

            }
            current = pirateArray[next];
            if (!uniques.contains(current)) {
                uniques.add(current);
            } else if (uniques.contains(current)) {
                if (uniques.contains(0)) {

                    return uniques.size() - 1;
                }
                return uniques.size();

            }


        }

        return uniques.size();

    }
}
