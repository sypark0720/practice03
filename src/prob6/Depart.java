package prob6;

public class Depart extends Employee {
	
	//field
	private String department;
	
	//constructor
	public Depart(String name, int salary, String department){
		setName(name);
		setSalary(salary);
		this.department = department;		
	}

	//method	
	@Override
	public void getInformation() {
		System.out.printf( "이름:"+getName()+"	연봉:"+getSalary()+"   부서:"+department);
	}
}
