package com.javarush.task.task31.task3112;

import java.io.IOException;
<<<<<<< HEAD
import java.io.InputStream;
=======
>>>>>>> 7defc761c64c11807484c27048e1438b8af48d88
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
<<<<<<< HEAD
import java.util.Random;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
=======
>>>>>>> 7defc761c64c11807484c27048e1438b8af48d88

/* 
Загрузчик файлов
*/
public class Solution {

    public static void main(String[] args) throws IOException {
<<<<<<< HEAD
        Path passwords = downloadFile("http://actinginlondon.co.uk/wp-content/uploads/2016/03/How-to-Start-an-Acting-Career-and-Figure-Things-Out.jpg", Paths.get("/home/rusiashka/Desktop"));

//        for (String line : Files.readAllLines(passwords)) {
//            System.out.println(line);
//        }
=======
        Path passwords = downloadFile("https://www.amigo.com/ship/secretPassword.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
>>>>>>> 7defc761c64c11807484c27048e1438b8af48d88
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        // implement this method
<<<<<<< HEAD
        Integer random = new Random().nextInt(25);

        URL url = new URL(urlString);
        InputStream inputStream = url.openStream();

        Path tempFile = Files.createTempFile("temp-",".tmp");
        Files.copy(inputStream, tempFile);

        //System.out.println(getFileName(urlString));
      //  Files.copy(inputStream, tempFile);


return null;
       // return   Files.move(tempFile, downloadDirectory.resolve(tempFile.getFileName()), REPLACE_EXISTING);

    }

    public static String getFileName(String url){
        int beginFileName = url.lastIndexOf("/") + 1;
        return url.substring(beginFileName);
=======
>>>>>>> 7defc761c64c11807484c27048e1438b8af48d88
    }
}
