package com.Image;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Folder {

    static String output = "";
    static String prefix = "|";
    static String filePrefix = "--";
    static String directoryPrefix = "|--";

    public static class MyFileVisitor extends SimpleFileVisitor<Path> {
        Path path;
        int level = 0;

        MyFileVisitor(Path path) {
            this.path = path;
        }

        @Override
        public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException {
            output = output + prefix + intendation(level) + filePrefix + path.getFileName() + " (" + (Files.size(path)/1024) + " kB)" + "\n";

            return FileVisitResult.CONTINUE;

        }

        @Override
        public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes attrs) throws IOException {
            output = output + prefix + intendation(level) + directoryPrefix + path.getFileName() + "\n";

            level++;

            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult postVisitDirectory(Path path, IOException exc) throws IOException {
            level--;

            return FileVisitResult.CONTINUE;
        }

        public String intendation(int level) {
            String output = "";

            for (int i = 0; i < level; i++) {
                output = output + "  ";
            }

            return output;
        }
    }

    public static void main(String[] args) throws IOException {

        Path directory = Paths.get("D:\\Pictures\\");

        MyFileVisitor visitor = new MyFileVisitor(directory);
        Files.walkFileTree(directory, visitor);

        System.out.println(Folder.output);
    }
}