package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class  cumleAlımı {


    public static List<String> method(String filepath) {

        List<String> cumleler = new ArrayList<>();

        try {
            BufferedReader girdi = new BufferedReader(new FileReader(filepath));

            String line = girdi.readLine();

            while (line != null) {
                cumleler.add(line);
                line = girdi.readLine();
            }

      /*          if (girdi != null) {
                    girdi.close();
                }
      */

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return cumleler;
    }
}
