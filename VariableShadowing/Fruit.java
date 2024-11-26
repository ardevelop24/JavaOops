//Variable Shadowing in static variable

package VariableShadowing;

public class Fruit {
    public static void main(String[] args) {
        System.out.println("Main Starts");
        test();
    }

    static int x =30;
    public static void test() {
        System.out.println("Test Method");
        int x =20;
        System.out.println("Local of x is " +x);
        System.out.println("Static x is "+Fruit.x);
        
    }
    
}
