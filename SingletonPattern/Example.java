/*
 * Singleton Design Pattern allows us to create object for a class only once and then re-use it several times
 * Best Example: JDBC. Whenever we want to perform CRUD operations between app and database. We create JDBC connection only 
 * once and then re-use that connection to fetch or store data via CRUD
 */

package SingletonPattern;

public class Example {
    public static void main(String[] args) {

        //Samosa samosa1 = new Samosa();
        //Above line will not work

        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());

        Samosa samosa2 = Samosa.getSamosa();
        System.out.println(samosa2.hashCode());

        //both objects give same hashcode
        //Representing that they point to same memory location


        //Singleton Pattern can be broken by
        /*
         * 1. Reflection API / making constructor private -> public
         * Solution: Add condition in constructor same as getSamosa
         * 
         * 2. During serialization
         * Solution: implement readResolve mthod
         * 
         * 3. By cloning
         * Solution: Oveeride clone() method and return _samosa;
         */
    }
}
