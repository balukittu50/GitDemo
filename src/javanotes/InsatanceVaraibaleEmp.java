package javanotes;

public class InsatanceVaraibaleEmp {
	public String name;
	private double salary;

	public InsatanceVaraibaleEmp(String string) {
		// TODO Auto-generated constructor stub
	}

	public void Emp(String empname) {

		name = empname;
	}

	public void setSalary(double Empsal) {
		salary = Empsal;
	}

	public void PrintEmp() {
		System.out.println("name" + name);
		System.out.println("salary" + salary);
		System.out.println("hello");
		System.out.println("hello");
	}
	
	
	public void main(String args[]) {
		InsatanceVaraibaleEmp one=new InsatanceVaraibaleEmp("kittu");
		one.setSalary(1000);
		one.PrintEmp();
	}
}
