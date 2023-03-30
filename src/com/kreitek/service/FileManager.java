package com.kreitek.service;

import com.kreitek.files.FileSystemItemBase;

public class FileManager {
    
    public static int calculateSize(FileSystemItemBase fileSystemItem) {
        return fileSystemItem.getSize();
    }

    // Aquí habría otros métodos para gestionar ficheros y directorios:
    // Crear ficheros, mover ficheros, eliminar ficheros, etc.
}
