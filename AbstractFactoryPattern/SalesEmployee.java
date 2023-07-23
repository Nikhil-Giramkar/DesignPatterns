package AbstractFactoryPattern;

public class SalesEmployee implements IEmployee {

    @Override
    public int getSalary() {
        // TODO Auto-generated method stub
        System.out.println("Getting Sales employee salary");
        return 1_00_000;
    }
    
}
