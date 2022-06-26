/*
Wrapper class = provides a way to use primitive data types as reference data types
Reference data types contain useful methods
Can be used with collection (ex. ArrayList)

    Primitive           Wrapper class
    --------            -------
    boolean             Boolean
    char                Character
    int                 Integer
    double              Double

Autoboxing = Automatic conversion java compiler makes between the primitive types and their corresponding object wrapper class
Unboxing = reverse of autoboxing. Converts wrapper class to primitive
*/

public class wrapper_classes {

    public static void main(String[] args) {

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Sniper Monkey";

        if(a==true) {
            System.out.println(d);
        }
    }
}
