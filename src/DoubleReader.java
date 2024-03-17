import java.io.*;

public class DoubleReader {
    public static double readDouble() {
        double i = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            i = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Falsche Eingabe! Bitte Wiederholen");
            return readDouble();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return i;

    }
}
