package FactoryPattern;

public class EmployeeFactory {
    
    //get the employee
    public static IEmployee getEmployee(EmployeeType empType){

        if(empType.equals(EmployeeType.Sales)){
            return new SalesEmployee();
        }
        
        if(empType.equals(EmployeeType.Marketing)){
            return new MarketingEmployee();
        }
        return null;
    }
}
