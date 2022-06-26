public class return_types {

    public static void main(String[] args) {

        int x = 3;
        int y = 4;

        int z = add(x, y);      //z is a local variable, only recognised in immediate curly brackets

        System.out.println(z);

        //or
        //System.out.println(add(x,y));
    }

    static int add(int x, int y) {     //void if you're not returning anything. List data type of value you're returning

        int z = x + y;
        return z;

        //or
        //return x + y;
    }
}

