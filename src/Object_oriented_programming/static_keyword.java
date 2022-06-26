package Object_oriented_programming;

public class static_keyword {

    public static void main(String[] args) {

        //static = modifier. Single copy of a variable/method is created and shares
        //The class 'owns' the static member

        Friend friend1 = new Friend("Sniper Monkey");
        Friend friend2 = new Friend("Boomerang Monkey");
        Friend friend3 = new Friend("Ninja Monkey");
        Friend friend4 = new Friend("Wizard Monkey");

        System.out.println("You have " + Friend.numberOfFriends + " friends!");

        Friend[] friendNames = {friend1, friend2, friend3, friend4};

        for(int i = 0; i < Friend.numberOfFriends; i++)
            System.out.println(friendNames[i].name);

        Friend.displayFriends();
    }
}