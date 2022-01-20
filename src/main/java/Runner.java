import java.io.FileNotFoundException;
import java.io.FileReader;

public class Runner {

    public static void main(String args[]) {
        FileReader fr = null;
        try {
            fr = new FileReader("/Users/codeclanstudent/codeclan_work/week_11/day_4/file_reader/src/main/java/file.txt");
            int i;
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
