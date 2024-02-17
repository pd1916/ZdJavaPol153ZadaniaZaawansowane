package pl.sdacademy.java.advanced.exercises.day3.task30;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Task30 {

    public static void main(String[] args) {
        Path dirPath = Path.of("src/main/java/pl/sdacademy/java/advanced/exercises/day3/task30");
        Path inputFilePath = dirPath.resolve("sda.dummy.csv");
        //odczyt pliku
        if(!inputFilePath.toFile().exists()) {
            System.out.println("File not exist!");
            return;
        }
        List<String> fileContent = getFileContent(inputFilePath);

        //modyfikacja zawartości pliku
        List<String> reversedFileContent = reverseFileContent(fileContent);

        //modyfikacja nazwy pliku
        String reversedFileName = reverseFileName(inputFilePath);
        Path outputFilePath = dirPath.resolve(reversedFileName);

        //zapis pliku
        boolean result = saveFileContent(outputFilePath, reversedFileContent);
        System.out.println("Result:" + result);
    }

    private static boolean saveFileContent(Path outputFilePath, List<String> content) {
        try {
            Files.write(outputFilePath, content, StandardCharsets.UTF_8);
            return true;
        } catch(IOException e) {
            System.out.println("Error during I/O: " + e);
        }
        return false;
    }

    private static String reverseFileName(Path inputFilePath) {
        /*
        sda.csv -> ads.csv
        sda -> ads
        sda.dummy.csv -> ymmud.ads.csv
         */
        String fileName = inputFilePath.toFile().getName();
        String fileExtension = "";
        int index = fileName.lastIndexOf(".");
        if(index > 0) {
            //nazwa pliku posiada rozszerzenie
            fileExtension = fileName.substring(index);
            fileName = fileName.substring(0, index);
//            String reversedName = new StringBuilder(fileName).reverse().append(extension).toString();
//            inputFilePath.getParent().resolve(reversedName);
        }
        return new StringBuilder(fileName)
                .reverse()
                .append(fileExtension)
                .toString();
    }

    private static List<String> reverseFileContent(List<String> fileContent) {
        return fileContent.stream()
                .map(line -> new StringBuilder(line).reverse().toString())
                .toList();
    }

    private static List<String> getFileContent(Path inputFilePath) {
        List<String> content = new ArrayList<>();
        try {
            content = Files.readAllLines(inputFilePath, StandardCharsets.UTF_8);
        } catch(IOException e) {
            System.out.println("Error during I/O: " + e);
        }
        return content;
    }
}
