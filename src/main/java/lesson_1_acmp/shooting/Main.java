package lesson_1_acmp.shooting;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] argv) throws IOException {
        new Main().run();
    }
    PrintWriter pw;
    Scanner sc;

    public void run() throws IOException {
        sc = new Scanner(new File("input.txt"));
        int n = Integer.parseInt(sc.nextLine());
        if (n < 3 || n > 100000) {
            pw = new PrintWriter("output.txt");
            pw.print(0);
            pw.close();
            return;
        }
        List<Integer> integers = new ArrayList<>();
        String[] strings = sc.nextLine().split(" ");
        Arrays.stream(strings).forEach((s) -> integers.add(Integer.parseInt(s)));
//        Integer[] integer = Arrays.stream(strings).map(Integer::parseInt).toArray(Integer[]::new);
        int result = result(integers);
        pw = new PrintWriter("output.txt");
        pw.print(result);
        pw.close();
    }

    public static int result(List<Integer> integers) {
        int max = Collections.max(integers);
        int index = integers.indexOf(max);
        int temp1 = 0;
        int temp2 = 1;
        for (int i = index + 1; i < integers.size() - 1; i++) {
            if (integers.get(i) > integers.get(i + 1) && integers.get(i) % 10 == 5) {
                if (integers.get(i) > temp1) temp1 = integers.get(i);
            }
        }
        if (temp1 == max) return 1;
        for (Integer integer : integers) {
            if (integer > temp1) temp2++;
        }
        if (temp1 > 0) return temp2;
        return 0;
    }

}
