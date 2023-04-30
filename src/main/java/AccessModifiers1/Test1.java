package AccessModifiers1;


import AccessModifiers2.Test2;
import Java_Basic.Method_and_Constructor;

public class Test1 extends Method_and_Constructor {

    /*
    * public - we can access anywhere
    * protected - we can access outside the packages - but through inheritance
    * default - only within the package
    * private -only within the class
    */


    public static void main(String[] args) {

        Test1 tc1 = new Test1();
        tc1.greetings01();
        Test2 tc= new Test2();
        tc.kite();

    }
}




