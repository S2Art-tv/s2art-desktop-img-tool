/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2art.desktop.img.tool;

import javax.activation.MimetypesFileTypeMap;
import s2art.desktop.img.tool.OSValidator;
import java.util.ArrayList;
import java.lang.String;
import java.io.File;


/**
 *
 * @author vvbv
 */
public class ViewerToolsController {
    
    public String cleanURI(String URI){
        if( URI.endsWith("/") || URI.endsWith("\\") ){
            return URI.substring(0, URI.length() -1);
        }
        return URI;
    }
        
    public ArrayList<String> getImages(String folderLocation, boolean searchSubfolders){
        folderLocation = this.cleanURI(folderLocation);
        ArrayList<String> listOfFiles = new ArrayList<String>();
        File directoryPath = new File(folderLocation);
        String contents[] = directoryPath.list();
        for(int i=0; i < contents.length; i++){
            String filePath = folderLocation + (
                    OSValidator.isWindows() ? "\\" : "/") + contents[i];
            File file = new File(filePath);
            if(file.isFile()){
               if(this.isImageMimeType(file)){
                   listOfFiles.add(filePath);
               };
            }
        }
        return listOfFiles;
    }
    
    public boolean isImageMimeType(File src){
        String mimetype = new MimetypesFileTypeMap().getContentType(src);
        String type = mimetype.split("/")[0];
        if(type.equals("image")){
            return true;
        }
        return false;
    }
    
    
    
}
