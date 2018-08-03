package CheckJar;

import Employee.*;
import pack2.*;

//Test class for using jar of Emp and Org class
public class CheckJar {
	public static void main(String[] args) {
		Emp.emp();// invoking emp of Emp class using the jar file
		Org.org_display(); // invoking org_diplay of Org class using the jar file
	}
}
