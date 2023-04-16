package Java_Basic;

public class Main {


    public static void main(String[] args) {
//        Employee employee1 = new Employee();
//        employee1.eid=1001;
//        employee1.eName="Shuvo";
//        employee1.job="HR";
//        employee1.eSal=1000;
//
//        Employee employee2 = new Employee();
//        employee2.eid=1002;
//        employee2.eName="Raiyyana";
//        employee2.job="Doctor";
//        employee2.eSal=5000;
//
//        employee1.display();
//        employee2.display();

        //Classname referentialVariable(anything-class name starting with small letters is recommended) = new Classname();
        //referentialVariable.(variable/method)


        //Approach 01 - using referential variable
        //Student student = new Student();
//        student.sid=100;
//        student.sname="Raiyyana";
//        student.grade='A';
//        student.printRR();

        //Approach 02 - using method

//        student.setData(1102,"Lisa",'A');
//        student.printRR();

        //Approach 03 - using Constructor
        //
//        Student student = new Student(123, "Musa",'A');
//        student.printRR();


//        Method_and_Constructor mc = new Method_and_Constructor();
//        mc.greetings01();
//        String msg=mc.greetings02();
//        System.out.println(msg);
//        mc.greetings03("Shuvo");
//        String msg1=mc.greetings04("Raiyana");
//        System.out.println(msg1);
//
//
//        Method_Overloading mo = new Method_Overloading();
//        mo.sum();
//        mo.sum(60, 70);
//        mo.sum(50,90.03);
//        mo.sum(30.80,80);

        ThisKeyWord tkw = new ThisKeyWord(20,30);
        tkw.display();

    }
}
