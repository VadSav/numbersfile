
    import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
    public class SumNubers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String st;
        int a = 0;
        while((st = br.readLine()) != null) {
            try {
                a += Integer.parseInt(st);
            } catch (Exception ex) {

            }
        }
        System.out.println("sum " + a);
        try(BufferedReader br1 = new BufferedReader(new FileReader("file.txt"))) {
            System.out.println("Sum "+sumUp(br1));
        } catch (Exception ex) {

        }

    }

    public static int sumUp(BufferedReader br) {
        return br.lines().filter(s -> isDigit(s)).mapToInt(Integer::parseInt).sum();
    }

    public static boolean isDigit(String s) {
        try {
            Integer.parseInt(s);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
}

