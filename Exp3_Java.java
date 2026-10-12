import java.util.Scanner;

class Employee{
	int emp_id;
	String emp_name;
	float emp_sal;
	float updatesal;
	
	

	public Employee(int emp_id, String emp_name, float d) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_sal = d;
		
	}
	
	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public float getEmp_sal() {
		return emp_sal;
	}

	public void setEmp_sal(float emp_sal) {
		this.emp_sal = emp_sal;
	}
	Scanner sc=new Scanner(System.in);
	void accept() {
		System.out.println("Enter employee id :");
		emp_id=sc.nextInt();
		System.out.println("Enter employee name :");
		emp_name=sc.next();
		System.out.println("Enter employee salary:");
		emp_sal=sc.nextFloat();
		if(emp_sal>0) {
			 updatesal=emp_sal*10/100;
//			System.out.println("Updated Salary :"+updatesal);
		}
		else {
			System.out.println("Salary is Negative!");
		}
	}
	void display() {
		System.out.println("Employee ID :"+emp_id);
		System.out.println("Employee Name :"+emp_name);
		if(emp_sal>0) {
			System.out.println("Employee Salary :"+updatesal);
		}
//		else {
//			System.out.println("Salary is negative!");
//		}
		
		
	}
	
}

public class Exp3_Java {
	public static void main(String[] args) {
		Employee emp=new Employee(1, "Swarda", 50000f);
		emp.accept();
		emp.display();
		
	}
}
