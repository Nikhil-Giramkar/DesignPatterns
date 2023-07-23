package BuilderPattern;


public class Main {
    public static void main(String[] args) {
        User myUser =  new User.UserBuilder().setName("Nikhil")
                                 .setEmail("niks@gmail.com")
                                 .setId(1)
                                 .build();

        System.out.println(myUser);

        //We can skip any parameter as well

        User user2 = new User.UserBuilder()
                    .setId(2)
                    .setName("Ansh")
                    .build();
                    
        System.out.println(user2);

    }
}
