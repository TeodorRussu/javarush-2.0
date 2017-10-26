package com.javarush.task.task31.task3101;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Проход по дереву файлов
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        List<File> fileDirectories = new ArrayList<>();

        String path =args[0];
        File resultFileAbsolutePath = new File (args[1]);
        File dest = new File(resultFileAbsolutePath.getParent()+ "/allFilesContent.txt");
        resultFileAbsolutePath.renameTo(dest);
     //   System.out.println(dest.getAbsolutePath());

        directoriesToList(path, fileDirectories);
       // System.out.println(fileDirectories);

        List<String> fileNames = new ArrayList<>();
        for (File f : fileDirectories)
            fileNames.add(f.getName());
        Collections.sort(fileNames);

        try(FileOutputStream out = new FileOutputStream(dest);) {
            for (String s : fileNames)
                out.write((s + "\n").getBytes());
        }
    }

    public static void directoriesToList(String path, List<File> fileDirectories) {
        File[] filesAndDirectories = new File(path).listFiles();
        for (File file : filesAndDirectories) {
            if (file.isDirectory()) {
                //System.out.println("name: " + file.getAbsolutePath());
                directoriesToList(file.getAbsolutePath(), fileDirectories);
            } else {
                if (file.length() > 50)
                    FileUtils.deleteFile(file);
                else
                    fileDirectories.add(file);
            }

        }
    }
}
