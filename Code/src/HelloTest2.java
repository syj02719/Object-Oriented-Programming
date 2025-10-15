class Hello{
    void sayHello(){
        System.out.println("hello");
    }
}

public class HelloTest2{
    public static void main(String[] args){
        Hello h1 = new Hello();
        h1.sayHello();
        Hello h2 = new Hello();
        h2.sayHello();
    }
}

