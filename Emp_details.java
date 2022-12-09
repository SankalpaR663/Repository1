public class Emp_details
{
	int id;
	String name;
	String address;
	double sal;
	
	Emp_details(int i, String n, String a, double s)
	{
		id = i;
		name = n;
		address = a;
		sal = s;
	}
	
	double getAnnualSalary()
	{
		double A_sal = sal*12;
		return A_sal;
	}
	
	double getPF()
	{
		double pf = (sal*18)/100;
		return pf;
	}


	public String toString()
	{
		return "Emp_ID: "+id+" Emp_Name: "+name+" Emp_address: "+address+"EmpAnnualSalary: "+getAnnualSalary()+"PF: "+getPF();
	}
}

package classandobjects;

public Emp_detailsMain
{
	public static void main(String args[])
	{
		Emp_details emp1 = new Emp_details(8244, "Sankalpa R", "Shri Neelakanteshwara Pan Shop, Manvi - 584123", 29000);
		Emp_details emp2 = new Emp_details(8245, "Mahalakshmi R", "Shri Mahalakshmi Gunny Traders, Navalkal - 584129", 29500);
		Emp_details emp3 = new Emp_details(8246, "Anjali N", "Shri Gayathri Gunny Traders, Davanagere - 577004", 29200);
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		System.out.println(emp1.getAnnualSalary());
		
	}
}	

