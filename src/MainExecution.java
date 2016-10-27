import Exceptions.EmptyStringException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by martanase on 10/27/2016.
 */
public class MainExecution {

    /*Exercise 8*/
    public static void isMemory() throws OutOfMemoryError {
        try{
            List<long[]> list = new LinkedList<long[]>();
            while (true) {
                list.add(new long[123456]);
            }
        } catch(OutOfMemoryError oer){
            System.out.println("Out of memory error.");
        }
    }

    public static void repeatMyself(){
        repeatMyself();
    }
    public static void isOverflow() throws StackOverflowError {
        try{
            repeatMyself();
        }catch(StackOverflowError so){
            System.out.println("Stack overflow error.");
        }
    }


    public static void main(String[] args) throws EmptyStringException {

        /* Exercise 1*/
        Monkey m1 = new Monkey();
        System.out.println("Exercise1");
        System.out.println("\t" + m1.monkeyTrouble(false, true));
        m1.monkeyTrouble(true, true);

        /* Exercise 3*/
        Parrot p = new Parrot();
        System.out.println("Exercise2");
        System.out.println("\t" + p.parrotTrouble(false,4));

        /* Exercise 3*/
        Exercise3 ex3 = new Exercise3();
        System.out.println("Exercise3");
        System.out.println("\t" + ex3.posNeg(1, -1, false));
        System.out.println("\t" + ex3.posNeg(-1, 1, false));
        System.out.println("\t" + ex3.posNeg(-4, -5, true));

        /* Exercise 4*/
        Exercise4 ex4 = new Exercise4();
        System.out.println("Exercise4");
        System.out.println("\t" + ex4.backAroung("cat"));
        System.out.println("\t" + ex4.backAroung("Hello"));
        System.out.println("\t" + ex4.backAroung("a"));
        System.out.println("\t" + ex4.backAroung(""));

        /* Exercise 5*/
        Exercise5 ex5 = new Exercise5();
        System.out.println("Exercise5");
        System.out.println("\t" + ex5.everyNth("Miracle", 2));
        System.out.println("\t" + ex5.everyNth("abcdefg", 2));
        System.out.println("\t" + ex5.everyNth("abcdefg", 3));
        System.out.println("\t" + ex5.everyNth("", 3));
        System.out.println("\t" + ex5.everyNth(null, 3));
        System.out.println("\t" + ex5.everyNth("", 0));
        System.out.println("\t" + ex5.everyNth("Maria", 0));

        /* Exercise 6*/
        Exercise6 ex6 = new Exercise6();
        System.out.println("Exercise6");
        int[] a ={1, 1, 4};
        System.out.println("\t" + ex6.scoresIncreasing(a));

        /* Exercise 7*/
        Exercise7 ex7 = new Exercise7();
        System.out.println("Exercise7");
        int[] heights = {5, 3, 6, 7, 2};
        System.out.println("\t" + ex7.sumHeights(heights, 2, 4));
        System.out.println("\t" + ex7.sumHeights(heights, 0, 1));
        System.out.println("\t" + ex7.sumHeights(heights, 4, 4));

        /* Exercise 8 */
        System.out.println("Exercise8");
        isMemory();
        isOverflow();

        /*Exercitiul 9*/
        System.out.println("Exercise9");
        Calculator calc = new Calculator();
        System.out.println(calc.add(2,3));

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(calc.average(list));

        /*Exercitiul 10*/
        System.out.println("Exercitiul10");
        Finally fin = new Finally();

    }
}
