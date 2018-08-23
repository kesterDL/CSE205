package project1;

import java.io.*;

//******************************************************************************************************** // CLASS: classname (classname.java)
//
// DESCRIPTION
// A description of the contents of this file.
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, semester and year // Project Number: project-number
//
// AUTHOR
// your-name (your-email-addr) //********************************************************************************************************

public class Main {

    public static void main(String[] pArgs) {
        Main mainObject = new Main();
        mainObject.run();
    }

    /**
     * A brief description of what the method does.
     */
    private void run() {
        FileInputStream inFile = readFile("p01-in.txt");

        try {
            FileOutputStream outFile = new FileOutputStream("p01-runs.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, could not open 'p01-in.txt' for reading. Stopping.");
            System.exit(-1);
        }

        // compute runs

        // compute total runs

        // produce output file in the below format
//                    Sample p01-runs.txt runs_total, 7
//                    runs_1, 4
//                    runs_2, 2
//                    runs_3, 1
//                    runs_4, 0
//                    runs_5, 0
//                    runs_6, 0


        // DELETE THIS LINE IT IS FOR TESTING ONLY
        System.out.println("STILL RUNNING");
    }

    /**
     * A brief description of what the method does.
     */
    private FileInputStream readFile(String fileName) {
        FileInputStream inFile = new FileInputStream();
        try {
            inFile = new FileInputStream(fileName);
            return inFile;
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, could not open 'p01-in.txt' for reading. Stopping.");
            System.exit(-1);
        }
        return (inFile);
    }

}
