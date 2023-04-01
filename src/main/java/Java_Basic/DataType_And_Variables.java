package Java_Basic;

public class DataType_And_Variables {

public static void main(String [] args ){
    /* Primitive Data Type*/
    byte by = 127;//when you create a variable, dataType is must. Within the same variable you cannot change the data type. but you can change the value anytime.
    by=100;
    //you can change the value of variable and the latest is always count.
    System.out.println("The value of by variable is:" + by);//concatenation


    short sh = 32767;
    System.out.println("The value of float variable is:" + sh);


    int i = 1234567890;
    System.out.println("The value of integer variable is:" + i);

    long l = 384756823476587l;
    System.out.println("The value of long variable is:" + l);

    float f = 2345.8236f;
    System.out.println("The value of float variable is:" + f);

    double d = 38472342356.772345;
    System.out.println("The value of double variable is:" + d);

    Boolean b= false;
    System.out.println("The value of boolean variable is:" + b);

    char c= 'A';   /* only one character with single quote*/
    System.out.println("The value of char variable is:" + c);

    /* Non-Primitive Data Type*/
    String s ="GGHDF";/* collection of characters with double quote*/
    System.out.println("The value of string variable is:" + s);
    /*  Arrays: Arrays in Java are homogeneous data structures implemented in Java as objects. Arrays store one or more values of a specific data type and provide indexed access to store the same. A specific element in an array is accessed by its index.
        Classes: A class in Java is a blueprint which includes all your data.  A class contains fields(variables) and methods to describe the behavior of an object.
        Interface: Like a class, an interface can have methods and variables, but the methods declared in interface are by default abstract (only method signature, no body).*/

    byte a = 123;
    System.out.println("The value of byte variable is:"+a);

    String s2 ="123";

    System.out.println("10" + "20");
    System.out.println(10 + 20);

}
}
