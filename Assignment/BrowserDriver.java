public class BrowserDriver {
    public static void main(String[] args) {
        Browser b1 = new Browser();
        b1.name = "Brave";
        b1.size = 48.43;
        b1.version = "2.34";
        System.out.println(" The name of Browser is :" +b1.name);
        System.out.println("The size of Browser is " +b1.size);
        b1.search();
        b1.download();
    }
}
