import java.io.*;
import java.util.*;

public class A {

    public static void main(String[] args) throws Exception{
        String fn = args.length > 0 ?  args[0] : "A-large.in";
        LineNumberReader in = new LineNumberReader(new FileReader(fn));
        PrintWriter out = new PrintWriter(new FileWriter(fn.replace(".in", ".out")));
        int T = Integer.parseInt(in.readLine());

        for(int k = 0; k < T; k++) {
            long N = Long.parseLong(in.readLine());
            Collection<Integer> digitsFound = new HashSet<>();

            out.print("Case #" + (k+1) + ": ");
            for (int i = 1; i <= 10_000; i++) {
                String num2str = String.valueOf(N * i);
                for (int j = 0; j < 10; j++) {
                    if(num2str.contains(String.valueOf(j)))
                        digitsFound.add(j);
                }
                if(digitsFound.size() == 10) {
                    out.print(num2str);
                    break;
                }
                if(i == 10_000)
                    out.print("INSOMNIA");
            }

            out.println();
        }
        out.close();
    }
}
