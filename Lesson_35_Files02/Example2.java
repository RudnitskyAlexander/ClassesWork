package Lesson_35_Files02;

import java.io.*;

public class Example2 {
    public static void main(String[] args) {

        final String inputfileName = "lines.txt";
        final String outputfileName = "lines2.txt";

        try (FileReader fr = new FileReader(inputfileName); FileWriter fw = new FileWriter(outputfileName)) {
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw= new BufferedWriter(fw);
            String line = null;
            while ((line = br.readLine()) != null) {
                char[] buffer = new char[line.length()];
                line.getChars(0, line.length(), buffer, 0);
                for (int i = 0; i < buffer.length; i++) {
                    if (buffer[i] == 'e') {
                        buffer[i] = Character.toUpperCase(buffer[i]);
                    }
                }
                System.out.println(buffer);
                bw.write(buffer + System.getProperty("line.separator"));
                bw.flush();
            }
        }
        catch (IOException ex) {

        }


    }
}
