package AbstractFactoryPattern;

public class SalesFactory extends AbstractEmployeeFactory {

    @Override
    public IEmployee createEmployee() {
        // TODO Auto-generated method stub
        return  new SalesEmployee();
    }
    
}
