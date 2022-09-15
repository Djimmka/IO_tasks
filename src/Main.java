import java.io.*;
import java.nio.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = null;
        double cnt = 0;
        for (; scanner.hasNext(); ) {
            s = scanner.nextLine();
            if (s.isEmpty()) {break;}
            String[] str = s.split(" ");
            for (String st :
                    str) {
                try {
                    cnt += Double.valueOf(st);
                } catch (NumberFormatException e) {
                    ;
                }

            }

        }
        s = String.format("%f", cnt);
        System.out.println(s);
        cnt = 0;
    }
}