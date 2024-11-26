package StaticNonStatic;

public class Employee {
    static int x=20;
    int a =43;
    public static void test(){
        System.out.println("Static Test Method");
        System.out.println("x is " +x);
        demo();
        Employee e1 =new Employee();
        System.out.println("a is " +e1.a);
        e1.drive();

    }
    public static void demo(){
        System.out.println("This is demo Method");
    }
    public void start(){
        System.out.println("Non static Start Method");
        System.out.println(" a is " +a);
        drive();
        System.out.println("x is " +x);
        demo();
    }
    public void drive(){
        System.out.println("Non static drive Method");
    }
    public static void main(String[]args){
        System.out.println("Main Method Method");
        test();
        System.out.println("+++++++++");
        Employee e1 = new Employee();
        e1.start();
    }
}
