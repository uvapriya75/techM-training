package core;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LastModifiedDate {
    public static void main(String[] args) {
        // the file path
        String filePath = "\"C:\\Users\\uva\\Downloads\\index2 (1).txt\""; // Change this to the actual file path

        // File object
        File file = new File(filePath);

        if (file.exists()) {
            // Get the last modified date
            long lastModified = file.lastModified();

            // Format the date
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedDate = sdf.format(new Date(lastModified));

            // Print the last modified date
            System.out.println("Last modified date of " + filePath + " is: " + formattedDate);
        } else {
            System.out.println("File does not exist.");
        }
    }
}

