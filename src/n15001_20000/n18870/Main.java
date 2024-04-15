package n15001_20000.n18870;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(bf.readLine());

        int[] line = new int[count];
        String[] input = bf.readLine().split(" ");

        for(int i = 0; i < count; i++){
            line[i] = Integer.parseInt(input[i]);
        }

        int[] sortedLine = line.clone();
        Arrays.sort(sortedLine);
        Map<Integer, Integer> compressionMap = new HashMap<>();
        int index = 0;
        for (int cord : sortedLine) {
            if (!compressionMap.containsKey(cord)) {
                compressionMap.put(cord, index++);
            }
        }

        for (int i = 0; i < count; i++) {
            bw.write(compressionMap.get(line[i]) + " ");
        }

        bw.flush();
        bw.close();
    }
}
