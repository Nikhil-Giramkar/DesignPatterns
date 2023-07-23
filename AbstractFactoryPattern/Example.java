package AbstractFactoryPattern;

public class Example {
    public static void main(String[] args) {
        
        IEmployee employee1 = EmployeeFactory.getEmployee(new SalesFactory());
        System.out.println(employee1.getSalary());

        IEmployee employee2 = EmployeeFactory.getEmployee(new MarketingFactory());
        System.out.println(employee2.getSalary());

        //Employee of any type can be created as per input
        //We do not need to hard code each type of employee Sales, Marketing via new Keyword
        //Hence loose coupling
    }
}

