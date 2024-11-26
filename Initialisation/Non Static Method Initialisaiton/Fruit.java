//object initialisation using non static method

public class Fruit {
    String name;
    int price;
    double weight;

    public void setValue(String n, int p, double w)
    {
        name =n;
        price =p;
        weight =w;
    }

    public void getDetails()
    {
        System.out.println("Name is " +name);
        System.out.println("Price is " +price);
        System.out.println("weight is " +weight);
        System.out.println("+++++++++++++++++");
    }
}
