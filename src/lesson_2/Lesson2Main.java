package lesson_2;

public class Lesson2Main {
    public static void main(String[] args) {
        Array array = new OrderedArray (  7 );
        array.addElement ( 5.3 );
        array.addElement ( 3.0 );
        array.addElement ( 1.2 );
        array.addElement ( 2.8 );
        array.addElement ( 4.678 );
        array.addElement ( 6.32 );

        array.display ();

        //array.deleteElement ( "3" );
        //array.display ();

        System.out.println ("Position of value 4 is " + array.find ( 4.678));
    }
}
