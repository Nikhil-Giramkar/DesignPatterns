package AbstractFactoryPattern;

public class MarketingFactory extends AbstractEmployeeFactory{

    @Override
    public IEmployee createEmployee() {
        // TODO Auto-generated method stub
        return new MarketingEmployee();
    }
    
}
