package FileManagement;

import java.io.FileWriter;
import java.io.IOException;

public class file_writer {

    public static void main(String[] args) throws IOException {

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nViolets are blue\nBooty booty booty booty");
            writer.append("\n(A poem by sniper)");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}