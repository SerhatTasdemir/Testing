import java.io.*;

public class Intreader {


    public static int readInt() {
        int i = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            i = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Falsche Eingabe! Bitte Wiederholen");
            return readInt();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return i;

    }

}

