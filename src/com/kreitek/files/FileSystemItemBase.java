package com.kreitek.files;


public abstract class FileSystemItemBase {
    private static final String PATH_SEPARATOR = "/";
    protected String name;
    private String path = PATH_SEPARATOR;
    private Directory directoryParent;


    protected FileSystemItemBase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public FileSystemItemBase getParent() {
        return directoryParent;
    }

    public void setParent(Directory directory) {
        this.directoryParent = directory;
    }

    public String getFullPath() {
        if (directoryParent != null) {
            String parentFullPath = directoryParent.getFullPath();
            path = directoryParent.getFullPath() + (parentFullPath.length() > 1 ? PATH_SEPARATOR : "");
        }
        path += getName();
        return path;
    }

    public abstract int getSize();

    
}
