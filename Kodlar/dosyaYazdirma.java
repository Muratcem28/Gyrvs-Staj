
package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class dosyaYazdirma {

    public static void yazdirma (List<String> yeniCumleler) {


        try {

            BufferedWriter cikti = new BufferedWriter(new FileWriter("dosya2.txt"));
            cikti.write(String.join(" \n" , yeniCumleler));
            cikti.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

/*
        try {
            girdi = new BufferedReader(new FileReader("/home/cem/Desktop/Staj/tanımlar.odt"));

            //      cikti = new PrintWriter(new FileWriter("dosya2.txt"));

            while ((satir = girdi.readLine()) != null) {

                List<String> cumleler = extractor.fromParagraph(String.valueOf(satir));

                List<WordAnalysis> analyses = morphology.analyzeSentence(String.valueOf(cumleler));

                for (WordAnalysis entry : analyses) {
                    for (SingleAnalysis analysis : entry) {
                    }
                }
                SentenceAnalysis result = morphology.disambiguate(String.valueOf(cumleler), analyses);
                List<SingleAnalysis> termList = result.bestAnalysis();
                List<String> rootList = new ArrayList<>();
                for(SingleAnalysis term : termList){
                    rootList.add(term.getDictionaryItem().root);
                }

                for (String part : cumleler) {

                    //dosyaya yazdırma outputStream.println(satir);
                    //               cikti.println(String.join(" ", rootList))
                    // fileWriter.write(soru.text() + System.lineSeparator() + cevap.text() + System.lineSeparator());
                    System.out.println(rootList);
                }

            }
        } finally {
            if (girdi != null) {
                girdi.close();
            }
            if (cikti != null) {
                cikti.close();

            }

        }
        System.out.println("bitti.");
    }

  */