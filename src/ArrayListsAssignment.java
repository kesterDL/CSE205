import java.util.ArrayList;

public class ArrayListsAssignment {
    /**
     * 3.1 Write code that creates an ArrayList<Integer> object named list and  fills list
     * with these numbers (using one or a pair of for or while loops):
     * 0123401234
     */
    public ArrayList<Integer> zeroToFour(){
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while(count < 2){
            for(int i = 0; i < 5; i++){
                list.add(i);
            }
            count++;
        }
        return list;
    }

    /**
     * 3.2 Consider the ArrayList<Integer> object named list containing these Integers: list = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 }
     * What are the contents of list after this loop completes?
     * for (int i = 1; i < 10; ++i) {
     *      list.set(i, list.get(i) + list.get(i-1));
     * }
     *
     * Answer: {1, 3, 6, 10, 15, 19, 22, 24, 25, 25}
     */
    public ArrayList<Integer> setting() {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i < 5; i++){
            list.add(i);
        }
        for(int i = 5; i >= 0; i--){
            list.add(i);
        }
        for (int i = 1; i < 10; ++i) {
            list.set(i, list.get(i) + list.get(i - 1));
        }
        return list;
    }

    /**
     * 3.3 Write an enhanced for loop that counts how many numbers in an ArrayList<Integer> object
     * named list are negative. Print the count after the loop terminates.
     */
    public void howManyNegative(ArrayList<Integer> list) {
        Integer numNegative = 0;
        for (Integer i: list) {
            if(i < 0) {
                numNegative++;
            }
        }
        System.out.println(numNegative);
    }

    /**
     * 3.4 Write a method named arrayListSum() that has one parameter pList which is an object of the
     * class ArrayList <Integer>. The method shall return the sum of the elements of pList.
     */

    /**
     * 3.5 Write a method named named arrayListCreate() that has two int parameters pLen and pInitValue.
     *  The method shall create and return a new ArrayList<Integer> object which has exactly pLen elements.
     * Each element shall be initialized to pInitValue.
     */

    /**
     * 3.6 Write a void method named insertName() that has two input parameters: (1) pList which is an object
     * of ArrayList <String> where each element of pList is a person's name; and (2) a String object named pName.
     * Assume the names in pList are sorted into ascending order. The method shall insert pName into
     * pList such that the sort order is maintained.
     */

    /**
     * 3.7 Write a void method named arrayListRemove() which has two parameters: pList is an object of the
     * ArrayList <Integer> class and pValue is an int. The method shall remove all elements from pList
     * that are equal to pValue.
     */



}
