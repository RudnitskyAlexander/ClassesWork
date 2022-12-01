package Lesson_35_Files02;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Example4 {
    public static void main(String[] args) {

        try (   FileInputStream fis = new FileInputStream("line1251.txt");
                InputStreamReader isr = new InputStreamReader(fis, "windows-1251");
                FileOutputStream fos = new FileOutputStream("line3.txt");
                OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                BufferedWriter bw= new BufferedWriter(osw);
        ) {
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                bw.write(line + System.getProperty("line separator"));

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    catch(
    IOException e);

    {
        e.printStackTrace();
    }
}
}
