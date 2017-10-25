package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {

    private String partOfName;
    private String partOfContent;
    private int minSize=-1;
    private int maxSize=-1;

    @Override
    public String toString() {
        return "SearchFileVisitor{" +
                "partOfName='" + partOfName + '\'' +
                ", partOfContent='" + partOfContent + '\'' +
                ", minSize=" + minSize +
                ", maxSize=" + maxSize +
                '}';
    }

    private List<Path> foundFiles = new ArrayList<>();

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        String content = new String(Files.readAllBytes(file));

        boolean containsName = true;
        if (partOfName != null) {

            if (partOfName != null && !file.getFileName().toString().contains(partOfName))
                containsName = false;
        }

        boolean containsContent = true;
        if (partOfContent != null){
            if (partOfContent != null && !content.contains(partOfContent))
                containsContent = false;
        }

        int minimSize = minSize;
        int maximumSize = maxSize;


        if (containsName && containsContent && minSize <0 &&maximumSize <0)
            foundFiles.add(file);
        else if (containsName && containsContent && (minSize >=0 && content.length()>=minSize)&&maximumSize <0)
            foundFiles.add(file);
        else if (containsName && containsContent && (maximumSize >=0 && content.length()<=maximumSize)&&minimSize <0)
            foundFiles.add(file);
        else if (containsName && containsContent && (maximumSize >=0 && content.length()<=maximumSize)&&(minimSize>=0&& content.length()>=minimSize))
            foundFiles.add(file);

        return FileVisitResult.CONTINUE;

    }

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public List<Path> getFoundFiles() {
        return foundFiles;
    }
}
