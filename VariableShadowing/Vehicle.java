//variable shadowing in non static method
package VariableShadowing;

public class Vehicle {
    static int x =30;
    int y =43;

    public void test ()
    {
        int x =32;
        int y =343;

        System.out.println("Local x is " +x );
        System.out.println("Local y is " +y);
        System.out.println("Static x is " +Vehicle.x);
        System.out.println("Non static y is " +this.y);
    }
    public static void main(String[] args) {
        Vehicle v1 =new Vehicle();
        v1.test();
    }
    
}
