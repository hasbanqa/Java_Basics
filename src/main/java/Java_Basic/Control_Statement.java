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
        cs.po();
        cs.switchCase();
        //cs.whileLoopCon();
        //cs.doWhileLoop();
       //cs.forLoop();
        cs.jumpingStatement();
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


public static void po(){

        int weekday=0;

        if(weekday==1){
            System.out.println("Sunday");
        }
        else if (weekday==3){
        System.out.println("Monday");
        }
        else if (weekday==4) {
            System.out.println("Tuesday");
        }
        else {
            System.out.println("not valid");
        }

}




//Switch (variable){
// case "VALUE1" : STATEMENTS;
//                      BREAK;
//  case "VALUE2" : STATEMENTS;
//                      BREAK;
//
//
// DEFAULT:STATEMENTS;
//
// will not support strings,Boolean,characters,long
//    'break' should be used in each case
// }


    public static void switchCase(){

        int weekday=1;

        switch (weekday){

            case 1:System.out.println("Sunday");break;
            case 2: System.out.println("Monday");break;
            case 3: System.out.println("Tuesday");break;
            case 4: System.out.println("Wednesday");break;
            default:System.out.println("Invalid");
        }

    }

    /*Looping statement
  while loop
  do while loop
  for loop
  enhanced for loop
*/
// Check the condition first then execute the statement
// while (condition){
// statements;
//    inc/dec
// }
    public static void whileLoopCon(){

        //ASC
        int i=1;  //initialization
        while (i<=10) {
            System.out.println(i);
            i++;
        }
        int j=10;
        //DESC

        while (j>=1){
            System.out.println(j);
            j--;
        }

    }

    /*
    * statement will be executed at least one then check the cond.
    *do{
    *
    *}while(condition);
    *
    * */
    public  static void doWhileLoop(){
    //1.........10
        int i =11;

        do{
            System.out.println(i);
            i++;

        }while (i<=10); //PRACTISE- DESC ORDER NUMBER

//        int ii=1;
//        while (ii<=10){
//            System.out.println(ii);
//            ii++;
//        }
//
//        int ij=1;
//        do{
//            System.out.println(ij);
//            ij++;
//
//        } while (ij>=10);
    }


/*
* using for loop reduce the line of code. we can write initialization condition and inc/dec in the same line
*for(initialization; condition; inc/dec){
* Statements;
* }
*
* */
    public  static void forLoop(){
////1....10
//        for (int i=1; i<=10; i++){
//            System.out.println(i);
//        }
////Printing even numb
//        for (int i=2; i<=10; i+=2 ){
//            System.out.println(i);
//        }
//
//    for (int i=1; i<=10; i++){
//
//        if(i%2!=0)
//        System.out.println(i);
//    }


//    for(int i=1; i<=10; i++ ){
//        if(i==2 || i==5 || i!=4){
//            System.out.println(i);
//
//        }
//
//    }


        boolean flag=false;
        if(flag){
            for(int i=1; i<=5; i++){
                System.out.println(i);
            }

        }else{
            for(int i=10; i>=1; i--){

                System.out.println(i);
            }

        }

    }

public  static void jumpingStatement(){


//        for(int i=1; i<=5; i++){
//
//            if(i==3 || i==5){
//                continue;
//            }
//            System.out.println(i);
//
//        }

    String str = "I hate java";
    char[] masuma = str.toCharArray();
    System.out.print("Duplicate Characters are: ");
    for (int i = 0; i < str.length(); i++) {
        for (int j = i + 1; j < str.length(); j++) {
            if (masuma[i] == masuma[j]) {
                System.out.print(masuma[j] + " ");
                break;
            }
        }
    }
    }


}









