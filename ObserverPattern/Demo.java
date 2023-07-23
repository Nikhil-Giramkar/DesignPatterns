public class Demo {
    public static void main(String[] args) {
        YoutubeChannel monicaRecipes = new YoutubeChannel();
        monicaRecipes.setName("Monica's Recipes");

        //List of subscribers
        monicaRecipes.subscribe(new Person("Nikhil"));
        monicaRecipes.subscribe(new Person("Ansh"));
        monicaRecipes.subscribe(new Person("Shubham"));
        monicaRecipes.subscribe(new Person("Atharva"));

        //New video uploaded
        monicaRecipes.addNewVideo("Paneer Tikka Masala");


    }
}
