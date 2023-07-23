

 package SingletonPattern;

 public class Samosa {
 
    //made static as we need to access in static method
    private static Samosa _samosa;


    //Stop creation of multiple objects is mke constructor private
    //Hence no one can create new objects by using new keyword: new Samosa();
    //construtor
    private Samosa(){

    }

    // getter method
    // Now to access a getter method, we need an object to access its methods
    // So to solve this, we make the getter as "static" so that
    // we do not need to necessarily create an object for accessing this method
    public static Samosa getSamosa(){

        //This method will create object of samosa
        //But anyone can call this method multiple times and create multiple objects
        //Hence, add a condition that object will be created only once

        if(_samosa == null){
            //If object has not been initilaized even once.
            _samosa = new Samosa();
        }

        return _samosa;
    }


    //Singleton pattern can be broken if we are using multiple threads
    //When our application uses multiple threading,
    // There can be a scenario where two threads running parallely
    //execute the line _samosa = new Samosa() together
    //In that case we got two objects
    //Hence we can make the object creation thread safe in following way

    public static Samosa getSamosaThreadSafe(){

        if(_samosa == null){

            //Synchronized keyword adds a locking system
            //where anythig inside synchronized block can be accessed by only one thread at a time
            synchronized(Samosa.class){
                if(_samosa==null){
                    _samosa = new Samosa();
                }
            }
        }
        return _samosa;
    }
 }

 /*
  * Points to remember
  1. Make constructor private
  2. Create a static getter method
  3. Create a static private object and access it inside getter
  4. Initilize that object only first time by checking if it is null
  */
