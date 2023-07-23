package BuilderPattern;

public class User {


    //Cannot directly reate instance of User class
    private User(UserBuilder userBuilder){
        this.name = userBuilder.name;
        this.email = userBuilder.email;
        this.id = userBuilder.id;
    }
    //Create only getters
    //As we should not be able to directly set any value for User
    //Object created will be immutable i.e., once value is set, it cannot be changed

    private final String name;
    private final Integer id;
    private final String email;

    public String getName() {
        return name;
    }
    public Integer getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", id=" + id + ", email=" + email + "]";
    }


    //Inner Class
    public static class UserBuilder{

        private  String name;
        private  Integer id;
        private  String email;
    
        public UserBuilder(){          
        }
        //Generate all setters here
        //Do metod chaining and return object of itself after setting a proprty
    
        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }
        public UserBuilder setId(Integer id) {
            this.id = id;
            return this;
        }
        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }
    
        public User build(){
            User user = new User(this);
            return user;
        }
    
    
    }
}

 
