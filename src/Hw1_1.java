import java.io.*;
import java.util.Scanner;

public class Hw1_1 {
// 4.1Explain what happens if you try to open a file for reading that does not exist.
// A FileNotFoundException is thrown "Exception in thread "main" java.io.FileNotFoundException: Hw1_1 (No such file or directory)"
//
// 4.2Explain what happens if you try to open a file for writing that does not exist.
// A new file with the name indicated is created.
//
// 4.3 Name your source code file Hw1_1.java. Write a program that prompts the user for the name of a Java source code file.
// The program shall read the source code file and output the contents to a new file named the same as the input file,
// but with a .txt file name extension (e.g., if the input file is foo.java then the output file shall be named foo.java.txt).
// Each line of the input file shall be numbered with a line number (formatted as shown below) in the output file.
// For example, if the user enters Hw1_1.java as the name of the input file and Hw1_1.java contains:
////    //***************************************************************
////// CLASS: Hw1_1 (Hw1_1.java)
//////***************************************************************
////    public class Hw1_1 {
////        public static void main(String[] pArgs) {
////        }
////        public Hw1_1() {
////        }
////    }
////    then the contents of the output file Hw1_1.java.txt would be:
////            [001] //***************************************************************
////            [002] // CLASS: Hw1_1 (Hw1_1.java)
////            [003] //***************************************************************
////            [004] public class Hw1_1 {
////            [005] public static void main(String[] pArgs) {
////            [006] }
////            [007] public Hw1_1() {
////            [008] }
////            [009] }
////    Hint: to print an integer as shown above in a field of width 3 with leading 0's use the printf() method with a format specifier of %03d.
//
//    public static void main(String[] pArgs) throws IOException {
//        Hw1_1();
//    }
//
//    public static void Hw1_1() throws IOException {
//
//        FileOutputStream outFile = null;
//        Scanner user_input = new Scanner(System.in);
//
//        System.out.print("Enter the name of a java source file : ");
//        String fileName = user_input.next();
//
//        FileInputStream inFile = new FileInputStream(fileName);
//        outFile = new FileOutputStream(fileName + ".txt");
//
//        int i;
//        while ((i = inFile.read()) != -1) {
//            outFile.write(i);
//        }
//
//    }
//
//    5.3 Explain what an unchecked exception is. Give one example.
//
//      Checked exceptions are exceptions that are checked when the project compiles. Such as the FileNotFoundException
//        in the question 4.1. Unchecked exceptions will compile just fine, but may throw an error during runtime.
//        an example of an unchecked exception is dividing an int by 0, which will throw ArithmeticException.
//
//    5.5 Why don’t you need to declare that your method might throw an IndexOutOfBoundsException?
//
//      IndexOutOfBoundsException is a RuntimeException. It is always checked and therefore no need to surround with
//        try catch. This type of error needs to be corrected, so it's best to allow it to be thrown so we can correct it.
//
//    5.6 Is the type of the exception object always the same as the type declared in the catch clause
//          that catches it? If not, why not?
//
//      Yes. If the exception is caught, then it must be the same type of exception object. If it isn't the same
//        type then the exception will be thrown. In the case that the catch block uses the general "Exception" object
//        then the exception will be caught regardless of its tpe.
//
//    6.3 (a) In a static method, it is easy to differentiate between calls to instance methods and calls to static methods.
//          How do you tell them apart? (b) Why is it not as easy for methods that are called from an instance method?
//
//      A static method is called using the class, not an instance of the class. For example Math.pow(a,b);
//        Math is a class. We can just call the method directly by writing the className.method();
//        An instance method would be called Math m = new Math(); then m.pow(a,b);
//
//
//  6.4 Explain what happens when this application runs and why.
//    public class C {
//        private int x;
//        private String s;
//        public static void main(String[] pArgs) {
//            new C(); }
//        public C() {
//            x = s.length();
//            System.out.println("x = " + x);
//        }
//    }
//
//    NullPointerException is thrown. s was not initiallized at any point in the code, and the exception is never handled.
//
//  6.6 Continuing with the previous exercise, write the declaration for a class named Main that implements the
//  main() method. Within main() suppose we wish to instantiate a C object named cObj1 calling the default constructor.
//  Write the code to do this.
//      public static void main(String[] pArgs) {
//            C cObj1 = new C();
//      }
//
// 6.5 Write the declaration for a class named C that declares:
//  (1) a private int instance variable named mX;
//  (2) a private int class variable named mY initialized to 0;
//  (3) a private int class constant named A which is equivalent to 100;
//  (4) a public int class constant named B which is equivalent to 200;
//  (5) public accessor and mutator methods for mX named getX() and setX();
//  (6) public accessor and mutator methods for mY named getY() and setY();
//  (7) a constructor that has one int input parameter named pX which calls setX() to initialize mX to pX;
//  (8) a default constructor that calls C(int) to initialize mX to -1.
//
//    public class C {
//
//        private int mX;
//        private int mY = 0;
//        public static final int A = 100;
//        public static final int B = 200;
//
//        public C() {
//            setX(-1);
//        }
//        public C(int pX) {
//            setX(pX);
//        }
//
//        public int getX() {
//            return mX;
//        }
//
//        public void setX(int mX) {
//            this.mX = mX;
//        }
//
//        public int getY() {
//            return mY;
//        }
//
//        public void setY(int mY) {
//            this.mY = mY;
//        }
//
//    }
//    6.7 Continuing, write the code to instantiate another C object named cObj2 calling the second constructor to
//          initialize the mX instance variable to 10.
//
//      C cObj2 = new C(10);
//
//    6.8 Continuing, within main(), are the following statements legal, i.e., do they compile? If so, explain
//          what happens when the statement is executed. If not, explain why the statement is illegal.
//             (a) int a1 = C.mX;       Invalid. mX is an instance variable and needs to be accessed via an object instance because it is private.
//             (b) int a2 = C.mY;           Invalid. mY is an instance variable and needs to be accessed via an object instance because it is private.
//             (c) int a3 = C.A;            valid. a3 is set to A's value.
//             (d) int a4 = C.B;            valid. a4 is set to B's value.
//             (e) cObj1.C(20);             valid. Variable pX is set to 20 by the constructor.
//             (f) int a5 = cObj1.getX();   valid assuming the default constructor was used, a5 is assigned the value -1.
//             (g) cObj1.setX(20);          valid. mX is set to 20.
//             (h) cObj2.setX(cObj1.getX());valid assuming cObj1's x has a value.
//             (i) int a6 = C.getX();       Invalid. methods are called by an instance of the class.
//             (j) C.setX(20);              Invalid. methods are called by an instance of the class.
//             (k) int a7 = cObj1.getY();   valid. a7 is assigned the value of Y.
//             (l) cObj1.setY(20);          valid. sets mY to value 20.
//             (m) int a8 = C.getY();       Invalid. methods are called by an instance of the class. Unless its set to static.
//             (n) C.setY(20);              Invalid. methods are called by an instance of the class. Unless its set to static.

}
