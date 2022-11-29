package Lesson_34_Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class FileTest {
    static Logger LOGGER;

    static {
        try (FileInputStream ins = new FileInputStream("D://111//log.config")) {
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(FileTest.class.getName());
        } catch (
                IOException ex) {
            ex.getMessage();
        }

    }

    public static void getFileList(String path) {
        File folder = new File(path);
        for (File item : folder.listFiles()) {
            if (folder.isDirectory()) {
                System.out.println(item.getAbsolutePath());
                System.out.println(Arrays.toString(item.listFiles(File::isDirectory)));
                System.out.println(Arrays.toString(item.listFiles(File::isFile)));
                getFileList(item.getAbsolutePath());
            }
        }
    }

    public static void main(String[] args) {
        createFile();
        getFileList("D:/Artemiy Dubovskiy");
    }

    public static void createFile() {
        String fillName = "test.txt";
        String folderName = System.getProperty("user.dir");
        String fullName = folderName + File.separator + fillName;
        File file = new File(fullName);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    LOGGER.log(Level.INFO, "Создали текстовый файл");
                } else {
                    LOGGER.log(Level.INFO, "Не создали текстовый файл");
                }
            } catch (IOException ex) {
                LOGGER.log(Level.SEVERE, "Ощибка системы ввода-вывода", ex);
            }
        } else {
            LOGGER.log(Level.SEVERE, "Файл существует");

        }
    }
}