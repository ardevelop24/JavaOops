package StaticNonStatic;

public class EmployDriver {
    public static void main(String[] args) {
        Employ e1=new Employ();
        Employ e2=new Employ();
        e1.employname="Sharma";
        e2.employname="Verma";
        e1.id=101;
        e2.id=012;

        System.out.println("Employ Name is "+e1.employname);
        System.out.println("Employ  id "+e1.id);
        System.out.println("Second Employ Name "+e2.employname);
        System.out.println("Company Name is "+e1.CompanyName);

        
    }
    
}
