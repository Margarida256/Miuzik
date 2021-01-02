/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miuzikapplication;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author ameri
 */
public class FileTypeFilter extends FileFilter {
   
     //File Extensions String
    private final String extension;
    
    private final String descripton;

    //Constructor method
    public FileTypeFilter (String extension, String descripton){
    this.extension = extension;
    this.descripton = descripton;
    
    }
    @Override
    public boolean accept(File file) {
        //if file is returning directory
        if(file.isDirectory()){
            return true;
           }
        //return filename with extension
        return file.getName().endsWith(extension);
    }
    
    @Override
    public String getDescription() {
        //return to display file type and descripton
       return descripton + String.format(" (*%s)", extension);
    }
    
}
