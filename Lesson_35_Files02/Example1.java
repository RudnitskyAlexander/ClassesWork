package Lesson_35_Files02;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Example1 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        final String inputfileName = "lines.txt";
        final String outputfileName = "lines1.txt";

        try {
            fr = new FileReader(inputfileName);
            fw = new FileWriter(outputfileName, true);
            BufferedReader br = new BufferedReader(fr);
            int lineCounter = 1;
            String line = null;
            while ((line = br.readLine()) != null) {
                if (lineCounter % 2 != 0) {
                    fw.write(line + System.getProperty("line.separator"));
                }lineCounter++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example1.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(Example1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Example1.class.getName()).log(Level.SEVERE, null, ex);
            }


        }
    }
}



