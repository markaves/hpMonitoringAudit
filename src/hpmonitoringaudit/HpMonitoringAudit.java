/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hpmonitoringaudit;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
 

/**
 *
 * @author aves
 */
public class HpMonitoringAudit {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // TODO code application logic here
        sftp getMyFiles = new sftp();
        if (args.length < 1)
        {
        System.err.println("Usage: java " + getMyFiles.getClass().getName()+
        " Properties_filename File_To_Download ");
        System.exit(1);
        }
 
    String propertiesFilename = args[0].trim();
    String fileToDownload = args[1].trim();
    getMyFiles.startFTP(propertiesFilename, fileToDownload);
    
    }
}