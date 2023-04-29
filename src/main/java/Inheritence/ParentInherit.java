package Inheritence;

class Parent{

    void display(int a){

        System.out.println(a);
    }
}

class Child01 extends Parent {

    void show(int b) {

        System.out.println(b);
    }

}
    class Child02 extends Parent {

        void printing(int c) {

            System.out.println(c);
        }
    }

public class ParentInherit {

    public static void main(String[] args) {
        Child01 child01 = new Child01();
        child01.show(32);

    }





}
