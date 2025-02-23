package core2;

import java.io.*;

class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}

public class MyFileReader {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\uva\\OneDrive\\Documents\\bas.docx";
        ;

        try {
            readFile(filePath);
        } catch (EmptyFileException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IO Error: " + e.getMessage());
        }
    }

    public static void readFile(String filePath) throws EmptyFileException, IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + filePath);
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String firstLine = reader.readLine();

        if (firstLine == null) {
            reader.close();
            throw new EmptyFileException("The file is empty: " + filePath);
        }

        System.out.println("File contents:");
        System.out.println(firstLine);
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}

