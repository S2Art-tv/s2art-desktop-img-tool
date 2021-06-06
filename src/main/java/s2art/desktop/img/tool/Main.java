/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2art.desktop.img.tool;

import s2art.desktop.img.tool.ViewerToolsController;

/**
 *
 * @author vvbv
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ViewerToolsController VTC = new ViewerToolsController();
        System.out.println(VTC.cleanURI("C:\\Users\\jeiso\\Seafile\\Debian Pictures\\RefDebian\\"));
        System.out.println(VTC.getImages("C:\\Users\\jeiso\\Seafile\\Debian Pictures\\RefDebian", true));

        //Viewer viewer = new Viewer();
        //viewer.setVisible(true);
    }
    
}
