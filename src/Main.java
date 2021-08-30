import task1.TableCreator;
import task2.Division;
import task3.AtUnit;

public class Main {
    public static void main(String[] args) {

        /*
        Exercise 1: (2) Implement more SQL types in the database example

        added SQLDate
         */

        try {
            TableCreator.start(args);
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println();



        /*
        Exercise 2: (3) Add support for division to the interface extractor.
         */

        try {
            System.out.println(Division.div(5,6));
            System.out.println(Division.div(3,1));
            System.out.println(Division.div(6,3));
            System.out.println(Division.div(7,8));
            System.out.println(Division.div(1,5));
            System.out.println(Division.div(8,4));

        } catch (Exception e){
            e.printStackTrace();
        }


        /*
        Exercise 11: (5) Add an @TestNote annotation to @Unit, so that the accompanying
        note is simply displayed during testing.

        I redid it a bit and connected the file directly, because the ClassNameFinder class does not want to work for me
         */


        try {
            AtUnit.start(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
