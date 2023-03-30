

package com.kreitek.files;

import com.kreitek.files.error.InvalidFileFormatException;
import com.kreitek.interfaces.FileSystemItem;
import com.kreitek.service.FileManager;

public class FileConverter extends FileSystemItemBase implements FileSystemItem {
    private String name;
    public FileConverter(String name) {
        super(name);
        this.name = name;
    }

    private String extension;

    public File convertMp3ToWav() {
        if (!"mp3".equalsIgnoreCase(getExtension())) {
            throw new InvalidFileFormatException("El fichero debe ser mp3");
        }
        
        int indexOfLastDot = name.lastIndexOf(".");
        String nameWithoutExtension = name;
        if (indexOfLastDot > 0) {
            nameWithoutExtension = name.substring(0, indexOfLastDot);
        }
        String newFileName = nameWithoutExtension + ".wav";
        File result = new File(newFileName);
        result.open();
        // Lógica de conversión de mp3 a wav. Se lee de este fichero y se escribe en result
        result.close();
        return result;
    }

    public File convertWavToMp3() {
        if (!"wav".equalsIgnoreCase(getExtension())) {
            throw new InvalidFileFormatException("El fichero debe ser wav");
        }

        int indexOfLastDot = name.lastIndexOf(".");
        String nameWithoutExtension = name;
        if (indexOfLastDot > 0) {
            nameWithoutExtension = name.substring(0, indexOfLastDot);
        }
        String newFileName = nameWithoutExtension + ".mp3";
        File result = new File(newFileName);
        result.open();
        // Lógica de conversión de wav a mp3. Se lee de este fichero y se escribe en result
        result.close();
        return result;
    }

    @Override
    public String getExtension() {
        return this.extension;
    }

    @Override
    public int getSize() {
        int size = FileManager.calculateSize(this);
        return size;
    }
    
}