package Super;

public class Program1 {
    public static void main(String args[])
    {
        Animal myDog = new Dog();
        myDog.animalsound();
        
    }
}


    class Animal{
        public void animalsound(){
            System.out.println("The animal makes a sound");
        }
    }

    class Dog extends Animal{
        public void animalsound(){
            super.animalsound();
        }
    }
    

