import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by eugenevendensky on 2/21/17.
 */
public class MainTest {
    Engine engine;
    @Before
    public void setUP(){ engine = new Engine();}

    @Test
    public void returnNumberForLoopTest(){
        int[] test = new int[]{1,3,0, 1};
        int[] test5 = new int[]{2,1,3, 2};
        int [] test2 = new int[]{2, 2, 4, 4, 0};
        int[] test3 = new int[]{2, 3, 1, 4, 5, 0};
        int actual = engine.returnNumberForLoop(test3);
        int expected = 5;
        assertEquals(actual, expected);

    }



}
