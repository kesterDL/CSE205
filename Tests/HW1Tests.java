import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class HW1Tests {

    ArrayListsAssignment1 subject = new ArrayListsAssignment1();
    ArrayList<Integer> controlInt = new ArrayList<>(Arrays.asList(0, -1, 2, 3, -4, 0, 1, 2, 3, 4));
    ArrayList<String> controlString = new ArrayList<>(Arrays.asList("amy", "brian","byorn","carol","cypress", "donny", "linda", "nathan"));

    @Test
    public void zeroToFourTest() {
        ArrayList<Integer> ztof = subject.zeroToFour();
    }

    @Test
    public void settingTest() {
        ArrayList<Integer> set = subject.setting();
        System.out.println(set);
    }

    @Test
    public void countNegativeTest() {
        ArrayList<Integer> set = new ArrayList<>(Arrays.asList(0, -1, 2, 3, -4, 0, 1, 2, 3, 4));
        subject.howManyNegative(set);
    }

    @Test
    public void sumofListTest() {
        int subjectSum = subject.arrayListSum(controlInt);
        assertEquals(10,subjectSum);
    }

    @Test
    public void initiateArrayTest() {
        ArrayList<Integer> subjectList = subject.arrayListCreate(5,9);
        ArrayList<Integer> controlList = new ArrayList<>(Arrays.asList(9,9,9,9,9));
        assertEquals(controlList,subjectList);
    }

    @Test
    public void insertNameTest() {
        subject.insertName(controlString, "david");
        System.out.println(controlString);
        assertEquals(controlString.get(5), "david");
    }
}
