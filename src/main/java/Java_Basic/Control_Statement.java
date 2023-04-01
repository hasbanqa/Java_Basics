package Java_Basic;

public class Control_Statement {

    /*Control Statements - Control the execution of code
    1. Conditional Statements
    2. Looping Statements/iterative statements
    3. Jumping Statements
    */

/*Conditional Statements-if match then run, if it doesn't then skip the set of conditions and move to next
    1. if
    2. if else
    3. nested if else
    4. switch case
  */
/*
* Return true or false [relational or logical operators or ]
* if (condition){
* statement
* }
* */

    public static void main(String[] args) {

        Control_Statement cs = new Control_Statement();
        cs.ifCondition();
        cs.ifElseCondition();
        cs.nestedIfElse();
    }
    public static void ifCondition(){

        int person_age=10;

        if(person_age>=18){
        System.out.println("Eligible for vote");
    }
    }

    public static void ifElseCondition(){
    int person_age1=17;
    if(person_age1>=18){
        System.out.println("This person is eligible for vote");
    }
    else{
        System.out.println("This person is not eligible for vote");
    }
    }


        //Even or odd
//        int xx = 111;
//        if(xx%2==0){
//            System.out.println("This is an even number");
//    }
//        else{
//
//           System.out.println("This is an odd numb");
//    }



//largest number of 3
//        int x = 300, y = 200, z = 1000;
//
//        if (x > y && x > z) {
//            System.out.println("x is the largest number");
//        }
//        else if (y>x && y>z) {
//            System.out.println("y is the largest number");
//        }
//        else{
//            System.out.println("z is the largest number");
//        }}



    public  static void nestedIfElse() {


    if (false) {

        if (true) {

            System.out.println("This is abc");
        } else {
            System.out.println("This is pqr");
        }
    } else {
        System.out.println("This is XYZ");

    }

    }
}





