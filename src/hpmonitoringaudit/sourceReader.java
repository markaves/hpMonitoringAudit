    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hpmonitoringaudit;
import java.io.*;

/**
 *
 * @author aves
 */
public class sourceReader {
int cnt = 0;

    public String[] readFile(String filename) {
            String[] out = new String[2000];

            try {

                FileReader file = new FileReader(filename);
                BufferedReader buff = new BufferedReader(file) ;

                boolean eof = false;
                while (!eof) {
                    String line = buff.readLine();
                    if (line == null)   {
                        eof = true;
                    } else {

                        out[cnt] = line;
                        //System.out.println(url[cnt]);
                        cnt++;

                    }
                    }
                    buff.close();
                } catch (IOException e) {
                    System.out.println("Error -- " + e.toString());
                }
            return out;
        }
    
}
