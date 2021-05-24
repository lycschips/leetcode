package com.chips.design.learn.cucalate.sort;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class FileNode {

        private int id;

        private String name;

        private boolean isFile;

        private List<FileNode> children;

}


