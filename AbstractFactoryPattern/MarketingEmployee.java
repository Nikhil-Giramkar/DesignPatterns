package AbstractFactoryPattern;

public class MarketingEmployee implements IEmployee {

    @Override
    public int getSalary() {
        // TODO Auto-generated method stub
       System.out.println("Getting marketing employee salary");
       return 2_00_000;
    }
    
}
