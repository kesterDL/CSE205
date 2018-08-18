import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;

public class ArrayListsTest {

    ArrayListsAssignment subject = new ArrayListsAssignment();

    @Test
    public void zeroToFourTest() {
        ArrayList<Integer> ztof = subject.zeroToFour();
        int[] control = {0, 1, 2, 3, 4, 0, 1, 2, 3, 4};
    }

    @Test
    public void settingTest() {
        ArrayList<Integer> set = subject.setting();
        System.out.println(set);
    }

    @Test
    public void countNegative() {
        
    }
}