package com.kreitek.files;

import com.kreitek.interfaces.FileSystemItem;
import com.kreitek.interfaces.IFileClose;
import com.kreitek.interfaces.IFileOpen;
import com.kreitek.interfaces.IFileWritter;

public class File extends FileSystemItemBase implements FileSystemItem, IFileOpen, IFileClose, IFileWritter {

    private int size = 0;
    private boolean isOpen = false;
    private int position = 0;

    public File(String name) {
        super(name);
    }

    @Override
    public String getExtension() {
        String extension = "";
        int indexOfLastDot = getName().lastIndexOf(".");
        if (indexOfLastDot > 0) {
            extension = getName().substring(indexOfLastDot + 1);
        }
        return extension;
    }

    @Override
    public int getSize() {
        return size;
    }

    public boolean getIsOpen(){
        return this.isOpen;
    }

    public int getPosition(){
        return this.position;
    }

    /* Los 3 métodos de abajo los he tenido que poner 
    aquí porque los tamaños de los archivos siempre 
    me daban 0 bytes de tamaño y no he sabido solucionarlo. */

    /* Mi idea era que no estuvieran aquí y que estuviesen
     en el FileReader y en el FileWritter */

    @Override
    public void open() {
        isOpen = true;
    }

    @Override
    public void close() {
        isOpen = false;
    }
    
    @Override
    public void write(byte[] buffer) {
        // Aquí habría lógica que escribiría en el fichero
        size += buffer.length;
        position += buffer.length;
    }

}
