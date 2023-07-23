package AbstractFactoryPattern;

public class EmployeeFactory {
    
    //get the employee
    public static IEmployee getEmployee(AbstractEmployeeFactory abstractEmployeeFactory){
        return abstractEmployeeFactory.createEmployee();
    }
}
