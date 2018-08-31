import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;





class EmployeeDetailsTest {
Employee employee;
	@BeforeEach
	void setUp() {
	employee =new Employee(157817,"priyanka",10000,1000);
	}

	@Test
	void testcalculateNetSalary() {
	assertEquals(14600.0,Employee.calculateNetSalary());	
		
	}

}
