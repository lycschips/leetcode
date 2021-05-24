package com.chips.design.learn.cucalate.sort;


import java.util.*;

public class IterateFile {

    public static List<String> solution(FileNode root) {
        List<String> resultList = new ArrayList<>();
        List<String> path = new ArrayList<>();

        if (root == null) {
            return resultList;
        }

        findPath(resultList, root, path);

        return resultList;

    }

    public static void findPath(List<String> result, FileNode currentNode, List<String> path) {

        if (currentNode.isFile()) {

            StringBuilder name = new StringBuilder();

            for (String s : path) {

                name.append(s + "//");

            }

            name.append(currentNode.getName());
            result.add(name.toString());
            return;
        }

        path.add(currentNode.getName());

        if (currentNode.getChildren() != null) {

            List<FileNode> childList = currentNode.getChildren();

            for (FileNode fileNode : childList) {
                findPath(result, fileNode, path);
            }

        }
        path.remove(path.size() - 1);
    }

}
