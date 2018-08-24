package project1;

import java.util.Scanner;

import java.io.*;
import java.util.ArrayList;

import static java.lang.System.out;

//******************************************************************************************************** // CLASS: Main (Main.java)
//
// DESCRIPTION
// Counts the runs in a list
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Fall A 2018 // Project Number: 1
//
// AUTHOR
// David Kester (dkester@asu.edu) //********************************************************************************************************

public class Main {

    public static void main(String[] pArgs) {
        Main mainObject = new Main();
        mainObject.run();
    }

    /**
     * Takes in a text file consisting of lists of integers and outputs a text file of run counts.
     */
    private void run() {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listRunsUpCount = new ArrayList<>();
        ArrayList<Integer> listRunsDnCount = new ArrayList<>();
        ArrayList<Integer> listRunsCount = new ArrayList<>();

        // Creates a list of numbers from an input file.
        try {
            FileInputStream inFile = new FileInputStream("p01-in.txt");
            Scanner in = new Scanner(inFile);
            while(in.hasNextInt()){
                int value = in.nextInt();
                list.add(value);
            }
        } catch (FileNotFoundException e) {
            out.println("Sorry, could not open 'p01-in.txt' for reading. Stopping.");
            System.exit(-1);
        }

        // compute runs
        listRunsUpCount = findRuns(list, "RUNS_UP");
        listRunsDnCount = findRuns(list, "RUNS_DN");
        // compute total runs
        listRunsCount = merge(listRunsUpCount,listRunsDnCount);

        // Creates the output file
        output("p01-runs.txt", listRunsCount);
    }

    /**
     * Counts the number of runs in a list.
     * @param pList an array of integers
     * @param pDir direction of count, run up or run down
     * @return an array of run size counts
     */
    public ArrayList<Integer> findRuns(ArrayList<Integer> pList, String pDir) {
        ArrayList<Integer> listRunsCount = arrayListCreate(pList.size(), 0);
        int k = 0;
        int i = 0;

        while(i < pList.size() - 1){
            if(pDir == "RUNS_UP" && pList.get(i) <= pList.get(i+1)) {
                k++;
            } else if (pDir == "RUNS_DN" && pList.get(i) >= pList.get(i+1)) {
                k++;
            } else {
                if (k != 0) {
                    int valueAtRun = listRunsCount.get(k)+1;
                    listRunsCount.set(k,valueAtRun);
                    k = 0;
                }
            }
            i++;
        }

        if (k != 0) {
            int valueAtRun = listRunsCount.get(k)+1;
            listRunsCount.set(k,valueAtRun);
        }
        return listRunsCount;
    }

    /**
     * Merges the total of each run count from two lists
     * @param pListRunsUpCount A list of the count of run ups
     * @param pListRunsDnCount A list of the count of run downs
     * @return a list of the total count of each run
     */
    public ArrayList<Integer> merge(ArrayList<Integer> pListRunsUpCount, ArrayList<Integer> pListRunsDnCount) {
        ArrayList<Integer>  listRunsCount = arrayListCreate(pListRunsUpCount.size(), 0);

        for(int i = 0; i < pListRunsUpCount.size(); i++) {
            listRunsCount.set(i, pListRunsDnCount.get(i) + pListRunsUpCount.get(i));
        }

        return listRunsCount;
    }

    /**
     * Inititates a list of the specified size with the specified values.
     * @param pSize is the size of the list
     * @param pInitValue the value that is set
     * @return list as an array of integers
     */
    public ArrayList<Integer> arrayListCreate(int pSize, int pInitValue) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < pSize ; i++) {
            list.add(pInitValue);
        }
        return list;
    }

    /**
     * Creates a text file that details the number of runs, and the length of each run.
     * @param pFilename name of file to write into
     * @param pListRuns list of the length of each run
     */
    public void output(String pFilename, ArrayList<Integer> pListRuns) {
        int totalRuns = sumOfList(pListRuns);
        try {
            PrintWriter writer = new PrintWriter(pFilename, "UTF-8");
            writer.println("runs_total, " + totalRuns);

            for(int k = 1; k < pListRuns.size(); k++) {
                writer.println("runs_" + k + ", " + pListRuns.get(k));
            }

            writer.close();

        } catch (FileNotFoundException e) {
            out.println("Sorry, could not open 'p01-in.txt' for reading. Stopping.");
            System.exit(-1);
        } catch (UnsupportedEncodingException e){
            out.println("Sorry, could not open 'p01-in.txt' for reading. Stopping.");
            System.exit(-1);
        }

//         produce output file in the below format
//                    runs_total, 7
//                    runs_1, 4
//                    runs_2, 2
//                    runs_3, 1
//                    runs_4, 0
//                    runs_5, 0
//                    runs_6, 0
    }

    /**
     * Cycles through each position in the given list, and adds the value to a total sum.
     * @param list array of integers
     * @return sum of the list
     */
    public Integer sumOfList(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer num:list) {
            sum += num;
        }

        return sum;
    }
}
