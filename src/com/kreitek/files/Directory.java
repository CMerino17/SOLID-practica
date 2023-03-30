package com.kreitek.files;

import java.util.ArrayList;
import java.util.List;
import com.kreitek.interfaces.IDirectory;


public class Directory extends FileSystemItemBase implements IDirectory {

    private final List<FileSystemItemBase> files;

    public Directory(String name) {
        super(name);
        files = new ArrayList<>();
    }

    public List<FileSystemItemBase> listFiles() {
        return files;
    }

    @Override
    public void addFile(FileSystemItemBase file) {
        if (!listFiles().contains(file)) {
            listFiles().add(file);
            file.setParent(this);
        }
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemItemBase file : listFiles()) {
            totalSize += file.getSize();
        }
        return totalSize;
    }

}
