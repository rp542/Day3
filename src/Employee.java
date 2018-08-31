
public class Employee {
private int employeeId;
private String employeeName;
private static double hra;
private double grsossSalary;
private static double basicSalary;
private static double medical;
private static double pf;
private static double netSalary;
public static final double PT = 200;
public Employee() {
	
}
public Employee(int employeeId, String employeeName,double basicSalary,double medical ) {
this.employeeId=employeeId;
this.employeeName=employeeName;
this.basicSalary=basicSalary;
this.medical=medical;
}
public static double calculateNetSalary() {
	hra=0.5*basicSalary;
	pf=0.12*basicSalary;
	double grossSalary = hra+basicSalary+medical;
	netSalary=grossSalary-(pf+PT);
	return netSalary;
}
public void displayEmployeeDetails(int employeeId, String employeeName,double netSalary)
{
	System.out.println("EmployeeId :"+employeeId+"EmployeeName"+employeeName+"NetSalary"+netSalary);
}
}