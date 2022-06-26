package Object_oriented_programming;

public class Constructors {

    public static void main(String[] args) {

        //constructor = special method that is called when an object is instatiated (created)
        Human human1 = new Human("Johnny", 21, 174.52);
        Human human2 = new Human("bing bong", 23, 190.31);

        System.out.println(human2.name);
        human2.eat();
        human1.drink();
    }
}