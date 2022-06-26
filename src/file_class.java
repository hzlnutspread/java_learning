import java.io.File;

public class file_class {

    public static void main(String[] args) {

        // file = abstract representation of file and directory pathnames

        File file = new File("hello.txt");

        if (file.exists()) {
            System.out.println("That file exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            System.out.println(file.isDirectory());
            //file.delete();
        }
        else {
            System.out.println("That doesn't exist");
        }

    }
}