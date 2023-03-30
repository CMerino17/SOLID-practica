package com.kreitek.files;

import com.kreitek.interfaces.IFileClose;
import com.kreitek.interfaces.IFileOpen;
import com.kreitek.interfaces.IFileWritter;

public class FileWritter implements IFileWritter, IFileOpen, IFileClose {

    private int size = 0;
    private boolean isOpen = false;
    private int position = 0;

    @Override
    public void write(byte[] buffer) {
        // Aquí habría lógica que escribiría en el fichero
        size += buffer.length;
        position += buffer.length;
    }

    public int getPosition(){
        return this.position;
    }

    public void setPosition(int numberOfBytesFromBeginning) {
        if (!isOpen) {
            throw new UnsupportedOperationException("Debe abrir el fichero primero");
        }
        if (numberOfBytesFromBeginning > size) {
            throw new UnsupportedOperationException("La posición no puede ser mayor que el tamaño del fichero");
        }
        this.position = numberOfBytesFromBeginning;
    }

    @Override
    public void open() {
        isOpen = true;
    }

    @Override
    public void close() {
        isOpen = false;
    }

}
