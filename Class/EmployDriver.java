class EmployDriver
{
	public static void main(String[]args){
		Employ e1=new Employ();
		Employ e2=new Employ();
		e1.name="Mohan";
		e1.id=234;
		e1.salary=345455.67;
		
		
		System.out.println("_____________________e1 Details________________");
		System.out.println("Name is :"+ e1.name);
		System.out.println("ID is :"+ e1.id);
		System.out.println("Salary is: "+e1.salary);
		e1.work();
		e1.read();
		System.out.println("--------------------e2 ka details=======");
		System.out.println("name is :"+ e2.name);
		System.out.println("ID is : "+e2.id);
		System.out.println("Salary is :"+ e2.salary);
		e2.work();
		e2.read();
		
		
	}
}