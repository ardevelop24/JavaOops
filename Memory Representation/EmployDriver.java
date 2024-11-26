public class EmployDriver {
    public static void main(String[] args) {
        Employ e1=new Employ();
        Employ e2=new Employ();
        Employ e3=new Employ();
        System.out.println("Company Name is:" +Employ.comp_name);
        Employ.work();

        e1.name="Mohan";
        e1.id=204;
        e1.salary=34343.445;


        e2.name="Sohan";
        e2.id=454;
        e2.salary=889809.88;

        e3.name="Rohan";
        e3.id=989;
        e3.salary=899090.99;

        e2.comp_name="Diamond Company";

        System.out.println("Employ Two details");
        System.out.println("Object address of e1 is"+e2);
        System.out.println("Company Name is:"+e2);

        System.out.println("Name is:"+e2.name);
        System.out.println("Id is"+e2.id);
        System.out.println("Salary is:"+e2.salary);
        e2.work();
        e2.read();

        System.out.println("Employ 3 Details");

        System.out.println("Name is :" + e3.name);
        System.out.println("ID is :" + e3.id);
        System.out.println("salary is :" + e3.salary);
        e3.work();
        e3.read();



    }

    
}
