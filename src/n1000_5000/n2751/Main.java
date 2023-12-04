package n1000_5000.n2751;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] input =new int[n];

        for(int i=0;i<n;i++) {
            input[i]=Integer.parseInt(br.readLine());
        }

        if(n>=5000)
            Arrays.parallelSort(input);
        else
            Arrays.sort(input);

        for(int i=0;i<n;i++) {
            bw.write(input[i]+"\n");
        }
        bw.flush();
    }
}
