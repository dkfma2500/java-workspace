package section18.ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Jump1805 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("out2.txt");
        BufferedReader br = new BufferedReader(reader);

        while (true) {
            String ilne = br.readLine();
            if (ilne == null) {
                break;
            }
            System.out.println(ilne);
        }

        reader.close();
    }
}
