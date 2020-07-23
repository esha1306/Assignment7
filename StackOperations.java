import java.util.*;
public class StackOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stackOfEmployee = new Stack<>();
		stackOfEmployee.push("Charise");
		stackOfEmployee.push("Marie");
		stackOfEmployee.push("Caron");
		stackOfEmployee.push("Lea");
		stackOfEmployee.push("Steve");
		stackOfEmployee.push("Cindy");
		
		System.out.println("Stack:" + stackOfEmployee);
		System.out.println("Is stack is Empty?:" + stackOfEmployee.isEmpty());
		
		String FirstEmployee = stackOfEmployee.pop();
		System.out.println("Name of removed Employee: " +FirstEmployee);
		System.out.println("Current Employess in stack:" +stackOfEmployee);
		
	}

}
