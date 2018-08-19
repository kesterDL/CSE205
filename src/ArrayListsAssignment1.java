import java.util.ArrayList;

public class ArrayListsAssignment1 {
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
    public Integer arrayListSum( ArrayList<Integer> pList) {
        Integer sum = 0;
        for (Integer num:pList) {
            sum += num;
        }
        return sum;
    }

    /**
     * 3.5 Write a method named named arrayListCreate() that has two int parameters pLen and pInitValue.
     *  The method shall create and return a new ArrayList<Integer> object which has exactly pLen elements.
     * Each element shall be initialized to pInitValue.
     */
    public ArrayList<Integer> arrayListCreate(int pLen, int pInitValue) {
        ArrayList<Integer> initializedList = new ArrayList<>();

        for (int i = 0; i < pLen ; i++) {
            initializedList.add(pInitValue);
        }
        return initializedList;
    }

    /**
     * 3.6 Write a void method named insertName() that has two input parameters: (1) pList which is an object
     * of ArrayList <String> where each element of pList is a person's name; and (2) a String object named pName.
     * Assume the names in pList are sorted into ascending order. The method shall insert pName into
     * pList such that the sort order is maintained.
     */
    public void insertName(ArrayList<String> pList, String pName){
        ArrayList<String> splitList = new ArrayList<>();
        char pNameLetter = pName.toLowerCase().charAt(0);
        int namePosition = 0;
        int letterPosition = 0;
        boolean foundPosition = false;

        // iterates through the list of names comparing the first letter of each name to the first letter of pName
        // This really should be done in it's own method, but given the assignment I will write this limited version here.
        while(!foundPosition) {
            System.out.println("Comparing " + pNameLetter + " to " + pList.get(namePosition).toLowerCase().charAt(letterPosition));
            switch(letterPosition) {
                case 0: // checks if first letters are greater, less than, or equal.
                    if (pNameLetter > pList.get(namePosition).toLowerCase().charAt(0)) {
                        namePosition++;
                    } else if ((pNameLetter < pList.get(namePosition).toLowerCase().charAt(0))) {
                        pList.add(namePosition, pName);
                        foundPosition = true;
                    } else if ((pNameLetter == pList.get(namePosition).toLowerCase().charAt(0))) {
                        letterPosition++;
                        pNameLetter = pName.toLowerCase().charAt(letterPosition);
                    }
                    break;
                case 1:
                    if (pNameLetter > pList.get(namePosition).toLowerCase().charAt(1)) {
                        namePosition++;
                    } else if ((pNameLetter < pList.get(namePosition).toLowerCase().charAt(1))) {
                        pList.add(namePosition, pName);
                        foundPosition = true;
                    } else if ((pNameLetter == pList.get(namePosition).toLowerCase().charAt(1))) {
                        letterPosition++;
                        pNameLetter = pName.toLowerCase().charAt(letterPosition);
                    }
                    break;
                case 2:
                    if (pNameLetter > pList.get(namePosition).toLowerCase().charAt(2)) {
                        namePosition++;
                    } else if ((pNameLetter < pList.get(namePosition).toLowerCase().charAt(2))) {
                        pList.add(namePosition, pName);
                        foundPosition = true;
                    } else if ((pNameLetter == pList.get(namePosition).toLowerCase().charAt(2))) {
                        letterPosition++;
                        pNameLetter = pName.toLowerCase().charAt(letterPosition);
                    }
                    break;

                    default:
                        foundPosition = true;
                        break;
            }

        }

    }
    /**
     * 3.7 Write a void method named arrayListRemove() which has two parameters: pList is an object of the
     * ArrayList <Integer> class and pValue is an int. The method shall remove all elements from pList
     * that are equal to pValue.
     */
    public void arrayListRemove(ArrayList<Integer> pList, int pValue) {
        for (Integer num: pList) {
            if(num == pValue){
                pList.remove(pList.indexOf(num));
            }
        }
    }


}
