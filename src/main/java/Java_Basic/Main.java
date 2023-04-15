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
        Student student = new Student(123, "Musa",'A');
        student.printRR();
    }
}
