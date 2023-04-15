package Java_Basic;

public class Method_and_Constructor {
    /*METHOD- is block or group of statement which perform certain task
    We have to call method through object
    1. no params    no return value
    2. no params    return value
    3. Take params  no return values
    4. Take params  return value
    */

// 1. no params    no return value
    void greetings01 (){
        System.out.println("Hello I am a method that no returns and no parameters");
    }

    //2. no params    return value
     String greetings02 (){
        return "Hello...I am a method with return value and no params";
    }

    // 3. Take params  no return values

    void greetings03 (String name) {
        System.out.println("Hello I am a method that no returns with parameters "+ name);
    }

    String greetings04 (String name){
        return( "Hello...I am a method with return value and params "+ name);
    }

}
