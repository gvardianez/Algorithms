package lesson_1_acmp.number_e;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] argv) throws IOException {
        new Main().run();
    }
    PrintWriter pw;
    Scanner sc;

    public void run() throws IOException {
        sc = new Scanner(new File("input.txt"));
        int n = Integer.parseInt(sc.nextLine());
        BigDecimal e = new BigDecimal("2.7182818284590452353602875") ;
        e = e.setScale(n,RoundingMode.HALF_UP);
        pw = new PrintWriter("output.txt");
        pw.print(e);
        pw.close();
    }

}

