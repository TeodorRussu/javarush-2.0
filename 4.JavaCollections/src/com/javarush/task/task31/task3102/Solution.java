package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.*;

/* 
Находим все файлы
"C:\\Users\\Rusiashka\\Desktop\\JavaRushTasks-master" "C:\\Users\\Rusiashka\\Desktop\\JavaRushTasks-master\\111.txt"
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        File rootFile = new File(root);
        List<String> filePaths = new ArrayList<>();

        if (rootFile.isFile()){
            filePaths.add(rootFile.getAbsolutePath());
            return filePaths;
        }

        File[] mainDir = rootFile.listFiles();
        Deque<File> allFiles = new LinkedList<>();
        Collections.addAll(allFiles, mainDir);



        while (!(allFiles.isEmpty())) {
            File temp = allFiles.pollFirst();
            if (temp == null) break;

            if (temp.isDirectory()) {
                File[] tempDirectory = temp.listFiles();
                for (File fi : tempDirectory) {
                    allFiles.add(fi);
                }
            } else filePaths.add(temp.getAbsolutePath());
        }

        return filePaths;
    }

    public static void main(String[] args) throws IOException {
        List<String> patjs = getFileTree("C:\\Users\\Rusiashka\\Desktop\\JavaRushTasks-master\\");

        for (String s: patjs)
            System.out.println(s);
    }
}
